package testCase_projectDashB;

import java.awt.Robot;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_portfolioSignoffTool_TC11 {
	
	By PrtfolioSignOffToolLink_underProjectDashboard=By.xpath("html/body/div//div/p/a[7]");
	By PorfolioSignatureToolPageHeader=By.xpath("html/body/div/div/div/div/div/div/h3");
	By ReportTypeDD_underPortFolioSignatureToolPage=By.id("SiteType"); // PARCEL FastTrack
	By GeneralXpathFor4DifferentCheckboxes=By.xpath("html/body/div//div/form/table/tbody/tr/td/input[4]");
	By SubmitChangesButton=By.name("submitSignatureChanges");
	By ReturnToProjactButton=By.xpath("html/body/div/div/div/div/div/div/div[1]/a");
	
	
	By StartNewPortFolioDeliverablesLink=By.xpath("");
	By DownloadYourReportsLink=By.xpath("");
	By SendReportAsAnEmailLink=By.xpath("");
	
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
	public int i;
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


	
	public Validate_portfolioSignoffTool_TC11(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void click_onPortfolioSignedOffToolLink() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement e0=wd.findElement(PrtfolioSignOffToolLink_underProjectDashboard);
		HighlightElement(wd, e0);
		e0.click();
		
		WebElement e1=wd.findElement(PorfolioSignatureToolPageHeader);
		HighlightElement(wd, e1);
		String s1=e1.getText();
		System.out.println(": "+s1);
	}
	
	public void select_reportTypeDD() throws InterruptedException
	{
		WebElement e0=wd.findElement(ReportTypeDD_underPortFolioSignatureToolPage);
		HighlightElement(wd, e0);
		e0.click();
		Select s=new Select(e0);
		s.selectByVisibleText("PARCEL FastTrack");
		//e0.click();
		Thread.sleep(4000);
		
	}
	
	public void click_onCheckBoxesForSignOff() throws InterruptedException
	{
		List<WebElement> li= wd.findElements(GeneralXpathFor4DifferentCheckboxes);
	    for(WebElement e2:li)
	    {
			HighlightElement(wd, e2);
			if (!e2.isSelected())
		        e2.click();
			
	    }
		
		/*for (int i = 1; i <=2; i++) {
		    WebElement ele = wd.findElement(By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr[2]/td/input["+4*i+"]")); // searching for new element after every reload
		    if (!ele.isSelected())
		        ele.click();
		}*/
	    
	    /*List<WebElement> li1= wd.findElements(GeneralXpathOfLast2Hyperlinks);
	    for(WebElement e3:li1)
	    {
			HighlightElement(wd, e3);
			
			String s3=e3.getText();
			System.out.println(s3 );
	    }*/
		
	}
	
	public void click_onSubitChanges() throws InterruptedException
	{
		WebElement e0=wd.findElement(SubmitChangesButton);
		HighlightElement(wd, e0);
		e0.click();
	}
	
	public void click_onReturnToProjectButton() throws InterruptedException
	{
		WebElement e0=wd.findElement(ReturnToProjactButton);
		HighlightElement(wd, e0);
		e0.click();
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onPortfolioSignedOffToolLink();
		this.select_reportTypeDD();
		this.click_onCheckBoxesForSignOff();
		this.click_onSubitChanges();
		this.click_onReturnToProjectButton();
	}

}
