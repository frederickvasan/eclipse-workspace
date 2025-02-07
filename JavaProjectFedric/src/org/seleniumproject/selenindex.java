package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenindex {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
				
		Thread.sleep(4000);
		d.findElement(By.xpath("//button[@value='Refresh']")).click();
		Thread.sleep(1000);
		d.close();
		
		
	}

}
