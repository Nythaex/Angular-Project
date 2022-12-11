package com.example.backend.services.impl;

import com.example.backend.models.entities.UserRole;
import com.example.backend.repositories.UserRoleRepository;
import com.example.backend.services.UserRoleService;

public class UserRoleServiceImpl implements UserRoleService {
    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public void saveRole(UserRole role) {
        userRoleRepository.save(role);
    }

    @Override
    public UserRole getRole(Long id) {
        return userRoleRepository.findById(id).orElse(null);
    }
}
