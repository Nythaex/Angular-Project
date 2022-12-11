package com.example.backend.repositories;

import com.example.backend.models.entities.UserRole;
import com.example.backend.models.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Long> {


}
