package org.Baseclass;

// import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.WebElement;

public class BaseExecution extends Baseclassmethod{
	
	public static void main(String[] args) throws Exception {
		
//		Baseclassmethod a = new Baseclassmethod();
		
//		a.browserlaunch("https://www.facebook.com/");
//		WebElement test = a.findelementID("email");
//		WebElement pass = a.findelementname("pass");
//		a.sendvalues(test, "ForTesting");
//		a.doubleclickevent(test);
//		a.waittime(2000);
		browserlaunch("https://demo.automationtesting.in/Register.html");
		selectdropdownop(findelementID("Skills"), 3);
		List<WebElement> options = printdropdown(findelementID("Skills"));
		for (int i = 0; i < options.size(); i++) {
		String text11 = options.get(i).getText();
		System.out.println(text11);
		}
		closewindow();
		browserlaunch("https://www.facebook.com/");
		String excelpath = "C:\\Users\\fnobl\\eclipse-workspace\\Testselinum\\src\\test\\resources\\Excel\\Framework.xlsx";
		String dataformexcel = getdatafromexcel(0,0,"testdata",excelpath);
//		WebElement test = a.findelementID("email");
		sendvalues (findelementID("email"), dataformexcel);
		doubleclickevent( findelementID("email"));
		String dataformexcel1 = getdatafromexcel(0, 1, "testdata", excelpath);
		sendvalues(findelementname("pass"), dataformexcel1);
		waittime(2000);
//		WebElement login = a.findelementname("login");
		clickevent(findelementname("login"));
		
		waittime(2000);
		screenshotpic();
		closewindow();
		
//DRAG AND DROP		
		browserlaunch("https://demo.guru99.com/test/drag_drop.html");
		 WebElement source = findelementxpath("//a[text()=' BANK ']");
		 WebElement destination = findelementID("bank");
		
	    draganddrop(source, destination);

	    WebElement source1 = findelementxpath("//a[text()=' 5000']");
		 WebElement destination1 = findelementID("amt7");

	    draganddrop(source1, destination1);
	    waittime(2000);
	    screenshotpic();
	    closewindow();
		
		
//	CONTEXT CLICK
		
		browserlaunch("https://www.google.com/");
		WebElement test1 = findelementxpath("//a[text()='Gmail']");
		contextclickevent(test1);
		waittime(2000);
		closewindow();
		
// MOVE TO ELEMENT EXAMPLE
		browserlaunch("https://www.greenstechnologys.com/");
		WebElement courses = findelementxpath("//a[text()='COURSES']");
		movetoelementevent(courses);
		screenshotpic();
		waittime(2000);
		closewindow();
	
//Select by Index example
		browserlaunch("https://demo.automationtesting.in/Register.html");
		WebElement hob =  findelementxpath("(//input[@type='checkbox'])[3]");
		clickevent(hob);
		waittime(2000);
		closewindow();
		
		
		
	// Excel write
//		String excelpath1 = "C:\\Users\\fnobl\\eclipse-workspace\\Testselinum\\src\\test\\resources\\Excel\\Testingforwrite.xlsx";
//		String sheetname = "Writtingdata";
//		a.writedatatoexcel(0, 1, sheetname, excelpath1, "Path");
		
  //SWITCH TAB
		
		browserlaunch("https://demo.automationtesting.in/Alerts.html");
		clickevent(findelementxpath("//button[@onclick='alertbox()']"));
		waittime(2000);
		switchtabaccept();
		clickevent(findelementxpath("//a [text()='Alert with OK & Cancel ']"));
		waittime(2000);
		clickevent(findelementxpath("//button[@onclick='confirmbox()']"));
		waittime(2000);
		switchtabdismiss();
		waittime(2000);
		clickevent(findelementxpath("//a [text()='Alert with Textbox ']"));
		waittime(2000);
		clickevent(findelementxpath("//button[@onclick='promptbox()']"));
		String alerttext =  switchtabgettext();
		System.out.println(alerttext);
		waittime(2000);
		switchtabsendkeys("Hi There");
		waittime(3000);
		closewindow();
		
	
		System.out.println("End of the Road");
}
	
}


