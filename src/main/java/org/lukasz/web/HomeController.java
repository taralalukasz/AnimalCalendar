package org.lukasz.web;

import org.lukasz.model.BasicDateModel;
import org.lukasz.model.db.Animal;
import org.lukasz.model.db.Event;
import org.lukasz.repository.AnimalRepo;
import org.lukasz.repository.BaseRepo;
import org.lukasz.util.DayManager;
import org.lukasz.util.MonthManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    @Autowired
    AnimalRepo animalRepo;

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String homepage(
            @Valid BasicDateModel basicDateModel,
            BindingResult result,
            Model model) {
        
        if (result.hasErrors()) {
            return redirectToToday();
        }
        int year = basicDateModel.getYear();
        int month = basicDateModel.getMonth();

        int firstDayOfMonth = DayManager.countFirstDayOfMonth(year, month);
        int numberOfDaysInMonth = DayManager.countDaysInMonth(year, month);

        List<Animal> allAnimals = animalRepo.findAllAnimals();

        List<Event> allEvents = getEventsToDisplay(month, allAnimals);

        model.addAttribute("monthToDisplay", MonthManager.createMonth(firstDayOfMonth, numberOfDaysInMonth));
        model.addAttribute("allAnimals", allAnimals);
        model.addAttribute("allEvents", allEvents);
        //this model is used in new animal form
        model.addAttribute("newAnimal", new Animal());

        model.addAttribute("newEvent", new Event());
        return "homepage";
    }

    private List<Event> getEventsToDisplay(int month, List<Animal> allAnimals) {
        return allAnimals.stream()
                .flatMap(animal -> animal.getEventList().stream())
                .filter(event -> {
                    int eventMonth = event.getEventDate().getMonth().getValue();
                    return eventMonth ==  month;
                }).collect(Collectors.toList());
    }

    private String redirectToToday() {
        LocalDate date = LocalDate.now();
        int currentMonth = date.getMonth().getValue();
        int currentYear = date.getYear();

        return "redirect:/home?year=" + currentYear + "&month=" + currentMonth;
    }
}
