package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags="@smoke or @Regression and not @pref", 
features={"src/main/resources/featuresWithTags"},
glue= {"StepDefinitions"},
plugin= {"pretty","html:target/htmlreport.html"})

public class cucumberTestRunnerTags extends AbstractTestNGCucumberTests {

}
