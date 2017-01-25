package detailTestScenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_orderStatus_onOrderCoformationPage_TC20 {
	
	By OrderConfirmationPageHeader=By.xpath(".//*[@id='aspnetForm']/div/div/div/div/div/div/img");
	By OrderRelatedSubHeading=By.xpath(".//*[@id='ctl00_cphBody__ActionButtonsPnl']/div[1]");
	By OrderStatusButton=By.id("ctl00_cphBody__OrderStatus");
	By BeginNewOrder=By.id("ctl00_cphBody__BeginNewOrder");
	//By BeginNewOrder=By.id("ctl00_cphBody__BeginNewOrder");
	//By BeginNewOrder=By.id("ctl00_cphBody__BeginNewOrder");
	
	
	
	
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	
	
	public static WebDriver wd;
	public static String SubParentWndow;
	public static String SubParent1Wndow;
	public static Set<String> s;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_orderStatus_onOrderCoformationPage_TC20(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void check_contentAvailability_ofConfirmOrderPage() throws InterruptedException
	{
		String s0=wd.getTitle();
		System.out.println("Page Title is: "+s0);
		
		WebElement e=wd.findElement(OrderConfirmationPageHeader);
		HighlightElement(wd, e);
		String s=e.getAttribute("alt");
		System.out.println("Page Header is: "+s);
		
		WebElement e1=wd.findElement(OrderRelatedSubHeading);
		HighlightElement(wd, e1);
		String s1=e1.getText();
		System.out.println("Page Header is: "+s1);
		
		WebElement e2=wd.findElement(OrderStatusButton);
		HighlightElement(wd, e2);
		String s2=e.getAttribute("alt");
		System.out.println("Available button 1: "+s2);
		
		WebElement e3=wd.findElement(BeginNewOrder);
		HighlightElement(wd, e3);
		String s3=e.getAttribute("alt");
		System.out.println("Available button 2: "+s3);
	}
	
	public void click_onOrderStatusButton() throws InterruptedException
	{
		WebElement e2=wd.findElement(OrderStatusButton);
		HighlightElement(wd, e2);
		e2.click();
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.check_contentAvailability_ofConfirmOrderPage();
		this.click_onOrderStatusButton();
	}

}
