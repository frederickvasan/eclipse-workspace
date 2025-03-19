package org.Testrunner;

import org.Reporting.Reportingtest;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\fnobl\\eclipse-workspace\\cucumbertest\\src\\test\\resources\\cucumber\\featureonline.feature", glue ="org.stepdef",
plugin = {"json: target\\cucumberreports\\cucumberreport1.json"})

public class reporttestingrunner {
	
	@AfterClass
	public static  void reportgeneration() {
                
		Reportingtest.generatecucreport("C:\\Users\\fnobl\\eclipse-workspace\\cucumbertest\\ target\\Report\\cucumberreport1.json");

	}

}
