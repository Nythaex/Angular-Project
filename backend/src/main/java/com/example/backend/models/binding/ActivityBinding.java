package com.example.backend.models.binding;

import org.springframework.web.multipart.MultipartFile;

public class ActivityBinding {


    String title;


    String location;


    String description;


    String image;


    public ActivityBinding(String title,String location, String description, String image) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.image = image;
    }

    public ActivityBinding() {
    }

    public String getTitle() {
        return title;
    }

    public ActivityBinding setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public ActivityBinding setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ActivityBinding setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImage() {
        return image;
    }

    public ActivityBinding setImage(String image) {
        this.image = image;
        return this;
    }
}
