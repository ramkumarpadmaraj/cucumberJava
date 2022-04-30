package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import com.aventstack.extentreports.gherkin.model.Scenario;

import Base.*;

public class Hooks {

		
	
	@Before
	public void setup() {
		
		Base.setUp();
		
		//System.out.println(driver.toString());
		
	}
	
	@AfterStep
	public void afterStep(Scenario scenario)
	{
		scenario.attach(SeleniumHelper.takeScreenshot(Base.driver), "image/png","Screenshot");
	}
	
	
	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
		      // Take a screenshot...
		      //final byte[] screenshot = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.attach(SeleniumHelper.takeScreenshot(Base.driver), "image/png","Screenshot"); 
		}
		Base.tearDown(Base.driver);
		System.out.println("Inside After");
		}
}
