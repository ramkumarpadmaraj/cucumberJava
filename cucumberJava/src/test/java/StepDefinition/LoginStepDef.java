package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.*;

public class LoginStepDef extends Base{
	

	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("Launching the URL");
		Base.driver.get("https://gmail.com");
		Thread.sleep(2000);
		//Base.driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		//SeleniumHelper.takeScreenshot(baseClass.driver);
	 System.out.println("User is in Login page");
	}

	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String userid, String Password) throws InterruptedException {
		//Thread.sleep(2000);
		
		  System.out.println("Entering User id");
		  Base.driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(userid); 
			/*
			 * baseClass.driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).
			 * click(); Thread.sleep(2000); System.out.println("Entering Password");
			 * baseClass.driver.findElement(By.name("password")).sendKeys(Password);
			 */
		 
	System.out.println("User enters userid: "+userid+"and password as"+Password);
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
		//baseClass.driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();'
		System.out.println("Clicking Next");
		 Base.driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
	    System.out.println("User clicked Login Button");
	    Assert.assertEquals("Compose","Compose");
	}

	@Then("users is navigated to homepage")
	public void users_is_navigated_to_homepage() {
	  System.out.println("User navigated to home page");
	  Base.driver.get("https://google.com");;
	  Assert.assertEquals("Compose","Compose");
	}
	
	
}
