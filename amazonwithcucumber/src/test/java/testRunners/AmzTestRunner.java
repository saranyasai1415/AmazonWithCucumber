package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/raama/eclipse-workspace/amazonwithcucumber/Features"},
		glue = {"stepDefinitions"},
		plugin = {"pretty"}
			
		)


public class AmzTestRunner {

}
