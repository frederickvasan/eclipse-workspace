package org.loginstep;
import org.Baseclass.Baseclassmethod;

import io.cucumber.java.en.*;
public class hotelbooked extends Baseclassmethod {
	@When("user clicks the select the hotel and click continue")
	public void user_clicks_the_select_the_hotel_and_click_continue() throws Exception {
      clickevent(findelementname("radiobutton_0"));
      waittime(2000);
      clickevent(findelementname("continue"));
      waittime(2000);
	}
	@When("User able to book a hotel")
	public void user_able_to_book_a_hotel() throws Exception {
		sendvalues(findelementID("first_name"), "Gerold");
		sendvalues(findelementID("last_name"), "Robbins");
		sendvalues(findelementID("address"), "Address Part 1");
		sendvalues(findelementID("cc_num"), "6011111111111117");
		selectdropdownop(findelementname("cc_type"), 3);
		selectdropdownop(findelementname("cc_exp_month"), 6);
		selectdropdownop(findelementname("cc_exp_year"), 10);
		sendvalues(findelementID("cc_cvv"), "123");
		clickevent(findelementname("book_now"));
		waittime(6000);
       screenshotpic();
	}
	@Then("User Logs out of the wesite")
	public void user_logs_out_of_the_wesite() throws Exception {
		waittime(3000);
		System.out.println("Hotel booked");
		closewindow();
	}
}

