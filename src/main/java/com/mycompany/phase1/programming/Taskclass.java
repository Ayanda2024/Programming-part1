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
   
     //Method that allows users to add tasks 
   public  void addTasks(){
     //Allowing the user to set task number
     
   int NumTasks= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount of tasks to be performed"));
           //for loop to allow the user to enter only set number of tasks
        for(int k=0;k<NumTasks;k++){
            TaskNumber=k+1;
            //int TaskNum=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a TaskNumber"));
            //Prompting the user for the name of task to be performed
            TaskName=JOptionPane.showInputDialog(null, "Enter the name of the task to be performed:");
            
             //Prompting the user for a Task description
            TaskDescription=JOptionPane.showInputDialog(null, "Please enter a task description:");
            
            //Calling the check task description method to immediatley offer the  user  with feedback
            checkTaskDescription(TaskDescription);
            
            
            
            //Prompting the user for developer Details
            DeveloperDetails=JOptionPane.showInputDialog(null, "Please enter the developers firstname and lastname");
            
            //Promptng the user for a task duration
            TaskDuration= Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the duration of the task (in hours)"));
           
            //Accumulating the total number of hours across all tasks
            Totalhours +=TaskDuration;
            
            //Calling the Create Task ID inorder to generate it immediately
            CreateTaskID(TaskName,TaskNumber,DeveloperDetails);
            
            //Prompting user to enter a Task Status
            TaskStatus=JOptionPane.showInputDialog(null, "Please choose a Task status:\n"+"1.To do\n"+"2.Done\n"+"3.Doing");
           
            
           switch (TaskStatus){
               case "1":TaskStatus="To do";
               
               // status  that shows when the user selects option 1
               break;
               
               case"2":TaskStatus="Done";
               // status  that shows when the user selects option 2
               break;
               
               case"3":TaskStatus="Doing";
               // status  that shows when the user selects option 3
               break;
             
              }  
            
         
        returnTotalhours();
        // Append the details of the current task to the allTaskDetails string
            allTaskDetails += printTaskDetails(TaskStatus, DeveloperDetails, TaskNumber, TaskName, TaskDescription, TaskID, TaskDuration) + "\n\n";
        }

        // Display all task details in one JOptionPane
        JOptionPane.showMessageDialog(null, allTaskDetails);
    }
  
    
    
    
    public String totals(int num){
        
        
        Totalhours =num;
      
        
        return ""+Totalhours;
    } 
   //Method to ensure that task description does not exceed 50 characters in lenght
   public boolean checkTaskDescription(String TaskDescription){
        while(TaskDescription.length()<50){
            //Message that pops up if the tested condition is true
            JOptionPane.showMessageDialog(null, "Task successfully Captured");
            return true;
            
        }
       
            
            //Message that pops if the if the tested condition is false
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                
            TaskDescription=JOptionPane.showInputDialog(null, "Please enter a task description:");

       return false;
        }
   
    
   public String CreateTaskID (String TaskName,int TaskNumber,String DeveloperDetails){
       //Extracting first two letters of the TaskName
        String initialSegment=TaskName.substring(0, 2).toUpperCase();
        
        //Extracting last two letters of the Developers name
        String Suffix=DeveloperDetails.substring(DeveloperDetails.length()-3).toUpperCase();
        
        //Creating a task ID
        TaskID=initialSegment+":"+TaskNumber+":"+Suffix;
        JOptionPane.showMessageDialog(null, "TaskId is:"+TaskID);
        
        return TaskID;
    }
//Method that prints the task details
   public String printTaskDetails(String TaskStatus,String DeveloperDetails,int TaskNumber,String TaskName,String TaskDescription,String TaskID,int TaskDuration){
       String TaskDetails="TaskStatus is:"+TaskStatus+"\n"+"DeveloperDetails is:"+"\n"+DeveloperDetails+"\n"+"TaskNumber is:"+TaskNumber+"\n"+"TaskName is:"+TaskName+"\n"+"TaskDescription is:"+TaskDescription+"\n"+"TaskId is"+TaskID+"\n"+"Task Duration:"+TaskDuration+"\n"+"Total hours is:"+Totalhours;
   
      JOptionPane.showMessageDialog(null, TaskDetails);
       
           
       
   return TaskDetails;
   }
   
   //Method that returns total hours
   public int returnTotalhours(){
    
      
   return  Totalhours;
   }

   // Add setter methods for testing
    
    public void setTaskID(String TaskID){
        this.TaskID=TaskID;
    }
    
    
    // Getter for allTaskDetails
    public String getAllTaskDetails() {
        return allTaskDetails;
    }

    }

    


    
   
            
      
            
            
            
            
            
            
            

