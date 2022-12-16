package com.example.backend.services;

import com.example.backend.models.entitie.Image;
import org.springframework.stereotype.Service;

@Service
public interface ImageService {
    void delete(Image image);
}
