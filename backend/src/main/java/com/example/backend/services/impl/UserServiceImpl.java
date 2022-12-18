package com.example.backend.services.impl;

import com.example.backend.models.entitie.User;
import com.example.backend.repositories.UserRepository;
import com.example.backend.services.UserService;
import org.springframework.stereotype.Service;

@Service
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
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
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
    public Boolean checkLogin(String email, String password) {
         User user=getUserByEmail(email);
         return user.getPassword().equals(password);
    }


}
