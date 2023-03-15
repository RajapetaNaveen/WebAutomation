package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = { "src/test/java/features/poc.feature" }, glue = {
		"stepDefinitions" }, plugin = {})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
