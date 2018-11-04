package org.lukasz.config;

import org.lukasz.model.db.Animal;
import org.lukasz.repository.AnimalRepo;
import org.lukasz.repository.BaseRepo;
import org.lukasz.repository.StubAnimalRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"org.lukasz"},
        excludeFilters={
                @ComponentScan.Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
        })
public class RootConfig {
        @Bean
        public AnimalRepo animalRepo() {
                AnimalRepo animalRepo = new StubAnimalRepo();
                animalRepo.save(new Animal(new Long(1), "Opiekacz"));
                return animalRepo;
        }
}