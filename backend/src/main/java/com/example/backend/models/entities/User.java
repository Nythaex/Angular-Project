package com.example.backend.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class User extends BasicEntity{
    @Column(unique = true,nullable = false)
    private String username;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

}
