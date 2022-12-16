package com.example.backend.models.binding;

import jakarta.persistence.Column;

public class RegisterBinding {

    private String username;


    private String email;



    private String password;

    public RegisterBinding(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public RegisterBinding() {
    }

    public String getUsername() {
        return username;
    }

    public RegisterBinding setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RegisterBinding setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterBinding setPassword(String password) {
        this.password = password;
        return this;
    }
}
