package org.selenimun;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelread {
	
	public static void main(String[] args) throws IOException {
		
	
	//1. to mention the path of the excel file to read
	File file = new File("C:\\Users\\fnobl\\eclipse-workspace\\Testselinum\\src\\test\\resources\\Excel\\Framework.xlsx");

	//2. to read the input from excel file -> FileInputStream
	FileInputStream fileInputStream = new FileInputStream(file);

	//3. to mention the type of file to access - .xlxs
	@SuppressWarnings("resource")
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	
	//4. to get the sheet -> Workbook: I -> getSheet() - abs - Sheet:I
	Sheet sheet = workbook.getSheet("testdata");

	//5. to get the row
	Row row = sheet.getRow(2);

	//6. to get the cell
	Cell cell = row.getCell(1);

	//7. to print the cell data
	System.out.println(cell);

	// to know the physical number of rows and cells
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	System.out.println(physicalNumberOfRows);

	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	System.out.println(physicalNumberOfCells);

	// to read a row data
	Row row2 = sheet.getRow(3);

	for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
	Cell cell2 = row2.getCell(i);
	System.out.println(cell2);

	}

	// to print all row data one by one
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

	Row rowData = sheet.getRow(i);

	for (int j = 0; j < rowData.getPhysicalNumberOfCells(); j++) {

	Cell cell2 = rowData.getCell(j);
	System.out.println(cell2);
	}
	}
	}
}

