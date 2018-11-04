package org.lukasz.repository;

import org.lukasz.model.db.Animal;

import java.util.ArrayList;
import java.util.List;


public class StubAnimalRepo extends StubAbstractBaseRepo<Animal> implements AnimalRepo {
    @Override
    public List<Animal> findAllAnimals() {
        return new ArrayList<>(records.values());
    }

}