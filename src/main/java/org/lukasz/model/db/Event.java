package org.lukasz.model.db;

import java.time.LocalDateTime;

/**
 * Basic event to be displayed
 */
public class Event extends AbstractEntity {
    private String Title;
    private String Description;
    private LocalDateTime eventDate;

    public Event(Long id, String title, LocalDateTime eventDate) {
        super(id);
        Title = title;
        this.eventDate = eventDate;
    }

    public Event( String title, LocalDateTime eventDate) {
        super();
        Title = title;
        this.eventDate = eventDate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

}
