package com.example.springboot;
import static org.junit.Assert.*;
import org.testng.annotations.Test;

public class EmployeesControllerTest {
    @Test
    public static void returnsCorrectHardCodedEmployeeOne(){
        //Arrange
        EmployeesController employeesController = new EmployeesController();
        //Action
        Employee[] employees = employeesController.index();
        //Assert
        assertEquals("Ned", employees[0].getName());
    }

    @Test
    public static void returnsCorrectHardCodedEmployeeTwo(){
        //Arrange
        EmployeesController employeesController = new EmployeesController();
        //Action
        Employee[] employees = employeesController.index();
        //Assert
        assertEquals("Fatma", employees[1].getName());
    }
}
