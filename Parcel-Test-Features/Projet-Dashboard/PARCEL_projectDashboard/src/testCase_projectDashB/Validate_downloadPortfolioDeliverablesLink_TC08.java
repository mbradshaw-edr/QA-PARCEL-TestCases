package testCase_projectDashB;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_downloadPortfolioDeliverablesLink_TC08 {
	
	By DownloadPortfolioDeleiverablesLink_underProjectDashboard=By.xpath("html/body/div//div/p/a[6]");
	By PortfolioDownloadPageHeader=By.xpath("html/body/div/div/div/div/div/div/h3[1]");
	By GeneralXpathDownloadDeliverablesSteps=By.xpath("html/body/div//div/table/tbody/tr/td[2]");
	By GeneralXpathForAllButtons=By.xpath(".//*[@id='frmReportSelection']/input");
	
	By CheckAllButton=By.xpath(".//*[@id='frmReportSelection']/input[1]");
	By CheckAllPCAsButton=By.xpath(".//*[@id='frmReportSelection']/input[2]");
	By CheckAllFastTracksButton=By.xpath(".//*[@id='frmReportSelection']/input[3]");
	By CheckAllPhaseIsButton=By.xpath(".//*[@id='frmReportSelection']/input[4]");
	By CheckAllFinalReportsButton=By.xpath(".//*[@id='frmReportSelection']/input[5]");
	By CheckAllNonFinalReportsButton=By.xpath(".//*[@id='frmReportSelection']/input[6]");
	By UncheckAllButton=By.xpath(".//*[@id='frmReportSelection']/input[7]");
	
	By BackButton=By.id("submitReportSelectBack");
	By NextButton=By.id("submitReportSelect");
	
	public WebDriver wd;
	public String ParentWindow;
	public String ChildWindow;
	public Set<String> s1;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
	
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


	
	public Validate_downloadPortfolioDeliverablesLink_TC08(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_onDownloadPortfolioDeliverableLink() throws InterruptedException
	{
		WebElement e0=wd.findElement(DownloadPortfolioDeleiverablesLink_underProjectDashboard);
		HighlightElement(wd, e0);
		e0.click();
		Thread.sleep(5000);
	}
	
	
	/* Method for setting valid data for user name field */
	public void observation_components_underPortfolioDeliverablePage() throws InterruptedException
	{
		WebElement e1=wd.findElement(PortfolioDownloadPageHeader);
		HighlightElement(wd, e1);
		
		List<WebElement> li= wd.findElements(GeneralXpathDownloadDeliverablesSteps);
	    for(WebElement e:li)
	    {
			HighlightElement(wd, e);
			
			String s1=e.getText();
			System.out.println(s1 );
	    }
	    
	    List<WebElement> li1= wd.findElements(GeneralXpathForAllButtons);
	    for(WebElement e2:li1)
	    {
			HighlightElement(wd, e2);
			
			String s2=e2.getAttribute("value");
			System.out.println(s2 );
	    }
		
		/*Boolean b =e1.isDisplayed();
		System.out.println("Link availability: "+b);
		String s=wd.getTitle();
		System.out.println("Page Title is: "+s);*/
		
		
	}
	
	public void click_onCheckAllButton() throws InterruptedException
	{
		WebElement e0=wd.findElement(CheckAllButton);
		HighlightElement(wd, e0);
		e0.click();
	}
	
	public void click_onCheckAllPCAsButton() throws InterruptedException
	{
		WebElement e1=wd.findElement(CheckAllPCAsButton);
		HighlightElement(wd, e1);
		e1.click();
	}
	
	public void click_onCheckAllFastTracksButton() throws InterruptedException
	{
		WebElement e2=wd.findElement(CheckAllFastTracksButton);
		HighlightElement(wd, e2);
		e2.click();
	}
	
	public void click_onCheckAllPhaseIsButton() throws InterruptedException
	{
		WebElement e3=wd.findElement(CheckAllPhaseIsButton);
		HighlightElement(wd, e3);
		e3.click();
	}
	
	public void click_onCheckAllFinalReportsButton() throws InterruptedException
	{
		WebElement e4=wd.findElement(CheckAllFinalReportsButton);
		HighlightElement(wd, e4);
		e4.click();
	}
	
	public void click_onCheckAllNonFinalReportsButton() throws InterruptedException
	{
		WebElement e5=wd.findElement(CheckAllNonFinalReportsButton);
		HighlightElement(wd, e5);
		e5.click();
	}
	
	public void click_onUncheckAllButton() throws InterruptedException
	{
		WebElement e6=wd.findElement(UncheckAllButton);
		HighlightElement(wd, e6);
		e6.click();
	}
	
	public void click_onBackButton() throws InterruptedException
	{
		WebElement e0=wd.findElement(BackButton);
		HighlightElement(wd, e0);
		e0.click();
	}
	
	public void click_onNextButton() throws InterruptedException
	{
		WebElement e1=wd.findElement(NextButton);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(5000);
	}
	
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onDownloadPortfolioDeliverableLink();
		this.observation_components_underPortfolioDeliverablePage();
		Thread.sleep(2000);
		this.click_onCheckAllButton();
		Thread.sleep(3000);
		/*this.click_onUncheckAllButton();
		Thread.sleep(2000);
		this.click_onCheckAllPCAsButton();
		Thread.sleep(2000);
		this.click_onUncheckAllButton();
		Thread.sleep(2000);
		this.click_onCheckAllFastTracksButton();
		Thread.sleep(2000);
		this.click_onUncheckAllButton();
		Thread.sleep(2000);
		this.click_onCheckAllPhaseIsButton();
		Thread.sleep(2000);
		this.click_onUncheckAllButton();
		Thread.sleep(2000);
		this.click_onCheckAllFinalReportsButton();
		Thread.sleep(2000);
		this.click_onUncheckAllButton();
		Thread.sleep(2000);
		this.click_onCheckAllNonFinalReportsButton();
		Thread.sleep(2000);
		this.click_onUncheckAllButton();
		Thread.sleep(2000);
		Thread.sleep(2000);
		this.click_onCheckAllButton();*/
		this.click_onNextButton();
	}
	
	
	
	

}
