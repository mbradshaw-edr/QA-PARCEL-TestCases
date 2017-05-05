package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utility.ExcelR;

public class Browsers {
	static WebDriver wd;

	public WebDriver startbrowser() throws Exception {
		ExcelR excel = new ExcelR("src\\Test_Data\\Report Writing Test Data.xlsx");
		String browser = excel.getBrowserName("Credentials", 1, 1);
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\Browser_Drivers\\chromedriver.exe");
			wd = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "src\\Browser_Drivers\\IEDriverServer.exe");
			wd = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\Browser_Drivers\\geckodriver.exe");
			wd = new FirefoxDriver();
		}

		wd.manage().window().maximize();
		wd.get(excel.getURL("Credentials", 1, 0));
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Thread.sleep(4000);
		System.out.println(" Browser open successfully and page title is: " + wd.getTitle());
		return wd;
	}

}
