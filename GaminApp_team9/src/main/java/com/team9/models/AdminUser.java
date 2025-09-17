package com.team9.models;

public class AdminUser {
    private String id;
    private String username;
    private String password;

    // Default constructor
    public AdminUser() {
    }

    // Parameterized constructor
    public AdminUser(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Optional: toString method for easy printing
    @Override
    public String toString() {
        return "AdminUser [id=" + id + ", username=" + username + ", password=" + password + "]";
    }
    
}
