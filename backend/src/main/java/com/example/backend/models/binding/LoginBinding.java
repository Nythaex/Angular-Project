package com.example.backend.models.binding;

public class LoginBinding {
    private String email;
    private String password;

    public LoginBinding(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginBinding() {
    }

    public String getEmail() {
        return email;
    }

    public LoginBinding setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginBinding setPassword(String password) {
        this.password = password;
        return this;
    }
}
