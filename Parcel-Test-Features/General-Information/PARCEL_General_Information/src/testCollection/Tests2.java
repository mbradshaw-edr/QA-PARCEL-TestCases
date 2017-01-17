package testCollection;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import detailTestScenarios.Login;
import detailTestScenarios.Vaidate_orderCofirmation_TC024;
import detailTestScenarios.Vailidate_ContinueButton_withPackageSection_EDRStandardPackagewithLightbox_underThe_EDRPackagesPage_TC16;
import detailTestScenarios.Validate_ContinueWithSingleSiteOrderFunctionality_TC14;
import detailTestScenarios.Validate_OrderDatabase_withPlacePortfolioOrderFunctionality_TC22;
import detailTestScenarios.Validate_availabilityOfEDRPortfolioPageContent_alongWithContinueFunctionality_TC23;
import detailTestScenarios.Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13;
import detailTestScenarios.Validate_contentAvailabilityAndItsFunctionality_addToOrder_andCityDirectpry_TC17;
import detailTestScenarios.Validate_continueButtonFunctionality_underTheProjectInformationPag_TC18;
import detailTestScenarios.Validate_continueButton_underPropertyLocationPage_TC15;
import detailTestScenarios.Validate_editFunctionalitis_andPlaceOrderFunctionality_underOrderSummaryPage_TC19;
import detailTestScenarios.Validate_orderStatus_onOrderCoformationPage_TC20;
import detailTestScenarios.Validate_umbrellaLink_TC11;
import detailTestScenarios.Verify_orderStatusPage_TC21;

public class Tests2 {
	
public static WebDriver wd;          
	
	@BeforeClass
	public void beforeTest1()                  // Initialisation of browser
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser");
		String brows=sc.next();
		if(brows.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\browserDrivers\\chromedriver.exe");
		wd=new ChromeDriver();
		}
		else if(brows.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\browserDrivers\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		}
		else if(brows.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\browserDrivers\\geckodriver.exe");
			wd=new FirefoxDriver();
		}
		wd.get("https://www.parcelplatform.com");
		wd.manage().window().maximize();
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
		l.loginTo();               ///////// "spatil", "Compu@1234",    "rahul", "jwepfqtwq8"
		System.out.println("Login");
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
   			Validate_umbrellaLink_TC11 tc11=new Validate_umbrellaLink_TC11(wd);
   		tc11.mainMetod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    /*@Test(priority=12, description="TestCase# 12")
   	public void testMethod12()
   	{
   		try
   		{
   			Validate_remainingPhase_EditPageUserChange_asDDsChanes_DDasAFiter_TC12 tc12=new Validate_remainingPhase_EditPageUserChange_asDDsChanes_DDasAFiter_TC12(wd);
   		tc12.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}*/
    
    @Test(priority=13, description="TestCase# 13")
   	public void testMethod13()
   	{
   		try
   		{
   			Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13 tc13=new Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13(wd);
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
   			Validate_ContinueWithSingleSiteOrderFunctionality_TC14 tc14=new Validate_ContinueWithSingleSiteOrderFunctionality_TC14(wd);
   		tc14.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=15, description="TestCase# 15")
   	public void testMethod15()
   	{
   		try
   		{
   			Validate_continueButton_underPropertyLocationPage_TC15 tc15=new Validate_continueButton_underPropertyLocationPage_TC15(wd);
   		tc15.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=16, description="TestCase# 16")
   	public void testMethod16()
   	{
   		try
   		{
   			Vailidate_ContinueButton_withPackageSection_EDRStandardPackagewithLightbox_underThe_EDRPackagesPage_TC16 tc16=new Vailidate_ContinueButton_withPackageSection_EDRStandardPackagewithLightbox_underThe_EDRPackagesPage_TC16(wd);
   		tc16.mainMethod();
   		System.out.println("");
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
   			Validate_contentAvailabilityAndItsFunctionality_addToOrder_andCityDirectpry_TC17 tc17=new Validate_contentAvailabilityAndItsFunctionality_addToOrder_andCityDirectpry_TC17(wd);
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
   			Validate_continueButtonFunctionality_underTheProjectInformationPag_TC18 tc18=new Validate_continueButtonFunctionality_underTheProjectInformationPag_TC18(wd);
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
   			Validate_editFunctionalitis_andPlaceOrderFunctionality_underOrderSummaryPage_TC19 tc19=new Validate_editFunctionalitis_andPlaceOrderFunctionality_underOrderSummaryPage_TC19(wd);
   		tc19.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=20, description="TestCase# 20")
   	public void testMethod20()
   	{
   		try
   		{
   			Validate_orderStatus_onOrderCoformationPage_TC20 tc20=new Validate_orderStatus_onOrderCoformationPage_TC20(wd);
   		tc20.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=21, description="TestCase# 21")
   	public void testMethod21()
   	{
   		try
   		{
   			Verify_orderStatusPage_TC21 tc21=new Verify_orderStatusPage_TC21(wd);
   		tc21.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=22, description="TestCase# 22")
   	public void testMethod22()
   	{
   		try
   		{
   			Validate_OrderDatabase_withPlacePortfolioOrderFunctionality_TC22 tc22=new Validate_OrderDatabase_withPlacePortfolioOrderFunctionality_TC22(wd);
   		tc22.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=23, description="TestCase# 23")
   	public void testMethod23()
   	{
   		try
   		{
   			Validate_availabilityOfEDRPortfolioPageContent_alongWithContinueFunctionality_TC23 tc23=new Validate_availabilityOfEDRPortfolioPageContent_alongWithContinueFunctionality_TC23(wd);
   		tc23.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=24, description="TestCase# 24")
   	public void testMethod24()
   	{
   		try
   		{
   			Vaidate_orderCofirmation_TC024 tc24=new Vaidate_orderCofirmation_TC024(wd);
   		tc24.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @AfterClass
    	public void closeBrowser()
    	{
    		wd.quit();
    	}
	
	
	
	

}
