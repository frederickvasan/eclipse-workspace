package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtabsexample {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize(); Thread.sleep(2000);
	
	WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	btn1.click();Thread.sleep(1000);
	
	driver.switchTo().alert().accept(); Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a [text()='Alert with OK & Cancel ']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	 Thread.sleep(1000);
	 
	 driver.switchTo().alert().dismiss(); Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//a [text()='Alert with Textbox ']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	 Thread.sleep(1000);
	 
	 String prompting = driver.switchTo().alert().getText();
	 System.out.println(prompting);
	 
	 driver.switchTo().alert().sendKeys("Hello there");Thread.sleep(2000);
//	 String prompting1 = driver.switchTo().alert().getText();
//	 System.out.println(prompting1);
	 
	 driver.switchTo().alert().accept(); Thread.sleep(2000);
	 
	}
}
