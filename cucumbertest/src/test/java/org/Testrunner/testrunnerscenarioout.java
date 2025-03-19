package org.Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\fnobl\\eclipse-workspace"
		+ "\\cucumbertest\\src\\test\\resources\\cucumber\\featureonline.feature", glue ="org.stepdef",
		plugin = {"pretty","json:target/cucumber.json", "html:target/cucumber-reports.html"},
		dryRun = false)
public class testrunnerscenarioout {

}
