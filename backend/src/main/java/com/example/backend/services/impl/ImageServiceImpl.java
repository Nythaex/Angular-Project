package com.example.backend.services.impl;

import com.example.backend.models.entitie.Image;
import com.example.backend.repositories.ImageRepository;
import com.example.backend.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;

public class ImageServiceImpl implements ImageService {

    private ImageRepository imageRepository;
    private CloudinaryServiceImpl cloudinaryService;

    @Autowired
    public ImageServiceImpl(ImageRepository imageRepository, CloudinaryServiceImpl cloudinaryService) {
        this.imageRepository = imageRepository;
        this.cloudinaryService = cloudinaryService;
    }

    @Override
    public void delete(Image image) {
        cloudinaryService.delete(image.getPublicId());
        imageRepository.delete(image);
    }
}
