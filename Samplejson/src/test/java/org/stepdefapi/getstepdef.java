package org.stepdefapi;

import org.apibase.apibaseclass;

import io.cucumber.java.en.*;

public class getstepdef extends apibaseclass{

	@Given("User should give the baseuri and request object for Queryparam")
	public void user_should_give_the_baseuri_and_request_object_for_queryparam() {
		urllocator("https://reqres.in/");
		headersadd("Content-Type", "application/json");
		addquery("page", "2");

	}
	@When("User should add the header and queryparam data")
	public void user_should_add_the_header_and_queryparam_data() {

	}
	@When("User should get the response object for {string} request method for Queryparam")
	public void user_should_get_the_response_object_for_request_method_for_queryparam(String string) {

	}
	@Then("User should print the responsebody and validate with expected status code {int} for Queryparam")
	public void user_should_print_the_responsebody_and_validate_with_expected_status_code_for_queryparam(Integer int1) {

	}



	
}
