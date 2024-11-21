/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phase1.programming;

import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */
public class Phase1Programming{

    public static void main(String[] args) {
        
        String username;
        String password;
        String firstname;
        String lastname;
        //Creation of a scanner object
        Scanner sc=new Scanner(System.in);
        
        final JDialog dialog =new JDialog();
        dialog.setAlwaysOnTop(true);
        //creating an instance of the class
        Login login=new Login();
        //function that generates required account creation messages 
        System.out.println("===========WELCOME TO OUR REGISTRATION SYSTEM============");
        System.out.println("enter your name :");
        firstname = sc.next();
        
        System.out.println("Enter your last name: ");
        lastname = sc.next();
        
        System.out.println("Enter your Username: ");
        username = sc.next();
        
        System.out.println("Enter your password: ");
        password = sc.next();
        
        
       String accountcreationmessages=login.Registeruser(firstname, lastname, username, password);
       System.out.println(accountcreationmessages);
      
        //Method that checks if user has provided the correct username and password
         //Asking the user for login details
         
         System.out.println("==========CONGRATS YOU HAVE REGISTERED===============\n======= NOW YOU CAN LOGIN ===========");
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
        
      //if statement that display welcome message
        
         if (isLoggedIn){
             
    JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
       
      
          boolean executing=true;
         
         while(executing){
             String Options=JOptionPane.showInputDialog(null, 
                     "Kanban Menu\n"+"1.Add Tasks\n"+"2.View Report\n"+"3.Quit");
         
           //Creating an instance of the add tasks methods
      Taskclass tasks=new Taskclass();
         
      
       switch(Options){
           case"1":
              tasks.addTasks();
             System.out.print("Total hours:"+tasks.returnTotalhours());
             tasks.displayDoneTasks();
             
    
           break;
           
           case"2":JOptionPane.showMessageDialog(null, "Coming Soon...");
           break;
           
           case "3":JOptionPane.showMessageDialog(null, "Quit");
           System.exit(0);
           break;
           
           default:
           JOptionPane.showMessageDialog(null, "This option is not valid,please try again ");
           break;
          
           
          
           
       }
       
         
       }
         
        }
        else{
            JOptionPane.showMessageDialog(null, "You're are not logged in please enter the correct loggin credentials");
       
           
          
           
}
}
           
       
       
                      
               
       
         
       }
         
 
             
         
    

       
         
             
         
       
        
         
        
    
    

       
           
        
               

