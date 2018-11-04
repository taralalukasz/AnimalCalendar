package org.lukasz.model.db;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractEntity implements Serializable {
    protected Long id;
    protected Date createdAt;
    protected Date modifiedAt;

    //TODO NEED TO ADD LEGIT CONSTRUCTOR


    public AbstractEntity(Long id) {
        this.id = id;
        this.createdAt = new Date();
        this.modifiedAt = new Date();
    }

    public AbstractEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
