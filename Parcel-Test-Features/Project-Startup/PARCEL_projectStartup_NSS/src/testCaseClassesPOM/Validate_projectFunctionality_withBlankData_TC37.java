package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_projectFunctionality_withBlankData_TC37 {
	
	By HomeButton=By.className("feature130");
	By ProjectTab=By.id("link_131");
	By NewSingleSiteOption=By.className("feature135");
	
	By ErrorMessagesForProjectInformation=By.xpath("//*[@id=('divProject')]/div");
	By ErrorMessagesForPropertyInformation=By.xpath("//*[@id='divProperty']/div");
	
	By CountryDropDown=By.id("prop_country");
	By StateDropdown=By.id("prop_state");
	By Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox=By.xpath("//*[@value='PhaseI.2149']");
	By Project_ID=By.xpath("//*[@id='divFeePhaseI.2149']/input[2]");
	By SubmitButton=By.name("submitExpress");
	By ToolIcon=By.xpath("html/body/div/div/div/div/div/div/div/div/div[2]/a");
	By AddProjectReportOption=By.xpath("html/body/div/div/div/div/div/div/div/div/div/ul/li[8]/a");
	
	By PageHederName=By.xpath("html/body/div/div/div/div/div/div/form/h4/p");
	
	
	
	
	
	public WebDriver wd;

	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_projectFunctionality_withBlankData_TC37(WebDriver wd)
		{
			this.wd=wd;
		} 
		public void click_NewSingleSiteProjectButton() throws InterruptedException
		{
			System.out.println("*** Validation of create project functionality with blank data ***");
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
		
		public void click_creatProjectButton() throws InterruptedException
		{
			WebElement e1=wd.findElement(SubmitButton);
			HighlightElement(wd, e1);
			e1.click();
		}
		
		public void errorMessageObservation() throws InterruptedException
		{
			System.out.println("Error messages for required fields are-");
			List<WebElement> l=wd.findElements(ErrorMessagesForProjectInformation);
			for(WebElement e:l)
			{
				HighlightElement(wd, e);
				String s=e.getText();
				System.out.println(" : "+s);
			}
			List<WebElement> m=wd.findElements(ErrorMessagesForPropertyInformation);
			for(WebElement e:m)
			{
				HighlightElement(wd, e);
				String s=e.getText();
				System.out.println(" : "+s);
			}
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
		/* Method for calling all methods related to this test case together */
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_NewSingleSiteProjectButton();
			this.set_CountryDropDown();
			this.set_StateDropdown();
			this.click_Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox();
			this.click_creatProjectButton();
			this.errorMessageObservation();
			this.redirectedPageVarification();
			
		}

}
