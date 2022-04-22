package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	 System.out.println("User is in Login page");
	}

	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String userid, String Password) {
	System.out.println("User enters userid: "+userid+"and password as"+Password);
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
	    System.out.println("User clicked Login Button");
	}

	@Then("users is navigated to homepage")
	public void users_is_navigated_to_homepage() {
	  System.out.println("User navigated to home page");
	}
}
