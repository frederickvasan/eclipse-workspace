package org.Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\fnobl\\eclipse-workspace\\cucumbertest\\src\\test\\resources\\cucumber\\Testing.feature", glue ="org.stepins"
                                       dryRun = true)
public class Testrunnerinsta {

}
