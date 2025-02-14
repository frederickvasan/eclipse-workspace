package org.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class base2 {
	
	  static WebDriver driver;
	 
	@BeforeClass
	public static void browserlaunch(String url) {
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	public static void closewindow() {
		 driver.quit();

}
	
}
