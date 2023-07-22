package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
	(
			features=".//Features/HomePage.feature",
			glue="stepDefinitions",
			dryRun=true,
			monochrome=true,
			plugin= {"pretty"}
			
			)







public class testrunner {

}