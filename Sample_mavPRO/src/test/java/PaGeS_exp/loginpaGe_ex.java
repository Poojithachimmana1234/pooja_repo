package PaGeS_exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpaGe_ex {
	private WebDriver driver;
	private final String url = "http://www.saucedemo.com/";
	private By usernameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login.button");
	private By errorMessage = By.cssSelector("h3[data-test='error']");

	public loginpaGe_ex(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateTo() {
		driver.get(url);
	}

	public void login(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
	}

	public String getErrorMessage() {
		return driver.findElement(errorMessage).getText();

	}
}
