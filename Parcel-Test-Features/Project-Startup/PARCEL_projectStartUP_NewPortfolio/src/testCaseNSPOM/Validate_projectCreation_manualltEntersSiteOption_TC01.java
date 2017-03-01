package testCaseNSPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_projectCreation_manualltEntersSiteOption_TC01 {
	
	
	By NewPortFolioOption=By.className("feature158");
	By HomeButton=By.className("feature130");
	By NewPortfolio=By.className("feature158");
	By ProjectNameField=By.name("pName");
	By UploadSiteSpreadSheetRadioButton=By.id("uploadyes");
	By ContinueButton=By.name("portfolio"); 
	By BrowseButton=By.name("userfile");
	By UploadFileButton=By.name("uploadSites");
	
	
	
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectStartUP_NewPortfolio\\src\\testData\\TestData_NewPortfolio.xlsx");
	public WebDriver wd;

    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
		public Validate_projectCreation_manualltEntersSiteOption_TC01(WebDriver wd)
		{
			this.wd=wd;
		} 
		
		public void click_newPortFolioOption() throws InterruptedException
		{
			wd.findElement(HomeButton).click();
			Thread.sleep(6000);
			WebElement e=wd.findElement(NewPortfolio);
			HighlightElement(wd, e);
			e.click();
			
		
		}
		
		public void enter_projrctName() throws InterruptedException
		{
			Thread.sleep(6000);
			WebElement e=wd.findElement(ProjectNameField);
			HighlightElement(wd, e);
			e.sendKeys(ExcelR1.getData("ProjectNameEntries",1,1));
		
		}
		/*public void ckick_uploadSiteSpreadSheetRadioButton() throws InterruptedException
		{
			WebElement e=wd.findElement(UploadSiteSpreadSheetRadioButton);
			HighlightElement(wd, e);
			e.click();
			
		}*/
		public void click_continueButton() throws InterruptedException
		{
			WebElement e=wd.findElement(ContinueButton);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(5000);
			
		}
		
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_newPortFolioOption();
			this.enter_projrctName();
			this.click_continueButton();
			
		}

}
