package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_hereLink_availabilityOfFunctionalityUnderThisLink_TC08 {
	
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
	public String parent1Window;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_hereLink_availabilityOfFunctionalityUnderThisLink_TC08(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_onHerLInk() throws InterruptedException
	{
		WebElement e=wd.findElement(HereLinkForSiteAssessor);
		HighlightElement(wd, e);
		e.click();
		
		WebElement e1=wd.findElement(PageHeader);
		HighlightElement(wd, e1);
		String s=e1.getText();
		System.out.println("Page header is: "+s);
	}
	
	public void click_onSearchLInk() throws InterruptedException
	{
		WebElement e=wd.findElement(SearchLinkOnEditUser);
		HighlightElement(wd, e);
		e.click();
		
		WebElement e1=wd.findElement(SearchPageHeader);
		HighlightElement(wd, e1);
		e1.click();
		
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
	
	public void observedusersList() throws InterruptedException
	{
		List<WebElement> e1= wd.findElements(ListOfUsers);
		int counter=0;
	    for(WebElement e:e1)
	    {
			HighlightElement(wd, e);
			counter++;
			
			String s1=e.getText();
			System.out.println(s1 );
			if(counter==10)
			{
				break;
			}
	    }
	}
	
	public void click_onAddUser() throws InterruptedException
	{
		
		WebElement e=wd.findElement(AddUserButton);
		HighlightElement(wd, e);
		e.click();
		
		WebElement e1=wd.findElement(CreatingAccountPageHeader);
		HighlightElement(wd, e1);
		String s=e1.getText();
		System.out.println("Page header is: "+s);
		
		List<WebElement> e5= wd.findElements(abailabilityOfAllFields);
	    for(WebElement e10:e5)
	    {
			HighlightElement(wd, e10);
			String s1=e10.getText();
			System.out.println(s1 );
	    }
	    
	    WebElement e3=wd.findElement(EmailTextField);
		HighlightElement(wd, e3);
		e3.sendKeys(ExcelR1.getData("Data for creatite or add a user",1,1));
		WebElement e4=wd.findElement(FirstNameTextField);
		HighlightElement(wd, e4);
		e4.sendKeys(ExcelR1.getData("Data for creatite or add a user",1,2));
		WebElement e6=wd.findElement(MiddNameTextField);
		HighlightElement(wd, e6);
		e6.sendKeys(ExcelR1.getData("Data for creatite or add a user",1,3));
		
		WebElement e7=wd.findElement(DefaultAccessLevelDD);
		HighlightElement(wd, e7);
		e7.click();
		Select s2=new Select(e7);
		s2.selectByVisibleText("Field Staff");
		e7.click();
		
		WebElement e8=wd.findElement(LastNameTextField);
		HighlightElement(wd, e8);
		e8.sendKeys(ExcelR1.getData("Data for creatite or add a user",1,4));
		
		WebElement e9=wd.findElement(SubmitButton);
		HighlightElement(wd, e9);
		e9.click();
        
	}
	
	//again call the search function to sear newly created user
	
	public void mactchingWithNewlyCreatedUser() throws InterruptedException
	{
		
		String s=ExcelR1.getData("Data for creatite or add a user",1,4);
		System.out.println(s);
		
		try{
			
		List<WebElement> l= wd.findElements(ListOfUsers);
	    for(WebElement w:l)
	    {
			
			String s1=w.getText();
			//System.out.println(s1 );
			Thread.sleep(5000);
			if(s1.contains(s))
			{
				HighlightElement(wd, w);
				//System.out.println(s);
				w.click();
				
				Thread.sleep(3000);
				break;
			}
			
	    }
		}
		catch(Exception e)
		{
			e.printStackTrace(System.out);
		}
	}
	
	
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onHerLInk();
		this.click_onSearchLInk();
		this.click_onSearchedResult();
		this.observedusersList();
		this.click_onAddUser();
		this.mactchingWithNewlyCreatedUser();
	}
	
	

}
