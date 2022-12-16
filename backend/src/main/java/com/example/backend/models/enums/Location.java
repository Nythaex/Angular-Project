package com.example.backend.models.enums;

public enum Location {
    BEACH("on the beach"),POOL("in the pool"),NEXT_TO_THE_POOL("next to the pool"),HOTEL("in the hotel");

    public final String location;

    private Location(String location) {
        this.location = location;
    }
}
