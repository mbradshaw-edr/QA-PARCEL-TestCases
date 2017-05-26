package testsExecution;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testCaseClassesPOM.LogOut;
import testCaseClassesPOM.Login;
import testCaseClassesPOM.Validate_messageDisplay_requiresFielsdOfProjectInfoLeftBlank_TC12;
import testCaseClassesPOM.Validate_newSingleSiteProjectOptionAvailabilityOnHomePage_TC07;
import testCaseClassesPOM.Validae_availabilityAndFunctionality_NewSinleSiteProject_TC03;
import testCaseClassesPOM.Validate_ClientInformationSectionOnNSSPpage_TC13;
import testCaseClassesPOM.Validate_ResultWhenUserClicks_AddReportToProjectTool_TC06;
import testCaseClassesPOM.Validate_availabilityOfNewPortfolioAndFunctionality_TC04;
import testCaseClassesPOM.Validate_expendAndColapsedFunctionalityForNSSP_TC10;
import testCaseClassesPOM.Validate_fieldsAvailabilityWhenUserCilckedOnNSSP_underStart_TC08;
import testCaseClassesPOM.Validate_findContactLink_underClientInformation_TC14;
import testCaseClassesPOM.Validate_searchFunctionalityOnFindContactPopup_TC15;
import testCaseClassesPOM.Validate_sectionsAvailability_usreClickOnNSSPThroughProjectTab_TC11;
import testCaseClassesPOM.Validate_sectionsOnNSSPPage_preexpendedAndColapsed_TC09;
import testCaseClassesPOM.VerifyAndValidate_availabilityOfAllOptionsUnderStart_TC02;
import testCaseClassesPOM.Verify_availabilityOfAddReportsToProjectTool_TC05;
import testCaseClassesPOM.Verify_availabilityOfStart_TC01;


public class Tests1 {
	                           // C:\Users\Admin\workspace\PARCEL_projectStartup_NSS\src\browserDrivers
public WebDriver wd;          
	
