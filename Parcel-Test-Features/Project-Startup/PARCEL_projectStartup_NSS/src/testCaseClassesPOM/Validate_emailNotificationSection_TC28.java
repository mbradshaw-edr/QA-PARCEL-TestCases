package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_emailNotificationSection_TC28 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	By EmailNotificationSection=By.xpath("//*[@id='divEmailHeader']/table/tbody/tr/td/b");
	By EmailNotificationShowLink=By.xpath(".//*[@id='divShowEmail']/b/a");
	By EmailNotificationHide=By.xpath(".//*[@id='divHideEmail']/b/a");
	By AllFieldsUnderEmailNotification=By.xpath(".//*[@id='divEmail']/table/tbody/tr/td[1]");
	By CheckboxToEnableEmailNotification=By.xpath("//*[@id='divEmail']/table/tbody/tr[1]/td/input");
	By FindContactLinkOnEmailNotification=By.xpath(".//*[@id='divEmail']/table/tbody/tr/td/b/a");
	
	public WebDriver wd;
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_emailNotificationSection_TC28(WebDriver wd)
	{
		this.wd=wd;
	} 

	
	/* Method for click on "New Single Site Project" */
	public void click_NewSingleSiteProject() throws InterruptedException
	{
		System.out.println("*** Validate   the 'Email Notification' section. ***");
		System.out.println(" ");
		WebElement e1=wd.findElement(HomeButton);
		HighlightElement(wd, e1);
		e1.click();
		WebElement e2=wd.findElement(NSSP);
		HighlightElement(wd, e2);
		e2.click();
		
	}
	
	public void verifyingShowFunctionality() throws InterruptedException
	{
		
		System.out.println("varifying 'Show' (or expend) Functionality for 'Email Notification' section and therefore this section is not mendetory");
		WebElement e1=wd.findElement(EmailNotificationShowLink);
		HighlightElement(wd, e1);
		String s=e1.getText();
		Boolean b=wd.findElement(EmailNotificationShowLink).isDisplayed();
		Boolean b1=wd.findElement(EmailNotificationShowLink).isEnabled();
		WebElement e2=wd.findElement(EmailNotificationSection);
		HighlightElement(wd, e2);
		String s3=e2.getText();
		System.out.println("Section is :"+s3);
		System.out.println("Name of this link is :"+s);
		System.out.println("Availability :"+b);
		System.out.println("Clickability :"+b1);
		
	}
	
	public void additionalPropertyInfoFields() throws InterruptedException
	{
		System.out.println("When user clicked on 'Show' link for this section, it get expended, and fields are displayed, the list of these"
				+ "displayad fields is as follows-");
		WebElement e1=wd.findElement(EmailNotificationShowLink);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(3000);
		WebElement e2=wd.findElement(CheckboxToEnableEmailNotification);
		HighlightElement(wd, e2);
		e2.click();
		
		 List<WebElement> l=wd.findElements(AllFieldsUnderEmailNotification);
	        for(WebElement e:l)
	        {
	        	HighlightElement(wd, e);
	        	String s=e.getText();
	        	System.out.println(" : "+s);
	        }
	        
	}
	
	public void verifyingHideFunctionality() throws InterruptedException
	{
		System.out.println("varifying 'Hide' Functionality after licked on 'Show' functionality for 'Attachments' section and therefore this section is not medetory");
		
		WebElement e1=wd.findElement(EmailNotificationHide);
		HighlightElement(wd, e1);
		String s1=e1.getText();
		Boolean b2=wd.findElement(EmailNotificationHide).isDisplayed();
		Boolean b3=wd.findElement(EmailNotificationHide).isEnabled();
		System.out.println("Name of this link is :"+s1);
		System.out.println("Availability :"+b2);
		System.out.println("Clickability :"+b3);
		WebElement e2=wd.findElement(CheckboxToEnableEmailNotification);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(3000);
		WebElement e3=wd.findElement(EmailNotificationHide);
		HighlightElement(wd, e3);
		e3.click();
		
	}
	
	public void mainMethod() throws InterruptedException
	
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_NewSingleSiteProject();
		this.verifyingShowFunctionality();
		this.additionalPropertyInfoFields();
		this.verifyingHideFunctionality();
	}

}
