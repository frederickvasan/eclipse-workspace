package org.testsel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabledemo {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		 driver.manage().window().maximize();
		 WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		 List<WebElement> tablerows = table.findElements(By.tagName("tr"));
		 System.out.println(tablerows.size());
		 List<WebElement> tablecols = table.findElements(By.tagName("th"));
		 System.out.println(tablecols.size());
		 List<WebElement> tabledata = table.findElements(By.tagName("td"));
		 System.out.println(tabledata.size());
		 Thread.sleep(2000);
		 WebElement row2 = tablerows.get(2);
		 System.out.println(row2.getText());
		 
		 List<WebElement> tableda2 = row2.findElements(By.tagName("td"));
		 for (int i = 0; i < tableda2.size(); i++) {
			System.out.println(tableda2.get(i).getText());
		}
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 Thread.sleep(2000);
	   for (int i = 0; i  < tablerows.size(); i++) {
		   WebElement rows = tablerows.get(i);
		   System.out.println(rows.getText());
		 
		
	}
	   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	   
	   for (int i = 0; i < tablerows.size(); i++) {
		   List<WebElement> finalda = tablerows.get(i).findElements(By.tagName("td"));
		   System.out.println("***********************************************************************************************");
		   for (int j = 0; j < finalda.size(); j++) {
			   String text = finalda.get(j).getText();
			   System.out.println(text);
		
		}
		
	}
		 driver.close();
		 
		 
		 
	}

}
