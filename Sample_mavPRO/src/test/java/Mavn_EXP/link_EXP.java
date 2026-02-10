package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_EXP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
	 	driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Image")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
