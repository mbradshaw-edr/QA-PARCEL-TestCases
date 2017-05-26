package testsExecution;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
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
import testCaseClassesPOM.Validat_blankInputsFor_creatingNewPortfolio_withLinkUnderNSSP_TC34;
import testCaseClassesPOM.Validate_AdditonalPropertyInformationSection_OnNSSP_TC21;
import testCaseClassesPOM.Validate_addContactFunctionalityOnFindContactWindow_TC17;
import testCaseClassesPOM.Validate_attachmentsSectionOnNSSP_TC26;
import testCaseClassesPOM.Validate_emailNotificationSection_TC28;
import testCaseClassesPOM.Validate_fieldsWithInvailidData_newPortfolioProjectSetup_TC33;
import testCaseClassesPOM.Validate_fieldsWithValidDataToSetupProject_TC32;
import testCaseClassesPOM.Validate_findContactFunctionality_forEmailNotificationSection_TC30;
import testCaseClassesPOM.Validate_grantAccessToOtherUsersSection_onNSSp_TC23;
import testCaseClassesPOM.Validate_newPortfolioUnderProjectTab_TC31;
import testCaseClassesPOM.Validate_parcelUserCanNotifyOtherUserAboutProjectCreation_EmailNotificationSection_TC29;
import testCaseClassesPOM.Validate_propertyInformation_onNewSingleSiteProject_TC18;
import testCaseClassesPOM.Validate_reportSelectionSection_onNSSP_TC19;
import testCaseClassesPOM.Validate_siteContactInformationSection_onNSSP_TC22;
import testCaseClassesPOM.Validate_uplodeDocuments_attachmentsSection_TC27;
import testCaseClassesPOM.Verify_availabilityOfAddReportsToProjectTool_TC05;
import testCaseClassesPOM.Vilidate_createProjectFunctionality_withProjectTab_TC35;

public class Tests2 extends WebDriverException {
	
public WebDriver wd;          
	
