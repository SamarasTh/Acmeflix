package com.acmeflix.repository;

import com.acmeflix.domain.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends BaseRepository<Movie, Long> {
    List<Movie> findByTitle(String title);
}
