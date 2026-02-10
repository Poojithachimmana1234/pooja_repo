package Test_EXM;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Testrunner {
	@CucumberOptions(
			features = "src/test/resources/Feature/test.feature",
			glue = {"Test_EXM"})
	public class TestRunner extends AbstractTestNGCucumberTests {

	}
}