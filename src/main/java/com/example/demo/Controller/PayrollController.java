package com.example.demo.Controller;

import com.example.demo.POJO.Admin;
import com.example.demo.POJO.Employee;
import com.example.demo.Service.AdminService;
import com.example.demo.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PayrollController {
    private final EmployeeService employeeService;
    private final AdminService adminService;
//    private MonthService monthService;

    public PayrollController(AdminService adminService, EmployeeService employeeService) {
        this.adminService = adminService;
        this.employeeService = employeeService;
//        this.monthService = monthService;
    }

    //Employees
    @GetMapping("/Employees")
    public List<Employee> getEmployees(){
        return employeeService.displayEmployee();
    }

    @PostMapping("/Employees")
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

    //Admin
    @GetMapping("/Admin")
    public List<Admin> getAdmin(){
        return adminService.displayAdmin();
    }

    @PostMapping("/Admin")
    public void addAdmin(@RequestBody Admin admin){
        adminService.addAdmin(admin);
    }

    @DeleteMapping("/Admin")
    public void deleteAdmin(@PathVariable("id") Integer id){
        adminService.deleteAdmin(id);
    }

    @PutMapping("/Admin/{id}")
    public void updateAdmin(@RequestBody Admin admin){
        adminService.updateAdmin(admin);
    }

}
