package com.acmeflix.repository;

import com.acmeflix.domain.Movie;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieRepositoryImpl extends BaseRepositoryImpl<Movie> implements MovieRepository {
    @Override
    public List<Movie> findByTitle(String title) {
        return null;
    }

    @Override
    public Movie create(Movie entity) {
        return null;
    }

    @Override
    public void update(Movie entity) {

    }

    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public void delete(Movie entity) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public boolean exists(Movie entity) {
        return false;
    }

    @Override
    public Movie get(Long aLong) {
        return null;
    }
}
