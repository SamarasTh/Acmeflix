package com.acmeflix.repository;

import com.acmeflix.domain.TVShow;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class TVShowRepositoryImpl extends BaseRepositoryImpl<TVShow> implements TVShowRepository {

    private final AtomicLong id = new AtomicLong(1);
    private final Map<Long, TVShow> entity = new LinkedHashMap<>();
    @Override
    public TVShow findByTitle(String title) {
        return null;
    }

    @Override
    public TVShow findByYear(String year) {
        return null;
    }


    @Override
    public Map<Long, TVShow> getEntity() {
        return entity;
    }

    @Override
    public AtomicLong getID() {
        return id;
    }
}
