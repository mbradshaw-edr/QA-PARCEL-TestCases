package testCaseClassesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Verify_availabilityOfStart_TC01 {
	By Start=By.id("start-panel");
	
public WebDriver wd;
    
public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
{
       JavascriptExecutor jse=(JavascriptExecutor)wd;
      jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
      Thread.sleep(2000);
      jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
   
}
	
	public Verify_availabilityOfStart_TC01(WebDriver wd)
	{
		this.wd=wd;
	} 
	/* Method for veryfyng Homi/Landing page after logged in successfully */
	public void pageTitle()
	{
		String s=wd.getTitle();
		System.out.println("After loin page title is: "+s);
	}
	/* Method for veryfyng availability of all options under the 'Start' menu */
	public void start() throws InterruptedException
	{
		Boolean b=wd.findElement(Start).isDisplayed();
		System.out.println("Availability of this option: "+b);
		WebElement e1=wd.findElement(Start);
		HighlightElement(wd, e1);
		String s=e1.getText();
		System.out.println("Name of this option: "+s);
		Assert.assertEquals("Start", s);
	}
	/* Method for calling all methods related to this test case together */
	public void verifyStart() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.pageTitle();
		this.start();
	}
	

}
