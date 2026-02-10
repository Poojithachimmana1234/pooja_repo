package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aTtrBtE_EXP {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello and welcome");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/header/div[2]/div[3]/div[1]/div/div[1]/a")).click();
		driver.quit();
	}

}
