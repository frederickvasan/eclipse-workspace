package org.HookTesting;

import org.Baseclass.Baseclassmethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class junithook extends Baseclassmethod {
	
	@Before
	public static void loginpage() {
		browserlaunch("https://www.facebook.com/");
	}
	
	@After
	public void closebrowsertesting() throws Exception {
	   waittime(2000);
	   System.out.println("Invalid username and password");
		closewindow();
		System.out.println("Browser Closed");

	}

}
