package com.example.backend.models.entities;

import com.example.backend.models.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name = "role")
public class UserRole extends BasicEntity{
    public UserRole() {
    }

    public UserRole(Role role, List<User> users) {
        this.role = role;
        this.users = users;
    }

    private Role role;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role getRole() {
        return role;
    }

    public UserRole setRole(Role role) {
        this.role = role;
        return this;
    }

    public List<User> getUsers() {
        return users;
    }

    public UserRole setUsers(List<User> users) {
        this.users = users;
        return this;
    }
}
