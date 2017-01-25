package testCasePOM_ProjectPortfolioSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_NextLink_underResultViewGrid_TC11 {
	
	By ProjectNameDD1=By.name("field1");
	By TypeDD1=By.name("type1");
	By FirstTextField=By.name("text1");
	By ProjectNameDD2=By.name("field2");
	By TypeDD2=By.name("type2");
	By SecondTextField=By.name("text2");
	By WithIn_AllReportTypeDD=By.name("siteType");
	
	By NextLink=By.xpath("html/body/div//div/form/table/tbody/tr[1]/th/a");
	By ProjectNumbersAvailabilityStatus=By.xpath("html/body/div//div/form/table/tbody/tr[1]/th[2]");
	By PreviousLink=By.xpath("html/body/div//div/form/table/tbody/tr[1]/th/a");
	
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


	
	public Validate_NextLink_underResultViewGrid_TC11(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void click_onNextLink() throws InterruptedException
	{
		
		WebElement e1=wd.findElement(NextLink);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(4000);
	}
	
	public void click_onPreviousLink() throws InterruptedException
	{
		
		WebElement e1=wd.findElement(PreviousLink);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(4000);
	}
	
	public void resultViewGrid_observation() throws InterruptedException
	{
		WebElement e0=wd.findElement(ProjectNumbersAvailabilityStatus);
		HighlightElement(wd, e0);
		String s=e0.getText();
		System.out.println("Projects status is: "+s);
		
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
		this.resultViewGrid_observation();
		this.click_onNextLink();
		this.resultViewGrid_observation();
		this.click_onPreviousLink();
		this.resultViewGrid_observation();
		
	}

}
