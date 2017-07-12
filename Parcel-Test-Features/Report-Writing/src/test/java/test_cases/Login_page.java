package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR;

public class Login_page {

	WebDriver driver;

	By username = By.id("uEmail");

	By password = By.id("pass");

	By loginbutton = By.xpath("//*[@id='login-box']/div[3]/div/button");

	public Login_page(WebDriver driver) {

		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	public void logintoparcel() throws Exception {
		ExcelR excel = new ExcelR("src\\test\\java\\Test_Data\\Report Writing Test Data.xlsx");
		HighlightElement(driver, driver.findElement(username));
		driver.findElement(username).sendKeys(excel.getCredentials("Credentials", 1, 2));
		HighlightElement(driver, driver.findElement(password));
		driver.findElement(password).sendKeys(excel.getCredentials("Credentials", 1, 3));
		HighlightElement(driver, driver.findElement(loginbutton));
		driver.findElement(loginbutton).click();
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			Thread.sleep(6000);
		}
	}

}
