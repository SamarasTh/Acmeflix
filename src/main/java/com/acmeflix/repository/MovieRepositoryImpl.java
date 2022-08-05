package com.acmeflix.repository;

import com.acmeflix.domain.Movie;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
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


}
