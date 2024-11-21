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
    String[] taskNames = new String[100]; // Array to hold task names
    String[] taskDescriptions = new String[100]; // Array to hold task descriptions 
    String[] developerDetails = new String[100]; // Array to hold developer details
    int[] taskDurations = new int[100]; // Array to hold task durations
    String[] taskStatuses = new String[100]; // Array to hold task statuses private 
    String[] taskIDs = new String[100];
    
    //Declarations
    
    String TaskName;
      int TaskNumber;
      String TaskDescription;
      String DeveloperDetails;
    int TaskDuration;
      String TaskID;
   String TaskStatus;
      int Totalhours=0;
      String allTaskDetails="";
    
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
            taskNames[k]=TaskName;//Populate taskNames array with data
            
             //Prompting the user for a Task description
            TaskDescription=JOptionPane.showInputDialog(null, "Please enter a task description:");
            taskDescriptions[k]=TaskDescription;//populate taskDescriptions with data
            
            //Calling the check task description method to immediatley offer the  user  with feedback
            checkTaskDescription(TaskDescription);
            
            
            
            //Prompting the user for developer Details
            DeveloperDetails=JOptionPane.showInputDialog(null, "Please enter the developers firstname and lastname");
            developerDetails[k]=DeveloperDetails;// populate developerDetails with data
            
            //Promptng the user for a task duration
            TaskDuration= Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the duration of the task (in hours)"));
           taskDurations[k]=TaskDuration;//populate taskDurations with data
           
            //Accumulating the total number of hours across all tasks
            Totalhours +=TaskDuration;
            
            //Calling the Create Task ID inorder to generate it immediately
            CreateTaskID(TaskName,TaskNumber,DeveloperDetails);
            taskIDs[k]=CreateTaskID(TaskName,TaskNumber,DeveloperDetails);//populate taskIDs array
           
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
            
         taskStatuses[k] = TaskStatus; // Populate taskStatuses array
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
         while (TaskDescription.length() > 50) {
            // Message pops up if the description is too long
            JOptionPane.showMessageDialog(null, "Task description cannot exceed 50 characters.");
            
            // Prompt the user to re-enter a task description
            TaskDescription = JOptionPane.showInputDialog(null, "Please enter a task description (max 50 characters):");
        }

        // If description is valid (length <= 50), show success message
        if (TaskDescription.length() <= 50) {
            JOptionPane.showMessageDialog(null, "Task successfully captured!");
            return true;
        }
        
        return false; // Shouldn't be hit if validation is correct
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
             public void DeveloperArray() {
                 // Sample data for tasks
        taskNames[0] = "Create login";
        taskDescriptions[0] = "Create login page for the application.";
        developerDetails[0] = "Mike Smith";
        taskDurations[0] = 5;  // 5 hours
        taskStatuses[0] = "To Do";
        taskIDs[0] = "CR:1:ITH";
        
        taskNames[1] = "Create Add features";
        taskDescriptions[1] = "Add features for creating user accounts.";
        developerDetails[1] = "Edward Harrison";
        taskDurations[1] = 8;  // 8 hours
        taskStatuses[1] = "Doing";
        taskIDs[1] = "CR:2:SON";
      

        taskNames[2] = "Create reports";
        taskDescriptions[2] = "Generate reports for user activity.";
        developerDetails[2] = "Samantha Paulson";
        taskDurations[2] = 2;  // 2 hours
        taskStatuses[2] = "Done";
        taskIDs[2] = "CR:3:SON";
       
        taskNames[3] = "Add arrays";
        taskDescriptions[3] = "Implement array manipulations.";
        developerDetails[3] = "Glenda Oberholzer";
        taskDurations[3] = 11;  // 11 hours
        taskStatuses[3] = "To Do";
        taskIDs[3] = "AD:4:ZER";
       
    }
                                 
                  
             
    //Method to show tasks with status "Done"
    public void displayDoneTasks(){
        StringBuilder doneTasks=new StringBuilder("Tasks with status 'Done':\n");
    
        for (int i=0;i<taskStatuses.length;i++){
    if ("Done".equals(taskStatuses[i])) { 
        doneTasks.append("Developer: ").append(developerDetails[i]) .append(", Task Name: ").append(taskNames[i]) .append(", Task Duration: ").append(taskDurations[i]) .append("\n"); } }
        JOptionPane.showMessageDialog(null, doneTasks.toString()); 
    }
    public void displayLongestTask() { 
        int maxDuration = 0; 
        int maxIndex = 0; 
        for (int i = 0; i < taskDurations.length; i++) { 
            if (taskDurations[i] > maxDuration) { 
                maxDuration = taskDurations[i]; maxIndex = i; } }
        String longestTask = "Task with the longest duration:\n" + "Developer: " + developerDetails[maxIndex] + ", Task Duration: " + taskDurations[maxIndex]; 
        JOptionPane.showMessageDialog(null, longestTask); }

    // Method to search for a task by name and display task name, developer, and task status
    public void searchTaskByName(String[] taskNames, String[] developerDetails, String[] taskStatuses, String searchName) { 
        for (int i = 0; i < taskNames.length; i++) { 
            if (taskNames[i] != null && taskNames[i].equalsIgnoreCase(searchName)) { 
                String result = "Task Name: " + taskNames[i] + "\n" + "Developer: " + developerDetails[i] + "\n" + "Task Status: " + taskStatuses[i];
                JOptionPane.showMessageDialog(null, result, "Task Details", JOptionPane.INFORMATION_MESSAGE);
                 return;}} 
        JOptionPane.showMessageDialog(null, "Task not found.", "Error", JOptionPane.ERROR_MESSAGE); }
    
}
  
    
















 
    












    

           
     

    

    


    
   
            
      
            
            
            
            
            
            
            

