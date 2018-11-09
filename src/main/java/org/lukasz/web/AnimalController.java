package org.lukasz.web;

import org.lukasz.model.db.Animal;
import org.lukasz.repository.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AnimalController {
    @Autowired
    AnimalRepo animalRepo;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String addAnimal(
            @Valid @ModelAttribute("newAnimal") Animal animal) {

        animalRepo.save(animal);
        return "redirect:/home";
    }
}
