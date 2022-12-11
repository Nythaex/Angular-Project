package com.example.backend.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class User extends BasicEntity{

    public User() {
    }

    public User(String username, String email, String phoneNumber, String password, List<UserRole> roles, List<Reservation> reservation) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.roles = roles;
        this.reservation = reservation;
    }

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;


    @Column()
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @ManyToMany()
    private List<UserRole> roles;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user")
    private List<Reservation> reservation;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public User setRoles(List<UserRole> roles) {
        this.roles = roles;
        return this;
    }

    public List<Reservation> getReservation() {
        return reservation;
    }

    public User setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
        return this;
    }
}
