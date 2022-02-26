package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @PostMapping("/AddEmployee")
    public void addEmployee(@RequestBody Employee employee) {
       employeeRepositoryField.addEmployee(employee);

    }

}