	@BeforeClass
	public void beforeTest1()                  // Initialisation of browser
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
		//wd.manage().window().maximize();
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
    @Test(priority=17, description="TestCase# 17")
 	public void testMethod17()
 	{
 		try
 		{
 			Validate_addContactFunctionalityOnFindContactWindow_TC17 tc17=new Validate_addContactFunctionalityOnFindContactWindow_TC17(wd);
 		tc17.mainMethod();
 		System.out.println("");
 		}
 		catch(Exception e) {
 		    e.printStackTrace(System.out);
 		}
 			
 	}
    @Test(priority=18, description="TestCase# 18")
 	public void testMethod18()
 	{
 		try
 		{
 			Validate_propertyInformation_onNewSingleSiteProject_TC18 tc18=new Validate_propertyInformation_onNewSingleSiteProject_TC18(wd);
 		tc18.mainMethod();
 		System.out.println("");
 		}
 		catch(Exception e) {
 		    e.printStackTrace(System.out);
 		}
 			
 	}
    @Test(priority=19, description="TestCase# 19")
 	public void testMethod19()
 	{
 		try
 		{
 			Validate_reportSelectionSection_onNSSP_TC19 tc19=new Validate_reportSelectionSection_onNSSP_TC19(wd);
 		tc19.mainMethod();
 		System.out.println("");
 		}
 		catch(Exception e) {
 		    e.printStackTrace(System.out);
 		}
 			
 	}
    @Test(priority=20, description="TestCase# 21")
  	public void testMethod21()
  	{
  		try
  		{
  			Validate_AdditonalPropertyInformationSection_OnNSSP_TC21 tc21=new Validate_AdditonalPropertyInformationSection_OnNSSP_TC21(wd);
  		tc21.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=21, description="TestCase# 22")
  	public void testMethod22()
  	{
  		try
  		{
  			Validate_siteContactInformationSection_onNSSP_TC22 tc22=new Validate_siteContactInformationSection_onNSSP_TC22(wd);
  		tc22.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    
   @Test(priority=22, description="TestCase# 23")
  	public void testMethod23()
  	{
  		try
  		{
  			Validate_grantAccessToOtherUsersSection_onNSSp_TC23 tc23=new Validate_grantAccessToOtherUsersSection_onNSSp_TC23(wd);
  		tc23.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    
    @Test(priority=23, description="TestCase# 26")
  	public void testMethod26()
  	{
  		try
  		{
  			Validate_attachmentsSectionOnNSSP_TC26 tc24=new Validate_attachmentsSectionOnNSSP_TC26(wd);
  		tc24.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=24, description="TestCase# 27")
  	public void testMethod27()
  	{
  		try
  		{
  			Validate_uplodeDocuments_attachmentsSection_TC27 tc27=new Validate_uplodeDocuments_attachmentsSection_TC27(wd);
  		tc27.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=25, description="TestCase# 28")
  	public void testMethod28()
  	{
  		try
  		{
  			Validate_emailNotificationSection_TC28 tc28=new Validate_emailNotificationSection_TC28(wd);
  		tc28.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=26, description="TestCase# 29")
	public void testMethod29() throws WebDriverException, InterruptedException
	{
		
			Validate_parcelUserCanNotifyOtherUserAboutProjectCreation_EmailNotificationSection_TC29 tc29=new Validate_parcelUserCanNotifyOtherUserAboutProjectCreation_EmailNotificationSection_TC29(wd);
		tc29.mainMethod("Automation Test Proj022", "07/28/2016", "10/30/2016", "Automation Test prop19", "Wichita Falls11", "Wichita Falls", "Auto136");
		System.out.println("");
		
			
	}
    @Test(priority=27, description="TestCase# 30")
 	public void testMethod30() throws WebDriverException, InterruptedException
 	{
 		
 			Validate_findContactFunctionality_forEmailNotificationSection_TC30 tc30=new Validate_findContactFunctionality_forEmailNotificationSection_TC30(wd);
 		tc30.mainMethod("Automation Test Proj023", "07/28/2016", "10/30/2016", "Automation Test prop17", "Wichita Falls12", "Wichita Falls", "Auto135");
 		System.out.println("");
 		
 		
 			
 	}
    @Test(priority=28, description="TestCase# 31")
 	public void testMethod31()
 	{
 		try
 		{
 			Validate_newPortfolioUnderProjectTab_TC31 tc31=new Validate_newPortfolioUnderProjectTab_TC31(wd);
 		tc31.mainMethod();
 		System.out.println("");
 		}
 		catch(Exception e) {
 		    e.printStackTrace(System.out);
 		}
 			
 	}
    @Test(priority=29, description="TestCase# 32")
  	public void testMethod32() throws InterruptedException
  	{
  		try
  		{
  			Validate_fieldsWithValidDataToSetupProject_TC32 tc32=new Validate_fieldsWithValidDataToSetupProject_TC32(wd);
  		tc32.mainMethod();
  		System.out.println("");
  		}
	    catch(WebDriverException ee) {
			
		    System.out.println("   "+ee);
		    //Verify_availabilityOfAddReportsToProjectTool_TC05 tc02=new Verify_availabilityOfAddReportsToProjectTool_TC05(wd);
		    
		    System.out.println("The Project Name you entered already exists on PARCEL.");
		}
  			
  	}
    /*@Test(priority=14, description="TestCase# 33")
  	public void testMethod33()
  	{
  		try
  		{
  			Validate_fieldsWithInvailidData_newPortfolioProjectSetup_TC33 tc33=new Validate_fieldsWithInvailidData_newPortfolioProjectSetup_TC33(wd);
  		tc33.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=15, description="TestCase# 34")
  	public void testMethod34()
  	{
  		try
  		{
  			Validat_blankInputsFor_creatingNewPortfolio_withLinkUnderNSSP_TC34 tc34=new Validat_blankInputsFor_creatingNewPortfolio_withLinkUnderNSSP_TC34(wd);
  		tc34.mainMethod();
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=16, description="TestCase# 35")
  	public void testMethod35() throws WebDriverException, InterruptedException
  	{
  		try
  		{
  		
  			Vilidate_createProjectFunctionality_withProjectTab_TC35 tc35=new Vilidate_createProjectFunctionality_withProjectTab_TC35(wd);
  			tc35.mainMethod("Automation Test Proj021", "07/28/2016", "10/30/2016", "Automation Test prop16", "Wichita Falls13", "Wichita Falls", "Auto134");
  		System.out.println("");
  		}
  	
        catch(WebDriverException e) {
			
		    System.out.println("   "+e );
		    Verify_availabilityOfAddReportsToProjectTool_TC05 tc02=new Verify_availabilityOfAddReportsToProjectTool_TC05(wd);
		    System.out.println("The Project Name you entered already exists on PARCEL.");
		}
  			
  	}*/
    
    @AfterClass
    public void loggout()
    {
 	   wd.quit();
    }
  

 

}
