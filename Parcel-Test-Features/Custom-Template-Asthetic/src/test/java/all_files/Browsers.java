package all_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
static WebDriver driver;
	
	public static WebDriver startbrowser(String browsername){
				
		if(browsername.equalsIgnoreCase("chrome")){			
			System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Test_Data\\Browser_Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
	if(browsername.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver","src\\test\\java\\Test_Data\\Browser_Drivers\\IEDriverServer.exe");				
		driver = new InternetExplorerDriver();	
		}
	
	if(browsername.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","src\\test\\java\\Test_Data\\Browser_Drivers\\geckodriver.exe");	
		driver= new FirefoxDriver();
		}
		
	driver.manage().window().maximize();
	return driver;	
	}

}
