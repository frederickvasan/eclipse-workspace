package org.testsel;

import java.util.List;

import org.openqa.selenium.WebElement;

public class basermethodecall {
	public static void main(String[] args) throws Exception {
		Baseclass a = new Baseclass();
		a.browserlaunch("https://www.instagram.com/");
		a.sendvalues(a.findelementname("username"), "Test");
		a.sendvalues(a.findelementname("password"),"Testing");
		a.threadsleep(2000);
		a.findelementxpath("//a[@href=\"/accounts/emailsignup/\"]").click();
		a.threadsleep(1000);
		a.driverclose();	
		a.browserlaunch("https://www.instagram.com/");
		String datafromexcel = a.datafromexcel(0, 1, "links", "C:\\Users\\fnobl\\eclipse-workspace\\test\\src\\test\\resources\\fortestinginsta.xlsx");
		System.out.println(datafromexcel);
		a.sendvalues(a.findelementname("username"), datafromexcel);
		a.threadsleep(1000);
		a.driverclose();
		a.browserlaunch("https://demo.automationtesting.in/Register.html");
		WebElement test = a.findelementid("Skills");
		a.selectdropdown(test, 1);
		List<WebElement> skills = a.printdropdown(test);
		for (int i = 0; i < skills.size(); i++) {
			System.out.println(skills.get(i).getText());			
		}
		a.threadsleep(1000);
		a.driverclose();
		
		//DRAG AND DROP		
		a.browserlaunch("https://demo.guru99.com/test/drag_drop.html");
		 WebElement source = a.findelementxpath("//a[text()=' BANK ']");
		 WebElement destination = a.findelementid("bank");
		
	    a.draganddropevent(source, destination);

	    WebElement source1 = a.findelementxpath("//a[text()=' 5000']");
		 WebElement destination1 = a.findelementid("amt7");

	    a.draganddropevent(source1, destination1);
	    a.threadsleep(2000);
//	    a.screenshotpic();
	    a.driverclose();
		
		
		
	}

}
