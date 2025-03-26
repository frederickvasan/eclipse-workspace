package org.loginstep;

import org.Baseclass.Baseclassmethod;

import io.cucumber.java.en.*;

public class loginstep extends Baseclassmethod {
	@Given("user should be in the adactinhotel login")
	public void user_should_be_in_the_adactinhotel_login() {
		browserlaunch("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		System.out.println("Browser launched");
	}
	@When("User should enter the Username and Password")
	public void user_should_enter_the_username_and_password() {
		sendvalues(findelementID("username"), "fnoble20");
		sendvalues(findelementID("password"), "Pass123!");
}
	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		clickevent(findelementID("login"));
	}
	@Then("User should be able to login")
	public void user_should_be_able_to_login() throws Exception {
		System.out.println("userlogged inside the application");
		waittime(2000);
		closewindow();
	}
}
