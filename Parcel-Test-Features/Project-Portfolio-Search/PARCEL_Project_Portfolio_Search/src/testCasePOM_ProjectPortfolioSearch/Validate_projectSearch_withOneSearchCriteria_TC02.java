package testCasePOM_ProjectPortfolioSearch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_projectSearch_withOneSearchCriteria_TC02 {
	
	By ProjectNameDD1=By.name("field1");
	By TypeDD1=By.name("type1");
	By FirstTextField=By.name("text1");
	By ProjectNameDD2=By.name("field2");
	By TypeDD2=By.name("type1");
	By SecondTextField=By.name("text2");
	By AllReportTypeDD=By.name("siteType");
	
	By GeneralXpathFirstValue_underResultViewGrid=By.xpath("html/body/div/div/div/div/div/div/form[2]/table/tbody/tr[3]/td");
	By SubmitButton=By.name("btn1");
	
	
	//By LogoutMenue=By.id("link_164");
	//By Logout= By.xpath(".//*[@id='SnehalPatilMenu']/li/ul/li[4]/a");
	
	public WebDriver wd;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_Project_Portfolio_Search\\src\\testData\\TestData1.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }


	
	public Validate_projectSearch_withOneSearchCriteria_TC02(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void searchWithOneSearchCriteria_usingProjectName_andContains() throws InterruptedException
	{ System.out.println("Search results after perforing 'One Search Criteria' by uding ProjectName and Contains option");
		WebElement e0=wd.findElement(ProjectNameDD1);
		HighlightElement(wd, e0);
		e0.click();
		Select s0=new Select(e0);
		s0.selectByVisibleText("Project Name");
		e0.click();
		
		
		WebElement e1=wd.findElement(TypeDD1);
		HighlightElement(wd, e1);
		e1.click();
		Select s1=new Select(e1);
		s1.selectByVisibleText("Contains");
		e1.click();
		
			WebElement e=wd.findElement(FirstTextField);
			e.sendKeys(ExcelR1.getData("DataEntries ForOneSearchCriteri",1,3));
			HighlightElement(wd, e);
			Thread.sleep(1000);
			
			WebElement e2=wd.findElement(SubmitButton);
			HighlightElement(wd, e2);
			e2.click();
			Thread.sleep(7000);
	}
	
	public void resultViewGrid_observation() throws InterruptedException
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
	
	public void searchWithOneSearchCriteria_usingProjectNumber_andEquals() throws InterruptedException
	{
		System.out.println("Search results after perforing second time 'One Search Criteria' by using ProjectNumber and Equals option");
		WebElement e0=wd.findElement(ProjectNameDD1);
		HighlightElement(wd, e0);
		e0.click();
		Select s0=new Select(e0);
		s0.selectByVisibleText("Project Number");
		e0.click();
		
		
		WebElement e1=wd.findElement(TypeDD1);
		HighlightElement(wd, e1);
		e1.click();
		Select s1=new Select(e1);
		s1.selectByVisibleText("Equals");
		e1.click();
		
			WebElement e=wd.findElement(FirstTextField);
			e.clear();
			e.sendKeys(ExcelR1.getData("DataEntries ForOneSearchCriteri",2,3));
			HighlightElement(wd, e);
			Thread.sleep(1000);
			
			WebElement e2=wd.findElement(SubmitButton);
			HighlightElement(wd, e2);
			e2.click();
			Thread.sleep(7000);
	}
	
	public void searchWithOneSearchCriteria_usingProjectNumber_andEqualsAgain() throws InterruptedException
	{
		System.out.println("Search results after perforing third times 'One Search Criteria' by uding ProjectName and Equals option");
		WebElement e0=wd.findElement(ProjectNameDD1);
		HighlightElement(wd, e0);
		e0.click();
		Select s0=new Select(e0);
		s0.selectByVisibleText("Project Number");
		e0.click();
		
		
		WebElement e1=wd.findElement(TypeDD1);
		HighlightElement(wd, e1);
		e1.click();
		Select s1=new Select(e1);
		s1.selectByVisibleText("Equals");
		e1.click();
		
			WebElement e=wd.findElement(FirstTextField);
			e.clear();
			e.sendKeys(ExcelR1.getData("DataEntries ForOneSearchCriteri",3,3));
			HighlightElement(wd, e);
			Thread.sleep(1000);
			
			WebElement e2=wd.findElement(SubmitButton);
			HighlightElement(wd, e2);
			e2.click();
			Thread.sleep(7000);
	}
	
	public void mainMethod() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.searchWithOneSearchCriteria_usingProjectName_andContains();
		this.resultViewGrid_observation();
		this.searchWithOneSearchCriteria_usingProjectNumber_andEquals();
		this.resultViewGrid_observation();
		this.searchWithOneSearchCriteria_usingProjectNumber_andEqualsAgain();
		this.resultViewGrid_observation();
	}

}
