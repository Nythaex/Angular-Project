package com.example.backend.services;

import com.example.backend.models.entitie.Entertainer;
import org.springframework.stereotype.Service;

@Service
public interface EntertainerService {

    void  saveEntertainer(Entertainer entertainer);
    Entertainer getEntertainerById(Long id);
}
