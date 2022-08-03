package com.acmeflix.service;

import com.acmeflix.domain.Movie;
import com.acmeflix.domain.TVShow;
import com.acmeflix.repository.BaseRepository;
import com.acmeflix.repository.TVShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl extends BaseServiceImpl<TVShow> implements TvShowService {
    private final TVShowRepository tvShowRepository;

    @Override
    public BaseRepository<TVShow, Long> getRepository() {
        return this.tvShowRepository;
    }

    @Override
    public Movie findByYear(String year) {
        return null;
    }

    @Override
    public Movie findByTitle(String title) {
        return null;
    }


}
