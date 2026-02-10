package Mavn_EXP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplWat_EXP {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/dynamic-properties");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		System.out.println(driver.findElement(By.id("visibleAfter")).getText());
		
		
		driver.quit();
	} 

}
