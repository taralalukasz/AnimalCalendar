package org.lukasz.repository;

public interface AbstractRepo <T> {
    void save(T entity);
    void delete(T entity);
    void deleteById(Long id);
    T findById(Long id);
}