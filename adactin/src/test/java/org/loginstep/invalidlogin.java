package org.loginstep;
import org.Baseclass.Baseclassmethod;

import io.cucumber.java.en.*;
public class invalidlogin  extends Baseclassmethod{
	@Given("User launches the Adactin Hotel App")
	public void user_launches_the_adactin_hotel_app() {
		browserlaunch("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		System.out.println("Browser launched");
}
	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String string, String string2) {
		sendvalues(findelementID("username"), "test30");
		sendvalues(findelementID("password"), "Pass123!");
}
	@When("Clicks on the login button")
	public void clicks_on_the_login_button() {
		clickevent(findelementID("login"));
}
	@Then("User should see an error message")
	public void user_should_see_an_error_message() throws Exception {
		System.out.println("invalid username and password");
		waittime(2000);
		closewindow();
}
}
