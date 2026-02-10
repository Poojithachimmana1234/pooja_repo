package TextCase_exp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PaGeS_exp.loginpaGe_ex;

public class loginpaGetest_exp {
	public loginpaGetest_exp(WebDriver driver) {
	}

	public static void main(String[] args) {
		WebDriver driver;
		loginpaGe_ex LoginPage;

		driver = new ChromeDriver();
		LoginPage = new loginpaGe_ex(driver);

		LoginPage.navigateTo();
		LoginPage.login("standard_user", "secret_sauce");

		LoginPage.navigateTo();
		LoginPage.login("invalid_user", "Wrong_password");

		driver.quit();
	}
 
}
