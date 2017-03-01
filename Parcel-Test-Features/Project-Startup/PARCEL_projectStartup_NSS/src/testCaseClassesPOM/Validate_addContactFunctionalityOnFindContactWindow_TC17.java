package testCaseClassesPOM;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Validate_addContactFunctionalityOnFindContactWindow_TC17 {
	 
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	
	By ClientInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[2]/tbody/tr/td/b");
	By ClientInformationShow=By.xpath("//*[@id='divShowClient']/b/a");
	By AllFieldsUnderclientInformation=By.xpath("//*[@id='divClient']/table/tbody/tr/td[1]");
	By ClientInformationHide=By.xpath("//*[@id=('divHideClient')]/b/a");
	
	By FindContact=By.xpath(".//*[@id='divClient']/table/tbody/tr/td/b/a");
	
	By AddContactLink=By.id("addContactShow");
	By FirstNameField=By.name("firstName");
	By LastNameField=By.name("lastName");
	By SubmitChangesButton=By.xpath("//*[@id='addContactForm']/form/table/tbody/tr[12]/td/input[1]");
	By SubmittedSuccessMsg=By.xpath("html/body/form/table/tbody/tr[3]/td");
	By CloseFindContactWindow=By.xpath("html/body/table/tbody/tr/td/input");
	By WarningMsg=By.xpath("html/body/form/table/tbody/tr[3]/td");
	By CloseButton=By.name("close");
	
	public WebDriver wd;
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_addContactFunctionalityOnFindContactWindow_TC17(WebDriver wd)
	{
		this.wd=wd;
	} 

	
	/* Method for click on "New Single Site Project" */
	public void click_NewSingleSiteProject() throws InterruptedException
	{
		System.out.println("*** Validate the pagination and search functionality on 'Find Contact' pop up. ***");
		System.out.println(" ");
		WebElement e1=wd.findElement(HomeButton);
		HighlightElement(wd, e1);
		e1.click();
		WebElement e2=wd.findElement(NSSP);
		HighlightElement(wd, e2);
		e2.click();
		
	}
	
	
		public void click_showLinkOnClientInfo() throws InterruptedException
		{
			System.out.println("After clicked on 'Show' Link, 'Client Information' section expended and it has 'Hide' link instead of 'Show' link ");
			WebElement e=wd.findElement(ClientInformationShow);
			HighlightElement(wd, e);
			e.click();
		}
		
		
		public void click_onFindContactAndObservation() throws InterruptedException
		{
	        
		
			 String parentWindow= wd.getWindowHandle();
			 
		        System.out.println(parentWindow);
	 
		        // Click on the Button "New Message Window"
	 
		        WebElement e=wd.findElement(FindContact);
		        HighlightElement(wd, e);
		        e.click();
		        
	 
		        // Store and Print the name of all the windows open	              
	 
		        Set childWndows = wd.getWindowHandles();
	 
		        System.out.println(childWndows);
	 
		        // Pass a window handle to the other window
	 
		        for (String handle1 : wd.getWindowHandles()) {
	 
		        	System.out.println(handle1);
	 
		        	wd.switchTo().window(handle1);
		        	//driver.get("http://google.com");
	 
		        	}
		       // System.out.println("FirstName entered in the search box, then click on find button, and searched results are displayed as follows--");
		        Boolean b=wd.findElement(AddContactLink).isDisplayed();
		        System.out.println("Availability of this link- "+b);
		        WebElement e1=wd.findElement(AddContactLink);
		        HighlightElement(wd, e1);
		        String s1=e1.getText();
		        System.out.println("Name of this link is :"+s1);
		        WebElement e2=wd.findElement(AddContactLink);
		        HighlightElement(wd, e2);
		        e2.click();
		        
		        System.out.println("Observation od 'AddContact' functionality wirked (or Printin new Contacts added)");
		        WebElement e3=wd.findElement(FirstNameField);
		        HighlightElement(wd, e3);
		        e3.sendKeys("aaaa");
		        WebElement e4=wd.findElement(LastNameField);
		        HighlightElement(wd, e4);
		        e4.sendKeys("bbbb");
		        WebElement e5=wd.findElement(SubmitChangesButton);
		        HighlightElement(wd, e5);
		        e5.click();
		        WebElement e6=wd.findElement(SubmittedSuccessMsg);
		        HighlightElement(wd, e6);
		        String s2=e6.getText();
		        System.out.println("Messagae for successfully aded contact is : "+s2);
		        Thread.sleep(4000);
		        System.out.println("The details of newly added contact displayed under the grid--");
		        List<WebElement> l=wd.findElements(By.xpath("html/body/table/tbody/tr/td/a"));
		        for(WebElement e7:l)
		        {
		        	HighlightElement(wd, e7);
		        	String s=e7.getText();
		        	System.out.println(" : "+s);
		        }
		        Thread.sleep(5000);
		        WebElement e8=wd.findElement(CloseFindContactWindow);
		        HighlightElement(wd, e8);
		        e8.click();
		       wd.switchTo().window(parentWindow);
		      
		        
		        
		}
		
		public void click_onFindContactAndAddContactwithBlankRequiredField() throws InterruptedException
		{
	        
		
			 String parentWindow= wd.getWindowHandle();
			 
		        System.out.println(parentWindow);
	 
		        // Click on the Button "New Message Window"
	 
		        WebElement e=wd.findElement(FindContact);
		        HighlightElement(wd, e);
		        e.click();
	 
		        // Store and Print the name of all the windows open	              
	 
		        Set childWndows = wd.getWindowHandles();
	 
		        System.out.println(childWndows);
	 
		        // Pass a window handle to the other window
	 
		        for (String handle1 : wd.getWindowHandles()) {
	 
		        	System.out.println(handle1);
	 
		        	wd.switchTo().window(handle1);
		        	
	 
		        	}
		     // wd.get("http://google.com");
		       // System.out.println("FirstName entered in the search box, then click on find button, and searched results are displayed as follows--");
		      
		        Actions ac=new Actions(wd);
		        System.out.println("Observation of 'AddContact' submit with blank required field");
		        WebElement e3=wd.findElement(AddContactLink);
		        HighlightElement(wd, e3);
		        e3.click();
		        WebElement e4=wd.findElement(SubmitChangesButton);
		        HighlightElement(wd, e4);
		        e4.click();
		        WebElement e5=wd.findElement(WarningMsg);
		        HighlightElement(wd, e5);
		        String s2=e5.getText();
		        System.out.println("Warning messagae when user aded contact eith blank required field : "+s2);
		        //wd.findElement(By.name("close")).click();
		        WebElement e8=wd.findElement(CloseButton);
		        HighlightElement(wd, e8);
		        e8.click();
		        wd.switchTo().window(parentWindow);
		        WebElement e6=wd.findElement(HomeButton);
		        HighlightElement(wd, e6);
		        e6.click();
		        
		        
		        
		    
		        
		        
		}
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_NewSingleSiteProject();
			this.click_showLinkOnClientInfo();
			this.click_onFindContactAndObservation();
			this.click_onFindContactAndAddContactwithBlankRequiredField();
		}
	

}
