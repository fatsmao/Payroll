package com.example.demo.DAO;

import com.example.demo.POJO.Employee;

import java.util.List;

public interface EmployeeDAO {
    int addEmployee(Employee employee);
    List<Employee> displayEmployee();
    int deleteEmployee(Integer ID);
    int updateEmployee(Employee employee);
}


