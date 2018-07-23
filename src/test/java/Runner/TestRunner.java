package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Sara on 21/07/2018.
 */

@CucumberOptions(features = {"src/test/java/Feature"},format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},glue = "Steps")
public class TestRunner extends AbstractTestNGCucumberTests {

}
