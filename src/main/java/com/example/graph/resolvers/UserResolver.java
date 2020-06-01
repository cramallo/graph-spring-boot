package com.example.graph.resolvers;

import com.example.graph.entities.User;
import com.example.graph.inputs.UserInput;
import com.example.graph.services.UserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserResolver implements GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    UserService userService;

    public User createUser(final UserInput userInput) {
        return userService.createUser(userInput);
    }

    public Optional<User> getUser(final int id) {
        return userService.getUser(id);
    }
}
