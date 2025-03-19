package org.Testrunner;


import org.Reporting.Reportingtest_tags;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\fnobl\\eclipse-workspace\\cucumbertest\\src\\test\\resources\\cucumber\\tags.feature", glue ="org.Regtest",
plugin = {"json:target\\Report\\cucumberreportstags.json"},tags = "@regressionfeature")

public class RegTestrunner {
	
	@AfterClass
	public static  void reportgeneration() {
                
		Reportingtest_tags.generatecucreport("C:\\Users\\fnobl\\eclipse-workspace\\cucumbertest\\target\\cucumberreports\\cucumberreportstags.json");

	}
}
