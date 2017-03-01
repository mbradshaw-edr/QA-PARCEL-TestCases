package testCaseNSPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectingRequiredOptionsFromDropdowns_TC08 {
	
	By TransactionTypeDD=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td/table/tbody/tr[1]/td/select");
	By ReportRequestedDD=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/select/option[2]");
	By ContinueButton=By.name("reports");
	
	public static WebDriver wd;
	
	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	   
	   public SelectingRequiredOptionsFromDropdowns_TC08(WebDriver wd)
		{
			this.wd=wd;
		} 
	   
	   public void click_andSelectTransactionType() throws InterruptedException
		{
			WebElement e=wd.findElement(TransactionTypeDD);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(2000);
			Select s=new Select(e);
			HighlightElement(wd, e);
			s.selectByVisibleText("Origination");
			
		}
	   
	   public void selectReportRequested() throws InterruptedException
		{
			WebElement e=wd.findElement(ReportRequestedDD);
			HighlightElement(wd, e);
			e.click();
		}
	   
	   public void click_continue() throws InterruptedException
		{
			WebElement e=wd.findElement(ContinueButton);
			HighlightElement(wd, e);
			e.click();
		}
	   
	   public void mainMethod() throws InterruptedException
		{
		   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_andSelectTransactionType();
			this.selectReportRequested();
			this.click_continue();
		}
	   
	   
	   

}
