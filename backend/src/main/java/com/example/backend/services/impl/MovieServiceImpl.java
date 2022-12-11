package com.example.backend.services.impl;

import com.example.backend.models.entities.Movie;
import com.example.backend.repositories.MovieRepository;
import com.example.backend.services.MovieService;

public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;

    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMovie(Movie movie) {
       movieRepository.save(movie);
    }
}
