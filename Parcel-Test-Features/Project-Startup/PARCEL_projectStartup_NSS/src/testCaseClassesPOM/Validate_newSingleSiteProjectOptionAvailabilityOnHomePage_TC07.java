package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_newSingleSiteProjectOptionAvailabilityOnHomePage_TC07 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	
	
public WebDriver wd;
    
public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
{
       JavascriptExecutor jse=(JavascriptExecutor)wd;
      jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
      Thread.sleep(2000);
      jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
   
}

	
	public Validate_newSingleSiteProjectOptionAvailabilityOnHomePage_TC07(WebDriver wd)
	{
		this.wd=wd;
	} 

	/* Method for checking availability, clickability, 'New New Single Site Project' option of start menu on home page */
	public void availability_NewSingleSitePriject() throws InterruptedException
	{
		WebElement e1=wd.findElement(HomeButton);
		HighlightElement(wd, e1);
		e1.click();
		WebElement e2=wd.findElement(NSSP);
		HighlightElement(wd, e2);
		String s=e2.getText();
		System.out.println("Name Of this option is "+s);
		Boolean b=wd.findElement(NSSP).isDisplayed();
		System.out.println("Availability of this option is: "+b);
		Boolean b1=wd.findElement(NSSP).isEnabled();
		System.out.println("Enability for to check clickable: "+b1);
	}
	/* Method for click on 'Single Site Project' option of start menu */
	public void click_NsspOption() throws InterruptedException
	{
		
		WebElement e2=wd.findElement(NSSP);
		HighlightElement(wd, e2);
		e2.click();
		String s=wd.getTitle();
		System.out.println("After click on 'New Single Site Project', new page title is: "+s);
	}

	/* Method for calling all methods related to this test case together */
	public void ValidateNewSingleSiteProjectOptionunderStart() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.availability_NewSingleSitePriject();
		this.click_NsspOption();
	}

}
