package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features={"src/test/resources/Features"},
glue={"StepDefenitions"},
plugin= {"pretty","html:target/htmlreport.html"})

public class TestRunner extends AbstractTestNGCucumberTests {

	
}
