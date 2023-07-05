package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
System.out.println("I am in Given statement");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("I am in When statement");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("I am in And statement");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("I am in Then statement");
	}

}
