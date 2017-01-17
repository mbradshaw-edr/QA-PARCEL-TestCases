package detailTestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Vailidate_editeFinctionality_withCancelButton_TC03 {
	
	By EditBuuton=By.id("toggle-edit-button");
	By CancelButton=By.name("cancelGI");
	
	public static WebDriver wd;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	  public static void windowScroll(WebDriver wd,WebElement element)
		{
			JavascriptExecutor jse = (JavascriptExecutor)wd;
			jse.executeScript("arguments[0].scrollIntoView(true);",element);
		}
	public Vailidate_editeFinctionality_withCancelButton_TC03(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_editButton() throws InterruptedException
	{
		WebElement e1=wd.findElement(EditBuuton);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(4000);
	}
	
	public void click_cancelButton() throws InterruptedException
	{
		WebElement e1=wd.findElement(CancelButton);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		e1.click();
	}
	
	public void mainMethod() throws InterruptedException
	{
	    Thread.sleep(5000);
		//this.click_editButton();
		//this.click_cancelButton();
		
	}

}
