package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptexample2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// to find the title element
		WebElement title = driver. findElement(By.xpath("//h2[@title=' Related Courses for Software Testing' ]"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		// to scroll down
		executor.executeScript("arguments[0].scrollIntoView(true)", title); Thread.sleep(2000);

		// to scroll up
		executor.executeScript("arguments[0].scrollIntoView(false)", title);
	}

}
