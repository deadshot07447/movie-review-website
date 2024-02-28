package com.movieapi.movies.service;

import com.movieapi.movies.entity.Movie;
import com.movieapi.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovie(ObjectId id){

        return movieRepository.findById(id);
    }

    public Optional<Movie> getMovieByImdbId(String imdbId){

        return movieRepository.findMovieByImdbId(imdbId);
    }
}
