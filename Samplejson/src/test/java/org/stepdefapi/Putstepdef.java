package org.stepdefapi;

import org.apibase.apibaseclass;

import io.cucumber.java.en.When;

public class Putstepdef extends apibaseclass{



	@When("User should be able to {string} the data given and give the addpath")
	public void user_should_be_able_to_the_data_given_and_give_the_addpath(String Methodtype) {
              
	     setRequestBody("Frederick", "Testing", "Active");
	     addpath("page", "2");
	    response = responseobj(Methodtype,  "/api/users/{page}");
		
	}



}
