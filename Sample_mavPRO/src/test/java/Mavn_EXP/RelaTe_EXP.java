package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelaTe_EXP {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello and welcome");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("//a[@class='gb_Z']")).click();
		Thread.sleep(2000);
		driver.quit();
	} 
 
}
