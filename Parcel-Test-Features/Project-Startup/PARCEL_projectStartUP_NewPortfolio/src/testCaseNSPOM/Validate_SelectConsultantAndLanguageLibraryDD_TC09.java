package testCaseNSPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_SelectConsultantAndLanguageLibraryDD_TC09 {
	
	By ConsultantDD=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td[4]/select");       // EDR Applications Development Group
	By LanguageLibrarydDD=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td[5]/select"); // Mike Test Appraisal Document Repository
	By ContinoueButton=By.name("consultantFee");
	
	public static WebDriver wd;
	
	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	   
	   public Validate_SelectConsultantAndLanguageLibraryDD_TC09(WebDriver wd)
		{
			this.wd=wd;
		} 
	   
	   public void click_andSelectConsultant() throws InterruptedException
		{
		   System.out.println("\n\n");
	    	System.out.println("Validating selection of consultant and language library");
		   Thread.sleep(4000);
			WebElement e=wd.findElement(ConsultantDD);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(2000);
			Select s=new Select(e);
			HighlightElement(wd, e);
			s.selectByVisibleText("EDR Applications Development Group");
			e.click();
			
		}
	   
	   public void click_andSelectLanguageLibrary() throws InterruptedException
		{
			WebElement e=wd.findElement(LanguageLibrarydDD);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(2000);
			Select s=new Select(e);
			s.selectByVisibleText("Mike Test Appraisal Document Repository");
			
		}
	   public void click_continue() throws InterruptedException
		{
			WebElement e=wd.findElement(ContinoueButton);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(5000);
		}
	   
	   public void mainMethod() throws InterruptedException
		{
		   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_andSelectConsultant();
			this.click_andSelectLanguageLibrary();
			this.click_continue();
		}

}
