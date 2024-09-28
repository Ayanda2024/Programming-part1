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
    Login my;
    public LoginTest() {
    }
    
    @BeforeEach
    public void setUp() {
        my= new Login();
    }
    
    @AfterEach
    public void tearDown() {
        my=null;
    }

    @Test
    public void testCheckusername() {
        //Test case 1:Validate username input validation for Empty string
        System.out.print("checkusername");
        String enteredusername="";
        boolean expResult=false;  //The system shall return a value of false for any empty username
        boolean result=my.checkusername(enteredusername);
        
        assertEquals(expResult,result);//Confirm actual result matches expected outcome
        
    }
    @Test
       public  void testcheckusername_Validusername(){
         //Testcase2
    String enteredusername="give_";
     boolean expResult=true;
    boolean result=my.checkusername(enteredusername);
    
    assertEquals(expResult,result);  
       }     
   
      @Test
      // Test case 3: Username without underscore
       public void testCheckusername_Nounderscore(){
          String enteredusername = "give"; 
    boolean expResult = false; 
    boolean result = my.checkusername(enteredusername); 
    assertEquals(expResult, result);
       }
   
    
}
