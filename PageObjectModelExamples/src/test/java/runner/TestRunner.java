package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/" }, // feature file or folder name
		glue = { "stepdefinitions" }, plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true, publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
