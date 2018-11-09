package org.lukasz.model.db;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class Animal extends AbstractEntity {
    @NotNull
    private String name;
    private List<Event> eventList = new ArrayList<>();

    public Animal(Long id, String name) {
        super(id);
        this.name = name;
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public Animal() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
