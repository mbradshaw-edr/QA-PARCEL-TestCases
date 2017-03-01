package testCaseClassesPOM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	By UserName=By.id("uEmail"); 
	By Password=By.id("pass");
	By Login=By.name("submit");
	
	//By LogoutMenue=By.id("link_164");
	//By Logout= By.xpath(".//*[@id='SnehalPatilMenu']/li/ul/li[4]/a");
	
	public WebDriver wd;
	
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
	public void setUserName(String un) throws InterruptedException
	{
		WebElement e1=wd.findElement(UserName);
		e1.sendKeys(un);
		HighlightElement(wd, e1);
		Thread.sleep(1000);
		System.out.println("User Enterd Success");
	}
	/* Method for setting valid data for password field */
	public void sePassword(String pa) throws InterruptedException
	{
		WebElement e2=wd.findElement(Password);
		e2.sendKeys(pa);
		HighlightElement(wd, e2);
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
	public void loginTo(String un,String pa) throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.setUserName(un);
		this.sePassword(pa);
		this.clickLogin();
	}

}
