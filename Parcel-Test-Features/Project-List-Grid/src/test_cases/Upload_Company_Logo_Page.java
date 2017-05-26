
package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Upload_Company_Logo_Page {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td/input[@name='logo']")
	WebElement Browse_Company_Logo;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td/input[@name='save']")
	WebElement Save_Company_Logo;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div/form/table/tbody/tr[1]/td[3]/a")
	WebElement Delete_Company_Logo;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div/form/table/tbody/tr[1]/td[2]/img")
	WebElement Current_Company_Logo;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/nav/div/ul/li[6]/a")
	WebElement Company_Dropdown;

	@FindBy(how = How.XPATH, using = "//*[@id='CompanyMenu']/li/ul[2]/li[3]/a")
	WebElement Company_Logo_option;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/nav/div/ul/li[3]/a")
	WebElement Home_tab;

	public Upload_Company_Logo_Page(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	public void Check_Company_Logo() throws Exception {
		HighlightElement(driver, Company_Dropdown);
		Company_Dropdown.click();
		Thread.sleep(3000);
		HighlightElement(driver, Company_Logo_option);
		Company_Logo_option.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, Browse_Company_Logo);
		Browse_Company_Logo.click();
		Thread.sleep(3000);
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();

		if (browserName.equals("chrome")) {
			Runtime.getRuntime().exec("src\\Test_Data\\JPG1 Image Upload for Chrome.exe");
		} else if (browserName.equals("internet explorer")) {
			Runtime.getRuntime().exec("src\\Test_Data\\JPG1 Image Upload for IE.exe");
		} else {
			Runtime.getRuntime().exec("src\\Test_Data\\JPG1 Image Upload for firefox.exe");
		}

		Thread.sleep(15000);
		HighlightElement(driver, Save_Company_Logo);
		Save_Company_Logo.click();
		Thread.sleep(5000);
		HighlightElement(driver, Browse_Company_Logo);
		Browse_Company_Logo.click();
		Thread.sleep(3000);

		if (browserName.equals("chrome")) {
			Runtime.getRuntime().exec("src\\Test_Data\\PNG Image Upload for Chrome.exe");
		} else if (browserName.equals("internet explorer")) {
			Runtime.getRuntime().exec("src\\Test_Data\\PNG Image Upload for IE.exe");
		} else {
			Runtime.getRuntime().exec("src\\Test_Data\\PNG Image Upload for firefox.exe");
		}

		Thread.sleep(15000);
		HighlightElement(driver, Save_Company_Logo);
		Save_Company_Logo.click();
		Thread.sleep(5000);
		HighlightElement(driver, Delete_Company_Logo);
		Delete_Company_Logo.click();
		Thread.sleep(5000);
		HighlightElement(driver, Browse_Company_Logo);
		Browse_Company_Logo.click();
		Thread.sleep(3000);
		if (browserName.equals("chrome")) {
			Runtime.getRuntime().exec("src\\Test_Data\\JPG Image Upload for Chrome.exe");
		} else if (browserName.equals("internet explorer")) {
			Runtime.getRuntime().exec("src\\Test_Data\\JPG Image Upload for IE.exe");
		} else {
			Runtime.getRuntime().exec("src\\Test_Data\\JPG Image Upload for firefox.exe");
		}

		Thread.sleep(15000);
		HighlightElement(driver, Save_Company_Logo);
		Save_Company_Logo.click();
		Thread.sleep(5000);
		Home_tab.click();
	}

}
