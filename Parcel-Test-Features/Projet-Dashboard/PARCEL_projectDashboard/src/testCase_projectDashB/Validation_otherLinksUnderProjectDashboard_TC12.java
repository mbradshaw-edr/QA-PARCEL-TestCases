package testCase_projectDashB;

import java.awt.Robot;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validation_otherLinksUnderProjectDashboard_TC12 {
	
	By FirstPartOfMatrix_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[1]/tbody/tr/td/h4");
	By GeneralXpathForOtherLinks_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[1]/tbody/tr/td/b/a");
	
	By ClientPropertyLink=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/th[4]/a");
	By SiteInforationLink=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/th[5]/a");
	By SiteAssessorLink=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/th[6]/a"); 
	
	
	public WebDriver wd;
	public String ParentWindow;
	public String ChildWindow;
	public Set<String> s1;
	public Robot r;
	public Login m1=new Login(wd);
	//public Login m2=new Login(wd);
	
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
		jse.executeScript("window.scrollBy(0,100)", "");
	}


	
	public Validation_otherLinksUnderProjectDashboard_TC12(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_onOtherLinks_underProjectDashboard() throws InterruptedException
	{
		
		List<WebElement> e1= wd.findElements(GeneralXpathForOtherLinks_underProjectDashboard);
	    for(WebElement e:e1)
	    {
	    	ParentWindow=wd.getWindowHandle();
	    	HighlightElement(wd, e);
	    	e.click();                                                    // code for switching in to parent window and and again opene a new child window 

            for (String handle1 : wd.getWindowHandles()) 
            {
             System.out.println(handle1);
             wd.switchTo().window(handle1);
	          }
            Thread.sleep(3000);
            wd.close();
            Thread.sleep(2000);
            
            wd.switchTo().window(ParentWindow);
	    }
            
	}
	
	public void click_onOtherLink2_under() throws InterruptedException
	{
		WebElement e0=wd.findElement(ClientPropertyLink);
		HighlightElement(wd, e0);
		e0.click();
		Thread.sleep(2000);
		
		WebElement e1=wd.findElement(SiteInforationLink);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(2000);
		
		WebElement e2=wd.findElement(SiteAssessorLink);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(2000);
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onOtherLinks_underProjectDashboard();
		this.click_onOtherLink2_under();
	}

}
