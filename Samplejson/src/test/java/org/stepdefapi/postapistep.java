package org.stepdefapi;

import org.apibase.apibaseclass;

import io.cucumber.java.en.*;

public class postapistep extends apibaseclass {
	
	@Given("User should give the baseuri and request object")
	public void user_should_give_the_baseuri_and_request_object() {
		urllocator("https://reqres.in/");

	}
	@When("User should add the header")
	public void user_should_add_the_header() {
		headersadd("Content-Type", "application/json");

	}
	@When("User should be able to {string} the data given")
	public void user_should_be_able_to_the_data_given(String Methodtype) {
		 setRequestBody("Mani", "Dev", "Active");
		  response = responseobj("POST",  "/api/users");

	}
	@Then("User should print the responsebody and validate with expected status code {int} for Posting a data")
	public void user_should_print_the_responsebody_and_validate_with_expected_status_code_for_posting_a_data(Integer expectedStatus) {
		printresponse(response);
		validateresponsecode(response, expectedStatus);

	}




}
