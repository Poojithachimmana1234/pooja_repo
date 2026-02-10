package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hvr_moS_EXP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
	   Thread.sleep(3000);
	   WebElement element= driver.findElement(By.linkText("IMAGE"));
	   Actions a= new Actions(driver);
	   a.moveToElement(element).build().perform();
	   Thread.sleep(3000);
	   driver.quit();
	}
}
