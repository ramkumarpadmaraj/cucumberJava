package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;

import Base.*;

public class Hooks {

	WebDriver driver;
	
	@Before
	public void setup() {
		
		driver=Base.setUp();
		
		//System.out.println(driver.toString());
		
	}
	
	@After
	public void tearDown() {
		Base.tearDown(Base.driver);
		System.out.println("Inside After");
	}
}
