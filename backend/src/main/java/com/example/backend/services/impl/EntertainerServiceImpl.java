package com.example.backend.services.impl;

import com.example.backend.models.entitie.Entertainer;
import com.example.backend.repositories.EntertainerRepository;
import com.example.backend.services.EntertainerService;

public class EntertainerServiceImpl implements EntertainerService {
    private final EntertainerRepository entertainerRepository;

    public EntertainerServiceImpl(EntertainerRepository entertainerRepository) {
        this.entertainerRepository = entertainerRepository;
    }

    @Override
    public void saveEntertainer(Entertainer entertainer) {
        entertainerRepository.save(entertainer);
    }

    @Override
    public Entertainer getEntertainerById(Long id) {
        return entertainerRepository.findById(id).orElse(null);
    }
}
