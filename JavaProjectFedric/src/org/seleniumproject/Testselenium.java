package org.seleniumproject;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.grid.Main;

public class Testselenium {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.windy.com/");
		String urlname = driver.getCurrentUrl();
		System.out.println(urlname);
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();		
			
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.windy.com/");
		String urlname1 = driver1.getCurrentUrl();
		System.out.println("URL from Firefox: "+urlname1);
		@Nullable
		String title1 = driver1.getTitle();
		System.out.println("Title take from URL from Firefox"+title1);
		driver1.close();		
		
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.windy.com/");
		String urlname2 = driver2.getCurrentUrl();
		System.out.println("URL From Edge: "+urlname2);
		@Nullable
		String title2 = driver2.getTitle();
		System.out.println("Title take from Edge: "+title2);
		driver2.close();		
		
	}
}
