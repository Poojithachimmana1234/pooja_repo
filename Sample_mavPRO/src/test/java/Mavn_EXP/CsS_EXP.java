package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsS_EXP {  
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("problem_use");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		((WebElement) driver.findElements(By.cssSelector("input.submit-button"))).click();
		Thread.sleep(2000);
		driver.quit();
	
	}

}
