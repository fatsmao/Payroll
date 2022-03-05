package com.example.demo.Controller;

import com.example.demo.POJO.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PayrollController {
    private final EmployeeService employeeService;
//    private AdminService userService;
//    private MonthService monthService;

    public PayrollController(EmployeeService employeeService) {
//        this.userService = userService;
        this.employeeService = employeeService;
//        this.monthService = monthService;
    }

    //Employees
    @GetMapping("/Employees")
    public List<Employee> getEmployees(){
        return employeeService.displayEmployee();
    }

    @PostMapping("/Employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") Integer ID){
        employeeService.deleteEmployee(ID);
    }

    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee updatedEmployee){
        employeeService.updateEmployee(updatedEmployee);
    }
}
