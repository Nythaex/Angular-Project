package com.example.backend.services;

import com.example.backend.models.entities.User;

public interface UserService {

     void saveUser(User user);

     User getUser(Long id);
     boolean existByEmail(String value);
     boolean existByUsername(String value);
}
