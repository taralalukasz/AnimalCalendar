package org.lukasz.model.db;

import java.util.List;

public class Animal extends AbstractEntity {

    //TODO NEED TO THINK ABOUT LEGIT CONTRUCTOR (THINK ABOUT ABSTRACTENTITY AS WELL)

    private String name;
    private List<AbstractEntity> eventList;

    public Animal(Long id, String name) {
        super(id);
        this.name = name;
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AbstractEntity> getEventList() {
        return eventList;
    }

    public void setEventList(List<AbstractEntity> eventList) {
        this.eventList = eventList;
    }
}
