package pom;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Capture_Screenshot {

	public static void Take_Screenshot(WebDriver driver, String Screenshot_Name) throws Exception {
		
	TakesScreenshot ts= (TakesScreenshot)driver;
	File Source= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Source, new File("src/Test_Data/Captured Screenshots/"+Screenshot_Name+".png"));
	System.out.println("Error/Warning message Screenshot taken please open Captured Screenshots folder");
	}

}
