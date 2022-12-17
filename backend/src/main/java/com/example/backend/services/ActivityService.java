package com.example.backend.services;

import com.example.backend.models.entitie.Activity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActivityService {

    Activity getActivityById(Long id);
    void saveActivity(Activity movie);
    List<Activity> getAll();
}
