package com.example.backend.models.entitie;


import com.example.backend.models.enums.Location;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;

@Entity
public class Activity extends BasicEntity{
    public Activity() {
    }

    public Activity(String title, String location, String description,String image) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.image=image;
    }

    @Column
    String title;

    @Column
    String location;

    @Column(length = 110000)
    String description;

    @Column
    String image;

    public String getTitle() {
        return title;
    }

    public Activity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Activity setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Activity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Activity setImage(String image) {
        this.image = image;
        return this;
    }
}
