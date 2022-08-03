package com.acmeflix.service;

import com.acmeflix.domain.TVShow;
import com.acmeflix.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl extends BaseServiceImpl<TVShow> implements TvShowService {


    @Override
    public BaseRepository<TVShow, Long> getRepository() {
        return null;
    }
}
