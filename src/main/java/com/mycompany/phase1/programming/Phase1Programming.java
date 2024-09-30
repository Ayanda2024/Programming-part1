/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phase1.programming;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Phase1Programming {

    public static void main(String[] args) {
        //Creation of a scanner object
        Scanner sc=new Scanner(System.in);
        //creating an instance of the class
        Login login=new Login();
        //function that generates required account creation messages 
       String accountcreationmessages=login.Registeruser();
       System.out.println(accountcreationmessages);
      
        //Method that checks if user has provided the correct username and password
         //Asking the user for login details
       System.out.println("Please enter username");
      String enteredusername=sc.next();
       System.out.println("Enter password");
       String enteredpassword=sc.next();
        
        String validation=login.loginUser(enteredusername,enteredpassword);
        System.out.println(validation);
        
       
        //Method that returns necessary login status
        boolean isLoggedIn=validation.startsWith("Welcome");
        String loginresult=login.returnLoginStatus(isLoggedIn);
        System.out.println(loginresult);
    }
}
