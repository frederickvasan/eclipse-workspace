package org.seleniumproject;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyTextUsingRobot {

	 public static void main(String[] args) throws Exception {
	      
	            // Create Robot instance
	            Robot robot = new Robot();
	            
	            // Set text to clipboard
	            String text = "Hello, this is copied text!";
	            StringSelection selection = new StringSelection(text);
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	            
	            // Simulate Ctrl+V to paste the copied text
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            
	            System.out.println("Text copied and pasted successfully.");
	        
	    }
}
