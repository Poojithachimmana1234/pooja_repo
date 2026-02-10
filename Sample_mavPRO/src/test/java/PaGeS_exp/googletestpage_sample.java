package PaGeS_exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googletestpage_sample {
	private static WebElement element =null;
	public static WebElement texttox_search(WebDriver driver)
	{
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	}

