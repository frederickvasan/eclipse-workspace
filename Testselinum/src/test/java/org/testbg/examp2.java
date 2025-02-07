package org.testbg;

import org.testng.annotations.Test;

public class examp2 {
	
	@Test(priority = -34, enabled=true)
	private void tc_1() {
	System.out.println("ClassB tc_1 priority = -33");
	}
	@Test(priority = 99)
	private void tc_2() {
	System.out.println("ClassB tc_2 priority = 99");
	}
	@Test(priority = -175)
	private void tc_3() {
	System.out.println("ClassB tc_3 priority = -175");
	}

	@Test(priority = 2, invocationCount = 3)
	private void tc_4() {
	System.out.println("ClassB tc_4 priority = 2");
	}
	@Test(invocationCount = 3)
	private void tc_5() {
	System.out.println("ClassB tc_5");
	}

	@Test(enabled = true, invocationCount = 7)
	private void tc_7() {
	System.out.println("ClassB tc_7");
	}

	@Test(priority = 56)
	private void tc_6() {
	System.out.println("ClassB tc_6 priority = 56");

	}

}
