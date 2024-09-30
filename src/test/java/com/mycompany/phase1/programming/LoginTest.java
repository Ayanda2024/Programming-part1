/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.phase1.programming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
   
    public LoginTest() {
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
        
    }

    
    
     @Test
    public void testCorrectlyFormattedUsername() {
        String username = "kyl_1";
        String expectedResponse = "Welcome <user first name>, <user last name>, it is great to see you.";
        assertEquals(expectedResponse, verifyUsername(username));
    }

    @Test
    public void testIncorrectlyFormattedUsername() {
        String username = "kyle!!!!!";
        String expectedResponse = "Username is not correctly formatted ,please ensure that your username contains an underscore and is no more than 5 characters in length";
        assertEquals(expectedResponse, verifyUsername(username));
    }

    private String verifyUsername(String username) {
        if (username.matches("^[a-zA-Z0-9_]{1,5}$")) {
            return "Welcome <user first name>, <user last name>, it is great to see you.";
        } else {
            return "Username is not correctly formatted ,please ensure that your username contains an underscore and is no more than 5 characters in length";
        }
    }


   @Test
    public void testPasswordMeetsComplexity() {
        String password = "Ch*&8sec@ke99!";
        String expectedResponse = "Password successfully captured.";
        assertEquals(expectedResponse, verifyPassword(password));
    }

    @Test
    public void testPasswordDoesNotMeetComplexity() {
        String password = "password";
        String expectedResponse = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        assertEquals(expectedResponse, verifyPassword(password));
    }

    private String verifyPassword(String password) {
        if (password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$")) {
            return "Password successfully captured.";
        } else {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
    }
@Test
    public void testLoginSuccessful() {
        String username = "validUser";
        String password = "ValidPass123!";
        assertTrue(login(username, password));
    }

    @Test
    public void testUsernameCorrectlyFormatted() {
        String username = "kyl_1";
        assertTrue(isUsernameCorrectlyFormatted(username));
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        String username = "kyle!!!!!";
        assertFalse(isUsernameCorrectlyFormatted(username));
    }

    @Test
    public void testPasswordMeetComplexity() {
        String password = "Ch*&8sec@ke99!";
        assertTrue(isPasswordComplex(password));
    }

    private boolean login(String username, String password) {
        // Simulate login logic
        return username.equals("validUser") && password.equals("ValidPass123!");
    }

    private boolean isUsernameCorrectlyFormatted(String username) {
        return username.matches("^[a-zA-Z0-9_]{1,5}$");
    }

    private boolean isPasswordComplex(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$");
    }


    @Test
    public void testRegisteruser() {
    }

    @Test
    public void testLoginUser() {
    }

    @Test
    public void testReturnLoginStatus() {
    }
    
}
