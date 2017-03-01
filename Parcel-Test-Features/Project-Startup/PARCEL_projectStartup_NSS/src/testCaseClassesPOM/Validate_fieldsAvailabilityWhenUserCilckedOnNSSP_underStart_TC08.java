package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_fieldsAvailabilityWhenUserCilckedOnNSSP_underStart_TC08 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	By AllMainFields=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td[1]/b");
	By AllButtons=By.xpath("//*[@id=('divButtons')]/input");
	By NewPortfolioLink=By.linkText("Advanced Project Setup");
	By EmailNotificationSection=By.xpath("//*[@id='divEmailHeader']/table/tbody/tr/td/b");
	
	public WebDriver wd;

    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
	public Validate_fieldsAvailabilityWhenUserCilckedOnNSSP_underStart_TC08(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	/* Method for click on 'Single Site Project' option of start menu */
	public void click_NsspOption() throws InterruptedException
	{
		WebElement e1=wd.findElement(HomeButton);
		HighlightElement(wd, e1);
		e1.click();
		WebElement e2=wd.findElement(NSSP);
		HighlightElement(wd, e2);
		e2.click();
		String s=wd.getTitle();
		System.out.println("After click on 'New Single Site Project', new page title is: "+s);
	}
	public void checkAvailabilityOfFields() throws InterruptedException
	{
		System.out.println("Available main fields on this pag are- ");
		List<WebElement> l=wd.findElements(AllMainFields);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
					System.out.println(" :"+s);
		}
	}
	public void checkAvailabilityOfButtons() throws InterruptedException
	{
		System.out.println("Available buttons on this pag are- ");
		List<WebElement> l=wd.findElements(AllButtons);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getAttribute("Value");
					System.out.println(" :"+s);
		}
		WebElement e=wd.findElement(EmailNotificationSection);
		HighlightElement(wd, e);
		String s=e.getText();
		System.out.println(" :"+s);
	}
	public void linkAvailabilityForNewPortfolioLink() throws InterruptedException
	{
		WebElement e=wd.findElement(NewPortfolioLink);
		HighlightElement(wd, e);
		String s=e.getText();
		System.out.println("Link name is :"+s);
		Boolean b=wd.findElement(NewPortfolioLink).isDisplayed();
		System.out.println("Availability of this link is :"+b);
		
	}
	

	/* Method for calling all methods related to this test case together */
	public void validateNewSingleSiteProjectOptionUnderStart() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_NsspOption();
		this.checkAvailabilityOfFields();
		this.checkAvailabilityOfButtons();
		this.linkAvailabilityForNewPortfolioLink();
		
	}

}
