package testsExecution;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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
import testCaseClassesPOM.Validate_projectFunctionality_withBlankData_TC37;
import testCaseClassesPOM.Validate_cancelAndReturnHomeButtonFunctionality_TC38;
import testCaseClassesPOM.Validate_creatProjectFunctionality_withInvailidData_TC36;
import testCaseClassesPOM.Validate_gramtAccessToOtherUsersSection_onNSSP_TC25;
import testCaseClassesPOM.Vilidate_createProjectFunctionality_withProjectTab_TC35;

public class Tests3 {
	
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
    @Test(priority=1, description="TestCase# 36")
  	public void testMethod36()
  	{
  		try
  		{
  			Validate_creatProjectFunctionality_withInvailidData_TC36 tc36=new Validate_creatProjectFunctionality_withInvailidData_TC36(wd);
  			tc36.mainMethod("$#$ #$#$ ##03", "^^^ ^^^><>", "@@@@@@@", "<<<>><", "+++0+", "_+_+_", ">>>>");
  		System.out.println("");
  		}
  		catch(Exception e) {
  		    e.printStackTrace(System.out);
  		}
  			
  	}
    @Test(priority=2, description="TestCase# 37")
   	public void testMethod37()
   	{
   		try
   		{
   			Validate_projectFunctionality_withBlankData_TC37 tc37=new Validate_projectFunctionality_withBlankData_TC37(wd);
   			tc37.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    @Test(priority=3, description="TestCase# 38")
   	public void testMethod38()
   	{
   		try
   		{
   			Validate_cancelAndReturnHomeButtonFunctionality_TC38 tc38=new Validate_cancelAndReturnHomeButtonFunctionality_TC38(wd);
   			tc38.mainMethod("Automation Test Proj6", "07/28/2016", "10/30/2016", "Automation Test prop5", "Wichita Falls4", "Wichita Falls", "Auto127");
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    @Test(priority=4, description="TestCase# 25")
   	public void testMethod25() throws InterruptedException
   	{
   		try
   		{
   			Validate_gramtAccessToOtherUsersSection_onNSSP_TC25  tc25=new Validate_gramtAccessToOtherUsersSection_onNSSP_TC25 (wd);
   			tc25.mainMethod();
   		System.out.println("");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   		Thread.sleep(5000);
   		wd.quit();
   			
   	}
  
    


}
