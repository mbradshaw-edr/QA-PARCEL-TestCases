package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_remainingPhase_EditPageUserChange_asDDsChanes_DDasAFiter_TC12 {
	
	By siteID=By.name("s");
	By GeneralInformationLinkOnTOCPage=By.xpath(".//*[@id='simplifiedtoc']/li[1]/a/span");
	By EditSignatureButton=By.xpath(".//*[@id='editLinkCS']/a");
	By hereLinkUnderEditSignature=By.xpath("html/body/div//div/form/table/tbody/tr[1]/td/div/a"); //.//*[@id='sigMsg_109535']/a
	
	By OrganizationDD=By.name("eid"); // Visible Text: Test Consultant Company
	By CompanyDD=By.name("cid");
	By OficeDD=By.name("oid"); 
	By UserDD=By.name("aid");
	By ListOfAllUserFieldsForEditOperation=By.xpath("html/body/div//div/form/table[1]/tbody/tr[1]/td/table/tbody/tr/td/input");
	
	By AddContactLinkForMewlyAddedCompany=By.xpath("html/body/div//div/form/table/tbody/tr[10]/td/a[1]");
	By ContactNameDD=By.name("aid");
	By AddContactSubmitButton=By.name("submitAddContact");
	
	By DeleteContactLinkForNewlyAddedContact=By.xpath("html/body/div//div/form/table/tbody/tr[10]/td/a[2]");
	By DeleteCompanyLinkForNewlyAddedCompany=By.xpath("html/body/div//div/form/table/tbody/tr[10]/td/a[3]");
	
	
	
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	
	
	public static WebDriver wd;
	public static Set<String> s;
	public static String ParentWndow;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_remainingPhase_EditPageUserChange_asDDsChanes_DDasAFiter_TC12(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void enterSiteID() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println(" *******Validation of 'Order Database Reports' button with 'PlaceSingleSiteProject' in 'General Info'******");
		WebElement e=wd.findElement(siteID);
		e.sendKeys(ExcelR1.getData("Site IDs",1,0));
		Thread.sleep(2000);
		e.sendKeys(Keys.ENTER);
		  Thread.sleep(10000);
	}
	
	public void click_onGILink() throws InterruptedException
	{
		ParentWndow=wd.getWindowHandle();
		WebElement e0=wd.findElement(GeneralInformationLinkOnTOCPage);
		HighlightElement(wd, e0);
		e0.click();
		
        s = wd.getWindowHandles();
             for (String handle1 : s) 
             {
              System.out.println(handle1);
              wd.switchTo().window(handle1);
	          }
             wd.manage().window().maximize();
             
             WebElement e1=wd.findElement(EditSignatureButton);
     		HighlightElement(wd, e1);
     		e1.click();
	}
	
	public void click_onHereLink() throws InterruptedException
	{
             
             WebElement e1=wd.findElement(hereLinkUnderEditSignature);
     		HighlightElement(wd, e1);
     		e1.click();
	}
	
	public void dDSelections() throws InterruptedException
	{
		WebElement e1=wd.findElement(OrganizationDD);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(3000);
		//Select s1=new Select(e1);
		//s1.selectByVisibleText("Test Consultant Company");
		//Thread.sleep(3000);
		e1.click();    
		
		WebElement e2=wd.findElement(CompanyDD);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(3000);
		Select s2=new Select(e2);
		//s2.selectByVisibleText("EDR Applications Development Group");
		//Thread.sleep(3000);
		e2.click(); 
		Thread.sleep(7000);
		
		WebElement e3=wd.findElement(OficeDD);
		HighlightElement(wd, e3);
		e3.click();
		//Thread.sleep(3000);
		//Select s3=new Select(e3);
		//s3.selectByVisibleText("Consultant Office");
		e3.click(); 
		Thread.sleep(7000);
		
		WebElement e4=wd.findElement(UserDD);
		HighlightElement(wd, e4);
		//e4.click();
		Select s4=new Select(e4);
		s4.selectByVisibleText("Deshmukh, Poonam");

	}
	
	public void dropdownSelectionAsAFilter() throws InterruptedException
	{
		WebElement e1=wd.findElement(OrganizationDD);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(3000);
		//Select s1=new Select(e1);
		//s1.selectByVisibleText("Test Consultant Company");
		//Thread.sleep(3000);
		e1.click();    
		
		WebElement e2=wd.findElement(CompanyDD);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(3000);
		Select s2=new Select(e2);
		s2.selectByVisibleText("EDR Applications Development Group");
		Thread.sleep(7000);
		
		WebElement e3=wd.findElement(OficeDD);
		HighlightElement(wd, e3);
		System.out.println("Went to Office DD");
		e3.click();
		System.out.println("Went to Office DD1");
		Select s3=new Select(e3);
		s3.selectByVisibleText("EDR Consultants");
		System.out.println("Went to Office DD2");
		
		wd.close();
		wd.switchTo().window(ParentWndow);
		

	}
	
	public void observationOfUsersFields() throws InterruptedException
	{
		List<WebElement> els = wd.findElements(ListOfAllUserFieldsForEditOperation);
		for ( WebElement el : els ) {
			HighlightElement(wd, el);
			String s=el.getAttribute("value");
			System.out.println(" : "+s);
		}
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.enterSiteID();
		this.click_onGILink();
		this.click_onHereLink();
		System.out.println("Available user information by default: ");
		this.observationOfUsersFields();
		this.dDSelections();
		System.out.println("Available user information when user selected as Poonam Deshmukh: ");
		this.observationOfUsersFields();
		this.dropdownSelectionAsAFilter();
		
	}

}
