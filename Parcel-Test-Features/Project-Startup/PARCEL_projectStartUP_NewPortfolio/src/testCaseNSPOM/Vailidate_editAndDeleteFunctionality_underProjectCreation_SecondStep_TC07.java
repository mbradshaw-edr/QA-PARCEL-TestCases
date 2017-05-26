package testCaseNSPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Vailidate_editAndDeleteFunctionality_underProjectCreation_SecondStep_TC07 {
	
	
	By EditLink=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr[3]/td/a[1]");
	By SaveChengesButton=By.xpath("html/body/div/div/div/div/div/div/form/input[2]");
	By CancelButton=By.xpath("html/body/div/div/div/div/div/div/form/input[3]");
	By DeleteLink=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr[3]/td/a[2]");
	By ContinueToNextStep=By.name("submitNextStep");
	
	public static WebDriver wd;
	
	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	   
	   public Vailidate_editAndDeleteFunctionality_underProjectCreation_SecondStep_TC07(WebDriver wd)
		{
			this.wd=wd;
		} 
	   
	   public void click_editLink() throws InterruptedException
	 		{
		       System.out.println("\n\n");
		       System.out.println("Validating 'Edit' and 'Delete' functionality");
	 			WebElement e=wd.findElement(EditLink);
	 			HighlightElement(wd, e);
	 			e.click();
	 			Thread.sleep(3000);
	 		}
	 	    
	 		public void click_saveChangesButton() throws InterruptedException
	 		{
	 			WebElement e=wd.findElement(SaveChengesButton);
	 			HighlightElement(wd, e);
	 			e.click();
	 			Thread.sleep(6000);
	 		}
	 		
	 		public void click_cancelButton() throws InterruptedException
	 		{
	 			WebElement e=wd.findElement(CancelButton);
	 			HighlightElement(wd, e);
	 			Thread.sleep(2000);
	 			e.click();
	 		}
	 		
	 		public void click_deleteLink() throws InterruptedException
	 		{
	 			WebElement e=wd.findElement(DeleteLink);
	 			HighlightElement(wd, e);
	 			//Thread.sleep(2000);
	 			e.click();
	 			Alert a=wd.switchTo().alert();
	 			Thread.sleep(5000);
	 			a.accept();
	 			Thread.sleep(5000);
	 		}
	 		
	 		public void click_continueToNextStep() throws InterruptedException
	 		{
	 			WebElement e=wd.findElement(ContinueToNextStep);
	 			HighlightElement(wd, e);
	 			e.click();
	 		}
	 		 
	 		public void mainMethod() throws InterruptedException
	 		{
	 			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 			this.click_editLink();
	 			this.click_saveChangesButton();
	 			this.click_editLink();
	 			this.click_cancelButton();
	 			this.click_deleteLink();
	 			this.click_continueToNextStep();
	 		}
	 		
	 		

}
