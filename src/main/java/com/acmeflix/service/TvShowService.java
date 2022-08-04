package com.acmeflix.service;

import com.acmeflix.domain.Season;
import com.acmeflix.domain.TVShow;

public interface TvShowService extends BaseService<TVShow, Long> {
    public TVShow findByYear(String year);

    public TVShow findByTitle(String title);

    void addSeasons(TVShow tvShow, Season... season);
}
