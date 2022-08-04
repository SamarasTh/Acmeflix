package com.acmeflix.repository;

import com.acmeflix.base.BaseComponent;
import com.acmeflix.domain.BaseModel;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public abstract class BaseRepositoryImpl <T extends BaseModel> extends BaseComponent implements BaseRepository<T, Long>{
    public abstract Map<Long, T> getEntity();
    public abstract AtomicLong getID();

    @Override
    public T create(T entity) {
        final Long id = getID().getAndIncrement();
        entity.setId(id);
        getEntity().put(id, entity);
        logger.trace("Created {}.", entity);
        return entity;
    }

    @Override
    public void update(final T entity) {
        getEntity().put(entity.getId(), entity);
        logger.trace("Updated {}.", entity);
    }

    @Override
    public List<T> findAll() {
       return getEntity().values().stream().toList();
    }

    @Override
    public void delete(final T entity) {
        deleteById(entity.getId());
    }

    @Override
    public void deleteById(final Long id) {
        logger.trace("{} entity with id:{}.", getEntity().remove(id) != null ? "Deleted" : "Did not delete", id);
    }

    @Override
    public boolean exists(final T entity) {
        boolean exists = Objects.nonNull(getEntity().get(entity.getId()));
        logger.trace("Found {}.", entity);
        return exists;
    }

    @Override
    public T get(final Long id) {
        return getEntity().get(id);
    }
}
