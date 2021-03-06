//package com.example.springboot;
//import static org.junit.Assert.*;
//
//import org.mockito.verification.VerificationMode;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.testng.annotations.Test;
//
//import static org.mockito.Mockito.*;
//
//@SpringBootTest
//public class PayrollControllerTest {
//    @Test
//    public static void returnsListOfEmployees(){
//        //Arrange
//        EmployeeDAO employeeRepositoryMock = mock(EmployeeDAO.class);
//        EmployeesController employeesController = new EmployeesController(employeeRepositoryMock);
//        Employee[] expectedEmployees = {new Employee("Ned")};
//        when(employeeRepositoryMock.listEmployee()).thenReturn(expectedEmployees);
//        //Action
//        Employee[] actualEmployees = employeesController.index();
//        //Assert
//        assertEquals("Ned", actualEmployees[0].getName());
//    }
//
////    @Test
////    public static void returnsCorrectHardCodedEmployeeTwo(){
////        //Arrange
////        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
////        EmployeesController employeesController = new EmployeesController(employeeRepository);
////        //Action
////        Employee[] employees = employeesController.index();
////        //Assert
////        assertEquals("Fatma", employees[1].getName());
////    }
//
//    @Test
//    public static void dataAccessLayerReceivesCorrectValue(){
//        //Arrange
//        //Create a mock data access layer(so we can write some assertations later around that access layer.
//        //Create an Employees controller which uses the mock data access layer.
//        EmployeeDAO employeeRepository = mock(EmployeeDAO.class);
//        EmployeesController employeesController = new EmployeesController(employeeRepository);
//        //Action
//        //Added an employee with well-known data.
//        Employee employee = new Employee("Ned");
//        employeesController.addEmployee(employee);
//        //Assert
//        //Check employee was added
//        //verify the data access layer was called with the correct parameters.
//        verify(employeeRepository, times(1)).addEmployee(employee);
//    }
//}
