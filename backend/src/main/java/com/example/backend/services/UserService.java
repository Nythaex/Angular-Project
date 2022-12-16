package com.example.backend.services;

import com.example.backend.models.entitie.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

     void saveUser(User user);
      User getUserByEmail(String username);
     User getUser(Long id);
     boolean existByEmail(String value);
     boolean existByUsername(String value);
}
