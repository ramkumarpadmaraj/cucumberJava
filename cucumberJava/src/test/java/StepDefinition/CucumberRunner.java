package StepDefinition;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue={"StepDefinition"},
monochrome=true,
plugin= {"pretty","html:target/HTMLReports/index.html",
		"json:target/JSONReports/report.json"},
publish=true,
tags="@Login"
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
