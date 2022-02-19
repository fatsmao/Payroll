package com.example.springboot;
import static org.junit.Assert.*;


import org.testng.annotations.Test;

public class HelloControllerTest2 {
    @Test
    public static void returnsCorrectGreeting(){
        //Arrange
      HelloController helloController = new HelloController();
        //Action
      String receivedGreeting = helloController.index();
        //Assert
      assertEquals(receivedGreeting, "Greetings from Discord!");
    }
}
//Red - Write a failing Unit Test
//Green - Write the most simple possible code to make the Unit Test past
//Refactor - Look at current code and rest of the code in the system, and ask ourselves, can we make this cleaner /
//implement better practices? - IMPORTANT: Refactor code should NEVER change functionality of our code.

//Triple A
//Arrange/Assemble
//Action
//Assert
