package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_attachmentsSectionOnNSSP_TC26 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	By AttachmentsSection=By.xpath("html/body/div/div/div/div/div/div/form/table[8]/tbody/tr/td/b");
	By AttachmentsShowLink=By.xpath(".//*[@id='divShowAttach']/b/a");
	By AttachmentsHide=By.xpath(".//*[@id='divHideAttach']/b/a");
	By AllFieldsUnderGrantAccessToOtherUsers=By.xpath(".//*[@id='divAttach']/table/tbody/tr/td/input");
	
	public WebDriver wd;
	 public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_attachmentsSectionOnNSSP_TC26(WebDriver wd)
	{
		this.wd=wd;
	} 

	
	/* Method for click on "New Single Site Project" */
	public void click_NewSingleSiteProject() throws InterruptedException
	{
		System.out.println("*** Validate 'Attachments' section on New Single Site Project page. ***");
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
		System.out.println("varifying 'Show' Functionality for 'Attachments' section and therefore this section is not mendetory");
		WebElement e1=wd.findElement(AttachmentsShowLink);
		HighlightElement(wd, e1);
		String s=e1.getText();
		Boolean b=wd.findElement(AttachmentsShowLink).isDisplayed();
		Boolean b1=wd.findElement(AttachmentsShowLink).isEnabled();
		WebElement e2=wd.findElement(AttachmentsSection);
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
		WebElement e1=wd.findElement(AttachmentsShowLink);
		HighlightElement(wd, e1);
		e1.click();
		 List<WebElement> l=wd.findElements(AllFieldsUnderGrantAccessToOtherUsers);
	        for(WebElement e:l)
	        {
	        	HighlightElement(wd, e);
	        	String s=e.getAttribute("value");
	        	System.out.println(" : "+s);
	        }
	        
	}
	
	public void verifyingHideFunctionality() throws InterruptedException
	{
		System.out.println("varifying 'Hide' Functionality after licked on 'Show' functionality for 'Attachments' section and therefore this section is not medetory");
		
		WebElement e1=wd.findElement(AttachmentsHide);
		HighlightElement(wd, e1);
		String s1=e1.getText();
		Boolean b2=wd.findElement(AttachmentsHide).isDisplayed();
		Boolean b3=wd.findElement(AttachmentsHide).isEnabled();
		System.out.println("Name of this link is :"+s1);
		System.out.println("Availability :"+b2);
		System.out.println("Clickability :"+b3);
		WebElement e2=wd.findElement(AttachmentsHide);
		HighlightElement(wd, e2);
		e2.click();
		
	}
	
	public void mainMethod() throws InterruptedException
	
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_NewSingleSiteProject();
		this.verifyingShowFunctionality();
		this.additionalPropertyInfoFields();
		Thread.sleep(5000);
		this.verifyingHideFunctionality();
	}

}
