package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13 {
	
	By siteID=By.name("s");
	By GeneralInformationLinkOnTOCPage=By.xpath(".//*[@id='simplifiedtoc']/li[1]/a/span");
	By OrderDatabaseButton=By.name("butShowVendors");
	By GeneralXpathForMainContentOfOrderDatabase=By.xpath("html/body/div/div/form/p/span[1]");
	By OrderDataBaseWindowHeader=By.xpath("html/body/div/div/form/h1");
	By LablesOfContentOfOrderDatabase=By.xpath("html/body/div/div/form/table/tbody/tr/td/b");
	By GeneralXpathForAllButtons=By.xpath("html/body/div/div/form/table[3]/tbody/tr/td/input");
	By YesRadioButton=By.xpath("html/body/div[1]/div/form/p[3]/span[2]/input[1]"); 
	By ContinueWithSingleSiteButton=By.name("submitDataOrder");
	By CheckBoxForDataProvider=By.xpath("html/body/div/div/form/table/tbody/tr/td[3]/input[3]");
	
	

	
	
	
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
	public Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13(WebDriver wd)
	{
		this.wd=wd;
	}
	
	/*public void enterSiteID() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println(" *******Validation of 'Order Database Reports' button with 'PlaceSingleSiteProject' in 'General Info'******");
		WebElement e=wd.findElement(siteID);
		e.sendKeys(ExcelR1.getData("Site IDs",1,0));
		Thread.sleep(2000);
		e.sendKeys(Keys.ENTER);
		  Thread.sleep(10000);
	}*/
	
	public void observedContentOfOrderDatabasePage() throws InterruptedException
	{
		WebElement e1=wd.findElement(OrderDataBaseWindowHeader);
		HighlightElement(wd, e1);
		e1.click();
		
		List<WebElement> e= wd.findElements(GeneralXpathForMainContentOfOrderDatabase);
	    for(WebElement e2:e)
	    {
			HighlightElement(wd, e2);
			String s1=e2.getText();
			System.out.println(s1 );
	    }
	    
	    List<WebElement> l= wd.findElements(LablesOfContentOfOrderDatabase);
	    for(WebElement e3:l)
	    {
			HighlightElement(wd, e3);
			String s2=e3.getText();
			System.out.println(s2 );
	    }
	    
	    List<WebElement> l1= wd.findElements(GeneralXpathForAllButtons);
	    for(WebElement e4:l1)
	    {
			HighlightElement(wd, e4);
			String s3=e4.getAttribute("value");
			System.out.println(s3);
	    }
	}
	
	public void click_onGILink() throws InterruptedException
	{
		SubParentWndow=wd.getWindowHandle();
		WebElement e0=wd.findElement(GeneralInformationLinkOnTOCPage);
		HighlightElement(wd, e0);
		e0.click();
		
        s = wd.getWindowHandles();
             for (String handle1 : s) 
             {
              System.out.println(handle1);
              wd.switchTo().window(handle1);
	          }
             wd.manage().window().maximize();
         
	}
	
	public void clickOnOrderDatabaseButton() throws InterruptedException
	{
		SubParent1Wndow=wd.getWindowHandle();
	
		
        Thread.sleep(4000);
		WebElement e0=wd.findElement(OrderDatabaseButton);
		HighlightElement(wd, e0);
		e0.click();
		
        s = wd.getWindowHandles();
             for (String handle1 : s) 
             {
              System.out.println(handle1);
              wd.switchTo().window(handle1);
	          }
             wd.manage().window().maximize();
             
             WebElement e1=wd.findElement(OrderDataBaseWindowHeader);
     		HighlightElement(wd, e1);
     		String s=e1.getText();
     		System.out.println("This page header is: "+s);
	}
	
	public void mainMethod() throws InterruptedException
	{
		//this.enterSiteID();
		this.click_onGILink();
		this.clickOnOrderDatabaseButton();
		this.observedContentOfOrderDatabasePage();
	}
	

}
