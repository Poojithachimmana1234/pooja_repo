package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature/test.feature",glue = {"stepdefinition"}, 
		 monochrome = true,
		 plugin = {"pretty","html:target1/HtmlReports.html","json:target/JSONReports"})
public class Testrunner extends AbstractTestNGCucumberTests {

}
            