package org.Baseclass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterSuite;
//import org.openqa.selenium.safari.SafariDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.OperaDriverManager;

public class datapro extends Baseclassmethod {
	
	@BeforeMethod
	@Parameters({"browser"})
	private void browsername( String browsername) {
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
			else if (browsername.equals("firefox")) {
					driver = new FirefoxDriver();	
				}
			else if (browsername.equals("Edge")) {
				driver = new EdgeDriver();
			}
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
			
		
	}
  @Test(dataProvider = "fblogin")	 
	private void fblogin(String username, String pass) throws Exception {
		sendvalues(findelementID("email"), username);
		sendvalues(findelementID("pass"), pass);
		waittime(2000);
		//		screenshotpic();
		closewindow();
		
	}
  

	@DataProvider(name = "fblogin")
	private Object[][] dataprov() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "frederick@email.com";
		data[0][1] = "frederick1234!";
		data[1][0] = "noble@email.com";
		data[1][1] = "noble1234!";
		data[2][0] = "vasanth@email.com";
		data[2][1] = "vasanth1234!";
		
				
		return data;
		
		
		
	}
	
	
}
