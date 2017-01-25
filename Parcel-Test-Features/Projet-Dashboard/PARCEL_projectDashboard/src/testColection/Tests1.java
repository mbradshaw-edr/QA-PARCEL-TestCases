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

import testCase_projectDashB.Login;
import testCase_projectDashB.Validate_addReportToThisProject_withSaveAndCancelButton_TC03;
import testCase_projectDashB.Validate_allAvailableHyperLinks_underTheDeliverableReportGenerated_TC10;
import testCase_projectDashB.Validate_downloadPortfolioDeliverablesLink_TC08;
import testCase_projectDashB.Validate_editProjectInformationLink_withSaveAndCancelButton_TC02;
import testCase_projectDashB.Validate_generateProjectDashboardAsPDFLink_TC04;
import testCase_projectDashB.Validate_grantAccessLink_withAccessGrante_andAccessRevoked_TC07;
import testCase_projectDashB.Validate_portfolioDownloadSecondStep_TC09;
import testCase_projectDashB.Validate_portfolioSignoffTool_TC11;
import testCase_projectDashB.Validate_viewOrderDatabaseStatusLink_underProjectDashboardPage_TC06;
import testCase_projectDashB.Validate_viewProjectMapLink_underProjectDashboard_TC05;
import testCase_projectDashB.Validation_otherLinks2_ouseHovering_functionality_underProjectDashboard_TC13;
import testCase_projectDashB.Validation_otherLinksUnderProjectDashboard_TC12;
import testCase_projectDashB.Verify_projectDashboardPageNavigation_fromDifferentPlaces_TC01;
import utility.ExcelR1;


public class Tests1 {
	
public static WebDriver wd;          
	
	@BeforeClass
	public void beforeTest1()                  // Initialisation of browser
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser");
		String brows=sc.next();
		if(brows.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "..\\PARCEL_projectDashboard\\src\\browserDrivers\\chromedriver.exe");
		wd=new ChromeDriver();
		}
		else if(brows.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "..\\PARCEL_projectDashboard\\src\\browserDrivers\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		//wd=new FirefoxDriver();
		}
		else if(brows.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "..\\PARCEL_projectDashboard\\src\\browserDrivers\\geckodriver.exe");
			wd=new FirefoxDriver();
		}
		wd.navigate().to("https://www.parcelplatform.com/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String s=wd.getTitle();
		System.out.println(" Open Browser success and page title is :"+s);
	}
	
    @Test(priority=0, description="TestCase# login")
	public void testLogin()
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
	public void test01()
	{
		try
		{
			Verify_projectDashboardPageNavigation_fromDifferentPlaces_TC01 tc01=new Verify_projectDashboardPageNavigation_fromDifferentPlaces_TC01(wd);
	        tc01.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=2, description="TestCase# 02")
	public void test02()
	{
		try
		{
			Validate_editProjectInformationLink_withSaveAndCancelButton_TC02 tc02=new Validate_editProjectInformationLink_withSaveAndCancelButton_TC02(wd);
	        tc02.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=3, description="TestCase# 03")
	public void test03()
	{
		try
		{
			Validate_addReportToThisProject_withSaveAndCancelButton_TC03 tc03=new Validate_addReportToThisProject_withSaveAndCancelButton_TC03(wd);
	        tc03.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=4, description="TestCase# 04")
	public void test04()
	{
		try
		{
			Validate_generateProjectDashboardAsPDFLink_TC04 tc04=new Validate_generateProjectDashboardAsPDFLink_TC04(wd);
	        tc04.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=5, description="TestCase# 05")
	public void test05()
	{
		try
		{
			Validate_viewProjectMapLink_underProjectDashboard_TC05 tc05=new Validate_viewProjectMapLink_underProjectDashboard_TC05(wd);
	        tc05.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=6, description="TestCase# 06")
	public void test06()
	{
		try
		{
			Validate_viewOrderDatabaseStatusLink_underProjectDashboardPage_TC06 tc06=new Validate_viewOrderDatabaseStatusLink_underProjectDashboardPage_TC06(wd);
	        tc06.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=7, description="TestCase# 07")
	public void test07()
	{
		try
		{
			Validate_grantAccessLink_withAccessGrante_andAccessRevoked_TC07 tc07=new Validate_grantAccessLink_withAccessGrante_andAccessRevoked_TC07(wd);
	        tc07.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=8, description="TestCase# 08")
	public void test08()
	{
		try
		{
			Validate_downloadPortfolioDeliverablesLink_TC08 tc08=new Validate_downloadPortfolioDeliverablesLink_TC08(wd);
	        tc08.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=9, description="TestCase# 09")
	public void test09()
	{
		try
		{
			Validate_portfolioDownloadSecondStep_TC09 tc09=new Validate_portfolioDownloadSecondStep_TC09(wd);
	        tc09.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=10, description="TestCase# 10")
   	public void test10()
   	{
   		try
   		{
   			Validate_allAvailableHyperLinks_underTheDeliverableReportGenerated_TC10 tc10=new Validate_allAvailableHyperLinks_underTheDeliverableReportGenerated_TC10(wd);
   	        tc10.mainMethod();
   		System.out.println(" ");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=11, description="TestCase# 11")
   	public void test11()
   	{
   		try
   		{
   			Validate_portfolioSignoffTool_TC11 tc11=new Validate_portfolioSignoffTool_TC11(wd);
   	        tc11.mainMethod();
   		System.out.println(" ");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=12, description="TestCase# 12")
   	public void test12()
   	{
   		try
   		{
   			Validation_otherLinksUnderProjectDashboard_TC12 tc12=new Validation_otherLinksUnderProjectDashboard_TC12(wd);
   	        tc12.mainMethod();
   		System.out.println(" ");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=13, description="TestCase# 13")
   	public void test13()
   	{
   		try
   		{
   			Validation_otherLinks2_ouseHovering_functionality_underProjectDashboard_TC13 tc13=new Validation_otherLinks2_ouseHovering_functionality_underProjectDashboard_TC13(wd);
   	        tc13.mainMethod();
   		System.out.println(" ");
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
