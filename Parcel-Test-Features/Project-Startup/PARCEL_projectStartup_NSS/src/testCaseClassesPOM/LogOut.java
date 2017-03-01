package testCaseClassesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut {

	
	By UserTab=By.id("link_164");
	By LogoutOption= By.className("feature166");
	
	public WebDriver wd;
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }


	
	public LogOut(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_userName() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement e1=wd.findElement(UserTab);
		HighlightElement(wd, e1);
		System.out.println("User tab find out Out");
		e1.click();
		System.out.println("User tab clicked");
	}
	public void click_logoutOption() throws InterruptedException
	{
		WebElement e2=wd.findElement(LogoutOption);
		HighlightElement(wd, e2);
		System.out.println("Loggeout option find out");
		e2.click();
		System.out.println("Logg Out clicked");
		Thread.sleep(3000);
	}
	
	public void mainMethod() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_userName();
		this.click_logoutOption();
	}
}
