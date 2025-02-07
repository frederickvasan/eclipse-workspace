package org.seleniumproject;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatortest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		 WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("fnoble20@gmail.com");
		 WebElement pass = driver.findElement(By.name("pass"));
		 pass.sendKeys("Fred1980!");
	//	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	 		 driver.close();	
		 
		 
	}
}
