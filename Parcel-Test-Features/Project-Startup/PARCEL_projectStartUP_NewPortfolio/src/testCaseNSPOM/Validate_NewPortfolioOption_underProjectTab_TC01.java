package testCaseNSPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_NewPortfolioOption_underProjectTab_TC01 {
	By HomeButton=By.className("feature130");
	By ProjectMenu=By.id("link_131");
	By NPortfolioOption=By.className("feature136");
	
	public WebDriver wd;
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
	public Validate_NewPortfolioOption_underProjectTab_TC01(WebDriver wd)
	{
		this.wd=wd;
	} 
	/* Method for verifying that whether 'New Single Site Project' option is available or not under the 'project'
	 * Menu 
	 */
	public void availabilityOfNewSingleSiteProject() throws InterruptedException
	{
		System.out.println("**** Validate the   sub menu functionality after click on New portfolio option ***");
		WebElement e3=wd.findElement(HomeButton);
		HighlightElement(wd, e3);
		
		
		
		WebElement e1=wd.findElement(ProjectMenu);
		HighlightElement(wd, e1);
		e1.click();
		Boolean b=wd.findElement(NPortfolioOption).isDisplayed();
		System.out.println("Availability of first option under the 'project menu': "+b);
		WebElement e2=wd.findElement(NPortfolioOption);
		HighlightElement(wd, e2);
		String s=e2.getText();
		//Assert.assertEquals("New Single Site Project", s);
		System.out.println("The name of this option under 'Project' menue is: "+s);
	}
	/* Method for validating the functionality of 'New Single Site Project' Option */
	public void click_ProjectMenu() throws InterruptedException
	{
		//wd.findElement(ProjectMenu).click();
		WebElement e2=wd.findElement(NPortfolioOption);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(6000);
		//String s=wd.getTitle();
		//System.out.println("The title of nevigated or redirected page afte click on 'New Single Site Project option under 'Project' menue is: "+s);
		
		//String s1=wd.getCurrentUrl();
		//System.out.println("Redirected or new URL is: "+s1);
	}
	/* Method for calling all methods related to this test case together */
	public void newPortfolioOptionUnderProjectMenu() throws InterruptedException
	{
		//wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.availabilityOfNewSingleSiteProject();
		this.click_ProjectMenu();
		
	}

}
