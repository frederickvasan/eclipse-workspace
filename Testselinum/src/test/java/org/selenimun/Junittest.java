package org.selenimun;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junittest {
	
	@BeforeClass
	public static void tc_1() {
	System.out.println("ClassA tc_1 @BeforeClass");
	}

	@AfterClass
	public static void tc_2() {
	System.out.println("ClassA tc_2 @AfterClass");
	}

	@Before
	public void tc_3() {
	System.out.println("ClassA tc_3 @Before");
	}

	@After
	public void tc_4() {
	System.out.println("ClassA tc_4 @After");
	}

	@Test
	public void tc_5() {
	System.out.println("ClassA tc_5 @Test");
	}
	
	


}
