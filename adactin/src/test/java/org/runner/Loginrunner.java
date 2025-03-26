package org.runner;

import org.Reporting.Reportingtest;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\fnobl\\eclipse-workspace\\adactin\\src\\test\\resources\\Featurefiles\\loginfeature.feature", glue ="org.loginstep", 
plugin = {"json:target\\Report\\cucumberreportsadactin.json"}, tags = "@hotelbookingreg")



public class Loginrunner {
	
	@AfterClass
	public static  void reportgeneration() {
                
		Reportingtest.generatecucreport("C:\\Users\\fnobl\\eclipse-workspace\\adactin\\target\\Report\\cucumberreportsadactin.json");

	}
}