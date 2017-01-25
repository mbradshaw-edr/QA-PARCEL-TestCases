package testCase_projectDashB;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_viewOrderDatabaseStatusLink_underProjectDashboardPage_TC06 {
	
	By ViewDatabaseOrderStatusLink_underProjectDashboard=By.xpath("html/body/div//div/p/a[4]");
	By DtabaseOrderStatusPageHeader=By.xpath("/html/body/h1");
	By ectualStatusOfProject=By.xpath(".//*[@id='sortable_edr']/tbody/tr[2]/td[3]");
	By ListOfShowEDRStatusPageLinks_underODBPage=By.xpath(".//*[@id='sortable_edr']/tbody/tr/td/b/a");
	By EDROrderDetailsPageHeader=By.xpath(".//*[@id='_CustomerInformation']");
	By ProjectDashboardPageHeader=By.xpath("html/body/div/div/div/div/div/div/h3");
	
	public WebDriver wd;
	public String ParentWindow;
	public String ChildWindow;
	public Set<String> s1;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
    
    public void windowScroll()
	{
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("window.scrollBy(0,100)", "");
	}


	
	public Validate_viewOrderDatabaseStatusLink_underProjectDashboardPage_TC06(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	/* Method for setting valid data for user name field */
	public void availability_viewOrderDatabaseStatusLink_underProjectDashboardPage() throws InterruptedException
	{
		WebElement e2=wd.findElement(ViewDatabaseOrderStatusLink_underProjectDashboard);
		HighlightElement(wd, e2);
		Boolean b =e2.isDisplayed();
		System.out.println("Link availability: "+b);
		String s=wd.getTitle();
		System.out.println("Page Title is: "+s);
		
		
	}
	
	public void click_onViewOrderDatabaseStatusLink() throws InterruptedException
	{
		ParentWindow=wd.getWindowHandle();
		System.out.println("Parent window: "+ParentWindow);
		WebElement e0=wd.findElement(ViewDatabaseOrderStatusLink_underProjectDashboard);
		HighlightElement(wd, e0);
		e0.click();
		
        s1 = wd.getWindowHandles();                                                    // code for switching in to parent window and and again opene a new child window
             for (String handle1 : s1) 
             {
              System.out.println(handle1);
              wd.switchTo().window(handle1);
	          }
      
     		Thread.sleep(3000);
     		//wd.close();
     		//wd.switchTo().window(ParentWindow);
     		
     		WebElement e2=wd.findElement(DtabaseOrderStatusPageHeader);
    		HighlightElement(wd, e2);
    		String h =e2.getText();
    		System.out.println("Page Header: "+h);
    		
    		WebElement e3=wd.findElement(ectualStatusOfProject);
    		HighlightElement(wd, e3);
    		String h1 =e3.getText();
    		System.out.println("Ectual Status: "+h1);
	}
	
	public void clicks_onShowEDRStatusPage_underOrderDatabaseStatusPage() throws InterruptedException
	{
		ChildWindow=wd.getWindowHandle();
		/*System.out.println("clild window: "+ChildWindow);
		WebElement e0=wd.findElement(ShowEDRStatusPageLink_underODBPage);
		HighlightElement(wd, e0);
		e0.click();*/
		
		List<WebElement> l= wd.findElements(ListOfShowEDRStatusPageLinks_underODBPage);
	    for(WebElement w:l)
	    {
			
			String s1=w.getText();
			//System.out.println(s1 );
			Thread.sleep(5000);
			if(s1.contains("Show EDR Status Page"))
			{
				HighlightElement(wd, w);
				//System.out.println(s);
				w.click();
				break;
			}
			
	    }
		
        s1 = wd.getWindowHandles();                                                    // code for switching in to parent window and and again opene a new child window
             for (String handle1 : s1) 
             {
              System.out.println(handle1);
              wd.switchTo().window(handle1);
	          }
     		Thread.sleep(3000);
     		
     		
     		/*WebElement e1=wd.findElement(EDROrderDetailsPageHeader);
    		HighlightElement(wd, e1);
    		String h =e1.getText();
    		System.out.println("New page Header is: "+h);*/
	    
	    wd.close();
 		wd.switchTo().window(ChildWindow);
 		WebElement e2=wd.findElement(DtabaseOrderStatusPageHeader);
		HighlightElement(wd, e2);
 		
	}
	
	public void goToParentWindow() throws InterruptedException
	{
		wd.close();
		wd.switchTo().window(ParentWindow);
		Thread.sleep(3000);
 		WebElement e1=wd.findElement(ProjectDashboardPageHeader);
		HighlightElement(wd, e1);
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.availability_viewOrderDatabaseStatusLink_underProjectDashboardPage();
		this.click_onViewOrderDatabaseStatusLink();
		//this.clicks_onShowEDRStatusPage_underOrderDatabaseStatusPage();
		this.goToParentWindow();
	}

}
