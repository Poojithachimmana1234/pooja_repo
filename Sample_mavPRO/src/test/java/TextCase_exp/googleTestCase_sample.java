package TextCase_exp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PaGeS_exp.googletestpage_sample;

public class googleTestCase_sample {
	static WebDriver driver;
	public static void  main(String[] args) {
		googlesearch();
		driver.quit();
		
	}
	public static void googlesearch()
	{
		driver = new ChromeDriver();   
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		googletestpage_sample.texttox_search(driver).sendKeys("India");
		googletestpage_sample.texttox_search(driver).sendKeys(Keys.ENTER);
	}

}     
