package com.example.backend.models.entitie;

import jakarta.persistence.*;

@Entity
public class User extends BasicEntity{

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;

    }

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;


    @Column(nullable = false)
    private String password;





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



    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }




}
