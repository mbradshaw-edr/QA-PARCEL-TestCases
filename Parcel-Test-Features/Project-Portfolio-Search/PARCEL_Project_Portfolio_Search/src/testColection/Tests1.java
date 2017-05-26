package testColection;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testCasePOM_ProjectPortfolioSearch.Login;
import testCasePOM_ProjectPortfolioSearch.Validate_NextLink_underResultViewGrid_TC11;
import testCasePOM_ProjectPortfolioSearch.Validate_WithinDropdownBox_thAadditionalSearchCriteria_TC04;
import testCasePOM_ProjectPortfolioSearch.Validate_WithinDropdownBox_usingTowSearchCriteria_theAadditionalSearchCriteria_TC05;
import testCasePOM_ProjectPortfolioSearch.Validate_archiveLink_underResultViewGrid_TC10;
import testCasePOM_ProjectPortfolioSearch.Validate_clikingOnAccessLink_underResultViewGrid_TC08;
import testCasePOM_ProjectPortfolioSearch.Validate_clikingOnPerticularProjectNameLink_TC07;
import testCasePOM_ProjectPortfolioSearch.Validate_documentLink_underResultViewGrid_TC09;
import testCasePOM_ProjectPortfolioSearch.Validate_projectSearch_withOneSearchCriteria_TC02;
import testCasePOM_ProjectPortfolioSearch.Validate_projectSearchwithTowSearchCriteria_TC03;
import testCasePOM_ProjectPortfolioSearch.Validate_toolTipsDisplayed_underResultsDrid_TC06;
import testCasePOM_ProjectPortfolioSearch.Verify_availabilityAndClickability_projectSearchLink_TC01;
import utility.ExcelR1;


public class Tests1 {
	
	
	
public static WebDriver wd;          
	
	@BeforeClass
	public void beforeTest1()                  // Initialisation of browser
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser");
		String brows=sc.next();*/
		//if(brows.equalsIgnoreCase("chrome"))
		//{
		System.setProperty("webdriver.chrome.driver", "..\\PARCEL_Project_Portfolio_Search\\src\\browserDrivers\\chromedriver.exe");
		wd=new ChromeDriver();
		//}
		/*else if(brows.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "..\\PARCEL_Project_Portfolio_Search\\src\\browserDrivers\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		
		}
		else if(brows.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "..\\PARCEL_Project_Portfolio_Search\\src\\browserDrivers\\geckodriver.exe");
			wd=new FirefoxDriver();
		}*/
		wd.navigate().to("https://www.parcelplatform.com/");
		//wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String s=wd.getTitle();
		System.out.println(" Open Browser success and page title is :"+s);
	}
	
    @Test(priority=0, description="TestCase# login")
	public void TestLogin()
	{
		try
		{
			Login l=new Login(wd);
			l.loginTo();
	   
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=1, description="TestCase# 01")
	public void TestMethod1()
	{
		try
		{
			Verify_availabilityAndClickability_projectSearchLink_TC01 tc01=new Verify_availabilityAndClickability_projectSearchLink_TC01(wd);
			tc01.mainMethod();
	   
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=2, description="TestCase# 02")
	public void TestMethod2()
	{
		try
		{
			Validate_projectSearch_withOneSearchCriteria_TC02 tc02=new Validate_projectSearch_withOneSearchCriteria_TC02(wd);
			tc02.mainMethod();	   
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=3, description="TestCase# 03")
	public void TestMethod3()
	{
		try
		{
			Validate_projectSearchwithTowSearchCriteria_TC03 tc03=new Validate_projectSearchwithTowSearchCriteria_TC03(wd);
			tc03.mainMethod();   
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=4, description="TestCase# 04")
	public void TestMethod4()
	{
		try
		{
			Validate_WithinDropdownBox_thAadditionalSearchCriteria_TC04 tc04=new Validate_WithinDropdownBox_thAadditionalSearchCriteria_TC04(wd);
			tc04.mainMethod(); 
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=5, description="TestCase# 05")
	public void TestMethod5()
	{
		try
		{
			Validate_WithinDropdownBox_usingTowSearchCriteria_theAadditionalSearchCriteria_TC05 tc05=new Validate_WithinDropdownBox_usingTowSearchCriteria_theAadditionalSearchCriteria_TC05(wd);
			tc05.mainMethod();
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=6, description="TestCase# 06")
	public void TestMethod6()
	{
		try
		{
			Validate_toolTipsDisplayed_underResultsDrid_TC06 tc06=new Validate_toolTipsDisplayed_underResultsDrid_TC06(wd);
			tc06.mainMethod();
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=7, description="TestCase# 07")
   	public void TestMethod7()
   	{
   		try
   		{
   			Validate_clikingOnPerticularProjectNameLink_TC07 tc07=new Validate_clikingOnPerticularProjectNameLink_TC07(wd);
   			tc07.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=8, description="TestCase# 08")
   	public void TestMethod8()
   	{
   		try
   		{
   			Validate_clikingOnAccessLink_underResultViewGrid_TC08 tc08=new Validate_clikingOnAccessLink_underResultViewGrid_TC08(wd);
   			tc08.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=9, description="TestCase# 09")
   	public void TestMethod9()
   	{
   		try
   		{
   			Validate_documentLink_underResultViewGrid_TC09 tc09=new Validate_documentLink_underResultViewGrid_TC09(wd);
   			tc09.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=10, description="TestCase# 10")
   	public void TestMethod10()
   	{
   		try
   		{
   			Validate_archiveLink_underResultViewGrid_TC10 tc10=new Validate_archiveLink_underResultViewGrid_TC10(wd);
   			tc10.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=11, description="TestCase# 11")
   	public void TestMethod11()
   	{
   		try
   		{
   			Validate_NextLink_underResultViewGrid_TC11 tc11=new Validate_NextLink_underResultViewGrid_TC11(wd);
   			tc11.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    

    

    
    /*@AfterClass
	public void closeBrowser()
	{
		wd.close();
	}*/
    
    
}
