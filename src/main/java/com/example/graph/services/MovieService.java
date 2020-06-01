package com.example.graph.services;

import com.example.graph.entities.Director;
import com.example.graph.entities.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    public Movie getMovie(final String id) {
        return Movie.builder()
                .title("Harry Potter")
                .director(Director.builder().name("pepe").build())
                .id("1")
                .build();
    }
}
