package com.example.backend.models.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BasicEntity(Long id) {
        this.id = id;
    }

    public BasicEntity() {
    }

    public Long getId() {
        return id;
    }

    public BasicEntity setId(Long id) {
        this.id = id;
        return this;
    }
}