package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_fieldsWithValidDataToSetupProject_TC32 {
	
	By HomeButton=By.className("feature130");
	By NewSingleSiteProjectButton=By.className("feature157");
    By AdvanceProjectSetup=By.xpath("html/body/div/div/div/div/div/div/form/h4/p/a");
    By NewPortfolioLink=By.className("feature136");
    By NewProjectSetupLink=By.xpath("html/body/div/div/div/div/div/div/form/h4/p/a");
    
    By ProjectNameField=By.name("pName");
    By ClientRequestWorkDD=By.name("clientCid");
    By DateDraftReportRequired=By.id("draftReportDate");
    By DateFinalReportRequired=By.id("finalReportDate");
    By ProjectCommentsField=By.name("pComments");
    By ContinueButton1=By.name("portfolio");
    
    By PropertyTypeDD=By.name("propertyType");
    By Address=By.name("address1");
    By countryDD=By.name("country");
    By City=By.name("city");
    By StateDD=By.id("state");
    By Zip=By.name("zip");
    By ReportRequestedDD=By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr[21]/td/select");
    By ContinueButton2=By.name("location");
    
    By No_Continue=By.name("portfolioComplete");
    
    By ContinueButton3=By.name("consultantFee");
    
    By ContinueButton4=By.name("attachmentsComplete");
    
    By ContinueButton5=By.name("submitSetAccess");
    
    By ConfirmInformationButton=By.name("confirmation");
    
    By CCTextField=By.name("cc");
    By Message=By.name("comments");
    By SendEmailButton=By.name("email");
    
    By NewPageHeader=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td/h4");
    By EndedOptions=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[2]/td/a");
    
    
    
    
    
    
    public WebDriver wd;

    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
  		public Validate_fieldsWithValidDataToSetupProject_TC32(WebDriver wd)
  		{
  			this.wd=wd;
  		} 
  		public void clickOnNewPortfolioLinkOnTopOfThePage() throws InterruptedException
  		{
  			System.out.println("*** Validate  the fields with valid data to setup project for 'Advance Project Setup' under 'New Single Site Project' ***");
  			WebElement e1=wd.findElement(HomeButton);
  			HighlightElement(wd, e1);
  			e1.click();
  			WebElement e2=wd.findElement(NewSingleSiteProjectButton);
  			HighlightElement(wd, e2);
  			e2.click();
  			WebElement e3=wd.findElement(AdvanceProjectSetup);
  			HighlightElement(wd, e3);
  			e3.click();
  			
  		}
  		public void completeFirstSteps() throws InterruptedException
  		{
  			WebElement e1=wd.findElement(ProjectNameField);
  			HighlightElement(wd, e1);
  			e1.sendKeys("Automation Project Name38");
  			WebElement e2=wd.findElement(ClientRequestWorkDD);
  			HighlightElement(wd, e2);
  			Select s=new Select(e2);
			s.selectByValue("101.");
			WebElement e3=wd.findElement(DateDraftReportRequired);
			HighlightElement(wd, e3);
			e3.clear();
			e3.sendKeys("08/29/2016");
			WebElement e4=wd.findElement(DateFinalReportRequired);
			HighlightElement(wd, e4);
			e4.clear();
			e4.sendKeys("09/05/2016");
			WebElement e5=wd.findElement(ProjectCommentsField);
			HighlightElement(wd, e5);
			e5.sendKeys("This is an testing project for automation 3");
			
			WebElement e6=wd.findElement(ContinueButton1);
			HighlightElement(wd, e6);
			e6.click();
			/*WebElement e7=wd.findElement(ContinueButton1);
			HighlightElement(wd, e7);
			e7.click();*/
  		}
  		public void CompleteSecondStep() throws InterruptedException
  		{
  			WebElement e1=wd.findElement(PropertyTypeDD);
  			HighlightElement(wd, e1);
  			Select s=new Select(e1);
			s.selectByVisibleText("Hotel/Motel");
  			WebElement e3=wd.findElement(Address);
  			HighlightElement(wd, e3);
  			e3.sendKeys("Test Address 5");
  			
  			WebElement e2=wd.findElement(countryDD);
  			HighlightElement(wd, e2);
  			Select s1=new Select(e2);
			s1.selectByValue("US");
			
			WebElement e4=wd.findElement(City);
			HighlightElement(wd, e4);
			e4.sendKeys("Wichita Falls");
			
			WebElement e5=wd.findElement(StateDD);
			HighlightElement(wd, e5);
			Select s2=new Select(e5);
			s2.selectByValue("TX");
			WebElement e6=wd.findElement(Zip);
			HighlightElement(wd, e6);
			e6.sendKeys("763011");
			WebElement e7=wd.findElement(ReportRequestedDD);
			HighlightElement(wd, e7);
			Select s3=new Select(e7);
			s3.selectByValue("FastTrack.976");
			WebElement e8=wd.findElement(ContinueButton2);
			HighlightElement(wd, e8);
			e8.click();
			WebElement e9=wd.findElement(No_Continue);
			HighlightElement(wd, e9);
			e9.click();
  		}
  		public void completeThirdStep() throws InterruptedException
  		{
  			WebElement e1=wd.findElement(ContinueButton3);
  			HighlightElement(wd, e1);
  			e1.click();
  		}
  		public void compleatFourthStep() throws InterruptedException
  		{
  			WebElement e1=wd.findElement(ContinueButton4);
  			HighlightElement(wd, e1);
  			e1.click();
  		}
  		public void completeFifthStep() throws InterruptedException
  		{
  			WebElement e1=wd.findElement(ContinueButton5);
  			HighlightElement(wd, e1);
  			e1.click();
  		}
  		
  		public void CompleteConfirmationStep() throws InterruptedException
  		{
  			WebElement e1=wd.findElement(ConfirmInformationButton);
  			HighlightElement(wd, e1);
  			e1.click();
  		}
  		public void completeSixthStep() throws InterruptedException
  		{
  			WebElement e1=wd.findElement(CCTextField);
  			HighlightElement(wd, e1);
  			e1.sendKeys("nkatiyar@edrnet.com");
  			WebElement e2=wd.findElement(Message);
  			e2.sendKeys("Hi This is A test mail 3");
  			HighlightElement(wd, e2);
  			WebElement e3=wd.findElement(SendEmailButton);
  			HighlightElement(wd, e3);
  			e3.click();
  		}
  		public void newPageOptions() throws InterruptedException
  		{
  			WebElement e1=wd.findElement(NewPageHeader);
  			HighlightElement(wd, e1);
  			String s1=e1.getText();
  			System.out.println("After creating a project successfully with 'New Project' link under 'N.S.S.P. a"
  					+ "a message is ariving "+s1);
  			System.out.println(" ");
  			System.out.println(" ");
  			System.out.println("These options available, in the final page");
  			List<WebElement> l=wd.findElements(EndedOptions);
  			for(WebElement e:l)
  			{
  				HighlightElement(wd, e);
  				String s=e.getText();
  				System.out.println(" : "+s);
  			}
  		}
  		
  		
  		public void mainMethod() throws InterruptedException
  		{
  			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  			this.clickOnNewPortfolioLinkOnTopOfThePage();
  			this.completeFirstSteps();
  			this.CompleteSecondStep();
  			this.completeThirdStep();
  			this.compleatFourthStep();
  			this.completeFifthStep();
  			this.CompleteConfirmationStep();
  			this.completeSixthStep();
  			this.newPageOptions();
  		}
  		
  		

}
