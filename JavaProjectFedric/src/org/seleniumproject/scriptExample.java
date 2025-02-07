package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptExample {
	
	public static void main(String[] args) throws InterruptedException {
		// JavaScript example
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// type cast => higher interface to lower interface
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		WebElement emailid = driver.findElement(By.id("email"));
		executor.executeScript("arguments[0].setAttribute('value','westindies@gmail.com')", emailid); Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','pass123')", password); Thread.sleep(1000);

		// how to click element using javascript
		WebElement loginBtn = driver.findElement(By.name("login"));
		executor. executeScript("arguments [2].click()", emailid, password, loginBtn);
	}

}
