package detailTestScenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Login {
	
	By UserName=By.id("uEmail"); 
	By Password=By.id("pass");
	By Login=By.name("submit");
	
	//By LogoutMenue=By.id("link_164");
	//By Logout= By.xpath(".//*[@id='SnehalPatilMenu']/li/ul/li[4]/a");
	
	public WebDriver wd;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }


	
	public Login(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	/* Method for setting valid data for user name field */
	public void setUserName() throws InterruptedException
	{
		WebElement e=wd.findElement(UserName);
		e.sendKeys(ExcelR1.getData("User Login Data",1,1));
		HighlightElement(wd, e);
		Thread.sleep(1000);
		System.out.println("User Enterd Success");
	}
	/* Method for setting valid data for password field */
	public void sePassword() throws InterruptedException
	{
		WebElement e=wd.findElement(Password);
		e.sendKeys(ExcelR1.getData("User Login Data",1,2));
		HighlightElement(wd, e);
		Thread.sleep(1000);
		System.out.println("Pass Enterd Success");
	}
	/* Method for click on Login button */
	public void clickLogin() throws InterruptedException
	{
		WebElement e3=wd.findElement(Login);
		
		HighlightElement(wd, e3);
		e3.click();
		Thread.sleep(5000);
		System.out.println("User Login Success");
		
	}
	/* Method for calling all methods related to this test case together */
	public void loginTo() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.setUserName();
		this.sePassword();
		this.clickLogin();
	}

}
