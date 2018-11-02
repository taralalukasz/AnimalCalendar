package org.lukasz.repository;

import org.lukasz.model.db.AbstractEntity;
import org.lukasz.model.db.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class StubAbstractRepo<T extends AbstractEntity> implements AbstractRepo <T>{

    protected Map<Long, T> records = new HashMap<>();

    @Override
    public void save(T entity) {
        if (entity.getId() == null) {
            entity.setId(records.size() + 1l);
        }
        records.put(entity.getId(), entity);
    }

    @Override
    public void delete(T entity) {
        records.remove(entity.getId());
    }

    @Override
    public void deleteById(Long id) {
        records.remove(id);
    }

    @Override
    public T findById(Long id) {
        return records.get(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(records.values());
    }
}
