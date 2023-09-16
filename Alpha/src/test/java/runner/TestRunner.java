package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {
	@CucumberOptions(
			
			features = {"C:\\Users\\Lenovo\\eclipse-workspace\\Alpha\\src\\test\\resources\\Feature"},
			dryRun =!true,
			glue = {"stepDefinition","hook"},
			snippets = io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE,
			monochrome = true,
			plugin = {"pretty","html:target/cucumber-TestNG/report.html",
					"json:target/cucumber-TestNG/report.json","junit:target/cucumber-TestNG/report.xml"},
			tags = "@demo"
			
			)


	public class Runner extends AbstractTestNGCucumberTests {
		
		
	}
}
