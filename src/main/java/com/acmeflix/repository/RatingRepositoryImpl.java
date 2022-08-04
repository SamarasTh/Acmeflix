package com.acmeflix.repository;

import com.acmeflix.domain.Program;
import com.acmeflix.domain.Rating;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class RatingRepositoryImpl extends BaseRepositoryImpl<Rating> implements RatingRepository {

    private final Map<String, Rating> entity = new LinkedHashMap<>();

    @Override
    public void addRating(Rating rating) {

    }

    @Override
    public Rating getRating(Program program) {
        return null;
    }

    @Override
    public Map<Long, Rating> getEntity() {
        return null;
    }

    @Override
    public AtomicLong getID() {
        return null;
    }
}


