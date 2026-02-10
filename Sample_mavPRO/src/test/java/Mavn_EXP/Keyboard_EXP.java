package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_EXP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement l=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.moveToElement(l).click();
		a.sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		a.contextClick().perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
	