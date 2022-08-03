package com.acmeflix.service;

import com.acmeflix.domain.Rating;
import com.acmeflix.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl extends BaseServiceImpl<Rating> implements RatingService {
    @Override
    public BaseRepository<Rating, Long> getRepository() {
        return null;
    }
}
