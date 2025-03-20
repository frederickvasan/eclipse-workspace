package org.Regtest;

import org.Baseclass.Baseclassmethod;

import io.cucumber.java.en.*;

public class Regtest  extends Baseclassmethod{

	@Given("user should be in the facebook login")
	public void user_should_be_in_the_facebook_login() {
		browserlaunch("https://www.facebook.com/");
		System.out.println("Browser Launched");

	}
	@When("User should enter the Username and Password")
	public void user_should_enter_the_username_and_password() {
		sendvalues(findelementID("email"), "Test@testing.com");
		sendvalues(findelementID("pass"), "pass123!");

	}
	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		clickevent(findelementname("login"));

	}
	
	@Then("User should verify the error message for the invalid credentials")
	public void user_should_verify_the_error_message_for_the_invalid_credentials() throws Exception {
		waittime(3000);
		System.out.println("Error Message received");
		closewindow();

	}
	
	@Given("user should be in the facebook login1")
	public void user_should_be_in_the_facebook_login1() {
		browserlaunch("https://www.facebook.com/");
		System.out.println("Browser Launched");

	}
	@When("User should enter the Username and Password1")
	public void user_should_enter_the_username_and_password1() {
		sendvalues(findelementID("email"), "Test@testing.com");
		sendvalues(findelementID("pass"), "pass123!");

	}
	@When("User should click the login button1")
	public void user_should_click_the_login_button1() {
		clickevent(findelementname("login"));

	}
	
	@Then("User should verify the error message for the invalid credentials1")
	public void user_should_verify_the_error_message_for_the_invalid_credentials1() throws Exception {
		waittime(3000);
		System.out.println("Error Message received");
		closewindow();

	}
	
	@Given("user should be in the facebook login2")
	public void user_should_be_in_the_facebook_login2() {
		browserlaunch("https://www.facebook.com/");
		System.out.println("Browser Launched");

	}
	@When("User should enter the Username and Password2")
	public void user_should_enter_the_username_and_password2() {
		sendvalues(findelementID("email"), "Test@testing.com");
		sendvalues(findelementID("pass"), "pass123!");

	}
	@When("User should click the login button2")
	public void user_should_click_the_login_button2() {
		clickevent(findelementname("login"));

	}
	
	@Then("User should verify the error message for the invalid credentials2")
	public void user_should_verify_the_error_message_for_the_invalid_credentials2() throws Exception {
		waittime(3000);
		System.out.println("Error Message received");
		closewindow();

	}

	@Given("user should be in the facebook login3")
	public void user_should_be_in_the_facebook_login3() {
		browserlaunch("https://www.facebook.com/");
		System.out.println("Browser Launched");

	}
	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String username, String password) {
		sendvalues(findelementID("email"), username);
		sendvalues(findelementID("pass"), password);

	}
	@When("User should click the login button3")
	public void user_should_click_the_login_button3() {
		clickevent(findelementname("login"));

	}
	
	@Then("User should verify the error message for the invalid credentials3")
	public void user_should_verify_the_error_message_for_the_invalid_credentials3() throws Exception {
		waittime(3000);
		System.out.println("Error Message received");
		closewindow();

	}



}
