package org.lukasz.model.db;

import java.time.LocalDateTime;

/**
 * Basic event to be displayed
 */
public class Event extends AbstractEntity {
    private String title;
    private String description;
    private LocalDateTime eventDate;

    public Event(Long id, String title, LocalDateTime eventDate) {
        super(id);
        this.title = title;
        this.eventDate = eventDate;
    }

    public Event( String title, LocalDateTime eventDate) {
        super();
        this.title = title;
        this.eventDate = eventDate;
    }

    public Event() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
}
