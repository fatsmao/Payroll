package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeesController {
    private final EmployeeRepository employeeRepositoryField;

    public EmployeesController(EmployeeRepository employeeRepository) {
        employeeRepositoryField = employeeRepository;
    }

    @GetMapping("/Employees")
    public Employee[] index(){
        return employeeRepositoryField.listEmployee();
    }

    public void addEmployee(Employee employee) {
       employeeRepositoryField.addEmployee(employee);
    }

}




