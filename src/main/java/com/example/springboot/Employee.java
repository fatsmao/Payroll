package com.example.springboot;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee(){}

    public void setName(String name) {
        this.name = name;
    }
}
