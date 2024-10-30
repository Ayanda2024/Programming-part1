/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phase1.programming;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
class Login {
    //Declarations
        String username;
        String password;
        String firstname;
        String lastname;
//        String enteredusername;
//        String enteredpassword;

        //Function that ensures that the entered username is formatted correctly
         public boolean checkusername(String username){
    // using an if statement to validate enteredusername and password
            if (username.contains("_")&& username.length() > 1&&username.length()<=5){
                //Statement that executes when the format of the username is correct
              System.out.println( "Username successfully captured" );
               
               return true;
            }
            else{
                //Statement that executes when the format of the usernname is incorrect
                System.out.println("Username is not correctly formatted ,please ensure that your username contains an underscore and is no more than 5 characters in length");
                return false;
            }
}
         //Function for ensuring entered password meets Password Complexity requirements
         public  boolean PasswordComplexity(String password){
        // using an if statement to ensure password complexity rules are met
        if (password.length()>=8 && password.contains(".[A-Z].")&& password.contains(".[0-9].")&& password.contains("!")||password.contains("@")|password.contains("#")||password.contains("$")||password.contains("%")||password.contains("^")||password.contains("&")){
          //Statement that executes if entered password meets Password complexity requuirements
            System.out.println("Password successfully captured");
            return true;
            
        }
        else{
            //Statement that executes if entered password does not meet Password complexity requirements
            System.out.println("Password is not correctly formatted ,please ensure that the password contains atleast 8 characters,a capital letter,a number and a special character ");
                    return false;
                    }
        
    }
          public  String Registeruser(String firstname, String lastname, String username, String password){
        
        
              if(!checkusername(username)){
                  System.out.println("incorrect username format");
                  return "Username is not correctly formatted ,please ensure that your username contains an underscore and is no more than 5 characters in length";
              }
              
              if(!PasswordComplexity(password)){
                  System.out.println("Password is not formatted correctly");
                  return "Please ensure that the password contains atleast 8 characters,a capital letter,a number and a special character ";
              }
              
              this.firstname = firstname;
              this.lastname = lastname;
              this.username = username;
              this.password = password;
              
              return "Both username and password are successfully captured";
       
        
        
    }
           public  String loginUser(String enteredusername,String enteredpassword){
           
       
        //ensuring login credentials entered matches the login credentials stored when the user register
        if(enteredusername.equals(username)&&enteredpassword.equals(password)){
            //message that outputs if the tested condition is true
            return"Welcome:"+firstname+""+lastname+"It is great to see you again";
            
            
        }
        else{
            //message that outputs if tested condition is false
       return" Username or password incorrect, please try again";
        }
           }
           //Method that returns relevant login status
        public String returnLoginStatus(boolean isLoggedIn){
            if(isLoggedIn){
                return"Login Successful";
            
        }
            else{
                return"login failed";
            }
        }

  
        }


