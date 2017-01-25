package testCasePOM_ProjectPortfolioSearch;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_toolTipsDisplayed_underResultsDrid_TC06 {
	
	By ProjectNameDD1=By.name("field1");
	By TypeDD1=By.name("type1");
	By FirstTextField=By.name("text1");
	By ProjectNameDD2=By.name("field2");
	By TypeDD2=By.name("type2");
	By SecondTextField=By.name("text2");
	By WithIn_AllReportTypeDD=By.name("siteType");
	
	By GeneralXpathFirstValue_underResultViewGrid=By.xpath("html/body/div/div/div/div/div/div/form[2]/table/tbody/tr[3]/td");
	By SubmitButton=By.name("btn1");
	
	
	//By LogoutMenue=By.id("link_164");
	//By Logout= By.xpath(".//*[@id='SnehalPatilMenu']/li/ul/li[4]/a");
	
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


	
	public Validate_toolTipsDisplayed_underResultsDrid_TC06(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void searchWithTowSearchCriteria_orDoubleFilter_usingProjectName_andContains() throws InterruptedException
	{ 
		System.out.println("Search results after perforing 'One Search Criteria' by using wittIn_dropDown");
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
			e.clear();
			e.sendKeys(ExcelR1.getData("Data_forAddionalSearchCriteria",3,3));
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
				e4.sendKeys(ExcelR1.getData("Data_forAddionalSearchCriteria",9,6));
				HighlightElement(wd, e4);
				Thread.sleep(1000);
			
		
			
	}
	
	public void selectAllReportType_withInDDBox_thenClickedOnSubmitButton_thirdAttempt() throws InterruptedException
	{
		WebElement e1=wd.findElement(WithIn_AllReportTypeDD);
		HighlightElement(wd, e1);
		e1.click();
		Select s1=new Select(e1);
		s1.selectByVisibleText("All Report Types");
		Thread.sleep(1000);
		e1.click();
		
		WebElement e2=wd.findElement(SubmitButton);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(7000);
	}
	
	public void toolTipObservation_underSearchResultViewGrid() throws InterruptedException
	{ 
		ac=new Actions(wd);
    	List<WebElement> e1= wd.findElements(GeneralXpathFirstValue_underResultViewGrid);
    	for(WebElement e:e1)
	    {
    		String s=e.getAttribute("tooltip");
    		System.out.println(s);
    		 ac.moveToElement(e).perform();
 	    	Thread.sleep(2000);
 	    	  ac.moveByOffset(5,5).perform();
 	    	  
 	    	  Thread.sleep(2000);
 	    	  ac.release(e);
	    }
			
		
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.searchWithTowSearchCriteria_orDoubleFilter_usingProjectName_andContains();
		this.selectAllReportType_withInDDBox_thenClickedOnSubmitButton_thirdAttempt();
		this.toolTipObservation_underSearchResultViewGrid();
		
	}
	

}
