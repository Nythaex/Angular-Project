package com.example.backend.services;

import com.example.backend.services.impl.CloudinaryImage;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
public interface CloudinaryService {
    CloudinaryImage upload(MultipartFile multipartFile) throws IOException;

    boolean delete(String publicId);
}
