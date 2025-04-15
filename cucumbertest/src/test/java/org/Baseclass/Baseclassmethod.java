package org.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class Baseclassmethod {
	
	 static WebDriver driver;
	//1
//	@BeforeClass
	public static void browserlaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}
	//2
	
	public static WebElement findelementID(String id) {
		WebElement elementId = driver.findElement(By.id(id));
		return elementId;		

	}
	//3
	public static WebElement findelementname(String name) {
		WebElement elementname = driver.findElement(By.name(name));
		return elementname;		

	}
//4
	public static WebElement findelementxpath(String xpath) {
		WebElement elementxpath = driver.findElement(By.xpath(xpath));
		return elementxpath;		

	}
	
//5 
	
	public static void sendvalues(WebElement element, String data) {
		element.sendKeys(data);
	}
	
//6
	public void closewindow() {
		 driver.quit();

	}
	
//7 
	public void selectdropdownop(WebElement element, int index) {
		
	Select select = new Select(element);
	select.selectByIndex(index);
		
	}
	//8
	public List<WebElement> printdropdown(WebElement element) {
		Select select = new Select(element);
		List <WebElement> options = select.getOptions();
		// to print all of the options
//		for (int i = 0; i < options.size(); i++) {
//		String text11 = options.get(i).getText();
//		System.out.println(text11);
		return options;
	}
	//9
	public String getdatafromexcel(int rowno, int cellno, String sheetname, String pathname) throws Exception {
		String celldata = " ";
		//1. to mention the path of the excel file to read
		File file = new File(pathname);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int celltype = cell.getCellType();
		if (celltype ==1) {
			celldata = cell.getStringCellValue();
		}
		if (celltype ==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-mmm-yyyy");
				celldata = dateformat.format(dateCellValue);				
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long longvalue = (long) numericCellValue;
				celldata = String.valueOf(longvalue);
			}
		}
		return celldata;
		
		
	}
	
//10 
	public static void waittime(int waiti) throws Exception {		
		Thread.sleep(waiti);

	}
