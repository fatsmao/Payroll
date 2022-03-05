package com.example.demo.Service;
import com.example.demo.DAO.EmployeeDAO;
import com.example.demo.POJO.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {

        this.employeeDAO = employeeDAO;
    }

    private boolean employeeExists(Integer id){
        return employeeDAO
                .displayEmployee()
                .stream()
                .anyMatch(employee -> Objects.equals(employee.getID(), id));
    }

    public void addEmployee(Employee employee){
        boolean exists = employeeExists(employee.getID());
        if(!exists){
            employeeDAO.addEmployee(employee);
        } else {
            throw new IllegalStateException("Employee already exists");
        }
    }

    public List<Employee> displayEmployee(){
        return employeeDAO.displayEmployee();
    }

    public void deleteEmployee(Integer ID){
        boolean exists = employeeExists(ID);
        if (!exists){
            throw new IllegalStateException("Employee does not exist");
        } else {
            employeeDAO.deleteEmployee(ID);
        }
    }

    public void updateEmployee(Employee employee){
        int result = employeeDAO.updateEmployee(employee);

        if(result !=1) {
            throw new IllegalStateException("Could not find employee in the database. Please try again");
        }
    }

}
