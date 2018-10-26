package org.lukasz.web;

import org.lukasz.model.BasicDateModel;
import org.lukasz.util.DayManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
public class HomeController {

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String homepage(
            @Valid  @ModelAttribute BasicDateModel basicDateModel,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            return redirectToToday();
        }

        Integer year = basicDateModel.getYear();
        Integer month = basicDateModel.getMonth();

        if (year == null || month == null) {
            return redirectToToday();
        }

        int firstDayOfMonth = DayManager.countFirstDayOfMonth(year, month);
        int numberOfDaysInMonth = DayManager.countDaysInMonth(year, month);

        model.addAttribute("firstDayOfMonth", firstDayOfMonth);
        model.addAttribute("numberOfDaysInMonth", numberOfDaysInMonth);

        return "homepage";
    }

    @RequestMapping(path="/home", method = RequestMethod.POST)
    public String processRegistration(
            @Valid BasicDateModel dateModel,
            Errors errors) {

        if (errors.hasErrors()) {
            return redirectToToday();
        }

        return "redirect:/home?year=" + dateModel.getYear() + "&month=" + dateModel.getMonth();
    }

    private String redirectToToday() {
        LocalDate date = LocalDate.now();
        Integer currentMonth = date.getMonth().getValue();
        Integer currentYear = date.getYear();

        return "redirect:/home?year=" + currentYear + "&month=" + currentMonth;

    }
}