//11	
	public void draganddrop(WebElement source, WebElement destination) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination).perform();
		      
       
	}
	//12
	public void screenshotpic() throws Exception {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	     String fileName = "screenshot_" + timeStamp + ".jpg";
	     String destinationPath = "D:\\\\TestingJava\\\\" + fileName;
		File dest = new File(destinationPath);
		FileUtils.copyFile(source, dest);

	}
	//13
	public void doubleclickevent(WebElement test) {
		Actions actions = new Actions(driver);
		actions.doubleClick(test).perform();

	}
	//14
	public void contextclickevent(WebElement test) {
		   Actions actions = new Actions(driver);
		   actions.contextClick(test).perform();

	}
	// 15
	public void movetoelementevent(WebElement test) {
		Actions actions = new Actions(driver);
		actions.moveToElement(test).perform();
	}
	//16
	public static void clickevent(WebElement click1) {
		click1.click();
	}
	//17
	public WebElement findelementclassname(String classname) {
              WebElement elementclassname = driver.findElement(By.className(classname));
      return elementclassname;
	}
	//18
	public WebElement findelementtagname(String tagname) {
             WebElement elementtagname = driver.findElement(By.tagName(tagname));
      return elementtagname;
	}
	//19
     public WebElement findelementlinktext(String linktext) {
            WebElement elementlinktext = driver.findElement(By.linkText(linktext));
            return elementlinktext;
	}
     //20
     public WebElement findelementpartiallink(String partiallink) {
    	 WebElement elementpartiallink = driver.findElement(By.partialLinkText(partiallink));
    	 return elementpartiallink;
	}
   //21
     public void writedatatoexcel(int rowno, int cellno, String sheetname, String pathname, String data) throws Exception {
//    	 File file = new File(pathname);
//    	 XSSFWorkbook workbook = new XSSFWorkbook(file);
//    	 XSSFSheet sheet = workbook.createSheet(sheetname);
//    	 Row row = sheet.getRow(rowno);
//    	 if (row == null){
//    		 row = sheet.createRow(rowno);			
//		}
//    	 Cell cell = row.getCell(cellno);
//    	 if (cell == null) {
//    		 row.createCell(cellno);
//			
//		}
//    	 cell.setCellValue(data);
//    	 FileOutputStream fileOutputStream = new FileOutputStream(file);
//    	 workbook.write(fileOutputStream);
//    	 
//    	 
//    	 System.out.println("Excel written successfully");
    	 File file = new File(pathname);
    	    FileInputStream fis = new FileInputStream(file);
    	    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    	    // Check if sheet exists, otherwise create it
    	    XSSFSheet sheet = workbook.getSheet(sheetname);
    	    if (sheet == null) {
    	        sheet = workbook.createSheet(sheetname);
    	    }

    	    Row row = sheet.getRow(rowno);
    	    if (row == null) {
    	        row = sheet.createRow(rowno);
    	    }

    	    Cell cell = row.getCell(cellno);
    	    if (cell == null) {
    	        cell = row.createCell(cellno);
    	    }

    	    cell.setCellValue(data);

    	    fis.close(); // Close input stream before writing

    	    FileOutputStream fileOutputStream = new FileOutputStream(file);
    	    workbook.write(fileOutputStream);
    	    fileOutputStream.close();
    	    workbook.close();

    	    System.out.println("Excel written successfully");
    	 
	}
   //22
     public JavascriptExecutor executorscript(String sc) { 
    	 JavascriptExecutor executor = (JavascriptExecutor) driver;
    	 return executor;

	}
     
    //23
     public void switchtabaccept() {
    	 driver.switchTo().alert().accept();
	}
    //24
     public void switchtabdismiss() {
    	 driver.switchTo().alert().dismiss();
	}
    
     //25
     public String switchtabgettext() {
    	Alert alert = driver.switchTo().alert();
    	return alert.getText();  	
	}
     //26
     public void switchtabsendkeys(String sendtext) {
    	 Alert text = driver.switchTo().alert();
    	 text.sendKeys(sendtext);
	}
     //27
     public String getattributeevent(WebElement element, String value) {
    	 element.getAttribute(value);
    	 return value;

	}
     
     //28
     public void setDateByInput(WebElement element, String dateValue) {
    	 element.clear();
    	 element.sendKeys(dateValue);
     }
     
     //29
//     public void selectDate(String day, String month, String year) {
//         // 1. Click the date input to open the calendar
//         WebElement dateInput = driver.findElement(By.id("dateOfBirthInput"));
//         dateInput.click();
//
//         // 2. Select year
//         WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
//         Select yearSelect = new Select(yearDropdown);
//         yearSelect.selectByVisibleText(year);
//
//         // 3. Select month
//         WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
//         Select monthSelect = new Select(monthDropdown);
//         monthSelect.selectByVisibleText(month);
//
//         // 4. Select day (pad to 2 digits if needed)
//         String dayFormatted = String.format("%02d", Integer.parseInt(day));
//
//         // Handle leading zeroes and exact class matching
//         WebElement dayElement = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='" + dayFormatted + "'] and not(contains(@class, 'outside-month'))"));
//
//         dayElement.click();
//     }
     //29
     public void selectDate(String day, String month, String year) {
    	    WebElement dateInput = driver.findElement(By.id("dateOfBirthInput"));

    	    // Scroll and click using JavaScript to avoid overlay issues
    	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dateInput);
    	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateInput);

    	    // Select year and month
    	    new Select(driver.findElement(By.className("react-datepicker__year-select")))
    	            .selectByVisibleText(year);

    	    new Select(driver.findElement(By.className("react-datepicker__month-select")))
    	            .selectByVisibleText(month);

    	    // Format and click day
    	    String formattedDay = String.format("%02d", Integer.parseInt(day));
    	    String dayClass = "react-datepicker__day--0" + formattedDay;

    	    WebElement dayElement = driver.findElement(By.xpath(
    	        "//div[contains(@class, '" + dayClass + "') and not(contains(@class, 'outside-month'))]"
    	    ));
    	    dayElement.click();
    	}
     
     //30
     public String getAttribute(WebElement element, String attributeName) {
         return element.getAttribute(attributeName);
     }
     
     //31
     public   void gettitle() {
        String getitle = driver.getTitle();
        return;
    	 
	}
}


            
   
