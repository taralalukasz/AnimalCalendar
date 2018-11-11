package org.lukasz.web;

import org.lukasz.model.db.Animal;
import org.lukasz.model.db.Event;
import org.lukasz.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    @Autowired
    EventRepo eventRepo;

    @RequestMapping(path = "/addEvent", method = RequestMethod.POST)
    public String addEvent(
            @ModelAttribute(name="newEvent") Event newEvent,
             Animal animal) {
        eventRepo.save(newEvent);
        return "redirect:/home";
    }
}
