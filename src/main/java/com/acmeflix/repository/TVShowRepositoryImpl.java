package com.acmeflix.repository;

import com.acmeflix.domain.TVShow;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TVShowRepositoryImpl extends BaseRepositoryImpl<TVShow> implements TVShowRepository {
    @Override
    public TVShow create(TVShow entity) {
        return null;
    }

    @Override
    public void update(TVShow entity) {

    }

    @Override
    public List<TVShow> findAll() {
        return null;
    }

    @Override
    public void delete(TVShow entity) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public boolean exists(TVShow entity) {
        return false;
    }

    @Override
    public TVShow get(Long aLong) {
        return null;
    }

    @Override
    public List<TVShow> findByTitle(String title) {
        return null;
    }
}
