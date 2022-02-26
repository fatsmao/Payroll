package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    @ResponseStatus( HttpStatus.CREATED )
    public void addEmployee(@RequestBody Employee employee) {
       employeeRepositoryField.addEmployee(employee);

    }

}




