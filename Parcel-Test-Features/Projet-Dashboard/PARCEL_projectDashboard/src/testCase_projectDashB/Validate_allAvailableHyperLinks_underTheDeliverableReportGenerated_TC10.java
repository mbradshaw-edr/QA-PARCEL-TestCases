package testCase_projectDashB;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_allAvailableHyperLinks_underTheDeliverableReportGenerated_TC10 {
	
	By ReportGeneratedTaskHeader=By.xpath("html/body/div/div/div/div/div/div/h3[2]");
	By SuccessMessage=By.xpath("html/body/div/div/div/div/div/div/p/b");
	By GeneralXpathOfFirst2Hyperlinks=By.xpath(".//*[@id='postClick']/p/b/a");
	By GeneralXpathOfLast2Hyperlinks=By.xpath(".//*[@id='postClick']/p/a");
	
	By ViewListOfRecentPortFolioDeliverablesLink=By.xpath(".//*[@id='postClick']/p/a[2]");
	By StartNewPortFolioDeliverablesLink=By.xpath(".//*[@id='postClick']/p/a[1]");
	By DownloadYourReportsLink=By.xpath(".//*[@id='postClick']/p/b[1]/a");
	By SendReportAsAnEmailLink=By.xpath(".//*[@id='postClick']/p/b[2]/a");
	
	By RecentPortfolioDownloads=By.xpath("html/body/div/div/div/div/div/div/h3");
	By GeneralXpathForRecetReportsAvailable=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td[1]");
	By CheckStatus_underRecentReportsDownloadPage=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[2]/td/a");
	
	By PageHeader_underEmailReportPage=By.xpath("html/body/div/div/div/div/div/div/h3");
	By TextBox_underSendReportAsAnEmail=By.id("to");
	By FindContactButton=By.xpath(".//*[@id='formEmailDeliverable']/table/tbody/tr/th/a");
	By Checkbox_sentCopyToThisMailAddress=By.name("sendToSelf");
	By SubmitButton=By.id("submitEmailDeliverableLink");
	By SuccessMSG=By.className("message");
	By GoToProjectDashboardLink=By.xpath("html/body/div//div/table/tbody/tr[3]/td/a");
	
	By SearchTextBox_underFindContactWindow=By.name("searchBox");
	By FindButton_underFindContactWindow=By.name("searchButton");
	By To_chechbox_underFindContactWindow=By.xpath("html/body/table/tbody/tr[1]/td[1]/input");
	By InsertSelectAddrss_underFindContactWindow=By.name("buttonInsert");
	
	By UserName=By.id("uEmail"); 
	By Password=By.id("pass");
	By Login=By.name("submit");
	
	
	
	
	
	By BackButton=By.id("submitReportSelectBack");
	By NextButton=By.id("submitReportSelect");
	
	public WebDriver wd;
	public String ParentWindow;
	public String ChildWindow;
	public Set<String> s1;
	public Robot r;
	public Login m1=new Login(wd);
	//public Login m2=new Login(wd);
	
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
    
    public void windowScroll()
	{
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("window.scrollBy(0,100)", "");
	}


	
	public Validate_allAvailableHyperLinks_underTheDeliverableReportGenerated_TC10(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void observation_onDeliverableReportPage() throws InterruptedException
	{
		WebElement e0=wd.findElement(ReportGeneratedTaskHeader);
		HighlightElement(wd, e0);
		System.out.println("Observation of all content under 'Report Deliverable Generated' page");
		String s=e0.getText();
		System.out.println(": "+s);
		
		WebElement e1=wd.findElement(SuccessMessage);
		HighlightElement(wd, e1);
		String s1=e1.getText();
		System.out.println(": "+s1);
		
		List<WebElement> li= wd.findElements(GeneralXpathOfFirst2Hyperlinks);
	    for(WebElement e2:li)
	    {
			HighlightElement(wd, e2);
			
			String s2=e2.getText();
			System.out.println(s2 );
	    }
	    
	    List<WebElement> li1= wd.findElements(GeneralXpathOfLast2Hyperlinks);
	    for(WebElement e3:li1)
	    {
			HighlightElement(wd, e3);
			
			String s3=e3.getText();
			System.out.println(s3 );
	    }
		
	}
	
	
	public void click_onViewListOfRecentPortFolioDeliverablesLink() throws InterruptedException
	{
		WebElement e4=wd.findElement(ViewListOfRecentPortFolioDeliverablesLink);
		HighlightElement(wd, e4);
		e4.click();
		Thread.sleep(6000);
		
		List<WebElement> li= wd.findElements(GeneralXpathForRecetReportsAvailable);
	    for(WebElement e:li)
	    {
	    	HighlightElement(wd, e);
			String s1=e.getText();
			System.out.println(s1 );
	    }
	    
	    WebElement e2=wd.findElement(CheckStatus_underRecentReportsDownloadPage);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(5000);
		
	}
	
	
	public void StartNewPortfolioDeliverable() throws InterruptedException
	{
		WebElement e2=wd.findElement(StartNewPortFolioDeliverablesLink);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(5000);
		String s1=wd.getTitle();
		System.out.println("Title of this page is: "+s1 );
		
	}
	
	
	public void click_onDownloadeYourReports() throws InterruptedException, AWTException
	{
		WebElement e1=wd.findElement(DownloadYourReportsLink);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(10000);
		
		//System.out.println("LogingTo 1" );
		WebElement e=wd.findElement(UserName);
		e.sendKeys(ExcelR1.getData("User Login Data",1,1));
		HighlightElement(wd, e);
		WebElement e2=wd.findElement(Password);
		e2.sendKeys(ExcelR1.getData("User Login Data",1,2));
		HighlightElement(wd, e2);
        WebElement e3=wd.findElement(Login);
		
		HighlightElement(wd, e3);
		e3.click();
		
		//System.out.println("LogingTo 2" );
		System.out.println("Title of this page is: "+s1 );
		Thread.sleep(7000);
		r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
	public void click_onSendReportsAsAnEmailLink() throws InterruptedException, AWTException
	{
		WebElement e1=wd.findElement(SendReportAsAnEmailLink);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(7000);
		//System.out.println("LogingTo 3" );


		//System.out.println("LogingTo 4" );
		//Thread.sleep(7000);
		WebElement e=wd.findElement(TextBox_underSendReportAsAnEmail);
		e.sendKeys(ExcelR1.getData("Send Report As An Email To",1,1));
		HighlightElement(wd, e);
		Thread.sleep(1000);
		
		ParentWindow=wd.getWindowHandle();
		//System.out.println("parent window: "+ParentWindow);
		WebElement e0=wd.findElement(FindContactButton);
		HighlightElement(wd, e0);
		e0.click();
		
        s1 = wd.getWindowHandles();                                                    // code for switching in to parent window and and again opene a new child window
             for (String handle1 : s1) 
             {
              System.out.println(handle1);
              wd.switchTo().window(handle1);
	          }
     		Thread.sleep(3000);
     		
     		
     		wd.manage().window().maximize();
     		WebElement e2=wd.findElement(SearchTextBox_underFindContactWindow);
    		e2.sendKeys(ExcelR1.getData("Searchable Data Under Find Cont",1,1));
    		HighlightElement(wd, e2);
    		Thread.sleep(1000);
    		
    		WebElement e3=wd.findElement(FindButton_underFindContactWindow);
    		HighlightElement(wd, e3);
    		e3.click();
    		
    		Thread.sleep(3000);
    		WebElement e4=wd.findElement(To_chechbox_underFindContactWindow);
    		HighlightElement(wd, e4);
    		e4.click();
    		
    		WebElement e5=wd.findElement(InsertSelectAddrss_underFindContactWindow);
    		HighlightElement(wd, e5);
    		e5.click();
    		wd.switchTo().window(ParentWindow);
    		
    		Thread.sleep(3000);
    		WebElement e6=wd.findElement(Checkbox_sentCopyToThisMailAddress);
    		HighlightElement(wd, e6);
    		e6.click();
    		
    		Thread.sleep(3000);
    		WebElement e7=wd.findElement(SubmitButton);
    		HighlightElement(wd, e7);
    		e7.click();
    		Thread.sleep(5000);
	    
 		WebElement e8=wd.findElement(SuccessMSG);
		HighlightElement(wd, e8);
		
		
	}
	
	public void click_onGoToProjectDashboardLink() throws InterruptedException
	{
		WebElement e=wd.findElement(GoToProjectDashboardLink);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(5000);
	}
	
	
	public void mainMethod() throws InterruptedException, AWTException
	{
		this.observation_onDeliverableReportPage();
		this.click_onViewListOfRecentPortFolioDeliverablesLink();
		this.StartNewPortfolioDeliverable();
		wd.navigate().back();
		Thread.sleep(5000);
		this.click_onDownloadeYourReports();
		wd.navigate().back();
		Thread.sleep(5000);
		this.click_onSendReportsAsAnEmailLink();
		this.click_onGoToProjectDashboardLink();
		
	}

}
