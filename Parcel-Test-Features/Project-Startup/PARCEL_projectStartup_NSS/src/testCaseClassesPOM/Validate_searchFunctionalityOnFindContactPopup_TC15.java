package testCaseClassesPOM;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_searchFunctionalityOnFindContactPopup_TC15 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	
	By ClientInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[2]/tbody/tr/td/b");
	By ClientInformationShow=By.xpath("//*[@id='divShowClient']/b/a");
	By AllFieldsUnderclientInformation=By.xpath("//*[@id='divClient']/table/tbody/tr/td[1]");
	By ClientInformationHide=By.xpath("//*[@id=('divHideClient')]/b/a");
	
	By FindContact=By.xpath(".//*[@id='divClient']/table/tbody/tr/td/b/a");
	
	By SearchBoxOnFindContact=By.name("searchBox");
	By SearchButton=By.name("searchButton");
	By Link1UnderNewWindow=By.xpath("html/body/table/tbody/tr[4]/td[2]/a");
	By CloseFindContactWindow=By.name("close");
	
	public WebDriver wd;
	 public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_searchFunctionalityOnFindContactPopup_TC15(WebDriver wd)
	{
		this.wd=wd;
	} 

	
	/* Method for click on "New Single Site Project" */
	public void click_NewSingleSiteProject() throws InterruptedException
	{
		System.out.println("*** Validate the search functionality on 'Find Contact' pop up. ***");
		System.out.println(" ");
		WebElement e=wd.findElement(HomeButton);
		HighlightElement(wd, e);
		e.click();
		WebElement e1=wd.findElement(NSSP);
		HighlightElement(wd, e1);
		e1.click();
		
	}
	
	
		public void click_showLinkOnClientInfo() throws InterruptedException
		{
			System.out.println("After clicked on 'Show' Link, 'Client Information' section expended and it has 'Hide' link instead of 'Show' link ");
			WebElement e1=wd.findElement(ClientInformationShow);
			HighlightElement(wd, e1);
			e1.click();
		}
		
		
		public void click_onFindContactAndObservation() throws InterruptedException
		{
	        
		
			 String parentWindow= wd.getWindowHandle();
			 
		        System.out.println(parentWindow);
	 
		        // Click on the Button "New Message Window"
	 
		        WebElement e1=wd.findElement(FindContact);
		        HighlightElement(wd, e1);
				e1.click();
	 
		        // Store and Print the name of all the windows open	              
	 
		        Set childWndows = wd.getWindowHandles();
	 
		        System.out.println(childWndows);
	 
		        // Pass a window handle to the other window
	 
		        for (String handle1 : wd.getWindowHandles()) {
	 
		        	System.out.println(handle1);
	 
		        	wd.switchTo().window(handle1);
		        	//driver.get("http://google.com");
	 
		        	}
		        System.out.println("FirstName entered in the search box, then click on find button, and searched results are displayed as follows--");
		        WebElement e2=wd.findElement(SearchBoxOnFindContact);
		        HighlightElement(wd, e2);
		        e2.sendKeys("Anne");
		        WebElement e3=wd.findElement(SearchButton);
		        HighlightElement(wd, e3);
		        e3.click();
		        List<WebElement> l=wd.findElements(By.xpath("html/body/table/tbody/tr/td/a"));
		        for(WebElement e:l)
		        {
		        	 HighlightElement(wd, e);
		        	String s=e.getText();
		        	System.out.println(" : "+s);
		        }
		        System.out.println("Enter another data (unmatchable) in the searched box, then click on find button, and instead of searched results  it displayed a message as follows--");
		        WebElement e4=wd.findElement(SearchBoxOnFindContact);
		        HighlightElement(wd, e4);
		        e4.sendKeys("txtttt");
		        WebElement e5=wd.findElement(SearchButton);
		        HighlightElement(wd, e5);
		        e5.click();
		        System.out.println(" : No contacts matched your search text. ");
		        WebElement e6=wd.findElement(CloseFindContactWindow);
		        HighlightElement(wd, e6);
		        e6.click();
		         wd.switchTo().window(parentWindow);
		        
		        
		}
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_NewSingleSiteProject();
			this.click_showLinkOnClientInfo();
			this.click_onFindContactAndObservation();
		}
		

}
