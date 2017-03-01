package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_ResultWhenUserClicks_AddReportToProjectTool_TC06 {
	
	By HomeButton=By.className("feature130");
	By SiteIdTextBox=By.xpath("//*[@id=('header-nav')]/li/form/input[1]");
	By ToolIcon=By.xpath("html/body/div/div/div/div/div/div/div/div/div[2]/a");
	By AddProjectReportOption=By.xpath("html/body/div/div/div/div/div/div/div/div/div/ul/li[8]/a");
	By AllFieldsNAme=By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td[1]");
	By PopulatedDataFields=By.xpath("/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input");
	By CountryDD= By.id("country");
	By StateDD= By.id("state");

	public WebDriver wd;

	 public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_ResultWhenUserClicks_AddReportToProjectTool_TC06(WebDriver wd)
	{
		this.wd=wd;
	} 
	public void enterSiteID() throws InterruptedException
	{
		WebElement e1=wd.findElement(HomeButton);
		HighlightElement(wd, e1);
		e1.click();
		System.out.println(" *******Validating the result when user clicks on 'Add Report(s) To Project' too option under the tool icon ******");
		WebElement e2=wd.findElement(SiteIdTextBox);
		HighlightElement(wd, e2);
		e2.clear();
		WebElement e3=wd.findElement(SiteIdTextBox);
		HighlightElement(wd, e3);
		e3.sendKeys("1330055");
		wd.findElement(SiteIdTextBox).sendKeys(Keys.ENTER);
	}
	public void click_AddProjectReportOption() throws InterruptedException
	{
		Thread.sleep(4000);
		/*WebElement e4=wd.findElement(ToolIcon);
		HighlightElement(wd, e4);
		e4.click();
		Thread.sleep(3000);*/
		WebElement e5=wd.findElement(AddProjectReportOption);
		HighlightElement(wd, e5);
		e5.click();
		
	}
	public void fieldsAvailabilityObservation() throws InterruptedException
	{
		System.out.println("Availability of all Fields on this pag are- ");
		List<WebElement> l=wd.findElements(AllFieldsNAme);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
					System.out.println(" :"+s);
		}
	}
	public void checkEnabilityOfFields() throws InterruptedException
	{
		System.out.println("Checking all fields on this pag are editable- ");
		List<WebElement> l=wd.findElements(AllFieldsNAme);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			Boolean b=e.isEnabled();
					System.out.println(" :"+b);
		}
	}
	public void checkPopulatedDataFields() throws InterruptedException
	{
		System.out.println("All neccessory information based on existing project, populated here when user clicks on 'Add Project Report(s)' option  - ");
		List<WebElement> l=wd.findElements(PopulatedDataFields);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getAttribute("value");
					System.out.println(" :"+s);
		}
		WebElement e1=wd.findElement(CountryDD);
		HighlightElement(wd, e1);
		Select s=new Select(e1);
		WebElement e2=s.getFirstSelectedOption();
		HighlightElement(wd, e2);
		String ss=e2.getText();
		
		System.out.println(" :"+ss);
		Thread.sleep(4000);
		
		WebElement e3=wd.findElement(StateDD);
		HighlightElement(wd, e3);
		/*Select s2=new Select(e3);
		WebElement e4=s2.getFirstSelectedOption();
		HighlightElement(wd, e4);*/
		String ss2=e3.getAttribute("value");
		
		System.out.println(" :"+ss2);
		Thread.sleep(2000);
	}
	
	public void resultValidationWhenUserClickOnAllReportsOption() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//this.enterSiteID();
		this.click_AddProjectReportOption();
		this.fieldsAvailabilityObservation();
		this.checkEnabilityOfFields();
		this.checkPopulatedDataFields();
	}
	
	
	
	
	
	
}
