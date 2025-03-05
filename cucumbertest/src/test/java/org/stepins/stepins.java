package org.stepins;

import org.Baseclass.Baseclassmethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepins extends Baseclassmethod {
	
	@Given("user should be in the facebook login")
	public void user_should_be_in_the_facebook_login() {
		browserlaunch("https://www.instagram.com/");
	   
	}
	@When("User should enter the Username and Password")
	public void user_should_enter_the_username_and_password() {
//		if (condition) {
//			
//		}
		sendvalues(findelementxpath("//input[@name='username']"), "test@test.com");
		sendvalues(findelementxpath("//input[@name='password']"), "test@123");
		
	    
	}
	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		
		clickevent(findelementxpath("//button[@type='submit']"));
	    
	}
	@Then("User should verify the error message for the invalid credentials")
	public void user_should_verify_the_error_message_for_the_invalid_credentials() throws Exception {
		waittime(3000);
		System.out.println("Error Message received");
		closewindow();
	    
	}


}
