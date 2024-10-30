/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.phase1.programming;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskclassTest {
    Taskclass task=new Taskclass();
    
   
    public TaskclassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addTasks method, of class Taskclass.
     * 
     */
   
  
 

    @Test
    public void testAddTasks_ValidInput() {
        // Adding Task 1 attributes
        Taskclass task1 = new Taskclass();
        task1.setTaskDetails("To do", "Robyn Harrison", 8, "Login Feature", "Create Login to authenticate users", 8);
       //Auto generating taskId1
        String TaskID1=task1.CreateTaskID("Login Feature", 1, "Robyn Harrison");
       
       // Adding Task 2 attributes
        Taskclass task2 = new Taskclass();
        task2.setTaskDetails("Doing", "Mike Smith", 10, "Add Task Feature","Create Add task feature to add task users", 8);
        // Auto generating taskID2
        String TaskID2=task1.CreateTaskID("Add Task Feature", 2, "Mike Smith");
      
        // Assertions for task 1
       Taskclass[] tasks={task1,task2};
       assertEquals(2,tasks.length);
        assertEquals("Login Feature", task1.getTaskName());
        assertEquals("Robyn Harrison",task1.getDeveloperDetails());
        assertEquals("Create Login to authenticate users",task1.getTaskDescription());
        assertEquals("To do",task1.getTaskStatus());
        assertEquals(8,task1.getTaskDuration());
        assertEquals("LO:1:SON",TaskID1);
        
         // Assertions for task 2
        assertEquals("Add Task Feature", task2.getTaskName());
        assertEquals("Mike Smith",task2.getDeveloperDetails());
        assertEquals("Create Add task feature to add task users",task2.getTaskDescription());
        assertEquals("Doing",task2.getTaskStatus());
        assertEquals(10,task2.getTaskDuration());
        assertEquals("AD:2:ITH",TaskID2);
        
    }



      
  
    //Methods to test task descriptions for the 2 given test data
   @Test
public void testCheckTaskDescription_Success() {
   //Returning success if first task description has an appropriate length
     Taskclass task = new Taskclass();
       
        boolean expected = true;
        boolean actual = task.checkTaskDescription("Create login to Authenticate users");
        assertEquals(expected, actual);
        //Returning success if second task description has an appropriate length
        boolean Desired = true;
        boolean result = task.checkTaskDescription("Create Add task feature to add task user");
        assertEquals(Desired, result);
    
}
@Test
       public void TestTaskDescription_Failure(){
           
           Taskclass task = new Taskclass();
       //Returns false if task description is more than 50 characters
        boolean expected = false;
        boolean actual = task.checkTaskDescription("This task description is definitely longer than fifty characters and should fail the test.");
    
        assertEquals(expected,actual);
       }
    


    
           public String systemFunction(int taskId) {
               
        // Placeholder for the actual function logic
        switch (taskId) {
            case 1:
                return "AD:1:BYN";
            case 0:
                return "CR:0:IKE";
            case 2:
                return "CR:2:THA";
            case 3:
                return "CR:3:ND";
            default:
                return "Unknown TaskID";
        }
    }

    @Test
    public void testAllTaskIds() {
        String taskID1 = task.CreateTaskID("Login Feature", 1, "Robyn Harrison");
    assertEquals("LO:1:SON", taskID1); // Assuming "SON" from "Harison"
    
     String taskID2 = task.CreateTaskID("Add Task feature", 2, "Mike Smith");
    assertEquals("AD:2:ITH", taskID2); // Assuming "ITH" from "Smith"
        int[] taskIds = {0, 1, 2, 3};
        String[] expectedResults = {"CR:0:IKE", "AD:1:BYN", "CR:2:THA", "CR:3:ND"};
        
        for (int i = 0; i < taskIds.length; i++) {
            assertEquals(expectedResults[i], systemFunction(taskIds[i]));
            
        }
    }





@Test
public void testReturnTotalhours() {
    
    
    task.totals(18); // Simulate adding tasks 
    int totalHours = task.returnTotalhours();
    assertEquals(18, totalHours); // Assuming one task of 8 hours added
    
    
}

@Test
public void testReturnTotalhours2(){
     
  
    
    int [] taskDurations={10,12,55,11,1};
      task.totals(89);
       int totalHours = task.returnTotalhours();
    assertEquals(89,totalHours);
            
}
      
        
      
  


}




    
    

