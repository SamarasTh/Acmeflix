package com.acmeflix.repository;

import com.acmeflix.domain.TVShow;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TVShowRepositoryImpl extends BaseRepositoryImpl<TVShow> implements TVShowRepository {



    @Override
    public TVShow findByTitle(String title) {
        return null;
    }

    @Override
    public TVShow findByYear(String year) {
        return null;
    }


}
