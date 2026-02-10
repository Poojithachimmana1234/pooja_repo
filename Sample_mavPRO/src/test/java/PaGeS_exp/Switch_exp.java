package PaGeS_exp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_exp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String initialHandle = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("http://www.google.com");
	 	System.out.println(driver.getWindowHandles().size());
		driver.switchTo().window(initialHandle);
		Thread.sleep(3000);
		driver.close();
		System.out.println(driver.getWindowHandles().size());
		driver.quit();
	}
}
