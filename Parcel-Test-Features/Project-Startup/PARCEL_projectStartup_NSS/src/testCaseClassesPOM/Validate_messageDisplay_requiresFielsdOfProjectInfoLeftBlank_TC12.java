package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_messageDisplay_requiresFielsdOfProjectInfoLeftBlank_TC12 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	
	By ProjectInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[1]/tbody/tr/td/b");
	//By MessageProjectNameLeftBlank=By.xpath(".//*[@id='divProject']/div[1]");
	//By MessageProjectNameLeftBlank=By.xpath(".//*[@id='divProject']/div[1]");
	By GeneralXpathMessageProjectNameLeftBlank=By.xpath(".//*[@id='divProject']/div");
	
	By PropertyName=By.name("prop_name");
	By AddressField=By.id("prop_address1");
	By City=By.id("prop_city");
	By CountryDropDown=By.id("prop_country");
	By StateDropdown=By.id("prop_state");
	By Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox=By.xpath("//*[@value='PhaseI.2149']");
	By Project_ID=By.xpath("//*[@id='divFeePhaseI.2149']/input[2]");
	By SubmitButton=By.name("submitExpress");
	

    public WebDriver wd;
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
	public Validate_messageDisplay_requiresFielsdOfProjectInfoLeftBlank_TC12(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_NewSingleSiteProject() throws InterruptedException
	{
		System.out.println("*** Validate that message is displayed, when   required fields of 'Project Information' section is left blank. ***");
		System.out.println("When user created a project with  blank ProjectName fields, then following message displayed--");
		WebElement e1=wd.findElement(HomeButton);
		HighlightElement(wd, e1);
		e1.click();
		WebElement e2=wd.findElement(NSSP);
		HighlightElement(wd, e2);
		e2.click();
		
	}
	
	public void set_PropertyName(String pname) throws InterruptedException
	{
		WebElement e1=wd.findElement(PropertyName);
		HighlightElement(wd, e1);
		e1.sendKeys(pname);
	}
	public void set_prop_AddressField(String Address) throws InterruptedException
	{
		WebElement e1=wd.findElement(AddressField);
		HighlightElement(wd, e1);
		e1.sendKeys(Address);
	}
	public void set_City(String city) throws InterruptedException
	{
		WebElement e1=wd.findElement(City);
		HighlightElement(wd, e1);
		e1.sendKeys(city);
	}
	public void set_CountryDropDown() throws InterruptedException
	{
		WebElement e1=wd.findElement(CountryDropDown);
		HighlightElement(wd, e1);
		Select s=new Select(e1);
		s.selectByValue("US");
	}
	public void set_StateDropdown() throws InterruptedException
	{
		WebElement e1=wd.findElement(StateDropdown);
		HighlightElement(wd, e1);
		Select s=new Select(e1);
		s.selectByValue("TX");
	}
	public void click_Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox() throws InterruptedException
	{
		WebElement e1=wd.findElement(Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox);
		HighlightElement(wd, e1);
		e1.click();
	}
	public void set_Project_ID(String ProId) throws InterruptedException 
	{
		WebElement e1=wd.findElement(Project_ID);
		HighlightElement(wd, e1);
		e1.sendKeys(ProId);
		
	}
	public void click_SubmitButton() throws InterruptedException
	{
		WebElement e1=wd.findElement(SubmitButton);
		HighlightElement(wd, e1);
		e1.click();
	}
	public void messagesObservationWhenProjectInfoFieldsLeftBlank() throws InterruptedException
	{
		List<WebElement> l=wd.findElements(By.xpath(".//*[@id='divProject']/div"));
		for(WebElement e1:l)
		{ 
			HighlightElement(wd, e1);
			String s=e1.getText();
			System.out.println(" : "+s);
		}
	}
	
	public void mainMethod(String pname,String Address, String city, String ProId) throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_NewSingleSiteProject();
		this.set_PropertyName(pname);
		this.set_prop_AddressField(Address);
		this.set_City(city);
		this.set_CountryDropDown();
		this.set_StateDropdown();
		this.click_Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox();
		this.set_Project_ID(ProId);
		this.click_SubmitButton();
		this.messagesObservationWhenProjectInfoFieldsLeftBlank();
	}
	

}
