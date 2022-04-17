package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Login Page");
	}
	@When("user enters the {userid} and {Password}")
	public void user_enters_the_and(String userid, String Password) {
		System.out.println(" User id: "+userid+ " Password:"+Password);
	}
	

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println("Clicks Login Button");
	}

	@Then("users is navigated to homepage")
	public void users_is_navigated_to_homepage() {
		System.out.println("Navigated to Home page");
	}

}
