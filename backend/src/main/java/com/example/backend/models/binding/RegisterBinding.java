package com.example.backend.models.binding;

import jakarta.persistence.Column;

public class RegisterBinding {




    private String email;



    private String password;

    public RegisterBinding( String email, String password) {

        this.email = email;
        this.password = password;
    }

    public RegisterBinding() {
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
