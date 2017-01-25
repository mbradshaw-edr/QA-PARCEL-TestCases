package detailTestScenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class GoToAmbrellaLink_againForValidatigNextFunctionality_TC001 {
	
	By GILink=By.xpath(".//*[@id='simplifiedtoc']/li[1]/a/span");
	By EditSignaturesButton=By.xpath(".//*[@id='editLinkCS']/a");
	By HereLinkForSiteAssessor=By.xpath("html/body//form/table/tbody/tr[7]/td/div/a");
	By PageHeader=By.xpath("html/body/div/div/div/div/div/div/h3");
	By SearchLinkOnEditUser=By.xpath("html/body/div[2]/div/div/div/div/div/form[1]/table[1]/tbody/tr/td/a");
	By SearchPageHeader=By.xpath("html/body/div[2]/div/div/div/div/div/h3");
	By SearcehPageDD1=By.name("searchType");  //Select By Visible text: Companies
	By SerchPAgeTextBox=By.id("searchString");
	By SearchButton=By.name("search");
	By SearchResultantLink=By.xpath("html/body/div/div/div/div/div/div/form/table[2]/tbody/tr/td/a");
	By OficeDD=By.name("oid");       // SelectByVisibleText: EDR Consultants
	By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	By AddUserButton=By.name("new");
	By CreatingAccountPageHeader=By.xpath("html/body/div/div/div/div/div/div/h3");
	By abailabilityOfAllFields=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td/table/tbody/tr/th");
	By EmailTextField=By.name("email");
	By FirstNameTextField=By.name("first");
	By DefaultAccessLevelDD=By.name("role"); //Select by visible text: Corporate User
	By MiddNameTextField=By.name("mi");
	By LastNameTextField=By.name("last");
	By SubmitButton=By.name("addAccount");
	By CancelButton=By.name("cancel");
	
	
	By EditButton=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td/div/a[1]");
	By DeleteButton=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td/div/a[2]");
	
	By ListOfEmails=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[2]");
	
	By AppraisalLicence=By.xpath(".//*[@id='licenses']/div/span");
	By LicenceIDTextField=By.name("license");
	By StateDD=By.xpath(".//*[@id='licensecreate']/p[2]/select");// Select by visible text: Texas
	By LicenceExpiration=By.xpath("html/body/div[1]/div[4]/form[1]/p[3]/input"); //for click only
	By SelectADate=By.xpath("html/body/div/table/tbody/tr[6]/td[2]/a");
	By BrowsButton=By.xpath(".//*[@id='licensecreate']/p[4]/input");
	//Then click Enter keey
	By CreatLisenceButton=By.xpath(".//*[@id='licensecreate']/p[5]/input");
	By CloseLisenceCreationPopup=By.xpath(".//*[@id='sb-nav-close']");   // This delete has one user
	
	
	
	public static WebDriver wd;
	public static Set<String> s;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public GoToAmbrellaLink_againForValidatigNextFunctionality_TC001(WebDriver wd)
	{
		this.wd=wd;
	}
	

	public void click_onEditSignatureButton() throws InterruptedException
	{
		wd.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e=wd.findElement(EditSignaturesButton);
		HighlightElement(wd, e);
		String s1=e.getText();
		System.out.println(" : "+s1 );
		e.click();
	}

public void click_onHerLInk() throws InterruptedException
	{
		WebElement e=wd.findElement(HereLinkForSiteAssessor);
		HighlightElement(wd, e);
		e.click();
		
	}

public void click_onSearchLInk() throws InterruptedException
	{
		WebElement e=wd.findElement(SearchLinkOnEditUser);
		HighlightElement(wd, e);
		e.click();

            WebElement e2=wd.findElement(SearcehPageDD1);
		HighlightElement(wd, e2);
		e2.click();
		Select s=new Select(e2);
		s.selectByVisibleText("Companies");
		e2.click();
		
		WebElement e3=wd.findElement(SerchPAgeTextBox);
		HighlightElement(wd, e3);
		e3.sendKeys(ExcelR1.getData("Search data under_SearchLink ",1,1));
		
		WebElement e4=wd.findElement(SearchButton);
		HighlightElement(wd, e4);
		e4.click();
}

public void click_onSearchedResult() throws InterruptedException
	{
		WebElement e=wd.findElement(SearchResultantLink);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(10000);
		
		WebElement e2=wd.findElement(OficeDD);
		HighlightElement(wd, e2);
		Select s=new Select(e2);
		s.selectByVisibleText("EDR Consultants");
		Thread.sleep(10000);
	}

public void click_onGILInk() throws InterruptedException
{
	WebElement e=wd.findElement(GILink);
	HighlightElement(wd, e);
	e.click();
	
}




Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2 m3=new Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2(wd);
public void mainMetod() throws InterruptedException
{
	Thread.sleep(5000);
	wd.close();
	wd.switchTo().window(m3.parentWindow);
	this.click_onGILInk();
	
	s = wd.getWindowHandles();                                                    // code for switching in to parent window and and again opene a new child window
    for (String handle1 : s) 
    {
     System.out.println(handle1);
     wd.switchTo().window(handle1);
     }
    
	this.click_onEditSignatureButton();
	this.click_onHerLInk();
	this.click_onSearchLInk();
	this.click_onSearchedResult();
}


}
