package org.Baseclass;

import org.Baseclass.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class testngbaseexample extends Baseclassmethod {
	
	String dataformexcel,dataformexcel1,elementfromexcel,elementfromexcel1 ;
	@BeforeTest
	public void launch() {
		browserlaunch("https://www.facebook.com/");
		System.out.println("Browser lanched");
	}
	@BeforeClass
	public void screenshot1() throws Exception {
		waittime(2000);
		screenshotpic();
	}
	@BeforeMethod
	
	public void exceloption() throws Exception {
		String excelpath = "C:\\Users\\fnobl\\eclipse-workspace\\Testselinum\\src\\test\\resources\\Excel\\Framework.xlsx";
		elementfromexcel = getdatafromexcel(0, 0, "testdata", excelpath);
		elementfromexcel1 = getdatafromexcel(1, 0, "testdata", excelpath);
//		System.out.println(elementfromexcel);
//		System.out.println(elementfromexcel1);
		dataformexcel = getdatafromexcel(0,1,"testdata",excelpath);
		dataformexcel1 = getdatafromexcel(0, 2, "testdata", excelpath);
	}
	
	@Test
	public void logintest() {
		sendvalues(findelementID(elementfromexcel), dataformexcel);
		sendvalues(findelementID(elementfromexcel1), dataformexcel1);
		clickevent(findelementname("login"));
	
	}
	
	@AfterMethod
	public void screenshotd() throws Exception {
		waittime(2000);
		screenshotpic();
		
	}
	
	
	@AfterClass
	public void closebrowser1() {
		closewindow();
	}
	

}
