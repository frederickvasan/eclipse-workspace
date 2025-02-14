package org.testsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomExample {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("fred@gmail.com");

		// the page will refresh for an example
		driver.navigate().refresh();

		// again without finding element directly sending data to field

		// this position will throw StaleElementReferenceException
		emailid.sendKeys("anand123@gmail.com");
	}

}
