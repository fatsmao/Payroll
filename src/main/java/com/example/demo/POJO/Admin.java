package com.example.demo.POJO;

public class Admin {
    private Integer ID;
    private String username;
    private String name;
    private Boolean isAdmin;
    private String password;

    public Admin(Integer ID, String username, String name, Boolean isAdmin, String password) {
        this.ID = ID;
        this.username = username;
        this.name = name;
        this.isAdmin = isAdmin;
        this.password = password;
    }

    public Admin(boolean isAdmin, String name, String username, int id) {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setManager(Boolean manager) {
        isAdmin = isAdmin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", isAdmin=" + isAdmin +
                ", password='" + password + '\'' +
                '}';
    }
}
