package com.example.backend.models.view;

import com.example.backend.models.entitie.Activity;

import java.util.ArrayList;
import java.util.List;

public class ProgramView {

   private List<Activity> activities;

    public ProgramView(List<Activity> activities) {
        this.activities = activities;
    }

    public ProgramView() {
        this.activities=new ArrayList<>();
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public ProgramView setActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }
}
