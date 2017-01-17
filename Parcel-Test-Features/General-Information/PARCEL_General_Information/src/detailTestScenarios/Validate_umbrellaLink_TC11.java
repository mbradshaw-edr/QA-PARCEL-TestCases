package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_umbrellaLink_TC11 {
	
	By UmbrellaLink=By.xpath("html/body/div//div/form/table/tbody/tr/td/a[2]");
	By UmbrellaPageHeader=By.className("general-panel-name");
	By AddCompanyButton=By.name("submitShowAddCompany");
	By CompanyNameDD=By.name("pcid"); // Visible Text: Test Consultant Company
	By FunctionDD=By.name("fid");
	By SubmitButton=By.name("submitAddCompany"); 
	By ListOfAllComponentsforperticullarRow=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr[6]/td");
	
	By ListOfAllThreeCompanyLinks=By.xpath("html/body/div//div/form/table/tbody/tr[9]/td/a");
	By AddContactLinkForMewlyAddedCompany=By.xpath("html/body/div//div/form/table/tbody/tr[10]/td/a[1]");
	By ContactNameDD=By.name("aid");
	By AddContactSubmitButton=By.name("submitAddContact");
	
	By DeleteContactLinkForNewlyAddedContact=By.xpath("html/body/div//div/form/table/tbody/tr[10]/td/a[2]");
	By DeleteCompanyLinkForNewlyAddedCompany=By.xpath("html/body/div//div/form/table/tbody/tr[10]/td/a[3]");
	
	
	
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	
	
	public static WebDriver wd;
	public static Set<String> s;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_umbrellaLink_TC11(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void addCompany() throws InterruptedException
	{
		WebElement e0=wd.findElement(UmbrellaLink);
		HighlightElement(wd, e0);
		e0.click();
		WebElement e4=wd.findElement(UmbrellaPageHeader);
		HighlightElement(wd, e4);
		String s=e4.getText();
		System.out.println("Page header is: "+s);
		
		WebElement e=wd.findElement(AddCompanyButton);
		HighlightElement(wd, e);
		e.click();
		
		WebElement e1=wd.findElement(CompanyNameDD);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(3000);
		Select s1=new Select(e1);
		s1.selectByVisibleText("Test Consultant Company");
		Thread.sleep(3000);
		e1.click();
		
		WebElement e2=wd.findElement(FunctionDD);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(3000);
		Select s2=new Select(e2);
		s2.selectByVisibleText("Appraisal");
		Thread.sleep(3000);
		e2.click();
		Thread.sleep(3000);
		
		WebElement e3=wd.findElement(SubmitButton);
		HighlightElement(wd, e3);
		e3.click();
	}
	
	
	public void observeAllLinksAndValidateFunctionalityRelatedToPerticullarUser() throws InterruptedException
	{
		List<WebElement> els = wd.findElements(ListOfAllComponentsforperticullarRow);
		for ( WebElement el : els ) {
			HighlightElement(wd, el);
			//String s=el.getText();
			//System.out.println(" : "+s);
			
		}
		
		WebElement e3=wd.findElement(AddContactLinkForMewlyAddedCompany);
		HighlightElement(wd, e3);
		e3.click();
		
		WebElement e2=wd.findElement(ContactNameDD);
		HighlightElement(wd, e2);
		e2.click();
		Select s2=new Select(e2);
		s2.selectByVisibleText("Test Consultant");
		e2.click();
		
		WebElement e=wd.findElement(AddContactLinkForMewlyAddedCompany);
		HighlightElement(wd, e);
		e.click();
	}
	
	
	public void deleteNewlyCreatedContact() throws InterruptedException
	{
		WebElement e3=wd.findElement(DeleteContactLinkForNewlyAddedContact);
		HighlightElement(wd, e3);
		e3.click();
		Thread.sleep(5000);
	}
	
	Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2 m2=new Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2(wd);
	public void deleteNewlyCreatedCompany() throws InterruptedException
	{
		WebElement e3=wd.findElement(DeleteCompanyLinkForNewlyAddedCompany);
		HighlightElement(wd, e3);
		e3.click();
		Thread.sleep(7000);
		wd.close();
		wd.switchTo().window(m2.parentWindow);
		
	}
	
	
	
	public void mainMetod() throws InterruptedException
	{
		this.addCompany();
		this.observeAllLinksAndValidateFunctionalityRelatedToPerticullarUser();
		this.deleteNewlyCreatedContact();
		this.deleteNewlyCreatedCompany();
	}

}
