

package testCaseClassesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Validae_availabilityAndFunctionality_NewSinleSiteProject_TC03 {
	
public WebDriver wd;

	By ProjectMenu=By.id("link_131");
	By NSSPOption=By.className("feature135");
	
	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validae_availabilityAndFunctionality_NewSinleSiteProject_TC03(WebDriver wd)
	{
		this.wd=wd;
	} 
	/* Method for verifying that whether 'New Single Site Project' option is available or not under the 'project'
	 * Menu 
	 */
	public void availabilityOfNewSingleSiteProject() throws InterruptedException
	{
		System.out.println("**** Method for verifying that whether 'New Single Site Project' option is available or not under the 'project' Menu and validating it's functionality ***");
		WebElement e1=wd.findElement(ProjectMenu);
		HighlightElement(wd, e1);
		e1.click();
		Boolean b=wd.findElement(NSSPOption).isDisplayed();
		System.out.println("Availability of first option under the 'project menu': "+b);
		WebElement e2=wd.findElement(NSSPOption);
		HighlightElement(wd, e2);
		String s=e2.getText();
		//Assert.assertEquals("New Single Site Project", s);
		System.out.println("The name of this option under 'Project' menue is: "+s);
	}
	/* Method for validating the functionality of 'New Single Site Project' Option */
	public void click_ProjectMenu() throws InterruptedException
	{
		//wd.findElement(ProjectMenu).click();
		WebElement e2=wd.findElement(NSSPOption);
		HighlightElement(wd, e2);
		e2.click();
		String s=wd.getTitle();
		System.out.println("The title of nevigated or redirected page afte click on 'New Single Site Project option under 'Project' menue is: "+s);
	}
	/* Method for calling all methods related to this test case together */
	public void validatingNSSPOptionUnderProjectMenu() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.availabilityOfNewSingleSiteProject();
		this.click_ProjectMenu();
		
	}

}
