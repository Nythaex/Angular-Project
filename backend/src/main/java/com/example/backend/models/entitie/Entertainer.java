package com.example.backend.models.entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Entertainer extends  BasicEntity {
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String description;

    public Entertainer() {
    }

    public Entertainer(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public Entertainer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Entertainer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Entertainer setDescription(String description) {
        this.description = description;
        return this;
    }
}
