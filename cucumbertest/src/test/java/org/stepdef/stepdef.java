package org.stepdef;

import org.Baseclass.Baseclassmethod;

import io.cucumber.java.en.*;

public class stepdef extends Baseclassmethod{
	
	
	@Given("user should be in the facebook or Instagram login")
	public void user_should_be_in_the_facebook_or_instagram_login() {
		browserlaunch("https://www.facebook.com/");
	   
	}
	
	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String username, String password) {
		
		sendvalues(findelementID("email"), username);
		sendvalues(findelementID("pass"), password);
	
	}

//	@When("User should enter the Username and Password")
//	public void user_should_enter_the_username_and_password() {
//		sendvalues(findelementID("email"), "test@test.com");
//		sendvalues(findelementID("pass"), "test@123");
//	    
//	}
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




}
