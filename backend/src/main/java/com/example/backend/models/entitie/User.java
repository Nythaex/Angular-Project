package com.example.backend.models.entitie;

import jakarta.persistence.*;

@Entity
public class User extends BasicEntity{

    public User() {
    }

    public User( String email, String password) {
        this.email = email;
        this.password = password;

    }



    @Column(unique = true)
    private String email;


    @Column(nullable = false)
    private String password;







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
