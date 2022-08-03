package com.acmeflix.service;

import com.acmeflix.domain.Movie;
import com.acmeflix.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService {
    @Override
    public BaseRepository<Movie, Long> getRepository() {
        return null;
    }
}
