package com.acmeflix.service;

import com.acmeflix.domain.Movie;
import com.acmeflix.domain.TVShow;

public interface TvShowService extends BaseService<TVShow, Long> {
    public Movie findByYear(String year);

    public Movie findByTitle(String title);


}
