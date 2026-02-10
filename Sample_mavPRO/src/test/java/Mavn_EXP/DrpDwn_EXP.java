package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpDwn_EXP { 
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/radio.html");
		WebElement drpdwn;
		drpdwn = driver.findElement(By.name("country"));
		Select sel =  new Select(drpdwn);
		sel.selectByVisibleText("Antartica");
		Thread.sleep(3000);
		boolean blnDisplayed = drpdwn.isDisplayed();
		boolean blnEnabled = drpdwn.isEnabled();
		Thread.sleep(3000);
		sel.selectByValue("INDIA");
		Thread.sleep(3000);
		sel.selectByIndex(1);
		
		System.out.println("Dropdown displayed:"+blnDisplayed);
		System.out.println("Dropdown enabled:"+blnEnabled);
		driver.quit();
	}

}
