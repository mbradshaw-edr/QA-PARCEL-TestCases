package testCase_grantAccess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_grantAccesToAReportLink_underHomPage_TC01 {
	
	By SecondReport_underTheListGrid=By.xpath("html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/table/tbody/tr[3]/td[3]"); 
	By GrantAccessLink_onHomePage=By.xpath(".//*[@id='contentother-content']/ul/li[4]/a");
	By GrantAccess_pageHeader=By.xpath("html/body/div[2]/div/div/div/div/div/h3");
	
	//By LogoutMenue=By.id("link_164");
	//By Logout= By.xpath(".//*[@id='SnehalPatilMenu']/li/ul/li[4]/a");
	
	public WebDriver wd;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }


	
	public Validate_grantAccesToAReportLink_underHomPage_TC01(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	/* Method for selecting a report from home page */
	public void selectReport() throws InterruptedException
	{
		WebElement e=wd.findElement(SecondReport_underTheListGrid);
		HighlightElement(wd, e);
		e.click();
		
	}
	/* Method for performing click operation on "Grant Access" */
	public void click_onGrantAccess() throws InterruptedException
	{
		WebElement e=wd.findElement(GrantAccessLink_onHomePage);
		HighlightElement(wd, e);
		e.click();
		
	}
	/* Method for click on Login button */
	public void pageTitle() throws InterruptedException
	{
		WebElement e3=wd.findElement(GrantAccess_pageHeader);
		HighlightElement(wd, e3);
		String s1=wd.getTitle();
		System.out.println("Title of this page is: "+s1);
		
		String s2=e3.getText();
		System.out.println("Page Header: "+s2);
		
	}
	/* Method for calling all methods related to this test case together */
	public void mainMethod() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.selectReport();
		this.click_onGrantAccess();
		this.pageTitle();
	}

}
