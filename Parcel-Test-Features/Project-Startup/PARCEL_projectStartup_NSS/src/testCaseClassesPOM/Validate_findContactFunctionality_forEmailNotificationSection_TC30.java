package testCaseClassesPOM;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_findContactFunctionality_forEmailNotificationSection_TC30 {
	
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
	
	By FindContactUnderEmailNotification=By.xpath(".//*[@id='divEmail']/table/tbody/tr/td/b/a");
	By SearchTextboxOfFindContactUnderEmailNotification=By.name("searchBox");
	By SearchButtonUnderEmailNotification=By.name("searchButton");
	By CheckboxToUnderEmailNotification=By.xpath("html/body/table/tbody/tr[1]/td[1]/input");
	By CheckboxCCUnderEmailNotification=By.xpath("html/body/table[2]/tbody/tr[1]/td[2]/input");
	By InsertSelectedAddressButtonUnderEmailNotification=By.name("buttonInsert");

	
	
	
	public WebDriver wd;

	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_findContactFunctionality_forEmailNotificationSection_TC30(WebDriver wd)
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
			System.out.println("Data not available in the fields of EmailNotification before imported fron 'Find"
					+ "Contact' link- ");
			WebElement e2=wd.findElement(CheckboxToEnableEmailNotification);
			HighlightElement(wd, e2);
			e2.click();
			WebElement e3=wd.findElement(EmailToTextField);
			HighlightElement(wd, e3);
			String s=e3.getText();
			WebElement e4=wd.findElement(EmailCCTextField);
			HighlightElement(wd, e4);
			String s1=e4.getText();
			WebElement e5=wd.findElement(EmailMessageTextField);
			HighlightElement(wd, e5);
			String s2=e5.getText();
			System.out.println(" : "+s);
			System.out.println(" : "+s1);
			System.out.println(" : "+s2);
			/*wd.findElement(CheckboxToEnableEmailNotification).click();
			wd.findElement(EmailToTextField).sendKeys("nkatiyar@edrnet.com");
			wd.findElement(EmailCCTextField).sendKeys("skamble@edrnet.com");
			wd.findElement(EmailMessageTextField).sendKeys("Hi, This just an email Varification mail");
			*/
		}
		
		
		public void click_onFindContactAndObservation() throws InterruptedException
		{
	        
		
			 String parentWindow= wd.getWindowHandle();
			 
		        System.out.println(parentWindow);
	 
		        // Click on the Button "New Message Window"
	 
		       WebElement e1= wd.findElement(FindContactUnderEmailNotification);
		       HighlightElement(wd, e1);
		       e1.click();
	 
		        // Store and Print the name of all the windows open	              
	 
		        Set childWndows = wd.getWindowHandles();
	 
		        System.out.println(childWndows);
	 
		        // Pass a window handle to the other window
	 
		        for (String handle1 : wd.getWindowHandles()) {
	 
		        	System.out.println(handle1);
	 
		        	wd.switchTo().window(handle1);
		        	//driver.get("http://google.com");
	 
		        	}
		       
		        /*wd.get("http://google.com");
		        wd.switchTo().window(parentWindow);
		        wd.get("http://gmail.com");*/
			
		
		System.out.println("when user clicked on 'FindContact' link, all the clients name, emails, company list is visible as follows :- ");	
		
		List<WebElement> r1=wd.findElements(By.tagName("html/body/table[2]/tbody/tr/td"));
		
		for(WebElement e:r1)
		{
			HighlightElement(wd, e);
	
				String s1=e.getText();
				System.out.println(s1 );
			
		}
	
		
		WebElement e6=wd.findElement(SearchTextboxOfFindContactUnderEmailNotification);
		HighlightElement(wd, e6);
		e6.sendKeys("spatil");
		Thread.sleep(2000);
		WebElement e7=wd.findElement(SearchButtonUnderEmailNotification);
		HighlightElement(wd, e7);
		e7.click();
		Thread.sleep(2000);
		WebElement e8=wd.findElement(CheckboxToUnderEmailNotification);
		HighlightElement(wd, e8);
		e8.click();
		WebElement e9=wd.findElement(CheckboxCCUnderEmailNotification);
		HighlightElement(wd, e9);
		e9.click();
		Thread.sleep(2000);
		WebElement e10=wd.findElement(InsertSelectedAddressButtonUnderEmailNotification);
		HighlightElement(wd, e10);
		e10.click();
		Thread.sleep(2000);
		
		wd.switchTo().window(parentWindow);
		
		Thread.sleep(3000);
		
		System.out.println("Now data available in the fields of EmailNotification After imported fron 'Find"
				+ "Contact' link- ");
		WebElement e11=wd.findElement(EmailToTextField);
		HighlightElement(wd, e11);
		String s=e11.getAttribute("value");
		WebElement e12=wd.findElement(EmailCCTextField);
		HighlightElement(wd, e12);
		String s1=e12.getAttribute("value");
		WebElement e13=wd.findElement(EmailMessageTextField);
		HighlightElement(wd, e13);
		String s2=e13.getAttribute("value");
		System.out.println(" : "+s);
		System.out.println(" : "+s1);
		System.out.println(" : "+s2);
		
		
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
			this.click_onFindContactAndObservation();
			this.click_SubmitButton(city);
			
		}

}
