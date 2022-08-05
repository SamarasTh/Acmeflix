package com.acmeflix.repository;

import com.acmeflix.domain.Program;
import com.acmeflix.domain.Rating;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class RatingRepositoryImpl extends BaseRepositoryImpl<Rating> implements RatingRepository {

    private final Map<String, Rating> entity = new LinkedHashMap<>();

    @Override
    public void addRating(Rating rating) {

    }

    @Override
    public Rating getRating(Program program) {
        return null;
    }

}


