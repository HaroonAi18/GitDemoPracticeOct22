package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Cucumber Option is used to Run our Tests.
	// feature		//glue		//tag		//dryRun		//monochrome.
	
	//-------------------------------------------------------------------
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "C:\\Users\\Mharo\\eclipse-workspaceVersion2\\BDD1\\src\\test\\resources\\features",
			glue = "src\\test\\java\\stepDefinition",
			tags = "@LoginTOAccount",
			
			strict = true,
			dryRun = false,
			monochrome = true,
			
			
	plugin = {
			"pretty",
			"html:target/site/cucumber-pretty",
			"json:target/cucumber.json"
	},
	publish = true
	)
	
	public class testRunner {
	
}
