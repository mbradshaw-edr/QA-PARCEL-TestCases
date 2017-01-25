package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_contentAvailabilityAndItsFunctionality_addToOrder_andCityDirectpry_TC17 {
	
	//Add To Order Page
	By YesAddToOrderButton=By.id("img");
	By TextAvailable_onAddToOrderPage=By.id("dvUpgradeTextContainer");
	By NoThanksContinueWithMyOrderLink=By.linkText("No thanks, continue with my order");
	
	//City Directory Services Page
	By GeneralXpathForAllPageContent=By.xpath(".//*[@id='_ContentDiv']/div");
	By DropDown_UnderCityDirectory=By.id("_AdjoiningsList_ctl02__AdjoiningTypes");
	By AddAnotherAddressButton=By.id("_AdjoiningsList_ctl03__AddNewRow");
	By ContinueButton_underTheCityDirectory=By.id("_CompleteSession");
	By GeneralXpath_ofcontent_UnderCitDirectory=By.xpath("");
	By ContinueButton_onCityDirectory=By.xpath("");
	
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
	  
	  public void windowScroll()
		{
			JavascriptExecutor jse = (JavascriptExecutor)wd;
			jse.executeScript("window.scrollBy(0,450)", "");
		}
	  
	  
	public Validate_contentAvailabilityAndItsFunctionality_addToOrder_andCityDirectpry_TC17(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void check_contentAvailability_onAddToOrderPage() throws InterruptedException
	{
		String s0=wd.getTitle();
		System.out.println("Page Title is: "+s0);
		
		WebElement e=wd.findElement(YesAddToOrderButton);
		HighlightElement(wd, e);
		
		WebElement e1=wd.findElement(TextAvailable_onAddToOrderPage);
		HighlightElement(wd, e1);
		String s=e.getText();
		System.out.println(s);
		
    }
	
	public void click_continueLink_onAddToOrderPage() throws InterruptedException
	{
		WebElement e=wd.findElement(NoThanksContinueWithMyOrderLink);
		HighlightElement(wd, e);
		e.click();
		
    }
	
	public void check_contentAvailability_onEDRCityDirectoryServices() throws InterruptedException
	{
		
		List<WebElement> e1= wd.findElements(GeneralXpathForAllPageContent);
	    for(WebElement e0:e1)
	    {
	    	windowScroll();
			HighlightElement(wd, e0);
			//String s1=e0.getText();
			//System.out.println(s1);
	    }
	    wd.navigate().refresh();
	    Thread.sleep(3000);
	    
	    WebElement e=wd.findElement(DropDown_UnderCityDirectory);
		HighlightElement(wd, e);
		e.click();
		Select s=new Select(e);
		s.selectByVisibleText("Target Property");
		e.click();
		
		WebElement e3=wd.findElement(AddAnotherAddressButton);
		HighlightElement(wd, e3);
		e3.click();
		Thread.sleep(5000);
		
		WebElement e2=wd.findElement(ContinueButton_underTheCityDirectory);
		HighlightElement(wd, e2);
		e2.click();
    }
	
	public void mainMethod() throws InterruptedException
	{
		this.check_contentAvailability_onAddToOrderPage();
		this.click_continueLink_onAddToOrderPage();
		this.check_contentAvailability_onEDRCityDirectoryServices();
	}

}
