package org.lukasz.config;

import org.lukasz.model.db.Animal;
import org.lukasz.model.db.Event;
import org.lukasz.repository.AnimalRepo;
import org.lukasz.repository.EventRepo;
import org.lukasz.repository.StubAnimalRepo;
import org.lukasz.repository.StubEventRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
@ComponentScan(basePackages={"org.lukasz"},
        excludeFilters={
                @ComponentScan.Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
        })
public class TestDbConfig {
    @Bean
    public AnimalRepo animalRepo() {
        AnimalRepo animalRepo = new StubAnimalRepo();
        Animal testAnimal = new Animal(new Long(1), "Opiekacz");
        Event event1 = new Event(1l,
                "event one",
                LocalDateTime.of(2017,11,7,12,0));
        Event event2 = new Event(1l,
                "event two",
                LocalDateTime.of(2017,11,10,10,0));
        Event event3 = new Event(1l,
                "event three",
                LocalDateTime.of(2017,12,1,10,0));
        testAnimal.setEventList(Arrays.asList(event1, event2, event3));
        animalRepo.save(testAnimal);
        return animalRepo;
    }

    @Bean
    public EventRepo eventRepo() {
        EventRepo eventRepo = new StubEventRepo();

        Event event1 = new Event(1l,
                "event one",
                LocalDateTime.of(2017,11,7,12,0));
        Event event2 = new Event(1l,
                "event two",
                LocalDateTime.of(2017,11,10,10,0));
        Event event3 = new Event(1l,
                "event three",
                LocalDateTime.of(2017,12,1,10,0));

        eventRepo.save(event1);
        eventRepo.save(event2);
        eventRepo.save(event3);

        return eventRepo;
    }
}
