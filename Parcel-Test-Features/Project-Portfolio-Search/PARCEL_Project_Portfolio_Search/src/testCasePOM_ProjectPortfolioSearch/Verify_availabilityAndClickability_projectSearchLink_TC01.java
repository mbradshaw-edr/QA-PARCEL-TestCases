package testCasePOM_ProjectPortfolioSearch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Verify_availabilityAndClickability_projectSearchLink_TC01 {
	
	By ProjectTab=By.id("link_131"); 
	By ProjectSerchLink=By.className("feature137");
	By ProjectMGNTPageHeader=By.className("general-panel-name");
	By GeneralXpathForAllDDs=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td/select");
	By GeneralXpathForTextFieldAndButton=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td/input");
	
	By ProjectNameDD1=By.name("field1");
	By TypeDD1=By.name("type1");
	By ProjectNameDD2=By.name("field2");
	By TypeDD2=By.name("type1");
	By AllReportTypeDD=By.name("siteType");
	
	
	//By LogoutMenue=By.id("link_164");
	//By Logout= By.xpath(".//*[@id='SnehalPatilMenu']/li/ul/li[4]/a");
	
	public WebDriver wd;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_Project_Portfolio_Search\\src\\testData\\TestData1.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }


	
	public Verify_availabilityAndClickability_projectSearchLink_TC01(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void click_onProjectSearchLink() throws InterruptedException
	{
		WebElement e0=wd.findElement(ProjectTab);
		HighlightElement(wd, e0);
		e0.click();
		
		WebElement e1=wd.findElement(ProjectSerchLink);
		Boolean b=e1.isDisplayed();
		System.out.println("availability of this coponent: "+b);
		Boolean b2=e1.isDisplayed();
		System.out.println("clickability of this coponent: "+b2);
		HighlightElement(wd, e1);
		e1.click();
		
		String s1=wd.getTitle();
		System.out.println("tital of redirected page is: "+s1);
		
		WebElement e2=wd.findElement(ProjectMGNTPageHeader);
		HighlightElement(wd, e2);
		String s=e2.getText();
		System.out.println("Page header is: "+s);
		
		
	}
	
	public void observation_underProjectManagementPage() throws InterruptedException
	{
		List<WebElement> e1= wd.findElements(GeneralXpathForAllDDs);
	    for(WebElement e:e1)
	    {
	    	HighlightElement(wd, e);
	    }
	    
	    List<WebElement> e2= wd.findElements(GeneralXpathForTextFieldAndButton);
	    for(WebElement e:e2)
	    {
	    	HighlightElement(wd, e);
	    }
		
	}
	
	public void allOptions_underProjectManagementPage() throws InterruptedException
	{
		WebElement e0= wd.findElement(ProjectNameDD1);
		Select s0=new Select(e0);
		List<WebElement> l=s0.getOptions();
		int x=l.size();
		System.out.println("Drop-down1 options for projectName-");
	    for(int i=1; i<x; i++)
	    {
	    	String DDoptions=l.get(i).getText();
	    	System.out.println(": "+DDoptions);
	    	
	    }
	    
	    WebElement e1= wd.findElement(TypeDD1);
		Select s1=new Select(e1);
		List<WebElement> l1=s1.getOptions();
		int x1=l1.size();
		System.out.println("Drop-down2 options for Type-");
	    for(int i=1; i<x1; i++)
	    {
	    	String DDoptions1=l1.get(i).getText();
	    	System.out.println(": "+DDoptions1);
	    	
	    }
	    
	    WebElement e2= wd.findElement(ProjectNameDD2);
		Select s2=new Select(e2);
		List<WebElement> l2=s2.getOptions();
		int x2=l2.size();
		System.out.println("Drop-down3 options for projectName-");
	    for(int i=1; i<x2; i++)
	    {
	    	String DDoptions2=l2.get(i).getText();
	    	System.out.println(": "+DDoptions2);
	    	
	    }
	    
	    WebElement e3= wd.findElement(TypeDD2);
		Select s3=new Select(e3);
		List<WebElement> l3=s3.getOptions();
		int x3=l3.size();
		System.out.println("Drop-down4 options for type-");
	    for(int i=1; i<x3; i++)
	    {
	    	String DDoptions3=l3.get(i).getText();
	    	System.out.println(": "+DDoptions3);
	    	
	    }
	    
	    WebElement e4= wd.findElement(AllReportTypeDD);
		Select s4=new Select(e4);
		List<WebElement> l4=s4.getOptions();
		int x4=l4.size();
		System.out.println("Drop-down5 options for AllReport TypeDD-");
	    for(int i=1; i<x4; i++)
	    {
	    	String DDoptions4=l4.get(i).getText();
	    	System.out.println(": "+DDoptions4);
	    	
	    }
	    
	   
		
	}
	
	public void mainMethod() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_onProjectSearchLink();
		this.observation_underProjectManagementPage();
		this.allOptions_underProjectManagementPage();
	}

}
