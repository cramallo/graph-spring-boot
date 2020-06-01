package com.example.graph.services;

import com.example.graph.entities.User;
import com.example.graph.inputs.UserInput;
import com.example.graph.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(final UserInput userInput) {
        final User user = User.builder()
                .name(userInput.getName())
                .lastName(userInput.getLastName())
                .email(userInput.getEmail())
                .country(userInput.getCountry())
                .build();
        return userRepository.save(user);
    }

    public Optional<User> getUser(final int id) {
        return userRepository.findById(id);
    }
}
