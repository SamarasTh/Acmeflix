package com.acmeflix.repository;

import com.acmeflix.domain.BaseModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseRepository<T extends BaseModel, ID> {

    T create(final T entity);

    void update(T entity);

    List<T> findAll();

    void delete(T entity);

    void deleteById(ID id);

    boolean exists(T entity);

    T get(ID id);
}
