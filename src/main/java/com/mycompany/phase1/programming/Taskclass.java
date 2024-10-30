/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phase1.programming;

import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */
public class Taskclass {
   
    //Declarations
    String TaskName;
      int TaskNumber;
      String TaskDescription;
      String DeveloperDetails;
    int TaskDuration;
      String TaskID;
   String TaskStatus;
      int Totalhours=0;
      String allTaskDetails;
    
       //Setter which will be used for testing
     public  void setTaskDetails(String TaskStatus, String DeveloperDetails, int TaskDuration, String TaskName, String TaskDescription, int par1) {
        this.TaskStatus = TaskStatus;
        this.DeveloperDetails = DeveloperDetails;
       
        this.TaskName = TaskName;
        this.TaskDescription = TaskDescription;
        
        this.TaskDuration = TaskDuration;
        
        
        
      
        
        
    }
     // Add getters for the fields if needed for testing
    public String getTaskName() { return TaskName; }
    public String getTaskDescription() { return TaskDescription; }
    public String getDeveloperDetails() { return DeveloperDetails; }
    public int getTaskDuration() { return TaskDuration; }
    public String getTaskStatus() { return TaskStatus; }
    public String getTaskID(){return TaskID;}
   
    
    
}

    
   
            
      
            
            
            
            
            
            
            

