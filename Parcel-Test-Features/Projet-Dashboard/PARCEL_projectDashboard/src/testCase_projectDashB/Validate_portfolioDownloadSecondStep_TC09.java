package testCase_projectDashB;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_portfolioDownloadSecondStep_TC09 {
	
	By TaskHeader=By.xpath("html/body/div/div/div/div/div/div/h3[2]");
	By CheckAllButtons=By.xpath(".//*[@id='frmModSelection']/div[1]/input[2]");
	By UncheckAllButtons=By.xpath(".//*[@id='frmModSelection']/div[1]/input[3]");
	By GeneralXpathForAllCheckBoxes=By.xpath(".//*[@id='frmModSelection']/div/input[4]");
	
	By TaskHeader_underConformationPage=By.xpath("html/body/div/div/div/div/div/div/h3[2]");
	By ConfirmButton_underConformationPage=By.id("btnConfirmRequest");
	
	/*By NextButton=By.xpath(".//*[@id='frmReportSelection']/input[1]");
	By CheckAllPCAsButton=By.xpath(".//*[@id='frmReportSelection']/input[2]");
	By CheckAllFastTracksButton=By.xpath(".//*[@id='frmReportSelection']/input[3]");
	By CheckAllPhaseIsButton=By.xpath(".//*[@id='frmReportSelection']/input[4]");
	By CheckAllFinalReportsButton=By.xpath(".//*[@id='frmReportSelection']/input[5]");
	By CheckAllNonFinalReportsButton=By.xpath(".//*[@id='frmReportSelection']/input[6]");
	By UncheckAllButton=By.xpath(".//*[@id='frmReportSelection']/input[7]");*/
	
	By NextButton=By.id("submitModuleSelect");
	
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


	
	public Validate_portfolioDownloadSecondStep_TC09(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_onCheckAllButton() throws InterruptedException
	{
		
		WebElement e1=wd.findElement(TaskHeader);
		HighlightElement(wd, e1);
		WebElement e0=wd.findElement(CheckAllButtons);
		HighlightElement(wd, e0);
		e0.click();
	}
	
	public void click_onUncheckAllButton() throws InterruptedException
	{
		WebElement e0=wd.findElement(UncheckAllButtons);
		HighlightElement(wd, e0);
		e0.click();
	}
	
	public void cusomCheck_onCheckBoxes() throws InterruptedException
	{
		List<WebElement> li= wd.findElements(GeneralXpathForAllCheckBoxes);
	    for(WebElement e:li)
	    {
			HighlightElement(wd, e);
			
			if(!e.isSelected())
			{
				e.click();
			}
	    }
	}
	
	public void click_onNextButton() throws InterruptedException
	{
		WebElement e0=wd.findElement(NextButton);
		HighlightElement(wd, e0);
		e0.click();
	}
	
	public void click_onConfirmButton() throws InterruptedException
	{
		WebElement e0=wd.findElement(TaskHeader_underConformationPage);
		HighlightElement(wd, e0);
		WebElement e1=wd.findElement(ConfirmButton_underConformationPage);
		HighlightElement(wd, e1);
		e1.click();
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onCheckAllButton();
		Thread.sleep(2000);
		this.click_onUncheckAllButton();
		Thread.sleep(2000);
		this.click_onCheckAllButton();
		Thread.sleep(2000);
		this.click_onCheckAllButton();
		this.click_onNextButton();
		Thread.sleep(3000);
		this.click_onConfirmButton();
		
	}
	
	
	
	

}
