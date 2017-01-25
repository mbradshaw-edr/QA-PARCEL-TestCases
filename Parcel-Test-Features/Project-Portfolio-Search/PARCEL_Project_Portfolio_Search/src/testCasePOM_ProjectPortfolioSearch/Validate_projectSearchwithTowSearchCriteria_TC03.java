package testCasePOM_ProjectPortfolioSearch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_projectSearchwithTowSearchCriteria_TC03 {
	
	By ProjectNameDD1=By.name("field1");
	By TypeDD1=By.name("type1");
	By FirstTextField=By.name("text1");
	By ProjectNameDD2=By.name("field2");
	By TypeDD2=By.name("type2");
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


	
	public Validate_projectSearchwithTowSearchCriteria_TC03(WebDriver wd)
	{
		this.wd=wd;
	}
	
	
	public void searchWithTowSearchCriteria_usingBothFilter_FirstTime() throws InterruptedException
	{ 
		System.out.println("Search results after perforing 'Two Search Criteria' first time");
		WebElement e0=wd.findElement(ProjectNameDD1);
		HighlightElement(wd, e0);
		e0.click();
		Select s0=new Select(e0);
		s0.selectByVisibleText("Project Name");
		e0.click();
		Thread.sleep(2000);
		
		
		WebElement e1=wd.findElement(TypeDD1);
		HighlightElement(wd, e1);
		e1.click();
		Select s1=new Select(e1);
		s1.selectByVisibleText("Contains");
		e1.click();
		Thread.sleep(2000);
		
			WebElement e=wd.findElement(FirstTextField);
			e.clear();
			e.sendKeys(ExcelR1.getData("DataEntriesForTwoSearchCriteria",1,3));
			HighlightElement(wd, e);
			Thread.sleep(1000);
			
			
			
			WebElement e2=wd.findElement(ProjectNameDD2);
			HighlightElement(wd, e2);
			e2.click();
			Select s2=new Select(e2);
			s2.selectByVisibleText("Project Name");
			e2.click();
			Thread.sleep(2000);
			
			
			WebElement e3=wd.findElement(TypeDD2);
			HighlightElement(wd, e3);
			e3.click();
			Select s3=new Select(e3);
			s3.selectByVisibleText("Contains");
			e3.click();
			Thread.sleep(2000);
			
				WebElement e4=wd.findElement(SecondTextField);
				e4.clear();
				e4.sendKeys(ExcelR1.getData("DataEntriesForTwoSearchCriteria",1,6));
				HighlightElement(wd, e4);
				Thread.sleep(1000);
			
			WebElement e6=wd.findElement(SubmitButton);
			HighlightElement(wd, e6);
			e6.click();
			Thread.sleep(7000);
	}
	
	
	public void searchWithTowSearchCriteria_usingBothFilter_SecondTime() throws InterruptedException
	{ 
		System.out.println("Search results after perforing 'Two Search Criteria' second time");
		WebElement e0=wd.findElement(ProjectNameDD1);
		HighlightElement(wd, e0);
		e0.click();
		Select s0=new Select(e0);
		s0.selectByVisibleText("Site City");
		e0.click();
		Thread.sleep(2000);
		
		
		WebElement e1=wd.findElement(TypeDD1);
		HighlightElement(wd, e1);
		e1.click();
		Select s1=new Select(e1);
		s1.selectByVisibleText("Contains");
		e1.click();
		Thread.sleep(2000);
		
			WebElement e=wd.findElement(FirstTextField);
			e.clear();
			e.sendKeys(ExcelR1.getData("DataEntriesForTwoSearchCriteria",2,3));
			HighlightElement(wd, e);
			Thread.sleep(1000);
			
			
			
			WebElement e2=wd.findElement(ProjectNameDD2);
			HighlightElement(wd, e2);
			e2.click();
			Select s2=new Select(e2);
			s2.selectByVisibleText("Project Number");
			e2.click();
			Thread.sleep(2000);
			
			
			WebElement e3=wd.findElement(TypeDD2);
			HighlightElement(wd, e3);
			e3.click();
			Select s3=new Select(e3);
			s3.selectByVisibleText("Equals");
			e3.click();
			Thread.sleep(2000);
			
				WebElement e4=wd.findElement(SecondTextField);
				e4.clear();
				e4.sendKeys(ExcelR1.getData("DataEntriesForTwoSearchCriteria",2,6));
				HighlightElement(wd, e4);
				Thread.sleep(1000);
			
			WebElement e6=wd.findElement(SubmitButton);
			HighlightElement(wd, e6);
			e6.click();
			Thread.sleep(7000);
	}
	
	public void searchWithTowSearchCriteria_usingBothFilter_ThirdTime() throws InterruptedException
	{ 
		System.out.println("Search results after perforing 'Two Search Criteria' third time");
		WebElement e0=wd.findElement(ProjectNameDD1);
		HighlightElement(wd, e0);
		e0.click();
		Select s0=new Select(e0);
		s0.selectByVisibleText("Client Name");
		e0.click();
		Thread.sleep(2000);
		
		
		WebElement e1=wd.findElement(TypeDD1);
		HighlightElement(wd, e1);
		e1.click();
		Select s1=new Select(e1);
		s1.selectByVisibleText("Contains");
		e1.click();
		Thread.sleep(2000);
		
			WebElement e=wd.findElement(FirstTextField);
			e.clear();
			e.sendKeys(ExcelR1.getData("DataEntriesForTwoSearchCriteria",3,3));
			HighlightElement(wd, e);
			Thread.sleep(1000);
			
			
			
			WebElement e2=wd.findElement(ProjectNameDD2);
			HighlightElement(wd, e2);
			e2.click();
			Select s2=new Select(e2);
			s2.selectByVisibleText("Project Number");
			e2.click();
			Thread.sleep(2000);
			
			
			WebElement e3=wd.findElement(TypeDD2);
			HighlightElement(wd, e3);
			e3.click();
			Select s3=new Select(e3);
			s3.selectByVisibleText("Equals");
			e3.click();
			Thread.sleep(2000);
			
				WebElement e4=wd.findElement(SecondTextField);
				e4.clear();
				e4.sendKeys(ExcelR1.getData("DataEntriesForTwoSearchCriteria",3,6));
				HighlightElement(wd, e4);
				Thread.sleep(1000);
			
			WebElement e6=wd.findElement(SubmitButton);
			HighlightElement(wd, e6);
			e6.click();
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
	
	public void mainMethod() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.searchWithTowSearchCriteria_usingBothFilter_FirstTime();
		this.resultViewGrid_observation();
		this.searchWithTowSearchCriteria_usingBothFilter_SecondTime();
		this.resultViewGrid_observation();
		this.searchWithTowSearchCriteria_usingBothFilter_ThirdTime();
		this.resultViewGrid_observation();
	}

}
