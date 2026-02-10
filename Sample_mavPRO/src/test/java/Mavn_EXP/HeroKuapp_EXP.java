package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKuapp_EXP {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("Nested frames")).click();
		driver.switchTo().frame("frame-bottom");
		WebElement l = driver.findElement(By.cssSelector("body"));
		System.out.println("Bottom frame text:" +l.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame(1);
		WebElement sec = driver.findElement(By.id("content"));
		System.out.println(sec.getText());
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().parentFrame();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().parentFrame();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		}
}
