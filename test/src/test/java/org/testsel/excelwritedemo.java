package org.testsel;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwritedemo {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 driver.manage().window().maximize();
//	    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\deepa\\eclipse-workspace\\test\\src\\test\\resources\\Test.xlsx");
		 XSSFWorkbook excelhand = new XSSFWorkbook();
		 XSSFSheet sheet = excelhand.createSheet("Test");
		 int rownum = 0;
		 for (WebElement link : links) {
			 XSSFRow row = sheet.createRow(rownum++);
			 Cell cell1 = row.createCell(0);
			 cell1.setCellValue(link.getText());
			 Cell cell2 = row.createCell(1);
			 cell2.setCellValue(link.getAttribute("href"));
		}
		 FileOutputStream fileoutp = new FileOutputStream(new File("C:\\Users\\fnobl\\eclipse-workspace\\test\\src\\test\\resources\\Test.xlsx"));
		 excelhand.write(fileoutp);
		 fileoutp.close();
		 driver.close();
	}

}
