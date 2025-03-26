package org.loginstep;
import org.Baseclass.Baseclassmethod;

import io.cucumber.java.en.*;
public class searchhotels extends Baseclassmethod {
	@Given("User login using Valid username and password  and clicks login button")
	public void user_login_using_valid_username_and_password_and_clicks_login_button() {
		sendvalues(findelementID("username"), "fnoble20");
		sendvalues(findelementID("password"), "Pass123!");
		clickevent(findelementID("login"));
}
	@When("user search for hotels in the Search Hotel")
	public void user_search_for_hotels_in_the_search_hotel() throws Exception {
		selectdropdownop(findelementname("location"), 3);
		selectdropdownop(findelementname("hotels"), 3);
		selectdropdownop(findelementname("room_type"), 3);
		selectdropdownop(findelementname("room_nos"), 3);
		sendvalues(findelementname("datepick_in"), "26/03/2025");
		sendvalues(findelementname("datepick_out"), "29/03/2025");
	//	waittime(3000);
		selectdropdownop(findelementname("adult_room"), 2);
		selectdropdownop(findelementname("child_room"), 2);
}
	@When("Clicks on the search button")
	public void clicks_on_the_search_button() {
		clickevent(findelementname("Submit"));
}
	@Then("Select Hotel page to be displayed")
	public void select_hotel_page_to_be_displayed() throws Exception {
		waittime(3000);
		System.out.println("Select page displayed");
		closewindow();
}
}
