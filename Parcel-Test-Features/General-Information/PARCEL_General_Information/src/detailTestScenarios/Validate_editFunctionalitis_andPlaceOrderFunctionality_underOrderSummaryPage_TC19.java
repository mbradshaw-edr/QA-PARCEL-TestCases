package detailTestScenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_editFunctionalitis_andPlaceOrderFunctionality_underOrderSummaryPage_TC19 {
	
	By GeneralXpathForColumnHeader=By.xpath(".//*[@id='pvw_prodspnl']/div[2]/div"); 
	//By TargetProperty1EditButton=By.name(".//*[@id='pvw_prodstitle']/div/img");
	//By DeliveryInformationEditButton=By.xpath(".//*[@id='ctl00_cphBody__DeliveryInformation_DVGDI_CTR']/div/img");
	
	By TargetProperty=By.xpath(".//*[@id='pvw_title']/img");
	By TargetProperty1EditButton=By.xpath(".//*[@id='pvw_prodstitle']/div/img");
	
	By DeliveryInformation=By.xpath(".//*[@id='ctl00_cphBody__DeliveryInformation_DVGDI']/div[1]/img");
	By DeliveryInformationEditButton=By.xpath(".//*[@id='ctl00_cphBody__DeliveryInformation_DVGDI_CTR']/div/img");
	
	By OrderPlacedButton=By.xpath(".//*[@id='ctl00_cphBody__SubmitOrder']");
	
	
	
	By ContinueButton_onEDRPackagePage=By.id("SECT_7526_HDR_SCB");
	By ContinueButton_onCityDirectoryServices=By.id("_CompleteSession");
	By ContinueButton_onProjectInfoPage=By.id("ctl00_ctl00_cphBody_cphMainContent_btnContinue");
	
	
	By CommentTextBox_=By.xpath("html/body/form/div//div/div/textarea");
	By Commercial_OfficeRadioButton=By.xpath("html/body/form/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/input");
	By EmailAddress2_TextBox=By.xpath("html/body/form/div//div[7]/div/div/input");
	By ContinueButton_underTheWebOrderingPropertyInformation=By.xpath(".//*[@id='ctl00_ctl00_cphBody_cphMainContent_btnContinue']");
	
	
	
	
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	
	
	public static WebDriver wd;
	public static String SubParentWndow;
	public static String SubParent1Wndow;
	public static Set<String> s;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_editFunctionalitis_andPlaceOrderFunctionality_underOrderSummaryPage_TC19(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void click_onTargetPropertyEditButton() throws InterruptedException
	{
		String s0=wd.getTitle();
		System.out.println("Page Title is: "+s0);
		
		WebElement e=wd.findElement(DeliveryInformation);
		HighlightElement(wd, e);
		
		WebElement e1=wd.findElement(TargetProperty1EditButton);
		HighlightElement(wd, e1);
		
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(40000);
		
		WebElement e2=wd.findElement(ContinueButton_onEDRPackagePage);
		HighlightElement(wd, e2);
		e2.click();
		Thread.sleep(10000);
		
		WebElement e3=wd.findElement(ContinueButton_onCityDirectoryServices);
		HighlightElement(wd, e3);
		e3.click();
		Thread.sleep(10000);
		
		WebElement e4=wd.findElement(ContinueButton_onProjectInfoPage);
		HighlightElement(wd, e4);
		e4.click();
		
	
	}
	
	
		
	
	
	
	public void click_onDeliveryInformationEditButton() throws InterruptedException
	{
		WebElement e=wd.findElement(TargetProperty);
		HighlightElement(wd, e);
		
		WebElement e1=wd.findElement(DeliveryInformationEditButton);
		HighlightElement(wd, e1);
		
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(40000);
		
		WebElement e4=wd.findElement(ContinueButton_onProjectInfoPage);
		HighlightElement(wd, e4);
		e4.click();
		
	
	}
	
	public void click_onOrderPalaceButtonOrderSummaryPage() throws InterruptedException
	{
		WebElement e4=wd.findElement(OrderPlacedButton);
		HighlightElement(wd, e4);
		e4.click();
		
	}
	
		public void mainMethod() throws InterruptedException
		{
			this.click_onTargetPropertyEditButton();
			this.click_onDeliveryInformationEditButton();
			this.click_onOrderPalaceButtonOrderSummaryPage();
		}

}
