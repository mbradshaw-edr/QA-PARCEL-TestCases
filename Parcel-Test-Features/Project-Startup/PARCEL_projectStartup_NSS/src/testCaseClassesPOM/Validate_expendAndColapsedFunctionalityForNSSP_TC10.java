package testCaseClassesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_expendAndColapsedFunctionalityForNSSP_TC10 {
	
	By HomeButton=By.className("feature130");
	
	By NSSP=By.className("feature157");
	By ProjectInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[1]/tbody/tr/td/b");
	By ClientInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[2]/tbody/tr/td/b");
	By PropertyInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[3]/tbody/tr/td/b");
	By ReportSection=By.xpath("html/body/div/div/div/div/div/div/form/table[4]/tbody/tr/td[1]/b");
	By AdditionalPropertyInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[5]/tbody/tr/td/b");
	By SiteContactInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[6]/tbody/tr/td/b");
	By GrantAccessToOtherUsers=By.xpath("html/body/div//div/form/table[7]/tbody/tr/td/b");
	By Attachments=By.xpath("html/body/div/div/div/div/div/div/form/table[8]/tbody/tr/td/b");
	By EmailNotification=By.xpath(".//*[@id='divEmailHeader']/table/tbody/tr/td/b");
	
	By ClientInformationShow=By.xpath("//*[@id=('divShowClient')]/b/a");
	By AdditionalPropertyInformationShow=By.xpath("//*[@id='divShowPropAdditional']/b/a");
	By SiteContactInformationShow=By.xpath("//*[@id='divShowContact']/b/a");
	By GrantAccessToOtherUsersShow=By.xpath("//*[@id='divShowAccess']/b/a");
	By AttachmentsShow=By.xpath("//*[@id='divShowAttach']/b/a");
	By EmailNotificationShow=By.xpath("//*[@id='divShowEmail']/b/a");
	
	By ClientInformationHide=By.xpath("//*[@id=('divHideClient')]/b/a");
	By AdditionalPropertyInformationHide=By.xpath("//*[@id='divHidePropAdditional']/b/a");
	By SiteContactInformationHide=By.xpath("//*[@id='divHideContact']/b/a");
	By GrantAccessToOtherUsersHide=By.xpath("//*[@id='divHideAccess']/b/a");
	By AttachmentsHide=By.xpath("//*[@id='divHideAttach']/b/a");
	By EmailNotificationHide=By.xpath("//*[@id='divHideEmail']/b/a");
    public WebDriver wd;

    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
	public Validate_expendAndColapsedFunctionalityForNSSP_TC10(WebDriver wd)
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
	public void sectionsHavingShowFunctionality() throws InterruptedException
	{
		System.out.println("Following sections has 'Show' option, Specify (Which means) that these sections a");
		System.out.println("Folowing sections are Not mendetory and colapsed because thay all have 'Show' link whch is clickable- ");
		WebElement e1=wd.findElement(ClientInformation);
		HighlightElement(wd, e1);
		String s=e1.getText();
		Boolean b=wd.findElement(ClientInformationShow).isDisplayed();
		Boolean c=wd.findElement(ClientInformationShow).isEnabled();
		System.out.println("First non medetory or colapsed Section : "+s);
		System.out.println("and it displayed 'Show' option  : "+b);
		System.out.println("and it's clickability  : "+c);
		
		WebElement e2=wd.findElement(AdditionalPropertyInformation);
		HighlightElement(wd, e2);
		String s1=e2.getText();
		Boolean b1=wd.findElement(AdditionalPropertyInformationShow).isDisplayed();
		Boolean c1=wd.findElement(AdditionalPropertyInformationShow).isEnabled();
		System.out.println("Second non medetory or colapsed Section : "+s1);
		System.out.println("and it displayed 'Show' option  : "+b1);
		System.out.println("and it's clickability  : "+c1);
		
		WebElement e3=wd.findElement(SiteContactInformation);
		HighlightElement(wd, e3);
		String s2=e3.getText();
		Boolean b2=wd.findElement(SiteContactInformationShow).isDisplayed();
		Boolean c2=wd.findElement(SiteContactInformationShow).isEnabled();
		System.out.println("Third non medetory or colapsed Section : "+s2);
		System.out.println("and it displayed 'Show' option  : "+b2);
		System.out.println("and it's clickability  : "+c2);
		
		WebElement e4=wd.findElement(GrantAccessToOtherUsers);
		HighlightElement(wd, e4);
		String s3=e4.getText();
		Boolean b3=wd.findElement(GrantAccessToOtherUsersShow).isDisplayed();
		Boolean c3=wd.findElement(GrantAccessToOtherUsersShow).isEnabled();
		System.out.println("Fourth non medetory or colapsed Section : "+s3);
		System.out.println("and it displayed 'Show' option  : "+b3);
		System.out.println("and it's clickability  : "+c3);
		
		WebElement e5=wd.findElement(Attachments);
		HighlightElement(wd, e5);
		String s4=e5.getText();
		Boolean b4=wd.findElement(AttachmentsShow).isDisplayed();
		Boolean c4=wd.findElement(AttachmentsShow).isEnabled();
		System.out.println("Fifth non medetory or colapsed Section : "+s4);
		System.out.println("and it displayed 'Show' option  : "+b4);
		System.out.println("and it's clickability  : "+c4);
		
		WebElement e6=wd.findElement(EmailNotification);
		HighlightElement(wd, e6);
		String s5=e6.getText();
		Boolean b5=wd.findElement(EmailNotificationShow).isDisplayed();
		Boolean c5=wd.findElement(EmailNotificationShow).isEnabled();
		System.out.println("Sixth non medetory or colapsed Section : "+s5);
		System.out.println("and it displayed 'Show' option  : "+b5);
		System.out.println("and it's clickability  : "+c5);
	}
	public void unavailabilityShowOption() throws InterruptedException
	{
		System.out.println("Folowing sections are mendetory and pre-expended because thay haven't 'Show' link- ");
		WebElement e1=wd.findElement(ProjectInformation);
		HighlightElement(wd, e1);
		String s=e1.getText();
		System.out.println("First Mendetory Section :"+s);
		WebElement e2=wd.findElement(PropertyInformation);
		HighlightElement(wd, e2);
		String s1=e2.getText();
		System.out.println("Second Mendetory Section :"+s1);
		WebElement e3=wd.findElement(ReportSection);
		HighlightElement(wd, e3);
		String s2=e3.getText();
		System.out.println("Third Mendetory Section :"+s2);
	}
	public void click_onShowOfNonMedetorySection() throws InterruptedException
	{
		WebElement e1=wd.findElement(ClientInformationShow);
		HighlightElement(wd, e1);
		e1.click();
		WebElement e2=wd.findElement(ClientInformation);
		HighlightElement(wd, e2);
		String s=e2.getText();
		Boolean b=wd.findElement(ClientInformationHide).isDisplayed();
		Boolean c=wd.findElement(ClientInformationHide).isEnabled();
		System.out.println("First non medetory section clicked therefor this section expend : "+s);
		System.out.println("and now it availability of 'Hide' option in place of 'Show' option  : "+b);
		System.out.println("and it's clickability  : "+c);
		
		WebElement e3=wd.findElement(AdditionalPropertyInformationShow);
		HighlightElement(wd, e3);
		e3.click();
		WebElement e4=wd.findElement(AdditionalPropertyInformation);
		HighlightElement(wd, e4);
		String s1=e4.getText();
		Boolean b1=wd.findElement(AdditionalPropertyInformationHide).isDisplayed();
		Boolean c1=wd.findElement(AdditionalPropertyInformationHide).isEnabled();
		System.out.println("First non medetory section clicked therefor this section expend : "+s1);
		System.out.println("and now it availability of 'Hide' option in place of 'Show' option  : "+b1);
		System.out.println("and it's clickability  : "+c1);
		
		WebElement e5=wd.findElement(SiteContactInformationShow);
		HighlightElement(wd, e5);
		e5.click();
		WebElement e6=wd.findElement(SiteContactInformation);
		HighlightElement(wd, e6);
		String s2=e6.getText();
		Boolean b2=wd.findElement(SiteContactInformationHide).isDisplayed();
		Boolean c2=wd.findElement(SiteContactInformationHide).isEnabled();
		System.out.println("First non medetory section clicked therefor this section expend : "+s2);
		System.out.println("and now it availability of 'Hide' option in place of 'Show' option  : "+b2);
		System.out.println("and it's clickability  : "+c2);
		
		Thread.sleep(7000);
		
		//WebElement e7=wd.findElement(GrantAccessToOtherUsersShow);
		//HighlightElement(wd, e7);
		//e7.click();
		WebElement e8=wd.findElement(GrantAccessToOtherUsers);
		HighlightElement(wd, e8);
		String s3=e8.getText();
		Boolean b3=wd.findElement(GrantAccessToOtherUsersHide).isDisplayed();
		Boolean c3=wd.findElement(GrantAccessToOtherUsersHide).isEnabled();
		System.out.println("First non medetory section clicked therefor this section expend : "+s3);
		System.out.println("and now it availability of 'Hide' option in place of 'Show' option  : "+b3);
		System.out.println("and it's clickability  : "+c3);
		
		WebElement e9=wd.findElement(AttachmentsShow);
		HighlightElement(wd, e9);
		e9.click();
		WebElement e10=wd.findElement(Attachments);
		HighlightElement(wd, e10);
		String s4=e10.getText();
		Boolean b4=wd.findElement(AttachmentsHide).isDisplayed();
		Boolean c4=wd.findElement(AttachmentsHide).isEnabled();
		System.out.println("First non medetory section clicked therefor this section expend : "+s4);
		System.out.println("and now it availability of 'Hide' option in place of 'Show' option  : "+b4);
		System.out.println("and it's clickability  : "+c4);
		
		WebElement e11=wd.findElement(EmailNotificationShow);
		HighlightElement(wd, e11);
		e11.click();
		WebElement e12=wd.findElement(EmailNotification);
		HighlightElement(wd, e12);
		String s5=e12.getText();
		Boolean b5=wd.findElement(EmailNotificationHide).isDisplayed();
		Boolean c5=wd.findElement(EmailNotificationHide).isEnabled();
		System.out.println("First non medetory section clicked therefor this section expend : "+s5);
		System.out.println("and now it availability of 'Hide' option in place of 'Show' option  : "+b5);
		System.out.println("and it's clickability  : "+c5);
	}
	
	public void vailidatingShowHideFuctionality() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_NsspOption();
		this.sectionsHavingShowFunctionality();
		this.unavailabilityShowOption();
		this.click_onShowOfNonMedetorySection();
	}
	

}
