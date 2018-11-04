package org.lukasz.repository;

import org.lukasz.model.db.AbstractEntity;

public interface BaseRepo<T extends AbstractEntity> {
    void save(T entity);
    void delete(T entity);
    void deleteById(Long id);
    T findById(Long id);
}
