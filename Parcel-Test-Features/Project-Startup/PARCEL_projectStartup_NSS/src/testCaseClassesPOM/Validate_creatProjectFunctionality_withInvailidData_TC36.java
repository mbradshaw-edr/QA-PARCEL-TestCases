package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_creatProjectFunctionality_withInvailidData_TC36 {
	
	By HomeButton=By.className("feature130");
	By ProjectTab=By.id("link_131");
	By NewSingleSiteOption=By.className("feature135");
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
	By ToolIcon=By.xpath("html/body/div/div/div/div/div/div/div/div/div[2]/a");
	By AddProjectReportOption=By.xpath("html/body/div/div/div/div/div/div/div/div/div/ul/li[8]/a");
	
	By GoToFirstProjectReport=By.xpath(".//*[@id='1217624']/td[1]/a");
	By GoToFirstProjectDashboard=By.xpath(".//*[@id='1217624']/td[2]/a");
	
	By PageHederName=By.xpath("html/body/div/div/div/div/div/div/form/h4/p");
	
	By ErrorMessages=By.xpath("//*[@id=('divProject')]/div");
	
	
	
	
	
	public WebDriver wd;

	 public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_creatProjectFunctionality_withInvailidData_TC36(WebDriver wd)
		{
			this.wd=wd;
		} 
		public void click_NewSingleSiteProjectButton() throws InterruptedException
		{
			System.out.println("*** Validation of create project functionality with invalid data ***");
			WebElement e1=wd.findElement(HomeButton);
			HighlightElement(wd, e1);
			e1.click();
			WebElement e2=wd.findElement(ProjectTab);
			HighlightElement(wd, e2);
			e2.click();
			WebElement e3=wd.findElement(NewSingleSiteOption);
			HighlightElement(wd, e3);
			e3.click();
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
					HighlightElement(wd, e1);
			Select s=new Select(e1);
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
		public void click_SubmitButton() throws InterruptedException
		{
			WebElement e1=wd.findElement(SubmitButton);
			HighlightElement(wd, e1);
			e1.click();
		}
		public void redirectedPageVarification() throws InterruptedException
		{
			System.out.println("After project created with invalid data, it is not redirecting to project report page,"
					+ "it remains in same page, page title is : ");
			String s1=wd.getTitle();
			System.out.println("Report Page Tital is : "+s1);
			WebElement e1=wd.findElement(PageHederName);
					HighlightElement(wd, e1);
			String s=e1.getText();
			System.out.println("Page Header is: "+s);
			System.out.println("Therefore project is not creating");
			
			
		}
		public void errorMessageObservation() throws InterruptedException
		{
			 List<WebElement> l=wd.findElements(ErrorMessages);
		        for(WebElement e1:l)
		        {
		        	HighlightElement(wd, e1);
		        	String s=e1.getText();
		        	System.out.println(" : "+s);
		        }
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
			this.redirectedPageVarification();
			this.errorMessageObservation();
			
		}

}
