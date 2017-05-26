package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_siteContactInformationSection_onNSSP_TC22 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	By SiteContactInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[6]/tbody/tr/td/b");
	By SiteContactInfoShowLink=By.xpath(".//*[@id='divShowContact']/b/a");
	By SiteContactInfoHide=By.xpath(".//*[@id='divHideContact']/b/a");
	By AllFieldsUnderSitesContactInfo=By.xpath(".//*[@id='divContact']/table/tbody/tr/td[1]");
	
	public WebDriver wd;
	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_siteContactInformationSection_onNSSP_TC22(WebDriver wd)
	{
		this.wd=wd;
	} 

	
	/* Method for click on "New Single Site Project" */
	public void click_NewSingleSiteProject() throws InterruptedException
	{
		System.out.println("*** Validate 'Site Contact Information' section on New Single Site Project page. ***");
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
		System.out.println("varifying 'Show' Functionality for 'Site Contact Information' and therefore this section is not medetory");
		WebElement e1=wd.findElement(SiteContactInfoShowLink);
		HighlightElement(wd, e1);
		String s=e1.getText();
		Boolean b=wd.findElement(SiteContactInfoShowLink).isDisplayed();
		Boolean b1=wd.findElement(SiteContactInfoShowLink).isEnabled();
		WebElement e2=wd.findElement(SiteContactInformation);
		HighlightElement(wd, e2);
		String s3=e2.getText();
		System.out.println("Section is :"+s3);
		System.out.println("Name of this link is :"+s);
		System.out.println("Availability :"+b);
		System.out.println("Clickability :"+b1);
		Thread.sleep(4000);
		
	}
	
	public void additionalPropertyInfoFields() throws InterruptedException
	{
		System.out.println("When user clicked on 'Show' link for this section, it get expended, and fields are displayed, the list of these"
				+ "displayad fields is as follows-");
		WebElement e1=wd.findElement(SiteContactInfoShowLink);
		HighlightElement(wd, e1);
		e1.click();
		 List<WebElement> l=wd.findElements(AllFieldsUnderSitesContactInfo);
	        for(WebElement e:l)
	        {
	        	HighlightElement(wd, e);
	        	String s=e.getText();
	        	System.out.println(" : "+s);
	        }
	        
	}
	
	public void verifyingHideFunctionality() throws InterruptedException
	{
		System.out.println("varifying 'Hide' Functionality after licked on 'Show' functionality for 'Additional Proprty Information' and therefore this section is not medetory");
		WebElement e1=wd.findElement(SiteContactInfoHide);
		HighlightElement(wd, e1);
		String s1=e1.getText();
		Boolean b2=wd.findElement(SiteContactInfoHide).isDisplayed();
		Boolean b3=wd.findElement(SiteContactInfoHide).isEnabled();
		System.out.println("Name of this link is :"+s1);
		System.out.println("Availability :"+b2);
		System.out.println("Clickability :"+b3);
		
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
