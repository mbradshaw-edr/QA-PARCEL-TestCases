package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
static WebDriver driver;
	
	public static WebDriver startbrowser(String browsername, String url){
		
		
		if(browsername.equalsIgnoreCase("chrome")){			
			System.setProperty("webdriver.chrome.driver", "D:\\selenium practice\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
	if(browsername.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver","D:\\selenium practice\\IEDriverServer\\IEDriverServer.exe");				
		driver = new InternetExplorerDriver();	
		}
	
	if(browsername.equalsIgnoreCase("firefox")){
		driver= new FirefoxDriver();
		}
		
	driver.manage().window().maximize();
	driver.get(url);
	return driver;	
	}

}
