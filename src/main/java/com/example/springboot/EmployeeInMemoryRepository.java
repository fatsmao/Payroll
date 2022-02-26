package com.example.springboot;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeInMemoryRepository implements EmployeeRepository{
    public ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee[] listEmployee() {
        return employees.toArray(new Employee[0]);
    }
}
