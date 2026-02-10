package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class india_EXP {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Thread.sleep(5000);
		
		
		WebElement search=driver.findElement(By.name("APjFqb"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
}
