package testCase_projectDashB;

import java.awt.Robot;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.ExcelR1;

public class Validation_otherLinks2_ouseHovering_functionality_underProjectDashboard_TC13 {
	
	By GaneralXpath_belowTheMatrix_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td/a");                                                           
	By GoToReport_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[1]/a/img");
	By EmailNotification_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[2]/a/img");
	
	By ToTextBox=By.id("to");
	By CCTextBox=By.id("cc");
	By SubjectTextBox=By.name("subject");
	By ExecutiveSuaryCheckBox=By.name("executiveSummary");
	By DetailedReportCheckBox=By.name("detailReport");
	By BodyTextBox=By.name("body");
	By DeleteReport_underProjectDashboard=By.name("confirm");
	
	By ViewSiteContactInfo_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[5]/a");
	By ViewFilesInAppendices_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[7]/a");
	By ViewFilesInAppendixA_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[8]/a");
	By ViewFilesInAppendixB_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[9]/a");
	By ViewFilesInAppendixC_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[10]/a");
	By ViewFilesInAppendixD_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[11]/a");
	By ViewFilesInAppendixE_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[12]/a");
	By ViewFilesInAppendixF_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[13]/a");
	By ViewFilesInAppendixG_underProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/table[2]/tbody/tr/td[14]/a");
	
	//By ViewFilesInAppendixG_underProjectDashboard=By.xpath(".//*[@id='sortable_PhaseI']/tbody/tr/td[20]/a/img");
	//By PercentageOfCopletion_underProjectDashboard=By.xpath(".//*[@id='sortable_PhaseI']/tbody/tr/td[22]/a");
	
	By SiteInforationLink=By.xpath("");
	By SiteAssessorLink=By.xpath(""); 
	
	By Password=By.id("");
	By Login=By.name("");
	
	
	
	
	
	By BackButton=By.id("submitReportSelectBack");
	By NextButton=By.id("submitReportSelect");
	
	public WebDriver wd;
	public Actions ac;
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
    
    public Validation_otherLinks2_ouseHovering_functionality_underProjectDashboard_TC13(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	
    public void mouseHovering_onOtherLinks_underProjectDashboard() throws InterruptedException
    {
    	ac=new Actions(wd);
    	List<WebElement> e1= wd.findElements(GaneralXpath_belowTheMatrix_underProjectDashboard);
    	for(WebElement e:e1)
	    {
    		 ac.moveToElement(e).perform();
 	    	Thread.sleep(2000);
 	    	  ac.moveByOffset(5,5).perform();
 	    	  Thread.sleep(2000);
 	    	  ac.release(e);
	    }
	    
    	
    }
    
	public void click_onOtherLinks2_underProjectDashboard() throws InterruptedException
	{
		
		List<WebElement> e1= wd.findElements(GaneralXpath_belowTheMatrix_underProjectDashboard);
		int counter=0;
	    for(WebElement e:e1)
	    {
	    	counter++;
	    	if(counter>3)
	    	{
	    	ParentWindow=wd.getWindowHandle();
	    	HighlightElement(wd, e);
	    	e.click();  
	    	// code for switching in to parent window and and again opene a new child window 

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
	    	else
	    	{
	    		System.out.println("Not Clicable");
	    	}
	    		
	    }
            
	}
	
	public void click_onGoToReport() throws InterruptedException
	{
		WebElement e0=wd.findElement(GoToReport_underProjectDashboard);
		HighlightElement(wd, e0);
		e0.click();
		Thread.sleep(5000);
		wd.navigate().back();
		Thread.sleep(1000);
		wd.navigate().back();
		Thread.sleep(4000);
		
	}
	
	public void click_onEailNotification() throws InterruptedException
	{
		ParentWindow=wd.getWindowHandle();
		WebElement e0=wd.findElement(EmailNotification_underProjectDashboard);
		HighlightElement(wd, e0);
		e0.click();
		
		Set<String> s = wd.getWindowHandles();      // code for switching in to parent window and and again opene a new child window
        for (String handle1 : s) 
        {
         System.out.println(handle1);
         wd.switchTo().window(handle1);
         }
        
        WebElement e1=wd.findElement(ToTextBox);
		HighlightElement(wd, e1);
		e1.click();
		WebElement e2=wd.findElement(CCTextBox);
		HighlightElement(wd, e2);
		e2.click();
		WebElement e3=wd.findElement(SubjectTextBox);
		HighlightElement(wd, e3);
		e3.click();
		WebElement e4=wd.findElement(ExecutiveSuaryCheckBox);
		HighlightElement(wd, e4);
		e4.click();
		WebElement e5=wd.findElement(DetailedReportCheckBox);
		HighlightElement(wd, e5);
		e5.click();
		WebElement e6=wd.findElement(BodyTextBox);
		HighlightElement(wd, e6);
		e6.click();
		WebElement e7=wd.findElement(DeleteReport_underProjectDashboard);
		HighlightElement(wd, e7);
		e7.click();
		Thread.sleep(3000);
		wd.close();
		wd.switchTo().window(ParentWindow);
		
	}
	
	
	public void mainMethod() throws InterruptedException
	{
		this.mouseHovering_onOtherLinks_underProjectDashboard();
		this.click_onGoToReport();
		this.click_onEailNotification();
		this.click_onOtherLinks2_underProjectDashboard();
	}

}
