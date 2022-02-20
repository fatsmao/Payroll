package com.example.springboot;
import static org.junit.Assert.*;
import org.testng.annotations.Test;
import static org.mockito.Mockito.*;

public class EmployeesControllerTest {
    @Test
    public static void returnsCorrectHardCodedEmployeeOne(){
        //Arrange
        EmployeesController employeesController = new EmployeesController(null);
        //Action
        Employee[] employees = employeesController.index();
        //Assert
        assertEquals("Ned", employees[0].getName());
    }

    @Test
    public static void returnsCorrectHardCodedEmployeeTwo(){
        //Arrange
        EmployeesController employeesController = new EmployeesController(null);
        //Action
        Employee[] employees = employeesController.index();
        //Assert
        assertEquals("Fatma", employees[1].getName());
    }

    @Test
    public static void dataAccessLayerReceivesCorrectValue(){
        //Arrange
        //Create a mock data access layer(so we can write some assertations later around that access layer.
        //Create an Employees controller which uses the mock data access layer.
        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        EmployeesController employeesController = new EmployeesController(employeeRepository);
        //Action
        //Added an employee with well-known data.
        Employee employee = new Employee("Ned");
        employeesController.addEmployee(employee);
        //Assert
        //Check employee was added
        //verify the data access layer was called with the correct parameters.
        verify(employeeRepository, times(1)).addEmployee(employee);
    }
}
