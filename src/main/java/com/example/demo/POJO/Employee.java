package com.example.demo.POJO;

public class Employee {
    private Integer ID;
    private String name;
    private String role;
    private Integer hourlySalary;
    private Integer hoursWorked;

    public Employee(int ID, String name, String role, int hourlySalary, int hoursWorked) {
        this.ID = ID;
        this.name = name;
        this.role = role;
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", hourlySalary=" + hourlySalary +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
