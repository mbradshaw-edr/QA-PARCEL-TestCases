package testCaseClassesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_sectionsOnNSSPPage_preexpendedAndColapsed_TC09 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	By ProjectInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[1]/tbody/tr/td/b");
	By ClientInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[2]/tbody/tr/td/b");
	By PropertyInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[3]/tbody/tr/td/b");
	By ReportSection=By.xpath("html/body/div/div/div/div/div/div/form/table[4]/tbody/tr/td[1]/b");
	By AdditionalPropertyInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[5]/tbody/tr/td/b");
	By SiteContactInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[6]/tbody/tr/td/b");
	By GrantAccessToOtherUsers=By.xpath("html/body/div/div/div/div/div/div/form/table[7]/tbody/tr/td/b");
	By Attachments=By.xpath("html/body/div/div/div/div/div/div/form/table[8]/tbody/tr/td/b");
	By EmailNotification=By.xpath(".//*[@id='divEmailHeader']/table/tbody/tr/td/b");
	
	public WebDriver wd;

	 public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_sectionsOnNSSPPage_preexpendedAndColapsed_TC09(WebDriver wd)
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
	public void availability_OfShowOption() throws InterruptedException
	{
		System.out.println("Folowing sections are colapsed because thay all have 'Show' link whch is clickable- ");
		WebElement e4=wd.findElement(ClientInformation);
		HighlightElement(wd, e4);
		String s=e4.getText();
		System.out.println(" :"+s);
		WebElement e5=wd.findElement(AdditionalPropertyInformation);
		HighlightElement(wd, e5);
		String s1=e5.getText();
		System.out.println(" :"+s1);
		WebElement e6=wd.findElement(SiteContactInformation);
		HighlightElement(wd, e6);
		String s5=e6.getText();
		System.out.println(" :"+s5);
		WebElement e7=wd.findElement(GrantAccessToOtherUsers);
		HighlightElement(wd, e7);
		String s2=e7.getText();
		System.out.println(" :"+s2);
		WebElement e8=wd.findElement(Attachments);
		HighlightElement(wd, e8);
		String s3=e8.getText();
		System.out.println(" :"+s3);
		
		WebElement e9=wd.findElement(EmailNotification);
		HighlightElement(wd, e9);
		String s4=e9.getText();
		System.out.println(" :"+s4);
	}
	public void unavailabilityShowOption() throws InterruptedException
	{
		System.out.println("Folowing sections are pre-expended because thay haven't 'Show' link- ");
		WebElement e3=wd.findElement(ProjectInformation);
		HighlightElement(wd, e3);
		String s=e3.getText();
		System.out.println(" :"+s);
		WebElement e2=wd.findElement(PropertyInformation);
		HighlightElement(wd, e2);
		String s1=e2.getText();
		System.out.println(" :"+s1);
		WebElement e1=wd.findElement(ReportSection);
		HighlightElement(wd, e1);
		String s2=e1.getText();
		System.out.println(" :"+s2);
	}
	
	public void ValidatePreExpended_ColapsedSectionOnNSSP() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_NsspOption();
		this.availability_OfShowOption();
		this.unavailabilityShowOption();
		
	}


}
