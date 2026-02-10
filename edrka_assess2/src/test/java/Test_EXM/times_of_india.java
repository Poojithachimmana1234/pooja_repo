package Test_EXM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class times_of_india {
	WebDriver driver;
	@Given("user is in the times of india website")
	public void user_is_in_the_times_of_india_website() {
		driver = new  ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
	}

	@When("user selects the Hindi language When the top header dropdown")
	public void user_selects_the_hindi_language_when_the_top_header_dropdown() {
		driver.findElement (By.xpath("//a[contains(@href,'navbharat')]")
				).click();
	}

	@Then("the website should be displayed in Hindi")
	public void the_website_should_be_displayed_in_hindi() {
		String url = driver.getCurrentUrl();
		System.out.println("Current URL: "+url);
		
		if(url.contains("navbharat")) {
			System.out.println("Hindi page displayed successfully");
		}
		else {
			System.out.println("Hindi page is not displayed");
		}
	  }
}
