package org.selenimun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {
	
	public static void main(String[] args) throws Exception {
		//1. to mention the path of the excel file to wirte
		File file = new File("C:\\Users\\fnobl\\eclipse-workspace\\Testselinum\\src\\test\\resources\\Excel\\framework1.xlsx");

		//2. to mention the type of excel workbook
		Workbook workbbok = new XSSFWorkbook();

		//3. to create the sheet
		Sheet sheet = workbbok.createSheet("testone");

		//4. to create the row
		Row row = sheet.createRow(0);

		//5. to create the cell
		Cell cell = row.createCell(0);

		//6. to set the data in the created cell
		cell.setCellValue("framework");

		//7. to get the file as a output
		FileOutputStream fileOutputStream = new FileOutputStream(file);

		//8. to write in the workbook
		workbbok.write(fileOutputStream);

		System.out.println("completed excel write");
	}

}
