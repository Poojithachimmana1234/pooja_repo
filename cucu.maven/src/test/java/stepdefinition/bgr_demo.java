package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bgr_demo {
	@Given("User is on HRMLogin page \"http:\\/\\/opensource-demo.orange")
	public void user_is_on_hrm_login_page_http_opensource_demo_orange() {
	    
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be able to login successfully and new page open")
	public void user_should_be_able_to_login_successfully_and_new_page_open() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters username as\"\" and password as {string}")
	public void user_enters_username_as_and_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be able to see a message\"Required\" below Username")
	public void user_should_be_able_to_see_a_message_required_below_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
