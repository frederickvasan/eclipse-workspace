package org.selenimun;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelread2 {

	public static void main(String[] args) throws IOException {
		
		//1. to mention the path of the excel file to read
		File file = new File("C:\\Users\\fnobl\\eclipse-workspace\\Testselinum\\src\\test\\resources\\Excel\\Framework.xlsx");

		//2. to read the input from excel file -> FileInputStream
		FileInputStream fileInputStream = new FileInputStream(file);

		//3. to mention the type of file to access - .xlxs
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		
		//4. to get the sheet -> Workbook: I -> getSheet() - abs - Sheet:I
		Sheet sheet = workbook.getSheet("testdata");
	
		// to print all row data one by one
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

		Row rowData = sheet.getRow(i);

		for (int j = 0; j < rowData.getPhysicalNumberOfCells(); j++) {

		Cell cell2 = rowData.getCell(j);
//		System.out.println(cell2);
		

		// to get the cell type
		int cellType = cell2.getCellType();
//		System.out.println(cellType);
		// cellType == 1 - alpha / string
		if (cellType == 1) { // getStringCellValue()
		String stringCellValue = cell2.getStringCellValue();
		System.out.println(stringCellValue);
		}

		// cellType == 0 - numerical
		if (cellType == 0) { // getNumericalCellValue()
		double numericCellValue = cell2.getNumericCellValue();
		long longvalue = (long) numericCellValue;
		String valueOf = String.valueOf(longvalue);
		System.out.println(valueOf);
		
		
		
//		 WebDriver driver = new ChromeDriver(); //
//		 driver.get("https://www.facebook.com/"); // WebElement phone =
//		 driver.findElement(By.id("email")); // phone.sendKeys(valueOf); //
//		 System.out.println("mobile number passed to field");
		 }
		}
		
		
		

}
	}
}
