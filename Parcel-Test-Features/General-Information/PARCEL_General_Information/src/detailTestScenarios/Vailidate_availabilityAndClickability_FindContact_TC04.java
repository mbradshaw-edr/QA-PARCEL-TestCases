package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Vailidate_availabilityAndClickability_FindContact_TC04 {
	
	By FindContactLink=By.xpath("//*[@id='viewGI']/table/tbody/tr/td/table/tbody/tr[9]/td/a");
	By SearchBox=By.name("searchBox");
	By SearchButton=By.name("searchButton");
	By AddContactLink=By.id("addContactShow");
	By ContentOfAddContactTable=By.xpath("html/body/table[2]/tbody/tr/td/a");
	By CloseWindowButton=By.xpath("html/body/div[2]/div/div/div/div/div/div[2]/a");
	
	//Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2 obj1=new Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2(wd);
	
	
	public static WebDriver wd;
	 public static String parentWindow;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Vailidate_availabilityAndClickability_FindContact_TC04(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public static void newWindow() throws InterruptedException
	{
        
	
		 parentWindow= wd.getWindowHandle();
		 
	        System.out.println(parentWindow);
 
	        // Click on the Button "New Message Window"
 
	       /* WebElement e=wd.findElement(GILink);
	        HighlightElement(wd, e);
	        e.click();*/
	        
 
	        // Store and Print the name of all the windows open	              
 
	        Set<String> childWndows = wd.getWindowHandles();
 
	        System.out.println(childWndows);
 
	        // Pass a window handle to the other window
 
	        for (String handle1 : childWndows) {
 
	        	System.out.println(handle1);
 
	        	wd.switchTo().window(handle1);
	        	//driver.get("http://google.com");
 
	        	}
	}
	
	
	public static void windowScroll(WebDriver wd,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public void check_findContactLink() throws InterruptedException
	{
		WebElement e1=wd.findElement(FindContactLink);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		String s=e1.getAttribute("value");
		System.out.println("It's name is: "+s);
		Boolean b=e1.isEnabled();
		System.out.println("Clickability: "+b);
	}
	public void click_onFindContactLink() throws InterruptedException
	{
		WebElement e1=wd.findElement(FindContactLink);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		e1.click();
		newWindow();
	}
	
	public void observedAddedContactsTable() throws InterruptedException
	{
		List<WebElement> e1= wd.findElements(ContentOfAddContactTable);
		int counter=0;
	    for(WebElement e:e1)
	    {
	    	windowScroll(wd, e);
			HighlightElement(wd, e);
			counter++;
			String s1=e.getText();
			System.out.println(s1 );
			if(counter==12)
			{
				break;
			}
	    }
		
		//List<WebElement> r1=e1.findElements(By.tagName("tr"));
		
		/*int x=r1.size();
		System.out.println("Total Number of rows :"+x);
		
		for(int i=0; i<10;i++)
		{
			List<WebElement> c1=r1.get(i).findElements(By.tagName("td"));
			for(int j=0;j<c1.size(); j++)
			{
				windowScroll(wd, e1);
				HighlightElement(wd, e1);
				//String s1=c1.get(j).getText();
				//System.out.println(s1 );
			
			}
		}*/
	
	}
	
	public void searchFunctionality_withValidDataOnFindContact() throws InterruptedException
	{
		WebElement e=wd.findElement(SearchBox);
		windowScroll(wd, e);
		HighlightElement(wd, e);
		e.sendKeys(ExcelR1.getData("SearchData_ofAddContacet",1,0));
		
		WebElement e1=wd.findElement(SearchButton);
		//windowScroll(wd, e1);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		e1.click();
		
	}
	public void searchFunctionality_withInvalidDataOnFindContact() throws InterruptedException
	{
		WebElement e=wd.findElement(SearchBox);
		windowScroll(wd, e);
		HighlightElement(wd, e);
		e.sendKeys(ExcelR1.getData("SearchData_ofAddContacet",1,1));
		
		WebElement e1=wd.findElement(SearchButton);
		//windowScroll(wd, e1);
		windowScroll(wd, e1);
		HighlightElement(wd, e1);
		e1.click();
		
	}
	public void searchFunctionality_withBlankDataOnFindContact() throws InterruptedException
	{
		WebElement e=wd.findElement(SearchBox);
		windowScroll(wd, e);
		HighlightElement(wd, e);
		e.sendKeys(ExcelR1.getData("SearchData_ofAddContacet",1,2));
		
		WebElement e1=wd.findElement(SearchButton);
		windowScroll(wd, e1);
		//windowScroll(wd, e1);
		HighlightElement(wd, e1);
		e1.click();
		
	}
	
	public void mainMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		this.check_findContactLink();
		this.click_onFindContactLink();
		System.out.println("Find contact List withot search: ");
		this.observedAddedContactsTable();
		this.searchFunctionality_withValidDataOnFindContact();
		System.out.println("Find contact List with valid search: ");
		this.observedAddedContactsTable();
		this.searchFunctionality_withInvalidDataOnFindContact();
		System.out.println("Find contact List with invalid search");
		this.observedAddedContactsTable();
		System.out.println("Find contact List with search functionality with blank data");
		this.searchFunctionality_withBlankDataOnFindContact();
	}
	

}
