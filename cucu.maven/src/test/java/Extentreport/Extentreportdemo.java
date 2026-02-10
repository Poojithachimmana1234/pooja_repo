package Extentreport;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//import io.cucumber.core.backend.Status;
//import io.cucumber.prettyformatter.Theme;

public class Extentreportdemo {
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	
	@BeforeClass
	public void starttest()
	{
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		
	}
	@Test
	public void extenttest() {
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("ReportDemo");
		
		extent.attachReporter(spark);
		
		
		ExtentTest test = extent.createTest("Login test").assignAuthor("pooja");
		test.pass("Login Test Successfull");
		test.info("Url loaded");
		test.pass("login test completd successfully");
		
		
		ExtentTest test1 = extent.createTest("Homepage test").assignAuthor("pooja1");
		test1.pass("HomePage Successfully");
		test1.info("Value entered");
		test1.fail("HomePage test fail");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		if(driver.getTitle().equals("Google1"))
		{
			test.log(Status.PASS,"Navigated to the specified URL");
		}
		else 
		{
			test.log(Status.FAIL,"Test Failed");
		}
		driver.quit();
	}
	@AfterMethod
	public void teardown() {
		extent.flush();
	}

}
