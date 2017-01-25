package testCase_projectDashB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_addReportToThisProject_withSaveAndCancelButton_TC03 {
	
	By AddReportToThisProjectLink_underProjectDashboard=By.xpath("html/body/div//div/p/a[1]");
	By PaheHeader_underAddReportToThisProjectLink=By.xpath("html/body/div//div/form/h4");
	By GeneralXpathForFieldLebles_underAddReportToThisProjectLink=By.xpath("html/body/div//div/form/table/tbody/tr/td[1]");
	By GeneralXpathForButtons=By.xpath("html/body/div//div/form/center/input"); 
	By ReturnToProjectButton=By.xpath("html/body/div//div[1]/a");
	
	By PropertyTextField=By.name("referenceNumber");  
	By SiteNameTextField=By.name("name"); 
	By AddressTextField=By.name("address"); 
	By CountryDD=By.name("country"); 
	By CityTextField=By.name("city"); 
	By StateDD=By.name("state"); 
	By ZipTextField=By.name("zip"); 
	By LatitudeTextField=By.name("lat"); 
	By longitudeTextField=By.name("long"); 
	By ContactTextField=By.name("contact"); 
	By PhoneTextField=By.name("phone"); 
	By FaxTextField=By.name("fax"); 
	By EmailTextField=By.name("email"); 
	By ReportTypeDDSelected=By.xpath("html/body/div//div/form/table/tbody/tr[12]/td/select/option[2]");
	By PropertyTypeDD=By.name("propertyType"); 
	By TreansactionTypeDD=By.name("transactionType"); 
	By AccessTypeDD=By.name("accessType");
	By SaveButtonUnderAddReportToThisProject=By.name("siteAddSubmit");
	By CancelButtonUnderAddReportToThisProject=By.name("siteAddCancel");
	
	By ProjectDashboardPageHeader=By.xpath("/html/body/div[2]/div/div/div/div/div/h3");
	
	
	
	//By LogoutMenue=By.id("link_164");
	//By Logout= By.xpath(".//*[@id='SnehalPatilMenu']/li/ul/li[4]/a");
	
	public WebDriver wd;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
    
    public void windowScroll()
	{
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("window.scrollBy(0,40)", "");
	}


	
	public Validate_addReportToThisProject_withSaveAndCancelButton_TC03(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	/* Method for setting valid data for user name field */
	public void click_onAddToThisProjectLink_underProjectDashboardPage() throws InterruptedException
	{
		Thread.sleep(8000);
		WebElement e=wd.findElement(AddReportToThisProjectLink_underProjectDashboard);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(3000);
		
		WebElement e0=wd.findElement(PaheHeader_underAddReportToThisProjectLink);
		HighlightElement(wd, e0);
		String s=e0.getText();
		System.out.println("Header of this page: "+s);
		
	}
	
	public void verify_availableFieldLebles_andBuutonsUnderAddProjectToThisLink() throws InterruptedException
	{
		 List<WebElement> li= wd.findElements(GeneralXpathForFieldLebles_underAddReportToThisProjectLink);
		    for(WebElement e:li)
		    {
		    	windowScroll();
				HighlightElement(wd, e);
				String s=e.getText();
				System.out.println(s);
				
		    }
		    
		    List<WebElement> li1= wd.findElements(GeneralXpathForButtons);
		    for(WebElement e1:li1)
		    {
		    	windowScroll();
				HighlightElement(wd, e1);
				String s1=e1.getText();
				System.out.println(s1);
				
		    }
		
	}
	
	/* Method for setting (or entering) valid input data for inside the fields under "Add Report To This Project and 
	 * validate 'Cancel' button functionality"  */
	public void enteringTestDataInTextFields_withCancelButton() throws InterruptedException
	{
		WebElement e=wd.findElement(PropertyTextField);
		e.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,1));
		HighlightElement(wd, e);
		Thread.sleep(1000);
		
		WebElement e1=wd.findElement(SiteNameTextField);
		e1.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,2));
		HighlightElement(wd, e1);
		Thread.sleep(1000);
		
		WebElement e2=wd.findElement(AddressTextField);
		e2.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,3));
		HighlightElement(wd, e2);
		Thread.sleep(1000);
		
		WebElement e3=wd.findElement(CountryDD);
		HighlightElement(wd, e3);
		e3.click();
		Thread.sleep(3000);
		e3.click();
		
		WebElement e4=wd.findElement(CityTextField);
		e4.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,4));
		HighlightElement(wd, e4);
		Thread.sleep(1000);
		//
		WebElement e5=wd.findElement(StateDD);
		HighlightElement(wd, e5);
		e5.click();
		Select ss1=new Select(e5);
		ss1.selectByVisibleText("Texas");
		e5.click();
		
		WebElement e6=wd.findElement(ZipTextField);
		e6.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,5));
		HighlightElement(wd, e6);
		Thread.sleep(1000);
		
		WebElement e7=wd.findElement(LatitudeTextField);
		e7.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,6));
		HighlightElement(wd, e7);
		Thread.sleep(1000);
		
		WebElement e8=wd.findElement(longitudeTextField);
		e8.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,7));
		HighlightElement(wd, e8);
		Thread.sleep(1000);
		
		WebElement e9=wd.findElement(ContactTextField);
		e9.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,8));
		HighlightElement(wd, e9);
		Thread.sleep(1000);
		
		WebElement e10=wd.findElement(PhoneTextField);
		windowScroll();
		e10.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,9));
		HighlightElement(wd, e10);
		Thread.sleep(1000);
		
		WebElement e11=wd.findElement(FaxTextField);
		windowScroll();
		e11.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,10));
		HighlightElement(wd, e11);
		Thread.sleep(1000);
		
		WebElement e12=wd.findElement(EmailTextField);
		windowScroll();
		e12.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,11));
		HighlightElement(wd, e12);
		Thread.sleep(1000);
		
		WebElement e13=wd.findElement(ReportTypeDDSelected);
		windowScroll();
		HighlightElement(wd, e13);
		e13.click();
		Thread.sleep(1000);
		
		WebElement e14=wd.findElement(PropertyTypeDD);
		windowScroll();
		HighlightElement(wd, e14);
		e14.click();
		Select ss3=new Select(e14);
		ss3.selectByVisibleText("Automotive");
		e14.click();
		Thread.sleep(2000);
		
		WebElement e15=wd.findElement(TreansactionTypeDD);
		windowScroll();
		HighlightElement(wd, e15);
		e15.click();
		Select ss4=new Select(e15);
		ss4.selectByVisibleText("Origination");
		e15.click();
		Thread.sleep(1000);
		
		WebElement e16=wd.findElement(AccessTypeDD);
		windowScroll();
		HighlightElement(wd, e16);
		e16.click();
		Thread.sleep(1000);
		e16.click();
		
		WebElement e17=wd.findElement(CancelButtonUnderAddReportToThisProject);
		windowScroll();
		HighlightElement(wd, e17);
		e17.click();
		Thread.sleep(1000);
	}
	
	/* Method for setting (or entering) valid input data for inside the fields under "Add Report To This Project"
	 * and validate 'Save' button  */
	public void enteringTestDataInTextFields_withSaveButton() throws InterruptedException
	{
		WebElement e=wd.findElement(PropertyTextField);
		e.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,1));
		HighlightElement(wd, e);
		Thread.sleep(1000);
		
		WebElement e1=wd.findElement(SiteNameTextField);
		e1.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,2));
		HighlightElement(wd, e1);
		Thread.sleep(1000);
		
		WebElement e2=wd.findElement(AddressTextField);
		e2.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,3));
		HighlightElement(wd, e2);
		Thread.sleep(1000);
		
		WebElement e3=wd.findElement(CountryDD);
		HighlightElement(wd, e3);
		e3.click();
		Thread.sleep(1000);
		e3.click();
		
		WebElement e4=wd.findElement(CityTextField);
		e4.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,4));
		HighlightElement(wd, e4);
		Thread.sleep(1000);
		//
		WebElement e5=wd.findElement(StateDD);
		HighlightElement(wd, e5);
		e5.click();
		Select ss1=new Select(e5);
		ss1.selectByVisibleText("Texas");
		e5.click();
		Thread.sleep(1000);
		
		WebElement e6=wd.findElement(ZipTextField);
		e6.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,5));
		HighlightElement(wd, e6);
		Thread.sleep(1000);
		
		WebElement e7=wd.findElement(LatitudeTextField);
		e7.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,6));
		HighlightElement(wd, e7);
		Thread.sleep(1000);
		
		WebElement e8=wd.findElement(longitudeTextField);
		e8.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,7));
		HighlightElement(wd, e8);
		Thread.sleep(1000);
		
		WebElement e9=wd.findElement(ContactTextField);
		e9.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,8));
		HighlightElement(wd, e9);
		Thread.sleep(1000);
		
		WebElement e10=wd.findElement(PhoneTextField);
		e10.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,9));
		HighlightElement(wd, e10);
		Thread.sleep(1000);
		
		WebElement e11=wd.findElement(FaxTextField);
		windowScroll();
		e11.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,10));
		HighlightElement(wd, e11);
		Thread.sleep(1000);
		
		WebElement e12=wd.findElement(EmailTextField);
		windowScroll();
		e12.sendKeys(ExcelR1.getData("Data for AddReportToThisProject",1,11));
		HighlightElement(wd, e12);
		Thread.sleep(1000);
		
		WebElement e13=wd.findElement(ReportTypeDDSelected);
		HighlightElement(wd, e13);
		e13.click();
		Thread.sleep(1000);
		
		WebElement e14=wd.findElement(PropertyTypeDD);
		windowScroll();
		HighlightElement(wd, e14);
		e14.click();
		Select ss3=new Select(e14);
		ss3.selectByVisibleText("Automotive");
		e14.click();
		Thread.sleep(1000);
		
		WebElement e15=wd.findElement(TreansactionTypeDD);
		HighlightElement(wd, e15);
		e15.click();
		Select ss4=new Select(e15);
		ss4.selectByVisibleText("Origination");
		e15.click();
		Thread.sleep(1000);
		
		WebElement e16=wd.findElement(AccessTypeDD);
		windowScroll();
		HighlightElement(wd, e16);
		e16.click();
		Thread.sleep(1000);
		e16.click();
		
		WebElement e17=wd.findElement(SaveButtonUnderAddReportToThisProject);
		HighlightElement(wd, e17);
		e17.click();
		Thread.sleep(1000);
		windowScroll();
		
	    Thread.sleep(4000);
		WebElement e0=wd.findElement(ProjectDashboardPageHeader);
		HighlightElement(wd, e0);
		String s=e0.getText();
		System.out.println("Header of this page: "+s);
		
		
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onAddToThisProjectLink_underProjectDashboardPage();
		this.verify_availableFieldLebles_andBuutonsUnderAddProjectToThisLink();
		this.enteringTestDataInTextFields_withCancelButton();
		this.click_onAddToThisProjectLink_underProjectDashboardPage();
		this.enteringTestDataInTextFields_withSaveButton();
		
	}

}
