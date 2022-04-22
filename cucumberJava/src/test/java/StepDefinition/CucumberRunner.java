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
plugin= {"json:target/cucumber-reports/cucumber.json", "pretty","html:target/cucumber-reports/report.html"},
publish=true,
tags="@Login"
)

public class CucumberRunner extends AbstractTestNGCucumberTests{

}
