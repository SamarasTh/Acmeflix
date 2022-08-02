package com.acmeflix.repository;

import com.acmeflix.domain.TVShow;

import java.util.List;

public interface TVShowRepository extends BaseRepository<TVShow, Long> {
    List<TVShow> findByTitle(String title);
}
