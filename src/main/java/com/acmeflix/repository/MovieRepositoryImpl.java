package com.acmeflix.repository;

import com.acmeflix.domain.Movie;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class MovieRepositoryImpl extends BaseRepositoryImpl<Movie> implements MovieRepository {


    @Override
    public Movie findByTitle(final String title) {
        return null;
    }

    @Override
    public Movie findByYear(String year) {
        return null;
    }


}
