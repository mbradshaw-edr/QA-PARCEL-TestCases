package testCollection;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import detailTestScenarios.Login;
import detailTestScenarios.Validate_availabilityAndClickability_ofOrderPlacedOnERDRWebsite_underStartMenue_TC01;
import detailTestScenarios.Validate_availabilityOfShortSummary_ofOPEW_TC03;
import detailTestScenarios.Validate_availability_ofOrdersPlacedOnEDRWebsite_underProjectTab_TC02;
import detailTestScenarios.Validate_finishOrderButton_underTheOrderPlacedOnEdrWebsitePage_TC04;
import utility.ExcelR1;


public class Tests1 {
	
public static WebDriver wd;          
	
	@BeforeClass
	public void beforeTest1()                  // Initialisation of browser
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the browser");
		//String brows=sc.next();
		//if(brows.equalsIgnoreCase("chrome"))
		//{
		System.setProperty("webdriver.chrome.driver", "..\\PARCEL_projectStartUp_orderPlacedOnEDRwebsite\\src\\browserDrivers\\chromedriver.exe");
		wd=new ChromeDriver();
		//}
		/*else if(brows.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "..\\workspace\\PARCEL_projectStartUp_orderPlacedOnEDRwebsite\\src\\browserDrivers\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		//wd=new FirefoxDriver();
		}
		else if(brows.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "..\\PARCEL_projectStartUp_OrderPlacedOnEDRwebsite\\src\\browserDrivers\\geckodriver.exe");
			wd=new FirefoxDriver();
		}*/
		wd.get("https://uat.parcelplatform.com");
		//wd.manage().window().maximize();
		//wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String s=wd.getTitle();
		System.out.println(" Open Browser success and page title is :"+s);
	}
	
    @Test(priority=0, description="TestCase# login")
	public void testLogin()
	{
		try
		{
		Login l=new Login(wd);
		l.loginTo("spatil", "Compu@1234");               ///////// "spatil", "Compu@1234",    "rahul", "jwepfqtwq8"
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=1, description="TestCase# 1")
	public void test1()
	{
		try
		{
			Validate_availabilityAndClickability_ofOrderPlacedOnERDRWebsite_underStartMenue_TC01 tc1=new Validate_availabilityAndClickability_ofOrderPlacedOnERDRWebsite_underStartMenue_TC01(wd);
		tc1.mainMethod();             
		System.out.println("");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=2, description="TestCase# 2")
	public void test2()
	{
		try
		{
			Validate_availability_ofOrdersPlacedOnEDRWebsite_underProjectTab_TC02 tc2=new Validate_availability_ofOrdersPlacedOnEDRWebsite_underProjectTab_TC02(wd);
		        tc2.mainMethod();    
		System.out.println("");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=3, description="TestCase# 3")
  	public void test3()
  	{
  		try
  		{
  			Validate_availabilityOfShortSummary_ofOPEW_TC03 tc3=new Validate_availabilityOfShortSummary_ofOPEW_TC03(wd);
  		    tc3.mainMethod();   
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    
    @Test(priority=4, description="TestCase# 4")
  	public void test4()
  	{
  		try
  		{
  			Validate_finishOrderButton_underTheOrderPlacedOnEdrWebsitePage_TC04 tc4=new Validate_finishOrderButton_underTheOrderPlacedOnEdrWebsitePage_TC04(wd);
  		    tc4.mainMethod();  
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    
   
    
    
 
    

    
 
    
    
}
