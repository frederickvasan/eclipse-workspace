package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickex {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); Thread.sleep(2000);
		
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("7200983432");

		Actions actions = new Actions(driver);
		actions.doubleClick(emailid).perform();
	}

}
