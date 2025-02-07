package org.testsel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsel {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		 driver.manage().window().maximize();
//		 driver.findElement(By.name("q")).sendKeys("Test");
//		 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

}
}