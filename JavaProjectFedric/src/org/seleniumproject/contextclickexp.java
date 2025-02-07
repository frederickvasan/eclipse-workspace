package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclickexp {
	
   public static void main(String[] args) throws InterruptedException {
	
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.manage().window().maximize(); Thread.sleep(2000);

	   WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));

	   Actions actions = new Actions(driver);
	   actions.contextClick(gmail).perform();
}

}
