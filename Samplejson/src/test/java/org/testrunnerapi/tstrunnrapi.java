package org.testrunnerapi;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\fnobl\\eclipse-workspace\\Samplejson\\src\\test\\resources\\Featurefiles\\APIFeature.feature", glue ="org.stepdefap")

public class tstrunnrapi {

}
