/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phase1.programming;

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

         public boolean checkusername(String enteredusername){
    //ensuring that the entered username is formatted correctly
            if (enteredusername.contains("_")&&enteredusername.length()<=5){
              System.out.println( "Username successfully captured" );
               
               return true;
            }
            else{
                System.out.println("Username is not correctly formatted ,please ensure that your username contains an underscore and is no more than 5 characters in length");
                return false;
            }
}
}
