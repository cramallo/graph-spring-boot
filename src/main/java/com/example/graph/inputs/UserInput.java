package com.example.graph.inputs;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserInput {
    private String name;
    private String lastName;
    private String email;
    private String country;
}
