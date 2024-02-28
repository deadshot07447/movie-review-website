package com.movieapi.movies.controller;


import com.movieapi.movies.entity.Movie;
import com.movieapi.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/getmovies")
    public ResponseEntity<List<Movie>> getAllMovies() {

        return new ResponseEntity<List<Movie>>(movieService.allMovies() , HttpStatus.OK);
    }

//    @GetMapping("/getmovie/{id}")
//    public ResponseEntity<Optional<Movie>> getMovie(@PathVariable ObjectId id){
//
//        return new ResponseEntity<Optional<Movie>>(movieService.getMovie(id), HttpStatus.OK);
//    }

    @GetMapping("/getmovie/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieByImdbId(@PathVariable String imdbId){

        return new ResponseEntity<Optional<Movie>>(movieService.getMovieByImdbId(imdbId), HttpStatus.OK);
    }



}
