package com.acmeflix.repository;

import com.acmeflix.domain.Movie;
import com.acmeflix.domain.TVShow;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class MovieRepositoryImpl extends BaseRepositoryImpl<Movie> implements MovieRepository {
    private final AtomicLong id = new AtomicLong(1);
    private final Map<Long, Movie> entity = new LinkedHashMap<>();

    @Override
    public Movie findByTitle(final String title) {
        return null;
    }

    @Override
    public Movie findByYear(String year) {
        return null;
    }

    @Override
    public Map<Long, Movie> getEntity() {
        return entity;
    }

    @Override
    public AtomicLong getID() {
        return id;
    }
}
