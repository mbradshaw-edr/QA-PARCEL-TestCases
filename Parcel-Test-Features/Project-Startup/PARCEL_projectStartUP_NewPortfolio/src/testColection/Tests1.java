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

import testCaseNSPOM.CreateTheProject;
import testCaseNSPOM.Login;
import testCaseNSPOM.SelectingRequiredOptionsFromDropdowns_TC08;
import testCaseNSPOM.Vailidate_editAndDeleteFunctionality_underProjectCreation_SecondStep_TC07;
import testCaseNSPOM.Validate_NewPortfolioCreationWithUploadSiteSpreadSheet_TS02;
import testCaseNSPOM.Validate_NewPortfolioOption_underProjectTab_TC01;
import testCaseNSPOM.Validate_ProjectCreatedSuccessfully_lallLinksAvailabilityAndFuctionality_TC22;
import testCaseNSPOM.Validate_ProjectCreatedSuccessfully_linksAvailabilityAndFuctionality_TC13;
import testCaseNSPOM.Validate_SelectConsultantAndLanguageLibraryDD_TC09;
import testCaseNSPOM.Validate_addAnothrtSite_yesButton_TC03;
import testCaseNSPOM.Validate_addNewLicationLink_onProjectCreationWithUploadSpredSheet_TC05;
import testCaseNSPOM.Validate_allNewLocationLinkWithCancelFunctionality_onProjectCreationWithUploadSpreadSheet_TC06;
import testCaseNSPOM.Validate_availabilityOfAllStepsToCreateNewPortfolio_TC02;
import testCaseNSPOM.Validate_eMailProjectInfoFunctionality_TC12;
import testCaseNSPOM.Validate_projectCreation_manualltEntersSiteOption_TC01;
import testCaseNSPOM.Validate_step2EnterProjectInformation_selectManualOption_TC02;
import testCaseNSPOM.Validate_step5GrantAccess_andrestOfallSteps_TC11;
import testCaseNSPOM.Validate_stepFourAttachDocument_TC10;
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
		System.setProperty("webdriver.chrome.driver", "..\\PARCEL_projectStartUP_NewPortfolio\\src\\browserDrivers\\chromedriver.exe");
		wd=new ChromeDriver();
		}
		else if(brows.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "..\\PARCEL_projectStartUP_NewPortfolio\\src\browserDrivers\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		//wd=new FirefoxDriver();
		}
		else if(brows.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "..\\PARCEL_projectStartUP_NewPortfolio\\src\\browserDrivers\\geckodriver.exe");
			wd=new FirefoxDriver();
		}
		wd.navigate().to("https://uat.parcelplatform.com/");
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
		l.loginTo("spatil", "Compu@1234");
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}

    
   @Test(priority=1, description="TestCase# 01")
	public void testMethod1()
	{
		try
		{
			Validate_NewPortfolioOption_underProjectTab_TC01 tc1=new Validate_NewPortfolioOption_underProjectTab_TC01(wd);
		tc1.newPortfolioOptionUnderProjectMenu();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=2, description="TestCase# 02")                //pr2,3 are commented
	public void testMethod2()
	{
		try
		{
			Validate_availabilityOfAllStepsToCreateNewPortfolio_TC02 tc2=new Validate_availabilityOfAllStepsToCreateNewPortfolio_TC02(wd);
		tc2.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    /*@Test(priority=3, description="TestCase# 03")
  	public void testMethod3()
  	{
  		try
  		{
  			CreateTheProject tc3=new CreateTheProject(wd);
  		tc3.mainMethid();
  		System.out.println(" ");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}*/
    @Test(priority=4, description="TestCase# 04")
  	public void testMethod4()
  	{
  		try
  		{
  			Validate_NewPortfolioCreationWithUploadSiteSpreadSheet_TS02 tc4=new Validate_NewPortfolioCreationWithUploadSiteSpreadSheet_TS02(wd);
  		tc4.mainMethod();
  		System.out.println(" ");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=5, description="TestCase# 05")
  	public void testMethod5()
  	{
  		try
  		{
  			Validate_addNewLicationLink_onProjectCreationWithUploadSpredSheet_TC05 tc5=new Validate_addNewLicationLink_onProjectCreationWithUploadSpredSheet_TC05(wd);
  		tc5.mainMethod();
  		System.out.println(" ");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=6, description="TestCase# 06")
  	public void testMethod6()
  	{
  		try
  		{
  			Validate_allNewLocationLinkWithCancelFunctionality_onProjectCreationWithUploadSpreadSheet_TC06 tc6=new Validate_allNewLocationLinkWithCancelFunctionality_onProjectCreationWithUploadSpreadSheet_TC06(wd);
  		tc6.mainMethod();
  		System.out.println(" ");
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
  			Vailidate_editAndDeleteFunctionality_underProjectCreation_SecondStep_TC07 tc7=new Vailidate_editAndDeleteFunctionality_underProjectCreation_SecondStep_TC07(wd);
  		tc7.mainMethod();
  		System.out.println(" ");
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
  			SelectingRequiredOptionsFromDropdowns_TC08 tc8=new SelectingRequiredOptionsFromDropdowns_TC08(wd);
  		tc8.mainMethod();
  		System.out.println(" ");
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
  			Validate_SelectConsultantAndLanguageLibraryDD_TC09 tc9=new Validate_SelectConsultantAndLanguageLibraryDD_TC09(wd);
  		tc9.mainMethod();
  		System.out.println(" ");
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
  			Validate_stepFourAttachDocument_TC10 tc10=new Validate_stepFourAttachDocument_TC10(wd);
  		tc10.mainMethod();
  		System.out.println(" ");
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
  			Validate_step5GrantAccess_andrestOfallSteps_TC11 tc11=new Validate_step5GrantAccess_andrestOfallSteps_TC11(wd);
  		tc11.mainMethod();
  		System.out.println(" ");
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
  			Validate_eMailProjectInfoFunctionality_TC12 tc12=new Validate_eMailProjectInfoFunctionality_TC12(wd);
  		tc12.mainMethod();
  		System.out.println(" ");
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
  			Validate_ProjectCreatedSuccessfully_linksAvailabilityAndFuctionality_TC13 tc13=new Validate_ProjectCreatedSuccessfully_linksAvailabilityAndFuctionality_TC13(wd);
  		tc13.mainMethod();
  		System.out.println(" ");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=14, description="TestCase# login")
	public void testLogin14()
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
    
    
	@Test(priority=15, description="TestCase# 1")
	public void testMethod15()
	{
		try
		{
			Validate_projectCreation_manualltEntersSiteOption_TC01 tc1=new Validate_projectCreation_manualltEntersSiteOption_TC01(wd);
	    tc1.mainMethod();
		System.out.println("");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
	@Test(priority=16, description="TestCase# 2")
	public void testMethod16()
	{
		try
		{
			Validate_step2EnterProjectInformation_selectManualOption_TC02 tc2=new Validate_step2EnterProjectInformation_selectManualOption_TC02(wd);
	    tc2.mainMethod();
		System.out.println("");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
	@Test(priority=17, description="TestCase# 03")
	public void testMethod17()
	{
		try
		{
			Validate_addAnothrtSite_yesButton_TC03 tc3=new Validate_addAnothrtSite_yesButton_TC03(wd);
	    tc3.mainMethod();
		System.out.println("");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=18, description="TestCase# 09")
  	public void testMethod18()
  	{
  		try
  		{
  			Validate_SelectConsultantAndLanguageLibraryDD_TC09 tc9=new Validate_SelectConsultantAndLanguageLibraryDD_TC09(wd);
  		tc9.mainMethod();
  		System.out.println(" ");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=19, description="TestCase# 10")
  	public void testMethod19()
  	{
  		try
  		{
  			Validate_stepFourAttachDocument_TC10 tc10=new Validate_stepFourAttachDocument_TC10(wd);
  		tc10.mainMethod();
  		System.out.println(" ");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=20, description="TestCase# 11")
  	public void testMethod20()
  	{
  		try
  		{
  			Validate_step5GrantAccess_andrestOfallSteps_TC11 tc11=new Validate_step5GrantAccess_andrestOfallSteps_TC11(wd);
  		tc11.mainMethod();
  		System.out.println(" ");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=21, description="TestCase# 12")
  	public void testMethod21()
  	{
  		try
  		{
  			Validate_eMailProjectInfoFunctionality_TC12 tc12=new Validate_eMailProjectInfoFunctionality_TC12(wd);
  		tc12.mainMethod();
  		System.out.println(" ");
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
  			Validate_ProjectCreatedSuccessfully_lallLinksAvailabilityAndFuctionality_TC22 tc22=new Validate_ProjectCreatedSuccessfully_lallLinksAvailabilityAndFuctionality_TC22(wd);
  		tc22.mainMethod();
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
