/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phase1.programming;

/**
 *
 * @author RC_Student_lab
 */
public class Phase1Programming {

    public static void main(String[] args) {
        //creating an instance of the class
        Login login=new Login();
        //Method that returns necessary registration messages 
       String registrationmessage=login.Registeruser();
       System.out.println(registrationmessage);
    }
}
