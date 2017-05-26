package testColection;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import testCase_grantAccess.Login;
import testCase_grantAccess.Validate_functionalityOfGrantAccses;
import testCase_grantAccess.Validate_grantAccesToAReportLink_underHomPage_TC01;
import utility.ExcelR1;


public class Tests1 {
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
	
public static WebDriver wd;          
	
	@BeforeClass
	public void beforeTest1()                  // Initialisation of browser
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the browser");
		//String brows=sc.next();
		//if(brows.equalsIgnoreCase("chrome"))
		//{
		System.setProperty("webdriver.chrome.driver", "..\\PARCEL_GrantAccess\\src\\browserDrivers\\chromedriver.exe");
		wd=new ChromeDriver();
		//}
		/*else if(brows.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "..\\PARCEL_GrantAccess\\src\\browserDrivers\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		//wd=new FirefoxDriver();
		}
		else if(brows.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "..\\PARCEL_GrantAccess\\src\\browserDrivers\\geckodriver.exe");
			wd=new FirefoxDriver();
		}*/
		wd.navigate().to("https://www.parcelplatform.com");
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
		l.loginTo();
		System.out.println("Login");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=1, description="Grant Access TestCase# 01")
	public void test01()
	{
		try
		{
			Validate_grantAccesToAReportLink_underHomPage_TC01 tc01=new Validate_grantAccesToAReportLink_underHomPage_TC01(wd);
	        tc01.mainMethod();
		System.out.println(" ");
		}
		catch(Exception e) {
		    e.printStackTrace(System.out);
		}
			
	}
    
    @Test(priority=2, description="Grant Access TestCase# 02")
   	public void test02()
   	{
   		try
   		{
   			Validate_functionalityOfGrantAccses tc02=new Validate_functionalityOfGrantAccses(wd);
   	        tc02.mainMethod();
   		System.out.println(" ");
   		}
   		catch(Exception e) {
   		    e.printStackTrace(System.out);
   		}
   			
   	}
    

    

    
    @AfterClass
	public void closeBrowser()
	{
		wd.close();
	}
    
	 

}
