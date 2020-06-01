package com.example.graph.entities;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Movie {
    private String id;
    private String title;
    private Director director;
}
