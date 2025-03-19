package org.robot;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



public class CopyTextUsingRobot extends Baseclassmethod {
	
	public static void main(String[] args) throws Exception {
       
		Baseclassmethod a = new Baseclassmethod();
            Robot robot = new Robot();
            
            // Open Flipkart login page (simulated, as Robot cannot open URLs directly)
        
            browserlaunch("https://www.flipkart.com/");
          
            System.out.println("Opening Flipkart login page...");
           
            // Simulate typing an email
            a.clickevent(a.findelementxpath("//span[normalize-space()='Login']"));
            
            String email = "testuser@example.com";
            a.sendvalues(a.findelementxpath("//input[@class='r4vIwl BV+Dqf']"), email);
            StringSelection selection = new StringSelection(email);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
            
            // Simulate Ctrl+V to paste the email in email textbox
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            // Simulate Ctrl+A to select all text
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            // Simulate Ctrl+X to cut the text
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_X);
            robot.keyRelease(KeyEvent.VK_X);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            // Simulate tab key to switch to password field
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            
            // Simulate Ctrl+V to paste in the password field
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            System.out.println("Email cut and pasted into password field successfully.");
        
    }

}
