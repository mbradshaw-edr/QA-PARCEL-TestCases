package detailTestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_availableOfFunctionalitygOnGIPage_TC01 {
	
	By OrderDataBaseButton=By.xpath("html/body/div[2]/div/div/div/div/div/table[1]/tbody/tr/td/input");
	By EditBuuton=By.id("toggle-edit-button");
	By EditSignatureButton=By.xpath(".//*[@id='editLinkCS']/a");
	By ViewMap=By.xpath(".//*[@id='viewGI']/table/tbody/tr/td/table/tbody/tr[1]/td/a");
	By FindContact=By.xpath(".//*[@id='viewGI']/table/tbody/tr/td/table/tbody/tr[9]/td/a");
	By CloseWindowButton=By.xpath("html/body/div[2]/div/div/div/div/div/div[2]/a");
	
	
	public static WebDriver wd;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_availableOfFunctionalitygOnGIPage_TC01(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void windowScroll(WebDriver wd,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public void functionalityOfODBButton() throws InterruptedException
	{
		WebElement e1=wd.findElement(OrderDataBaseButton);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		String s=e1.getAttribute("value");
		System.out.println(": "+s);
		Boolean b=e1.isEnabled();
		System.out.println("Clickability: "+b);
	}
	
	public void functionalityOfEditButton() throws InterruptedException
	{
		WebElement e1=wd.findElement(EditBuuton);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		String s=e1.getText();
		System.out.println(": "+s);
		Boolean b=e1.isEnabled();
		System.out.println("Clickability: "+b);
	}
	
	public void functionalityOfEditSignatureButton() throws InterruptedException
	{
		WebElement e1=wd.findElement(EditSignatureButton);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		String s=e1.getAttribute("value");
		System.out.println(": "+s);
		Boolean b=e1.isEnabled();
		System.out.println("Clickability: "+b);
	}
	
	public void functionalityOfviewMapLink() throws InterruptedException
	{
		WebElement e1=wd.findElement(ViewMap);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		String s=e1.getText();
		System.out.println(": "+s);
		Boolean b=e1.isEnabled();
		System.out.println("Clickability: "+b);
	}
	public void functionalityOfFindContact() throws InterruptedException
	{
		WebElement e1=wd.findElement(FindContact);
		
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		String s=e1.getText();
		System.out.println(": "+s);
		Boolean b=e1.isEnabled();
		System.out.println("Clickability: "+b);
	}
	public void functionalityOfCloseWindowButton() throws InterruptedException
	{
		WebElement e1=wd.findElement(CloseWindowButton);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		String s=e1.getText();
		System.out.println(": "+s);
		Boolean b=e1.isEnabled();
		System.out.println("Clickability: "+b);
	}
	
	public void mainMethod() throws InterruptedException
	{
	    Thread.sleep(5000);
		//this.functionalityOfODBButton();
		//this.functionalityOfEditButton();
		//this.functionalityOfEditSignatureButton();
		//this.functionalityOfviewMapLink();
		//this.functionalityOfFindContact();
		//this.functionalityOfCloseWindowButton();
		
	}

}
