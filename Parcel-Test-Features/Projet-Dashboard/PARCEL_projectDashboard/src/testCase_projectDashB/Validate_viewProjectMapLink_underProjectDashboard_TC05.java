package testCase_projectDashB;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_viewProjectMapLink_underProjectDashboard_TC05 {
	
	By ViewProjectMapLinkLink_underProjectDashboard=By.xpath("html/body/div//div/p/a[3]");
	By RedirectedPageHeader=By.xpath("html/body/table/tbody/tr[1]/td");
	By GeneralXpathForAllAvailableLinks=By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/a");
	By ProjectDashboardPageHeader=By.xpath("html/body/div/div/div/div/div/div/h3");
	
	public WebDriver wd;
	public String ParentWindow;
	public Set<String> s1;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
	
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
		jse.executeScript("window.scrollBy(0,40)", "");
	}


	
	public Validate_viewProjectMapLink_underProjectDashboard_TC05(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	/* Method for setting valid data for user name field */
	public void availability_viewProjectMapLink_underProjectDashboardPage() throws InterruptedException
	{
		WebElement e2=wd.findElement(ViewProjectMapLinkLink_underProjectDashboard);
		HighlightElement(wd, e2);
		Boolean b =e2.isDisplayed();
		System.out.println("Link availability: "+b);
		String s=wd.getTitle();
		System.out.println("Page Title is: "+s);
		
		
	}
	
	public void click_onViewProjectMapLink() throws InterruptedException
	{
		ParentWindow=wd.getWindowHandle();
		System.out.println("Parent window: "+ParentWindow);
		WebElement e0=wd.findElement(ViewProjectMapLinkLink_underProjectDashboard);
		HighlightElement(wd, e0);
		e0.click();
		
        s1 = wd.getWindowHandles();                                                    // code for switching in to parent window and and again opene a new child window
             for (String handle1 : s1) 
             {
              System.out.println(handle1);
              wd.switchTo().window(handle1);
	          }
             
             //Thread.sleep(3000);
             /*WebElement e1=wd.findElement(PageHeader_generateProjectDashboardAsPDFLink);
     		HighlightElement(wd, e1);*/
     		Thread.sleep(3000);
     		//wd.close();
     		//wd.switchTo().window(ParentWindow);
     		
     		WebElement e2=wd.findElement(RedirectedPageHeader);
    		HighlightElement(wd, e2);
    		String h =e2.getText();
    		System.out.println("Link availability: "+h);
	}
	
	public void clicks_onAllLinksAvailable_underViewMapPage() throws InterruptedException
	{
		List<WebElement> e1= wd.findElements(GeneralXpathForAllAvailableLinks);
	    for(WebElement e:e1)
	    {
			HighlightElement(wd, e);
			
			String s1=e.getText();
			System.out.println(s1 );
			e.click();
			Thread.sleep(3000);
			e.click();
	    }
	    
	    wd.close();
 		wd.switchTo().window(ParentWindow);
 		WebElement e2=wd.findElement(ProjectDashboardPageHeader);
		HighlightElement(wd, e2);
 		
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.availability_viewProjectMapLink_underProjectDashboardPage();
		this.click_onViewProjectMapLink();
		this.clicks_onAllLinksAvailable_underViewMapPage();
	}

}
