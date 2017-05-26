package testCaseNSPOM;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_NewPortfolioCreationWithUploadSiteSpreadSheet_TS02 {
	
	By HomeButton=By.className("feature130");
	By NewPortfolio=By.className("feature158");
	By ProjectNaeField=By.name("pName");
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
		public Validate_NewPortfolioCreationWithUploadSiteSpreadSheet_TS02(WebDriver wd)
		{
			this.wd=wd;
		} 
		
		public void click_newPorfolioButton() throws InterruptedException
		{
			System.out.println("\n\n");
			wd.findElement(HomeButton).click();
			WebElement e=wd.findElement(NewPortfolio);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(5000);
		}
		public void enter_projrctName() throws InterruptedException
		{
			System.out.println("Project related field entered successfully");
			WebElement e=wd.findElement(ProjectNaeField);
			HighlightElement(wd, e);
			e.sendKeys(ExcelR1.getData("ProjectNameEntries",1,0));
		
			
		}
		public void ckick_uploadSiteSpreadSheetRadioButton() throws InterruptedException
		{
			System.out.println("selecting or using upload the file option");
			WebElement e=wd.findElement(UploadSiteSpreadSheetRadioButton);
			HighlightElement(wd, e);
			e.click();
			
		}
		public void ckick_continueButton() throws InterruptedException
		{
			WebElement e=wd.findElement(ContinueButton);
			HighlightElement(wd, e);
			e.click();
			
		}
		public void ckick_BrowseButton() throws InterruptedException
		{
			WebElement e=wd.findElement(BrowseButton);
			HighlightElement(wd, e);
			//e.sendKeys("..\\src\\testData\\Detail_creatNewPortfolio1.xlsx");
			
			File file = new File("src\\testData\\Detail_creatNewPortfolio1.xlsx");
			e.sendKeys(file.getAbsolutePath());
			
			
		}
		public void click_uploadButton() throws InterruptedException
		{
			WebElement e=wd.findElement(UploadFileButton);
			HighlightElement(wd, e);
			e.click();
			System.out.println("File uploaded successfully");
		}
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_newPorfolioButton();
			this.enter_projrctName();
			this.ckick_uploadSiteSpreadSheetRadioButton();
			this.ckick_continueButton();
			this.ckick_BrowseButton();
			this.click_uploadButton();
		}

}
