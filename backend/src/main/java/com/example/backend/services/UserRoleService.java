package com.example.backend.services;

import com.example.backend.models.entities.UserRole;
import com.example.backend.models.enums.Role;

public interface UserRoleService {
    void saveRole(UserRole role);
    UserRole getRole(Long id);
}