	@BeforeClass
	public void beforeTest1() throws InterruptedException                  // Initialisation of browser
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser");
		String brows=sc.next();
		if(brows.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "..\\PARCEL_projectStartup_NSS\\src\\browserDrivers\\chromedriver.exe");
		wd=new ChromeDriver();
		}
		else if(brows.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "..\\PARCEL_projectStartup_NSS\\src\\browserDrivers\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		//wd=new FirefoxDriver();
		}
		else if(brows.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "..\\PARCEL_projectStartup_NSS\\src\\browserDrivers\\geckodriver.exe");
			wd=new FirefoxDriver();
		}
		wd.get("https://www.parcelplatform.com/");
		Thread.sleep(5000);
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
		
		l.loginTo("spatil", "Compu@1234");
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
   @Test(priority=1, description="TestCase# 1")
	public void testMethod1()
	{
		try
		{
			Verify_availabilityOfStart_TC01 tc1=new Verify_availabilityOfStart_TC01(wd);
		tc1.verifyStart();
		System.out.println("");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    @Test(priority=2, description="TestCase# 02")
   	public void testMethod2()
   	{
   		try
   		{
   			VerifyAndValidate_availabilityOfAllOptionsUnderStart_TC02 tc2=new VerifyAndValidate_availabilityOfAllOptionsUnderStart_TC02(wd);
   		tc2.allOptionasOfStart();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
   @Test(priority=3, description="TestCase# 03")
   	public void testMethod3()
   	{
   		try
   		{
   			Validae_availabilityAndFunctionality_NewSinleSiteProject_TC03 tc3=new Validae_availabilityAndFunctionality_NewSinleSiteProject_TC03(wd);
   		tc3.validatingNSSPOptionUnderProjectMenu();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    @Test(priority=4, description="TestCase# 04")
   	public void testMethod4()
   	{
   		try
   		{
   			Validate_availabilityOfNewPortfolioAndFunctionality_TC04 tc4=new Validate_availabilityOfNewPortfolioAndFunctionality_TC04(wd);
   		tc4.validatingNewPortfolioOptionUnderProjectMenu();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    @Test(priority=5, description="TestCase# 05")
	public void testMethod5() throws InterruptedException
	{
    	
		try
		{
			
			Verify_availabilityOfAddReportsToProjectTool_TC05 tc5=new Verify_availabilityOfAddReportsToProjectTool_TC05(wd);
		tc5.mainMethod("Automation Test Project006", "07/28/2016", "10/30/2016", "Automation Test prop01", "Wichita Falls30", "Wichita Falls", "Auto04");
		System.out.println("");
		}
		catch(WebDriverException e) {
			
		    System.out.println("   "+e );
		    Verify_availabilityOfAddReportsToProjectTool_TC05 tc02=new Verify_availabilityOfAddReportsToProjectTool_TC05(wd);
		    tc02.loadSiteID();
		    tc02.mainMethod1();
		    System.out.println("The Project Name you entered already exists on PARCEL.");
		}
		
			
	}
    @Test(priority=6, description="TestCase# 06")
   	public void testMethod6()
   	{
   		try
   		{
   			Validate_ResultWhenUserClicks_AddReportToProjectTool_TC06 tc6=new Validate_ResultWhenUserClicks_AddReportToProjectTool_TC06(wd);
   		tc6.resultValidationWhenUserClickOnAllReportsOption();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    @Test(priority=7, description="TestCase# 07")
   	public void testMethod7()
   	{
   		try
   		{
   			Validate_newSingleSiteProjectOptionAvailabilityOnHomePage_TC07 tc7=new Validate_newSingleSiteProjectOptionAvailabilityOnHomePage_TC07(wd);
   		tc7.ValidateNewSingleSiteProjectOptionunderStart();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    @Test(priority=8, description="TestCase# 08")
   	public void testMethod8()
   	{
   		try
   		{
   			Validate_fieldsAvailabilityWhenUserCilckedOnNSSP_underStart_TC08 tc8=new Validate_fieldsAvailabilityWhenUserCilckedOnNSSP_underStart_TC08(wd);
   		tc8.validateNewSingleSiteProjectOptionUnderStart();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    @Test(priority=9, description="TestCase# 09")
   	public void testMethod9()
   	{
   		try
   		{
   			Validate_sectionsOnNSSPPage_preexpendedAndColapsed_TC09 tc9=new Validate_sectionsOnNSSPPage_preexpendedAndColapsed_TC09(wd);
   		tc9.ValidatePreExpended_ColapsedSectionOnNSSP();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    @Test(priority=10, description="TestCase# 10")
   	public void testMethod10()
   	{
   		try
   		{
   			Validate_expendAndColapsedFunctionalityForNSSP_TC10 tc10=new Validate_expendAndColapsedFunctionalityForNSSP_TC10(wd);
   		tc10.vailidatingShowHideFuctionality();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
   @Test(priority=11, description="TestCase# 11")
   	public void testMethod11()
   	{
   		try
   		{
   			Validate_sectionsAvailability_usreClickOnNSSPThroughProjectTab_TC11 tc11=new Validate_sectionsAvailability_usreClickOnNSSPThroughProjectTab_TC11(wd);
   		tc11.validatingNSSPPageContent();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    @Test(priority=12, description="TestCase# 12")
  	public void testMethod12()
  	{
  		try
  		{
  			Validate_messageDisplay_requiresFielsdOfProjectInfoLeftBlank_TC12 tc12=new Validate_messageDisplay_requiresFielsdOfProjectInfoLeftBlank_TC12(wd);
  		tc12.mainMethod("Automation03", "Wichita Falls3", "Wichita Falls", "Auto126");
  		System.out.println("Login");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=13, description="TestCase# 13")
  	public void testMethod13()
  	{
  		try
  		{
  			Validate_ClientInformationSectionOnNSSPpage_TC13 tc13=new Validate_ClientInformationSectionOnNSSPpage_TC13(wd);
  		tc13.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=14, description="TestCase# 14")
  	public void testMethod14()
  	{
  		try
  		{
  			Validate_findContactLink_underClientInformation_TC14 tc14=new Validate_findContactLink_underClientInformation_TC14(wd);
  		tc14.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=15, description="TestCase# 15")
  	public void testMethod15() throws InterruptedException
  	{
  		try
  		{
  			Validate_searchFunctionalityOnFindContactPopup_TC15 tc15=new Validate_searchFunctionalityOnFindContactPopup_TC15(wd);
  		tc15.mainMethod();

  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  		
  			
  	}
    
   @Test(priority=16, description="TestCase# logout16")
    public void logoutMethod() throws InterruptedException
    {
    	try
  		{
  			 LogOut lg=new LogOut(wd);
  		     lg.mainMethod();
  		System.out.println("Log out");
  		
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		   
  		}
    	
    	
 
   }
   
   @AfterClass
   public void loggout()
   {
	   wd.quit();
   }
   
   

  
    

}
