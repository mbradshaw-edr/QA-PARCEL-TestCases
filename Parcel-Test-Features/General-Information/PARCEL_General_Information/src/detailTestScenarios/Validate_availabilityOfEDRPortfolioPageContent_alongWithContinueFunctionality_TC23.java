package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_availabilityOfEDRPortfolioPageContent_alongWithContinueFunctionality_TC23 {
	
	By ERDPortfolioOrderPageHeader=By.xpath(".//*[@id='edrPort']/h1");
	By ProjectNameHeader=By.xpath(".//*[@id='edrPort']/h3"); 
	By GeneraXpathPageContentsOrInformationAboutThePortfolioOrder=By.xpath(".//*[@id='edrPort']/table/tbody/tr/td/input");
	By CheckAllButton=By.xpath(".//*[@id='edrPort']/table[2]/tbody/tr/td[1]/input[1]");
	By PkgDD1=By.xpath("html/body/form/table/tbody/tr/td[3]/select");                 // EDR Standard Lightbox Package
	By FieldChk_checkBox=By.xpath("html/body/form/table/tbody/tr/td[4]/input");
	By SrchDistDD2=By.xpath("html/body/form/table/tbody/tr/td[5]/select");             // EDR-Test
	
	By EmailNotificationsTo_textArea=By.xpath("html/body/form/table/tbody/tr/td[1]/textarea");
	By SiteComments_textArea=By.xpath("html/body/form/table/tbody/tr/td[2]/textarea");
	By ContinueButton=By.xpath("html/body/form/table[2]/tbody/tr/td[2]/input");
	
	
	
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
		
		
		public static WebDriver wd;
		public static String SubParentWndow;
		public static String SubParent1Wndow;
		public static Set<String> s;
		ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
		  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
		    {
		           JavascriptExecutor jse=(JavascriptExecutor)wd;
		          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		          Thread.sleep(3000);
		          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
		       
		    }
		public Validate_availabilityOfEDRPortfolioPageContent_alongWithContinueFunctionality_TC23(WebDriver wd)
		{
			this.wd=wd;
		}
		
		public void check_contentOfERDPortfolioOrderPage() throws InterruptedException
		{
			String s0=wd.getTitle();
			System.out.println("Page Title is: "+s0);
			
			WebElement e=wd.findElement(ERDPortfolioOrderPageHeader);
			HighlightElement(wd, e);
			String s=e.getText();
			System.out.println("Page Header is: "+s);
			
			WebElement e1=wd.findElement(ProjectNameHeader);
			HighlightElement(wd, e1);
			String s1=e.getText();
			System.out.println("Page Header is: "+s1);
			
			List<WebElement> l2= wd.findElements(GeneraXpathPageContentsOrInformationAboutThePortfolioOrder);
		    for(WebElement e2:l2)
		    {
				HighlightElement(wd, e2);
				String s2=e2.getAttribute("value");
				System.out.println(s2);
		    }
			
		}
		
		public void fuctionalOperation_underTheOrderPortfolio() throws InterruptedException
		{
			WebElement e=wd.findElement(CheckAllButton);
			HighlightElement(wd, e);
			e.click();
			
			WebElement e1=wd.findElement(PkgDD1);
			HighlightElement(wd, e1);
			e1.click();
			Select s1=new Select(e1);
			s1.selectByVisibleText("EDR Standard Lightbox Package");
			e1.click();
			
			WebElement e3=wd.findElement(FieldChk_checkBox);
			HighlightElement(wd, e3);
			e3.click();
			
			WebElement e2=wd.findElement(SrchDistDD2);
			HighlightElement(wd, e2);
			e2.click();
			Select s2=new Select(e2);
			s2.selectByVisibleText("EDR-Test");
			e2.click();
		}
		
		public void enterEmailNotificationsAndSiteComments() throws InterruptedException
		{
			WebElement e1=wd.findElement(EmailNotificationsTo_textArea);
			HighlightElement(wd, e1);
			e1.sendKeys("nkatiyar@edrnet.com");
			
			WebElement e2=wd.findElement(SiteComments_textArea);
			HighlightElement(wd, e2);
			e2.sendKeys("Hi all, this 'Database' order created using 'Order New Portfolio' option through automattion techniques, thanks");
		}
		
		public void click_onContinue_onOrderNewPortfolioPage() throws InterruptedException
		{
			WebElement e1=wd.findElement(ContinueButton);
			HighlightElement(wd, e1);
			e1.click();
			
			Alert a=wd.switchTo().alert();
			a.accept();
		}
		
		
		
		
		
		Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13 m2=new Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13(wd);
			public void mainMethod() throws InterruptedException
			{
				
				this.check_contentOfERDPortfolioOrderPage();
				this.fuctionalOperation_underTheOrderPortfolio();
				this.enterEmailNotificationsAndSiteComments();
				this.click_onContinue_onOrderNewPortfolioPage();
			}

}
