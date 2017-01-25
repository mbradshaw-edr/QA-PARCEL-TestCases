package testCasePOM_ProjectPortfolioSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_documentLink_underResultViewGrid_TC09 {
	
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
	By FirstDocumentLnk_underResultViewGrid=By.xpath("html/body/div//div/form/table/tbody/tr[3]/td[6]/a");
	By FirstArchiveLnk_underResultViewGrid= By.xpath("html/body/div//div/form/table/tbody/tr[3]/td[7]/a");
	By NextLnk_underResultViewGrid=By.xpath("html/body/div//div/form/table/tbody/tr[1]/th/a");
	By RestoreLnk_underResultViewGrid=By.xpath("html/body/div//div/form/table/tbody/tr[3]/td/a");
	
	By ProjectDashboard_pageHeader=By.xpath("html/body/div[2]/div//div/h3");
	By AccessManagementPageHeader=By.xpath("html/body/div/div//div/h3");
	By ProjectDocumentPageHeader=By.xpath("html/body/div/div//div/h3");
	
	
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


	
	public Validate_documentLink_underResultViewGrid_TC09(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void searchWithTowSearchCriteria_orDoubleFilter_usingProjectName_andContains() throws InterruptedException
	{ 
		System.out.println("Search results after perforing 'Tow Search Criteria' by using wittIn_dropDown");
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
				
				WebElement e5=wd.findElement(SubmitButton);
				HighlightElement(wd, e5);
				e5.click();
				Thread.sleep(7000);
			
		
			
	}
	
	public void click_onDocumentLink_underResultViewGrid() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement e=wd.findElement(FirstDocumentLnk_underResultViewGrid);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(4000);
		
		String s0=wd.getTitle();
		System.out.println("Resultant redirected page title is: "+s0);
		
		WebElement e1=wd.findElement(ProjectDocumentPageHeader);
		HighlightElement(wd, e1);
		String s1=wd.getTitle();
		System.out.println("Resultant page header is: "+s1);
		wd.navigate().back();
		Thread.sleep(4000);
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.searchWithTowSearchCriteria_orDoubleFilter_usingProjectName_andContains();
		this.click_onDocumentLink_underResultViewGrid();
		
	}

}
