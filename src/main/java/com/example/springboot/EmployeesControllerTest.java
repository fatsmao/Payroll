package com.example.springboot;
import static org.junit.Assert.*;
import org.testng.annotations.Test;

public class EmployeesControllerTest {
    @Test
    public static void returnsCorrectHardCodedEmployees(){
        //Arrange
        EmployeesController employeesController = new EmployeesController();
        //Action
        Employee employee = employeesController.index();
        //Assert
        assertEquals("Ned", employee.getName());
    }
}
