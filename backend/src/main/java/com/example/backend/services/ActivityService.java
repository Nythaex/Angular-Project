package com.example.backend.services;

import com.example.backend.models.entitie.Activity;
import org.springframework.stereotype.Service;

@Service
public interface ActivityService {

    Activity getActivityById(Long id);
    void saveActivity(Activity movie);
}
