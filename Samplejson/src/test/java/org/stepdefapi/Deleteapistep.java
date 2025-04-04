package org.stepdefapi;

import org.apibase.apibaseclass;

import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Deleteapistep extends apibaseclass {
	

	@When("User should be able to {string} the data given and give the Queryparam")
	public void user_should_be_able_to_the_data_given_and_give_the_queryparam(String MethodType) {
		   addquery("page", "2");
		    response = responseobj(MethodType, "/api/users");

	}
}
