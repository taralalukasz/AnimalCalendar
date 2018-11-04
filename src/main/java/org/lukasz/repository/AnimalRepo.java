package org.lukasz.repository;

import org.lukasz.model.db.Animal;

import java.util.List;

public interface AnimalRepo extends BaseRepo <Animal> {
    List<Animal> findAllAnimals();
}
