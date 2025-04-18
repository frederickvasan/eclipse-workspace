package org.Baseclass;

// import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.WebElement;

public class BaseExecution extends Baseclassmethod{
	
	public static void main(String[] args) throws Exception {
		
		Baseclassmethod a = new Baseclassmethod();
		
//		a.browserlaunch("https://www.facebook.com/");
//		WebElement test = a.findelementID("email");
//		WebElement pass = a.findelementname("pass");
//		a.sendvalues(test, "ForTesting");
//		a.doubleclickevent(test);
//		a.waittime(2000);
		browserlaunch("https://demo.automationtesting.in/Register.html");
		a.selectdropdownop(a.findelementID("Skills"), 3);
		List<WebElement> options = a.printdropdown(a.findelementID("Skills"));
		for (int i = 0; i < options.size(); i++) {
		String text11 = options.get(i).getText();
		System.out.println(text11);
		}
		closewindow();
		browserlaunch("https://www.facebook.com/");
		String excelpath = "C:\\Users\\fnobl\\eclipse-workspace\\Testselinum\\src\\test\\resources\\Excel\\Framework.xlsx";
		String dataformexcel = a.getdatafromexcel(0,0,"testdata",excelpath);
//		WebElement test = a.findelementID("email");
		a.sendvalues(a.findelementID("email"), dataformexcel);
		a.doubleclickevent(a.findelementID("email"));
		String dataformexcel1 = a.getdatafromexcel(0, 1, "testdata", excelpath);
		a.sendvalues(a.findelementname("pass"), dataformexcel1);
		a.waittime(2000);
//		WebElement login = a.findelementname("login");
		a.clickevent(a.findelementname("login"));
		
		a.waittime(2000);
		a.screenshotpic();
		closewindow();
		
//DRAG AND DROP		
		browserlaunch("https://demo.guru99.com/test/drag_drop.html");
		 WebElement source = a.findelementxpath("//a[text()=' BANK ']");
		 WebElement destination = a.findelementID("bank");
		
	    a.draganddrop(source, destination);

	    WebElement source1 = a.findelementxpath("//a[text()=' 5000']");
		 WebElement destination1 = a.findelementID("amt7");

	    a.draganddrop(source1, destination1);
	    a.waittime(2000);
	    a.screenshotpic();
	    closewindow();
		
		
//	CONTEXT CLICK
		
		browserlaunch("https://www.google.com/");
		WebElement test1 = a.findelementxpath("//a[text()='Gmail']");
		a.contextclickevent(test1);
		a.waittime(2000);
		closewindow();
		
// MOVE TO ELEMENT EXAMPLE
		browserlaunch("https://www.greenstechnologys.com/");
		WebElement courses = a.findelementxpath("//a[text()='COURSES']");
		a.movetoelementevent(courses);
		a.screenshotpic();
		a.waittime(2000);
		closewindow();
	
//Select by Index example
		browserlaunch("https://demo.automationtesting.in/Register.html");
		WebElement hob =  a.findelementxpath("(//input[@type='checkbox'])[3]");
		a.clickevent(hob);
		a.waittime(2000);
		closewindow();
		
		
		
	// Excel write
//		String excelpath1 = "C:\\Users\\fnobl\\eclipse-workspace\\Testselinum\\src\\test\\resources\\Excel\\Testingforwrite.xlsx";
//		String sheetname = "Writtingdata";
//		a.writedatatoexcel(0, 1, sheetname, excelpath1, "Path");
		
  //SWITCH TAB
		
		browserlaunch("https://demo.automationtesting.in/Alerts.html");
		a.clickevent(a.findelementxpath("//button[@onclick='alertbox()']"));
		a.waittime(2000);
		a.switchtabaccept();
		a.clickevent(a.findelementxpath("//a [text()='Alert with OK & Cancel ']"));
		a.waittime(2000);
		a.clickevent(a.findelementxpath("//button[@onclick='confirmbox()']"));
		a.waittime(2000);
		a.switchtabdismiss();
		a.waittime(2000);
		a.clickevent(a.findelementxpath("//a [text()='Alert with Textbox ']"));
		a.waittime(2000);
		a.clickevent(a.findelementxpath("//button[@onclick='promptbox()']"));
		String alerttext =  a.switchtabgettext();
		System.out.println(alerttext);
		a.waittime(2000);
		a.switchtabsendkeys("Hi There");
		a.waittime(3000);
		closewindow();
	
		System.out.println("End of the Road");
}
	
}


