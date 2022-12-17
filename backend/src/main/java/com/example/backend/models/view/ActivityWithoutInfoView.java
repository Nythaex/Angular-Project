package com.example.backend.models.view;

public class ActivityWithoutInfoView {
    private Long id;
    private String title;

    public ActivityWithoutInfoView(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public ActivityWithoutInfoView() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ActivityWithoutInfoView setId(Long id) {
        this.id = id;
        return this;
    }

    public ActivityWithoutInfoView setTitle(String title) {
        this.title = title;
        return this;
    }
}
