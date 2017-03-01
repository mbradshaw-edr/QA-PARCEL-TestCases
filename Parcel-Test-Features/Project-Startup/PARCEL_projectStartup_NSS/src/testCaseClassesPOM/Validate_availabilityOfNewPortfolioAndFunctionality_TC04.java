package testCaseClassesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_availabilityOfNewPortfolioAndFunctionality_TC04 {
	
	public WebDriver wd;

	By ProjectMenu=By.id("link_131");
	By NewPortfolio=By.className("feature136");
	
	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_availabilityOfNewPortfolioAndFunctionality_TC04(WebDriver wd)
	{
		this.wd=wd;
	} 
	/* Method for verifying that whether 'New Portfolio' option is available or not under the 'project'
	 * Menu 
	 */
	public void availabilityOfNewPortfolio() throws InterruptedException
	{
		System.out.println("**** Method for verifying that whether 'New Portfolio' option is available or not under the 'project' Menu and validating it's functionality ***");
		wd.navigate().back();
		WebElement e1=wd.findElement(ProjectMenu);
		HighlightElement(wd, e1);
		e1.click();
		Boolean b=wd.findElement(NewPortfolio).isDisplayed();
		System.out.println("Availability of first option under the 'project menu': "+b);
		WebElement e2=wd.findElement(NewPortfolio);
		HighlightElement(wd, e2);
		String s=e2.getText();
		//Assert.assertEquals("New Single Site Project", s);
		System.out.println("The name of this option under 'Project' menue is: "+s);
	}
	/* Method for validating the functionality of 'New Portfolio' Option */
	public void click_NewPortfolio() throws InterruptedException
	{
		//wd.findElement(ProjectMenu).click();
		WebElement e2=wd.findElement(NewPortfolio);
		HighlightElement(wd, e2);
		e2.click();
		String s=wd.getTitle();
		System.out.println("The title of nevigated or redirected page afte click on 'New Portfolio' option under 'Project' menue is: "+s);
	}
	/* Method for calling all methods related to this test case together */
	public void validatingNewPortfolioOptionUnderProjectMenu() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.availabilityOfNewPortfolio();
		this.click_NewPortfolio();
		
	}

}
