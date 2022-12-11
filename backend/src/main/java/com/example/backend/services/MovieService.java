package com.example.backend.services;

import com.example.backend.models.entities.Movie;

public interface MovieService {

    Movie getMovieById(Long id);
    void saveMovie(Movie movie);
}
