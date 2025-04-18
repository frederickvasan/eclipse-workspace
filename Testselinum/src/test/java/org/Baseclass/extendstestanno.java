package org.Baseclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertSame;

import org.Baseclass.Baseclassmethod;



public class extendstestanno extends Baseclassmethod {
	
	
      @BeforeClass
	public static void tc_1() {
		
		browserlaunch("https://www.facebook.com/");
		System.out.println("TC1 @BeforeClass");
		
	}
	
     @AfterClass
	public static  void tc_2() {
		closewindow();
		System.out.println("Login page unit testing completed");
		System.out.println("tc_2 @AfterClass");

	}
	
	@Before
	public void tc_3() throws Exception {
		long timeMillis = System.currentTimeMillis();
		System.out.println("start time : "+ timeMillis);
		screenshotpic();
		System.out.println("tc_3 @Before");
	}
	
	@After
	public void tc_4() throws Exception {
	  long endtime = System.currentTimeMillis();
	  System.out.println("end time : "+ endtime);
	  screenshotpic();
	  System.out.println("tc_4 @After");
	}
	@Test
	public void tc_5() {
//		sendvalues(findelementID("email"), "Tedst@testing.com");
		WebElement username = findelementID("email");
		username.sendKeys("Testubg@email.com");
		
		String at = username.getAttribute("value");
		
		
		assertEquals("Testubg@email.com", at);
		assertSame(at, "king@email.com", "Fail");
		
		sendvalues(findelementID("pass"), "testing123");
		System.out.println("tc_5 @Test");
		

	}
	
	
	

}
