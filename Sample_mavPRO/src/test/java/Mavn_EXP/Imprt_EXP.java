package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imprt_EXP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		Thread.sleep(3000);
		
		
		WebElement usrm=driver.findElement(By.name("user-name"));
		usrm.sendKeys("standard_user");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.name("log in"));
		loginbtn.click();
		
		driver.quit();
		
	}

}
