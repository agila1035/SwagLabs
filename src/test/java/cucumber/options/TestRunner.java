package cucumber.options;

import org.junit.runner. RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(  
	    features = "src/test/java/features", monochrome=true,
	    glue="stepDefinitions",
	    tags = "@TestScenario3",
	    plugin= {"pretty", "html:target/cucumber-report" , "json:target/jsonReports/cucumber-report.json"}) 

public class TestRunner extends AbstractTestNGCucumberTests  {
	

} 