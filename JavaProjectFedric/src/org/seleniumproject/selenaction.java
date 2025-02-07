package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenaction {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(courses).perform();

	}

}
