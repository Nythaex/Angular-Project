package com.example.backend.services.impl;

import com.example.backend.models.entitie.Activity;
import com.example.backend.repositories.ActivityRepository;
import com.example.backend.services.ActivityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    private final ActivityRepository activityRepository;

    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;

    }

    @Override
    public Activity getActivityById(Long id) {
        return activityRepository.findById(id).orElse(null);
    }

    @Override
    public void saveActivity(Activity activity) {
        System.out.println(activity.getImage());
       activityRepository.save(activity);
    }

    @Override
    public List<Activity> getAll() {
       return activityRepository.findAll();
    }
}
