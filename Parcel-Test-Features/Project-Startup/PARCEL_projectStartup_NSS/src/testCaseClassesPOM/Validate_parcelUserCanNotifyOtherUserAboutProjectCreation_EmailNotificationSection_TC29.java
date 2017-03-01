package testCaseClassesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_parcelUserCanNotifyOtherUserAboutProjectCreation_EmailNotificationSection_TC29 {
	
	By HomeButton=By.className("feature130");
	By NewSingleSiteProjectButton=By.className("feature157");
	By ProjectNameField=By.id("project_name");
	By DateDraftDueField=By.id("draft_date");
	By DateFineDueField=By.id("final_date");
	By PropertyName=By.name("prop_name");
	By AddressField=By.id("prop_address1");
	By City=By.id("prop_city");
	By CountryDropDown=By.id("prop_country");
	By StateDropdown=By.id("prop_state");
	By Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox=By.xpath("//*[@value='PhaseI.2149']");
	By Project_ID=By.xpath("//*[@id='divFeePhaseI.2149']/input[2]");
	By SubmitButton=By.name("submitExpress");

	By EmailNotificationSection=By.xpath("//*[@id='divEmailHeader']/table/tbody/tr/td/b");
	By EmailNotificationShowLink=By.xpath(".//*[@id='divShowEmail']/b/a");
	By CheckboxToEnableEmailNotification=By.xpath("//*[@id='divEmail']/table/tbody/tr[1]/td/input");
	By EmailToTextField=By.name("email_to");
	By EmailCCTextField=By.name("email_cc");
	By EmailMessageTextField=By.name("email_message");
	
	
	
	
	public WebDriver wd;
	

	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_parcelUserCanNotifyOtherUserAboutProjectCreation_EmailNotificationSection_TC29(WebDriver wd)
		{
			this.wd=wd;
		} 
		public void click_NewSingleSiteProjectButton() throws InterruptedException
		{
			System.out.println("*** Checke availability of 'AddReportsToProjectTool' under the tool Icon, After create the project ***");
			WebElement e1=wd.findElement(HomeButton);
			HighlightElement(wd, e1);
			e1.click();
			WebElement e2=wd.findElement(NewSingleSiteProjectButton);
			HighlightElement(wd, e2);
			e2.click();
		}
		public void set_ProjectNameField(String proname) throws InterruptedException
		{
			WebElement e1=wd.findElement(ProjectNameField);
			HighlightElement(wd, e1);
			e1.sendKeys(proname);
		}
		public void set_DateDraftDueField(String ddd) throws InterruptedException
		{
			WebElement e1=wd.findElement(DateDraftDueField);
			HighlightElement(wd, e1);
			e1.sendKeys(ddd);
		}
		public void set_DateFineDueField(String fdd) throws InterruptedException
		{
			WebElement e1=wd.findElement(DateFineDueField);
			HighlightElement(wd, e1);
			e1.sendKeys(fdd);
		}
		public void set_PropertyName(String pname) throws InterruptedException
		{
			WebElement e1=wd.findElement(PropertyName);
			HighlightElement(wd, e1);
			e1.sendKeys(pname);
		}
		public void set_prop_AddressField(String Address) throws InterruptedException
		{
			WebElement e1=wd.findElement(AddressField);
			HighlightElement(wd, e1);
			e1.sendKeys(Address);
		}
		public void set_City(String city) throws InterruptedException
		{
			WebElement e1=wd.findElement(City);
			HighlightElement(wd, e1);
			e1.sendKeys(city);
		}
		public void set_CountryDropDown() throws InterruptedException
		{
			WebElement e1=wd.findElement(CountryDropDown);
			HighlightElement(wd, e1);
			Select s=new Select(e1);
			s.selectByValue("US");
		}
		public void set_StateDropdown() throws InterruptedException
		{
			WebElement e1=wd.findElement(StateDropdown);
			Select s=new Select(e1);
			HighlightElement(wd, e1);
			s.selectByValue("TX");
		}
		public void click_Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox() throws InterruptedException
		{
			WebElement e1=wd.findElement(Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox);
			HighlightElement(wd, e1);
			e1.click();
		}
		public void set_Project_ID(String ProId) throws InterruptedException
		{
			WebElement e1=wd.findElement(Project_ID);
			HighlightElement(wd, e1);
			e1.sendKeys(ProId);
		}
		public void click_SubmitButton(String city) throws InterruptedException
		{
			WebElement e1=wd.findElement(SubmitButton);
			HighlightElement(wd, e1);
			e1.click();
		}
		
		
		public void notifyingOtherUsers_emailNotificationFunctionality() throws InterruptedException
		{
			WebElement e1=wd.findElement(EmailNotificationShowLink);
			HighlightElement(wd, e1);
			e1.click();
			WebElement e2=wd.findElement(CheckboxToEnableEmailNotification);
			HighlightElement(wd, e2);
			e2.click();
			WebElement e3=wd.findElement(EmailToTextField);
			HighlightElement(wd, e3);
			e3.sendKeys("nkatiyar@edrnet.com");
			WebElement e4=wd.findElement(EmailCCTextField);
			HighlightElement(wd, e4);
			e4.sendKeys("skamble@edrnet.com");
			WebElement e5=wd.findElement(EmailMessageTextField);
			HighlightElement(wd, e5);
			e5.sendKeys("Hi, This just an email Varification mail");
		}
	
		/* Method for calling all methods related to this test case together */
		public void mainMethod(String proname, String ddd, String fdd, String pname,String Address, String city, String ProId) throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_NewSingleSiteProjectButton();
			this.set_ProjectNameField(proname);
			this.set_DateDraftDueField(ddd);
			this.set_DateFineDueField(fdd);
			this.set_PropertyName(pname);
			this.set_prop_AddressField(Address);
			this.set_City(city);
			this.set_CountryDropDown();
			this.set_StateDropdown();
			this.click_Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox();
			this.set_Project_ID(ProId);
			this.notifyingOtherUsers_emailNotificationFunctionality();
			this.click_SubmitButton(city);
			
		}

}
