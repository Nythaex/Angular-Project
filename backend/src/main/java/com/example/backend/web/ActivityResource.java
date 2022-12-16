package com.example.backend.web;

import com.example.backend.models.binding.ActivityBinding;
import com.example.backend.models.entitie.Activity;
import com.example.backend.models.enums.Location;
import com.example.backend.services.ActivityService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController()
public class ActivityResource {

    private final ActivityService activityService;

    public ActivityResource(ActivityService activityService) {
        this.activityService = activityService;

    }


    @ResponseStatus( HttpStatus.CREATED)
    @PostMapping("/program/create-activity")
    public void addActivity(@RequestBody ActivityBinding activityBinding)  {

        System.out.println(activityBinding.getTitle());
        System.out.println(activityBinding.getDescription());
        System.out.println(activityBinding.getLocation());
        System.out.println(activityBinding.getImage());


        Activity activity = new Activity();
        activity.setTitle(activityBinding.getTitle());
        activity.setDescription(activityBinding.getTitle());
        activity.setLocation(Location.valueOf("POOL"));
        activity.setImage(activityBinding.getImage());

      activityService.saveActivity(activity);
    }
}
