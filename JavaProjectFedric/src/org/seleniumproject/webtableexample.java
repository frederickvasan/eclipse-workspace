package org.seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableexample {
	
	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			driver.manage().window().maximize(); Thread.sleep(2000);

			WebElement table = driver. findElement(By.xpath("//table[@class='dataTable']"));

			// to know how many number of rows
			List<WebElement> tableRows = table.findElements(By.tagName("tr"));
			System.out.println(tableRows.size());

			// to know how many number of heading
			List<WebElement> tableHead = table. findElements(By.tagName("th"));
			System.out.println(tableHead.size());

			// to know how many number of data
			List<WebElement> tableData = table. findElements(By.tagName("td"));
			System.out.println(tableData.size());

			// to print one row data
			WebElement row3 = tableRows.get(3);
			System.out.println(row3.getText());
			System.out.println("********** ");

			// to print all of the row data
			for (int i = 0; i < tableRows.size(); i++) {
			WebElement rows = tableRows.get(i);
			System.out.println(rows.getText());
	}
	}
	}
