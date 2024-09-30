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
        String username="Aya_1";
        String password="Berry@1992!";
        String firstname="Ayanda";
        String lastname="Ngwenya";
        String enteredusername;
        String enteredpassword;

        //Function that ensures that the entered username is formatted correctly
         public boolean checkusername(String enteredusername){
    // using an if statement to validate enteredusername and password
            if (enteredusername.contains("_")&& enteredusername.length() > 1&&enteredusername.length()<=5){
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
         public  boolean PasswordComplexity(String enteredpassword){
        // using an if statement to ensure password complexity rules are met
        if (enteredpassword.length()>=8 && enteredpassword.contains(".[A-Z].")&& enteredpassword.contains(".[0-9].")&& enteredpassword.contains("!")||enteredpassword.contains("@")||enteredpassword.contains("#")||enteredpassword.contains("$")||enteredpassword.contains("%")||enteredpassword.contains("^")||enteredpassword.contains("&")){
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
          public  String Registeruser(){
        
        //Creating a scanner object
        Scanner sc=new Scanner(System.in);
        //Prompting the user for information required to create an account
        System.out.println("Enter your username:");
       enteredusername=sc.next();
        
        System.out.println("Enter your password:");
        enteredpassword=sc.next();
        
        System.out.println("Enter your firstname:");
         firstname=sc.next();
        
        System.out.println("Enter your lastname:");
         lastname=sc.next();
        
         //Registration logic
         System.out.println("Username:"+enteredusername);
         
        //Message that outputs if username format is correct and if the passwordcomplexity requirement are met
            
        if (checkusername(enteredusername)&&PasswordComplexity(enteredpassword)){
            
            System.out.println("You have been succesfully registered username:"+enteredusername);
           
          return "Account created Successfully" ;
        }
        //Message that outputs if username format is incorrect correct or passwordcomplexity requirements are not met
        else {
            System.out.println("Username incorrectly formatted or PasswordComplexity requirements not met");
        }
            return "Failed to Create Account";
        
        
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


