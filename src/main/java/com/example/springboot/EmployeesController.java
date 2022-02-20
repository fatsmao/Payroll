package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {
    private final EmployeeRepository employeeRepositoryField;

    public EmployeesController(EmployeeRepository employeeRepository) {
        employeeRepositoryField = employeeRepository;
    }

    @GetMapping("/Employees")
    public Employee[] index(){
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Ned");
        employees[1] = new Employee("Fatma");
        return employees;
    }

    public void addEmployee(Employee employee) {
       employeeRepositoryField.addEmployee(employee);
    }

}




