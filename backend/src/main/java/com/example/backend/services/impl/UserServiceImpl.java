package com.example.backend.services.impl;

import com.example.backend.models.entities.User;
import com.example.backend.repositories.UserRepository;
import com.example.backend.services.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public boolean existByEmail(String value) {
        return  userRepository.existsByEmail(value);
    }

    @Override
    public boolean existByUsername(String value) {
        return userRepository.existsByUsername(value);

    }
}
