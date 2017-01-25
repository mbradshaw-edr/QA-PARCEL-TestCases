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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import detailTestScenarios.GoToAmbrellaLink_againForValidatigNextFunctionality_TC001;
import detailTestScenarios.Login;
import detailTestScenarios.Vaidate_orderCofirmation_TC024;
import detailTestScenarios.Vailidate_ContinueButton_withPackageSection_EDRStandardPackagewithLightbox_underThe_EDRPackagesPage_TC16;
import detailTestScenarios.Vailidate_availabilityAndClickability_FindContact_TC04;
import detailTestScenarios.Vailidate_editeFinctionality_withCancelButton_TC03;
import detailTestScenarios.Validate_ContinueWithSingleSiteOrderFunctionality_TC14;
import detailTestScenarios.Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2;
import detailTestScenarios.Validate_OrderDatabase_withPlacePortfolioOrderFunctionality_TC22;
import detailTestScenarios.Validate_addContactFunctionality_unserFindContact_TC05;
import detailTestScenarios.Validate_availabilityOfEDRPortfolioPageContent_alongWithContinueFunctionality_TC23;
import detailTestScenarios.Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13;
import detailTestScenarios.Validate_availableOfFunctionalitygOnGIPage_TC01;
import detailTestScenarios.Validate_availablityClickablityFunctionality_viewMapLink_TC06;
import detailTestScenarios.Validate_contentAvailabilityAndItsFunctionality_addToOrder_andCityDirectpry_TC17;
import detailTestScenarios.Validate_continueButtonFunctionality_underTheProjectInformationPag_TC18;
import detailTestScenarios.Validate_continueButton_underPropertyLocationPage_TC15;
import detailTestScenarios.Validate_editDeleteFunctionalityForUsers_TC09;
import detailTestScenarios.Validate_editFunctionalitis_andPlaceOrderFunctionality_underOrderSummaryPage_TC19;
import detailTestScenarios.Validate_editSignature_hereLink_TC07;
import detailTestScenarios.Validate_hereLink_availabilityOfFunctionalityUnderThisLink_TC08;
import detailTestScenarios.Validate_impersonateAnUser_TC10;
import detailTestScenarios.Validate_orderStatus_onOrderCoformationPage_TC20;
import detailTestScenarios.Validate_remainingPhase_EditPageUserChange_asDDsChanes_DDasAFiter_TC12;
import detailTestScenarios.Validate_umbrellaLink_TC11;
import detailTestScenarios.Verify_orderStatusPage_TC21;
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
		System.setProperty("webdriver.chrome.driver", "..\\PARCEL_General_Information\\src\\browserDrivers\\chromedriver.exe");
		wd=new ChromeDriver();
		}
		else if(brows.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "..\\PARCEL_General_Information\\src\\browserDrivers\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		}
		else if(brows.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "..\\PARCEL_General_Information\\src\\browserDrivers\\geckodriver.exe");
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
    
    @Test(priority=3, description="TestCase# 1")
   	public void testMethod1()
   	{
   		try
   		{
   			Validate_availableOfFunctionalitygOnGIPage_TC01 tc1=new Validate_availableOfFunctionalitygOnGIPage_TC01(wd);
   		tc1.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=1, description="TestCase# 2")
	public void testMethod2()
	{
		try
		{
			Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2 tc2=new Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2(wd);
		tc2.mainMethod();
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=2, description="TestCase# 3")
   	public void testMethod3()
   	{
   		try
   		{
   			Vailidate_editeFinctionality_withCancelButton_TC03 tc3=new Vailidate_editeFinctionality_withCancelButton_TC03(wd);
   		tc3.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=4, description="TestCase# 4")
   	public void testMethod4()
   	{
   		try
   		{
   			Vailidate_availabilityAndClickability_FindContact_TC04 tc4=new Vailidate_availabilityAndClickability_FindContact_TC04(wd);
   		tc4.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=5, description="TestCase# 5")
   	public void testMethod5()
   	{
   		try
   		{
   			Validate_addContactFunctionality_unserFindContact_TC05 tc5=new Validate_addContactFunctionality_unserFindContact_TC05(wd);
   		tc5.addWindow();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=6, description="TestCase# 6")
   	public void testMethod6()
   	{
   		try
   		{
   			Validate_availablityClickablityFunctionality_viewMapLink_TC06 tc6=new Validate_availablityClickablityFunctionality_viewMapLink_TC06(wd);
   		tc6.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    /*@Test(priority=7, description="TestCase# 7")
   	public void testMethod7()
   	{
   		try
   		{
   			Validate_editSignature_hereLink_TC07 tc7=new Validate_editSignature_hereLink_TC07(wd);
   		tc7.mainMethod();
   		System.out.println("Login");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=8, description="TestCase# 8")
   	public void testMethod8()
   	{
   		try
   		{
   			Validate_hereLink_availabilityOfFunctionalityUnderThisLink_TC08 tc8=new Validate_hereLink_availabilityOfFunctionalityUnderThisLink_TC08(wd);
   		tc8.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=9, description="TestCase# 9")
   	public void testMethod9()
   	{
   		try
   		{
   			Validate_editDeleteFunctionalityForUsers_TC09 tc9=new Validate_editDeleteFunctionalityForUsers_TC09(wd);
   		tc9.mainMethod();
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
   			Validate_impersonateAnUser_TC10 tc10=new Validate_impersonateAnUser_TC10(wd);
   		tc10.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=11, description="TestCase# login")
   	public void testLoginAgain()
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
    
    @Test(priority=12, description="TestCase# 001")
   	public void testMethod001()
   	{
   		try
   		{
   			GoToAmbrellaLink_againForValidatigNextFunctionality_TC001 tc001=new GoToAmbrellaLink_againForValidatigNextFunctionality_TC001(wd);
   		tc001.mainMetod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    
    @Test(priority=13, description="TestCase# 11")
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
    
    @Test(priority=14, description="TestCase# 12")
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
    
    @Test(priority=15, description="TestCase# 13")
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
    
    @Test(priority=16, description="TestCase# 14")
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
    
    @Test(priority=17, description="TestCase# 15")
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
    
    @Test(priority=18, description="TestCase# 16")
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
    
    @Test(priority=19, description="TestCase# 17")
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
    
    @Test(priority=20, description="TestCase# 18")
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
    
    @Test(priority=21, description="TestCase# 19")
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
    
    @Test(priority=22, description="TestCase# 20")
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
    
    @Test(priority=23, description="TestCase# 21")
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
    
    @Test(priority=24, description="TestCase# 22")
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
    
    @Test(priority=25, description="TestCase# 23")
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
    
    @Test(priority=26, description="TestCase# 24")
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
    
    /*@AfterClass
	public void closeBrowser()
	{
		wd.quit();
	}*/
 
    

    
 
    
    
}
