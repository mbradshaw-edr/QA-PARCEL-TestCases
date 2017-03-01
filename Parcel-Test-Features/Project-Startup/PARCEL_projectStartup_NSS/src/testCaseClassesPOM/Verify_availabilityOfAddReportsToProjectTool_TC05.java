package testCaseClassesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Verify_availabilityOfAddReportsToProjectTool_TC05 {
	

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
	By ToolIcon=By.xpath("html/body/div/div/div/div/div/div/div/div/div[2]/a/span[2]");
	By AddProjectReportOption=By.xpath("html/body/div/div/div/div/div/div/div/div/div/ul/li[8]/a");
	
	By GoToFirstProjectReport=By.xpath(".//*[@id='1217624']/td[1]/a");
	By GoToFirstProjectDashboard=By.xpath(".//*[@id='1217624']/td[2]/a");
	By SiteIDTextBox=By.xpath("//*[@id=('header-nav')]/li/form/input[1]");
	
	
	
	
	public WebDriver wd;
  
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
		
		public Verify_availabilityOfAddReportsToProjectTool_TC05(WebDriver wd)
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
			
			WebElement e3=wd.findElement(ProjectNameField);
			HighlightElement(wd, e3);
			e3.sendKeys(proname);


					
		}
		public void set_DateDraftDueField(String ddd) throws InterruptedException
		{
			WebElement e4=wd.findElement(DateDraftDueField);
			HighlightElement(wd, e4);
			e4.sendKeys(ddd);
		}
		public void set_DateFineDueField(String fdd) throws InterruptedException
		{
			WebElement e5=wd.findElement(DateFineDueField);
			HighlightElement(wd, e5);
			e5.sendKeys(fdd);
		}
		public void set_PropertyName(String pname) throws InterruptedException
		{
			WebElement e6=wd.findElement(PropertyName);
			HighlightElement(wd, e6);
			e6.sendKeys(pname);
		}
		public void set_prop_AddressField(String Address) throws InterruptedException
		{
			WebElement e7=wd.findElement(AddressField);
			e7.sendKeys(Address);
			HighlightElement(wd, e7);
			e7.click();
		}
		public void set_City(String city) throws InterruptedException
		{
			WebElement e8=wd.findElement(City);
			HighlightElement(wd, e8);
			e8.sendKeys(city);
		}
		public void set_CountryDropDown() throws InterruptedException
		{
			WebElement e1=wd.findElement(CountryDropDown);
			HighlightElement(wd, e1);
			Select s=new Select(e1);
			s.selectByValue("US");
			Thread.sleep(3000);
		}
		public void set_StateDropdown() throws InterruptedException
		{
			WebElement e1=wd.findElement(StateDropdown);
			HighlightElement(wd, e1);
			Select s=new Select(e1);
			s.selectByValue("TX");
			Thread.sleep(3000);
		}
		public void click_Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox() throws InterruptedException
		{
			WebElement e9=wd.findElement(Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox);
			HighlightElement(wd, e9);
			e9.click();
		}
		public void set_Project_ID(String ProId) throws InterruptedException
		{
			Thread.sleep(5000);
			WebElement e1=wd.findElement(Project_ID);
			Boolean b=e1.isDisplayed();
			System.out.println("Visibility is : "+b);
			HighlightElement(wd, e1);
			e1.sendKeys(ProId);
			
		}
		public void click_SubmitButton() throws InterruptedException
		{
			WebElement e11=wd.findElement(SubmitButton);
			HighlightElement(wd, e11);
			e11.click();
		}
		public void click_ToolIcon() throws InterruptedException
		{
			Thread.sleep(5000);
			WebElement e12=wd.findElement(ToolIcon);
			HighlightElement(wd, e12);
			e12.click();
			Thread.sleep(3000);
		}
		public void checkAvailability_AddProjectReportOption() throws InterruptedException
		{
			Boolean b=wd.findElement(AddProjectReportOption).isDisplayed();
			System.out.println("After project creation availability Of this Option is: "+b);
			Boolean b1=wd.findElement(AddProjectReportOption).isEnabled();
			System.out.println("Enability for click: "+b1);
			WebElement e1=wd.findElement(AddProjectReportOption);
			HighlightElement(wd, e1);
			String s=e1.getText();
			System.out.println("Name Of this potion is :  "+s);
		}
		
		public void loadSiteID() throws InterruptedException
		{
			WebElement e1=wd.findElement(SiteIDTextBox);
			HighlightElement(wd, e1);
			e1.clear();
			e1.sendKeys("1330055");
			e1.sendKeys(Keys.ENTER);
			Thread.sleep(7000);
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
			this.click_SubmitButton();
			this.click_ToolIcon();
			this.checkAvailability_AddProjectReportOption();
			
			
			
		}
		public void mainMethod1() throws InterruptedException
		{
            this.loadSiteID();
			this.click_ToolIcon();
			this.checkAvailability_AddProjectReportOption();
		}

}
