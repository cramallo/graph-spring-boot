package com.example.graph.resolvers;

import com.example.graph.entities.Movie;
import com.example.graph.services.MovieService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieResolver implements GraphQLQueryResolver {
    @Autowired
    private MovieService movieService;

    public Movie getMovie(final String id) {
        return movieService.getMovie(id);
    }
}
