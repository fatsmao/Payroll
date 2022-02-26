package com.example.springboot;

import java.util.ArrayList;

public interface EmployeeRepository {
    void addEmployee(Employee employee);
    Employee[] listEmployee();
}
