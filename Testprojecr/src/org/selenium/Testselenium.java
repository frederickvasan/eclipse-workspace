package org.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testselenium {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("q")).sendKeys("Test");
		 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		 Thread.sleep(2000);
		 driver.close();
//		  eamil.sendKeys("Test");
		 
		
	}
}