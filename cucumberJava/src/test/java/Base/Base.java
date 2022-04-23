package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
	public static WebDriver driver;

	
	public static WebDriver setUp()
	{
		System.out.println("Set up");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//System.out.println("Driver Object Created");
		//driver.get("https://google.com");
		
		 return driver;
		
	}
	
	public static void tearDown(WebDriver driver)
	{
		System.out.println("Tear Down");
		driver.close();
		driver.quit();
		
	}
}
