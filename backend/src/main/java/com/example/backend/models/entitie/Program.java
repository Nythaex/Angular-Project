package com.example.backend.models.entitie;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Program extends BasicEntity{
    public Program() {
    }

    public Program(String programDate, List<Activity> activities) {
        this.programDate = programDate;
        this.activities = activities;
    }

    @Column
    private String programDate;

    @OneToMany
    private List<Activity> activities;

    public String getProgramDate() {
        return programDate;
    }

    public Program setProgramDate(String programDate) {
        this.programDate = programDate;
        return this;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public Program setActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }
}
