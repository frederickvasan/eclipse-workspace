package org.Testrunner;


import org.Reporting.Hooksreporting;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\fnobl\\eclipse-workspace\\cucumbertest\\src\\test\\resources\\cucumber\\hooktest.feature", glue ="org.HookTesting",
plugin = {"json:target\\Report\\cucumberreportshook.json"})

public class HookTest {
	

	@AfterClass
	public static void hookreport() {
              
		Hooksreporting.hooktestreporting1("C:\\Users\\fnobl\\eclipse-workspace\\cucumbertest\\target\\Report\\cucumberreportshook.json");
		
	}


}
