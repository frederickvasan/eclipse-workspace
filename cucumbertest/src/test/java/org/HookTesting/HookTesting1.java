package org.HookTesting;

import org.Baseclass.Baseclassmethod;

import io.cucumber.java.en.*;

public class HookTesting1 extends Baseclassmethod{
	
	@When("User should enter the {string} and {string}")
	public static void user_should_enter_the_and(String username, String password) {
		sendvalues(findelementID("email"), username);
		sendvalues(findelementID("pass"), password);
	}
	
	
	@When("User should click the login button")
	public static void user_should_click_the_login_button() {
		clickevent(findelementname("login"));

}
}