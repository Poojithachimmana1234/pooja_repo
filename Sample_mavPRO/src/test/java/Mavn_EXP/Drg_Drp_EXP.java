package Mavn_EXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drg_Drp_EXP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement From=driver.findElement(By.name("//*[@id='credit2']/a"));
		WebElement To=driver.findElement(By.name("//*@id='bank']/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(From,To).build().perform();
		driver.quit();

}
}
