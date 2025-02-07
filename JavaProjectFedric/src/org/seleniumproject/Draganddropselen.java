package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropselen {
	
	public static void main(String[] args) throws Exception  {
			
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize(); // Thread.sleep(2000);

	WebElement source = driver. findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement dest = driver.findElement(By.id("bank"));

	Actions actions = new Actions(driver);
	actions.dragAndDrop(source, dest).perform();

	
	WebElement source1 = driver. findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
	WebElement dest1 = driver.findElement(By.id("amt7"));
	
	Actions actions1 = new Actions(driver);
	actions1.dragAndDrop(source1, dest1).perform(); Thread.sleep(2000);
	
	driver.close();	

}
}
