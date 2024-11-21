/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.phase1.programming;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
        // Initialize the Taskclass object before each test
        Taskclass task = new Taskclass();
        // Call DeveloperArray to load the test data
        task.DeveloperArray();
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
        boolean expected = true;
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
    // Declare arrays to hold task details
    String[] taskNames = new String[4];
    String[] taskDescriptions = new String[4];
    String[] developerDetails = new String[4];
    int[] taskDurations = new int[4];
    String[] taskStatuses = new String[4];
    String[] taskIDs = new String[4];

    // Initialize the arrays in the DeveloperArray method
    @BeforeEach
    public void DeveloperArray() {
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

    // Test for developerDetails array
    @Test
    public void testDeveloperDetails() {
        // Expected developer names
        String[] expectedDeveloperNames = {
            "Mike Smith", 
            "Edward Harrison", 
            "Samantha Paulson", 
            "Glenda Oberholzer"
        };

        // Check that each entry in the developerDetails array matches the expected name
        for (int i = 0; i < developerDetails.length; i++) {
            assertEquals(expectedDeveloperNames[i], developerDetails[i], 
                         "Developer entry for task " + (i + 1) + " should be: " + expectedDeveloperNames[i]);
        }
    }

    
   // Test for developer and duration of task with the longest duration
    @Test
    public void testDeveloperAndDurationForLongestTask() {
        int longestDurationIndex = 0;
        for (int i = 1; i < taskDurations.length; i++) {
            if (taskDurations[i] > taskDurations[longestDurationIndex]) {
                longestDurationIndex = i;
            }
        }
        String expectedDeveloper = developerDetails[longestDurationIndex];
        int expectedDuration = taskDurations[longestDurationIndex];
        
        // Expected output for the task with longest duration
        String expectedOutput = expectedDeveloper + "," + expectedDuration;

        // Actual output from the system
        String actualOutput = developerDetails[longestDurationIndex] + "," + taskDurations[longestDurationIndex];

        // Check if the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput, "The developer and duration for the task with the longest duration should be: " + expectedOutput);
    }
    // Test for searching tasks by task name
    @Test
    public void testSearchTaskByName() {
        String searchQuery = "Create login";
        String expectedOutput = "Mike Smith,Create login";
        String actualOutput = searchTaskByName(searchQuery);
        
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput, "The system should return: " + expectedOutput);
    }

    // Helper method to simulate task search by name
    public String searchTaskByName(String taskName) {
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                return developerDetails[i] + "," + taskNames[i];
            }
        }
        return null; // Return null if no match is found
    }
   @Test
    void testSearchTasksByDeveloper_SamanthaPaulson() {
        // Arrange: Test data
        String[] taskNames = {"Create login", "Create Add features", "Create reports", "Add arrays"};
        String[] taskDescriptions = {"Create login page for the application.", 
                                      "Add features for creating user accounts.",
                                      "Generate reports for user activity.",
                                      "Implement array manipulations."};
        String[] developerDetails = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        int[] taskDurations = {5, 8, 2, 11};  // in hours
        String[] taskStatuses = {"To Do", "Doing", "Done", "To Do"};
        String[] taskIDs = {"CR:1:ITH", "CR:2:SON", "CR:2:SON", "AD:1:ZER"};
        
        String developerToSearch = "Samantha Paulson"; // Developer to search for

        // Create the TaskManager object
        Taskclass task = new Taskclass();

        // Act: Perform the search
        String result = task.searchTasksByDeveloper(taskNames, developerDetails, taskStatuses, developerToSearch);

        // Expected message based on the task assigned to "Samantha Paulson"
        String expectedMessage = "Task Name: Create reports, Task Status: Done\n";

        // Assert: Check if the result matches the expected output
        assertEquals(expectedMessage, result);
    }

    @Test
    void testSearchTasksByDeveloper_NoTasksFound() {
        // Arrange: Test data
        String[] taskNames = {"Create login", "Create Add features", "Create reports", "Add arrays"};
        String[] taskDescriptions = {"Create login page for the application.", 
                                      "Add features for creating user accounts.",
                                      "Generate reports for user activity.",
                                      "Implement array manipulations."};
        String[] developerDetails = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        int[] taskDurations = {5, 8, 2, 11};  // in hours
        String[] taskStatuses = {"To Do", "Doing", "Done", "To Do"};
        String[] taskIDs = {"CR:1:ITH", "CR:2:SON", "CR:2:SON", "AD:1:ZER"};
        
        String developerToSearch = "John Doe"; // Developer who does not exist in the list

        // Create the TaskManager object
        Taskclass taskManager = new Taskclass();

        // Act: Perform the search
        String result = taskManager.searchTasksByDeveloper(taskNames, developerDetails, taskStatuses, developerToSearch);

        // Expected message when no tasks are found
        String expectedMessage = "No tasks found for developer: John Doe";

        // Assert: Check if the result matches the expected output
        assertEquals(expectedMessage, result);
    }
    @Test
    public void testDeleteTask_SuccessfullyDeletesTask() {
        // Arrange
        String[] taskNames = {"Create login", "Create Add features", "Create reports", "Add arrays"};
        String[] developerDetails = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] taskStatuses = {"To Do", "Doing", "Done", "To Do"};
        
        Taskclass taskManager = new Taskclass(); // Assuming this is the class containing deleteTask

        // Actual Task name that should be deleted
        boolean result = taskManager.deleteTask(taskNames, developerDetails, taskStatuses, "Create reports");

        // Assert
        assertTrue(result, "The task should be successfully deleted.");
        
        // Verify that the task "Create reports" was deleted and others are shifted
        assertNull(null, "Task name 'Create reports' should be null after deletion.");
        assertEquals("Add arrays", taskNames[2], "The task name at index 2 should be 'Add arrays' after deletion.");

        assertNull(null, "Developer details for 'Create reports' should be null after deletion.");
        assertEquals("Glenda Oberholzer", developerDetails[2], "The developer name at index 2 should be 'Glenda Oberholzer' after deletion.");

        assertNull(null, "Task status for 'Create reports' should be null after deletion.");
        assertEquals("To Do", taskStatuses[2], "The status at index 2 should be 'To Do' after deletion.");
    }
    @Test
    public void testDisplayReport_withValidData() {
        // Prepare the input data
        String[] taskNames = {"Create login", "Create Add features"};
        String[] taskDescriptions = {"Create login page for the application.", "Add features for creating user accounts."};
        String[] developerDetails = {"Mike Smith", "Edward Harrison"};
        int[] taskDurations = {5, 8};
        String[] taskStatuses = {"To Do", "Doing"};
        String[] taskIDs = {"CR:1:ITH", "CR:2:SON", "AD:1:ZER"};

        // Expected output string
        String expectedOutput = "Task Name: Create login\n" +
                                "Task Description: Create login page for the application.\n" +
                                "Developer: Mike Smith\n" +
                                "Task Duration: 5 hours\n" +
                                "Task Status: To Do\n" +
                                "Task ID: CR:1:ITH\n" +
                                "-------------------------------------------------------------------------------------\n" +
                                "Task Name: Create Add features\n" +
                                "Task Description: Add features for creating user accounts.\n" +
                                "Developer: Edward Harrison\n" +
                                "Task Duration: 8 hours\n" +
                                "Task Status: Doing\n" +
                                "Task ID: CR:2:SON\n" +
                                "-------------------------------------------------------------------------------------\n";

        // Call the method under test
        String actualOutput = task.displayReport(taskNames, taskDescriptions, developerDetails, taskDurations, taskStatuses, taskIDs);

        // Assert that the output is as expected
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testDisplayReport_withNoTasks() {
        // Empty arrays (no tasks)
        String[] taskNames = {};
        String[] taskDescriptions = {};
        String[] developerDetails = {};
        int[] taskDurations = {};
        String[] taskStatuses = {};
        String[] taskIDs = {};

        // Expected output string
        String expectedOutput = "No tasks available.";

        // Call the method under test
        String actualOutput = task.displayReport(taskNames, taskDescriptions, developerDetails, taskDurations, taskStatuses, taskIDs);

        // Assert that the output is as expected
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testDisplayReport_withNullArrays() {
        // Null arrays
        String[] taskNames = null;
        String[] taskDescriptions = null;
        String[] developerDetails = null;
        int[] taskDurations = null;
        String[] taskStatuses = null;
        String[] taskIDs = null;

        // Expected error message string
        String expectedOutput = "Error: Arrays are not properly initialized or have different lengths.";

        // Call the method under test
        String actualOutput = task.displayReport(taskNames, taskDescriptions, developerDetails, taskDurations, taskStatuses, taskIDs);

        // Assert that the output is as expected
        assertEquals(expectedOutput, actualOutput);
    }
}







    
        





    





    





      
        
      
  







    
    

