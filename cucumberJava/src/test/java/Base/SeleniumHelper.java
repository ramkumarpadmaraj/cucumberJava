package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SeleniumHelper {

	public static void takeScreenshot(WebDriver driver) {
		
		//Base.setUp();
		
	 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     
     //Copy the file to a location and use try catch block to handle exception
     try {
         FileUtils.copyFile(screenshot, new File("./target/screenshot.png"));
     } catch (IOException e) {
         System.out.println(e.getMessage());
     }
	}
}
