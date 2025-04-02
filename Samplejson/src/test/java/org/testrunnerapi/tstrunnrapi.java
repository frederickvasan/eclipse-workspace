package org.testrunnerapi;

import org.Reporting.Reportingtest;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\fnobl\\eclipse-workspace\\Samplejson\\src\\test\\resources\\Featurefiles\\APIFeature.feature", glue ="org.stepdefapi",
plugin = {"json:target\\Report\\cucumberreportsjson.json"})

public class tstrunnrapi {

	@AfterClass
	public static  void reportgeneration() {
                
		Reportingtest.generatecucreport("C:\\Users\\fnobl\\eclipse-workspace\\Samplejson\\target\\Report\\cucumberreportsjson.json");
	
}
}
