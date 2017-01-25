package testCasePOM_ProjectPortfolioSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.ExcelR1;

public class Validate_archiveLink_underResultViewGrid_TC10 {
	
	By ProjectNameDD1=By.name("field1");
	By TypeDD1=By.name("type1");
	By FirstTextField=By.name("text1");
	By ProjectNameDD2=By.name("field2");
	By TypeDD2=By.name("type2");
	By SecondTextField=By.name("text2");
	By WithIn_AllReportTypeDD=By.name("siteType");
	By SubmitButton=By.name("btn1");
	
	By FirstProjectNameLink_underResultViewGrid=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr[3]/td/b/a");
	By FirstAccessLnk_underResultViewGrid=By.xpath("html/body/div//div/form/table/tbody/tr[3]/td[5]/a");
	By FirstDocumentLnk_underResultViewGrid=By.id("html/body/div//div/form/table/tbody/tr[3]/td[6]/a");
	By FirstArchiveLnk_underResultViewGrid= By.xpath("html/body/div//div/form/table/tbody/tr[3]/td[7]/a");
	By NextLnk_underResultViewGrid=By.xpath("html/body/div//div/form/table/tbody/tr[1]/th/a");
	
	By RestoreLnk_underResultViewGrid=By.xpath("html/body/div//div/form/table/tbody/tr[3]/td/a");
	
	By ProjectDashboard_pageHeader=By.xpath("html/body/div[2]/div//div/h3");
	By AccessManagementPageHeader=By.xpath("html/body/div/div//div/h3");
	By ProjectDocumentPageHeader=By.xpath("html/body/div/div//div/h3");
	By ProjectManagementPageHeader=By.xpath("html/body/div/div//div/h3");
	
	By GeneralXpathFirstValue_underResultViewGrid=By.xpath("html/body/div/div/div/div/div/div/form[2]/table/tbody/tr[3]/td");
	
	
	public WebDriver wd;
	public Actions ac;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_Project_Portfolio_Search\\src\\testData\\TestData1.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }


	
	public Validate_archiveLink_underResultViewGrid_TC10(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void click_onArchiveLink_underResultViewGrid() throws InterruptedException
	{
		WebElement e=wd.findElement(FirstArchiveLnk_underResultViewGrid);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(4000);
		
		String s0=wd.getTitle();
		System.out.println("Resultant redirected page title is: "+s0);
		
		WebElement e1=wd.findElement(ProjectManagementPageHeader);
		HighlightElement(wd, e1);
		String s1=wd.getTitle();
		System.out.println("Resultant page header is: "+s1);
		Thread.sleep(4000);
	}
	
	public void click_onResoreLink_underResultViewGrid() throws InterruptedException
	{
		WebElement e=wd.findElement(RestoreLnk_underResultViewGrid);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(4000);
		
		String s0=wd.getTitle();
		System.out.println("Resultant redirected page title is: "+s0);
		
		WebElement e1=wd.findElement(ProjectManagementPageHeader);
		HighlightElement(wd, e1);
		String s1=wd.getTitle();
		System.out.println("Resultant page header is: "+s1);
		Thread.sleep(4000);
	}
	
	public void resultViewGrid_observation_after() throws InterruptedException
	{
		List<WebElement> e1= wd.findElements(GeneralXpathFirstValue_underResultViewGrid);
		int counter=0;
	    for(WebElement e:e1)
	    {
			HighlightElement(wd, e);
			counter++;
			
			String s1=e.getText();
			System.out.println(s1 );
			if(counter==7)
			{
				break;
			}
	    }
	}
	
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onArchiveLink_underResultViewGrid();
		this.click_onResoreLink_underResultViewGrid();
		this.resultViewGrid_observation_after();
		
	}

}
