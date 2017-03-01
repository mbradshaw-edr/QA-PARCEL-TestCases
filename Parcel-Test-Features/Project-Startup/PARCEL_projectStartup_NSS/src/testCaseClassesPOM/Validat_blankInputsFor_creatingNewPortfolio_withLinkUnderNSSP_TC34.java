package testCaseClassesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validat_blankInputsFor_creatingNewPortfolio_withLinkUnderNSSP_TC34 {
	
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
    By DuplicationErrorMessage=By.xpath("html/body/div/div/div/div/div/div/div");
    
    
    
    public WebDriver wd;

    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
  		public Validat_blankInputsFor_creatingNewPortfolio_withLinkUnderNSSP_TC34(WebDriver wd)
  		{
  			this.wd=wd;
  		} 
  		public void clickOnNewPortfolioLinkOnTopOfThePage() throws InterruptedException
  		{
  			System.out.println("*** Validate the fields with invalid data to setup project or 'Advance Project Setup' under 'New Single Site Project' ***");
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
  			e1.sendKeys("");
  			
  			WebElement e2=wd.findElement(ClientRequestWorkDD);
  			HighlightElement(wd, e2);
  			Select s=new Select(e2);
			s.selectByValue("101.");
			WebElement e3=wd.findElement(DateDraftReportRequired);
			HighlightElement(wd, e3);
			e3.clear();
			WebElement e4=wd.findElement(DateFinalReportRequired);
			HighlightElement(wd, e4);
			e4.clear();
			WebElement e5=wd.findElement(ProjectCommentsField);
			HighlightElement(wd, e5);
			e5.sendKeys(" ");
			WebElement e6=wd.findElement(ContinueButton1);
			HighlightElement(wd, e6);
			e6.click();
		
			
			System.out.println("Warning or error message is not coming here and not redirecting to the new Page"
					+ "We can say Page remains same:");
  		}
  		
  		public void mainMethod() throws InterruptedException
  		{
  			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  			this.clickOnNewPortfolioLinkOnTopOfThePage();
  			this.completeFirstSteps();
  		}

}
