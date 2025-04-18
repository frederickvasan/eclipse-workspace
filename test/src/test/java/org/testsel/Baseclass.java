package org.testsel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	WebDriver driver;
	//1
	
	public void browserlaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	//2
	public WebElement findelementid(String id) {
	  WebElement elementid = driver.findElement(By.id(id));
        return elementid;
    //3
	}
	public WebElement findelementname(String name) {
		WebElement elementname = driver.findElement(By.name(name));
		return elementname;
	}
	//4
	public WebElement findelementxpath(String xpath) {
		WebElement elementxpath = driver.findElement(By.xpath(xpath));
		return elementxpath;
	}
	//5
	public WebElement findelementclassname(String classname) {
              WebElement elementclassname = driver.findElement(By.className(classname));
      return elementclassname;
	}
	//6
	public WebElement findelementtagname(String tagname) {
             WebElement elementtagname = driver.findElement(By.tagName(tagname));
      return elementtagname;
	}
	//7
     public WebElement findelementlinktext(String linktext) {
            WebElement elementlinktext = driver.findElement(By.linkText(linktext));
            return elementlinktext;
	}
     //8
     public WebElement findelementpartiallink(String partiallink) {
    	 WebElement elementpartiallink = driver.findElement(By.partialLinkText(partiallink));
    	 return elementpartiallink;
	}
     //9
     public void driverclose() {
		driver.close();
	}
     //10
     public void threadsleep(int millisec) throws Exception {
		Thread.sleep(millisec);
	}
    //11
     public void selectdropdown(WebElement element, int index) {
    	 Select select = new Select(element);
    	 select.selectByIndex(index);
	}
    //12
     public List<WebElement> printdropdown(WebElement element) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        return options;
	}
     //13
    public String datafromexcel(int rownno, int cellno, String sheetname, String path) throws Exception {
         String celldata = "";
         File file = new File(path);
         FileInputStream fileInputStream = new FileInputStream(file);
         XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
         Sheet sheet = workbook.getSheet(sheetname);
         Row row = sheet.getRow(rownno);
         Cell cell = row.getCell(cellno);
          int celltype = cell.getCellType();
          if (celltype == 1) {
        	 celldata = cell.getStringCellValue();
			
		}
         if (celltype == 0) {
        	 if (DateUtil.isCellDateFormatted(cell)) {
        		 Date dateCellValue = cell.getDateCellValue();
        		 SimpleDateFormat dateformat = new SimpleDateFormat("dd-mmm-yyyy");
				celldata = dateformat.format(dateCellValue);
				
			}
        	 else {
        		 double cellValue = cell.getNumericCellValue();
        		 long longvalue = (long) cellValue;
        		 celldata = String.valueOf(longvalue);
        		 
        	 }
			
		}
         return celldata;
	}
    //14
    public void sendvalues(WebElement element, String data) {
    	element.sendKeys(data);
	}
    //15
    public void draganddropevent(WebElement source, WebElement target) {
             Actions action = new Actions(driver);
             action.dragAndDrop(source, target).perform();
    	
	}
    
}
