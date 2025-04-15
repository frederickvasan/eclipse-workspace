package org.Demoqa;

import org.Baseclass.Baseclassmethod;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class demoQAreg extends Baseclassmethod {
	
	@Given("User is on the registration page")
	public void user_is_on_the_registration_page() {
		browserlaunch("https://demoqa.com/automation-practice-form");

	}
	@When("User enters registration details from Excel row {string}")
	public void user_enters_registration_details_from_excel_row(String Getfromexcel) throws Exception {
		String excelpath = "C:\\Users\\fnobl\\eclipse-workspace\\cucumbertest\\src\\test\\resources\\Excel\\Framework.xlsx";
		String firstname = getdatafromexcel(0,1,"testdata",excelpath);
		sendvalues(findelementID("firstName"), firstname);
		String lastname = getdatafromexcel(1,1,"testdata",excelpath);
 		sendvalues(findelementID("lastName"), lastname);
 		String userEmail = getdatafromexcel(2,1,"testdata",excelpath);
		sendvalues(findelementID("userEmail"), userEmail);
		clickevent(findelementxpath("//label[normalize-space()='Male']"));
		String Mobilenumber = getdatafromexcel(3,1,"testdata",excelpath);
		sendvalues(findelementID("userNumber"), Mobilenumber);
//		String DOB = getdatafromexcel(4,1,"testdata",excelpath);
//		sendvalues(findelementID("dateOfBirthInput"), DOB);
//		findelementID("dateOfBirthInput").clear();
//		setDateByInput(findelementID("dateOfBirthInput"), DOB);
	   selectDate("10", "April", "1990");
		String subject = getdatafromexcel(7,1,"testdata",excelpath);
		sendvalues(findelementID("subjectsInput"), subject);
		waittime(3000);
		clickevent(findelementxpath("//label[normalize-space()='Sports']"));
		waittime(2000);
		clickevent(findelementID("submit"));

	}
	@Then("Registration should be successful")
	public void registration_should_be_successful() {
		getAttribute(null, null);

	}



	

}
