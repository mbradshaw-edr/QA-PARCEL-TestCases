package testCase_projectDashB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Verify_projectDashboardPageNavigation_fromDifferentPlaces_TC01 {
	
	By TopOfFirstRecentlyViewedReport_forProjectDashboard=By.xpath(".//*[@id='contentrecentlyviewed-content']/div/div/div[1]/div[1]/div/div[1]/a[1]"); 
	By FirstIconFromP_column=By.xpath("html/body/div[2]/div//div/table/tbody/tr[2]/td[2]/a");
	By ProjectDashboardPageHeader=By.xpath("html/body/div/div/div/div/div/div/h3");
	By GeneralXpath_forContentavailabilityOnProjectDashboard=By.xpath("html/body/div//div/p/a");
	By GeneralXpath_forASTMPropertyConditionAndASTMPhase1=By.xpath("html/body/div/div/div/div/div/div/div/table/tbody/tr/td/h4");
	
	By siteID=By.xpath("html/body/div/div/nav/div/ul/li/form/input[1]");
	By OpenProjectDashboard=By.xpath("html/body/div/div/div/div/div/div/div/div/p/small/a");
	
	//By Logout= By.xpath(".//*[@id='SnehalPatilMenu']/li/ul/li[4]/a");
	
	public WebDriver wd;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }


	
	public Verify_projectDashboardPageNavigation_fromDifferentPlaces_TC01(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	/* Method for setting valid data for user name field */
	public void click_onTopOfFirstRecentReport() throws InterruptedException
	{
		WebElement e=wd.findElement(TopOfFirstRecentlyViewedReport_forProjectDashboard);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(3000);
		WebElement e1=wd.findElement(ProjectDashboardPageHeader);
		HighlightElement(wd, e1);
		String s1=e1.getText();
		System.out.println("Header of this page is: "+s1);
		
	}
	
	public void click_onPcolumnUnderTheProjectList_grid() throws InterruptedException
	{
		WebElement e=wd.findElement(FirstIconFromP_column);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(3000);
		String s=wd.getTitle();
		System.out.println("Titale of this page is: "+s);
		WebElement e1=wd.findElement(ProjectDashboardPageHeader);
		HighlightElement(wd, e1);
		String s1=e1.getText();
		System.out.println("Header of this page is: "+s1);
		
	}
	
	public void enterSiteIDForOpeningCustomReport() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println(" *******Validation of 'Order Database Reports' button with 'PlaceSingleSiteProject' in 'General Info'******");
		WebElement e0=wd.findElement(siteID);
		e0.clear();
		e0.sendKeys(ExcelR1.getData("Go To Report With Site ID",1,1));
		Thread.sleep(2000);
		wd.findElement(siteID).sendKeys(Keys.ENTER);
		  Thread.sleep(5000);
		  
		  WebElement e=wd.findElement(OpenProjectDashboard);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(3000);
		
	}
	
	public void Verifing_projectDashboardPageContent() throws InterruptedException
	{
		List<WebElement> li= wd.findElements(GeneralXpath_forContentavailabilityOnProjectDashboard);
	    for(WebElement e:li)
	    {
			HighlightElement(wd, e);
			String s=e.getText();
			System.out.println(s);
			
	    }
	    JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("window.scrollBy(0,400)", "");
	    List<WebElement> li1= wd.findElements(GeneralXpath_forASTMPropertyConditionAndASTMPhase1);
	    for(WebElement e1:li1)
	    {
			HighlightElement(wd, e1);
			String s1=e1.getText();
			System.out.println(s1 );
			
	    }
	    JavascriptExecutor jse1 = (JavascriptExecutor)wd;
		jse1.executeScript("window.scrollBy(0,-400)", "");
		
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onPcolumnUnderTheProjectList_grid();
		this.Verifing_projectDashboardPageContent();
		wd.navigate().back();
		Thread.sleep(10000);
		this.click_onTopOfFirstRecentReport();
		this.Verifing_projectDashboardPageContent();
		this.enterSiteIDForOpeningCustomReport();
	}
	
	

}
