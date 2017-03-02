package detailTestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_availabilityAndClickability_ofOrderPlacedOnERDRWebsite_underStartMenue_TC01 {
	
	By OrderPlaceOnEDR=By.className("feature159");
	By OrderPlacedOnEDRWebsitePageHeader=By.className("general-panel-name");
	By PageMessage=By.xpath("html/body/div[2]/div//div/p");
	
	
    public WebDriver wd;
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
	
	public Validate_availabilityAndClickability_ofOrderPlacedOnERDRWebsite_underStartMenue_TC01(WebDriver wd)
	{
		this.wd=wd;
	}
	
	/* Method for validating New 'Order placed on EDR' options of start menu */
	public void validateOrderPlaceOnEDROption() throws InterruptedException
	{
		WebElement e3=wd.findElement(OrderPlaceOnEDR);
		HighlightElement(wd, e3);
		//Thread.sleep(10000);
		
		Boolean b=e3.isDisplayed();
		System.out.println("availability of this optuin is: "+b);
		
		Boolean b1=e3.isEnabled();
		System.out.println("availability of this optuin is: "+b1);
		
		e3.click();
		Thread.sleep(5000);
		
		String s=wd.getTitle();
		System.out.println("After click on 'Order Place On EDR', new page title is: "+s);
				
	}
	
	/* Method for print page header of the page 'Order placed on EDR' */
	public void printPageHeader() throws InterruptedException
	{
		WebElement e3=wd.findElement(OrderPlacedOnEDRWebsitePageHeader);
		HighlightElement(wd, e3);
				
	}
	
	/* Method for print page header of the page 'Order placed on EDR' */
	public void printFunctionalMessage() throws InterruptedException
	{
		WebElement e3=wd.findElement(PageMessage);
		HighlightElement(wd, e3);
				
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.validateOrderPlaceOnEDROption();
		this.printPageHeader();
		this.printFunctionalMessage();
	}

}
