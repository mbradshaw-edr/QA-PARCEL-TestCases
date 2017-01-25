package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_continueButtonFunctionality_underTheProjectInformationPag_TC18 {
	
	// EDR Web Ordering: Property Information Page
	
		By GeneralXpath_projectInfoContents_underTheWebOrderingPropertyInformation=By.xpath(".//*[@id='ctl00_ctl00_cphBody_cphMainContent_pi1_PI_CTR']/div/div/div[1]");
		By GeneralXpath_DeliveryInfoContents_underTheWebOrderingPropertyInformation=By.xpath(".//*[@id='ctl00_ctl00_cphBody_cphMainContent_di1_DVGDI_CTR']/div/div/div/div/div");
		//By CommentTextBox_underTheWebOrderingPropertyInformation=By.id("ctl00_ctl00_cphBody_cphMainContent_pi1_PI_CO_TA");
		
		By CommentTextBox_=By.xpath("html/body/form/div//div/div/textarea");
		By Commercial_OfficeRadioButton=By.xpath("html/body/form/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/input");
		By EmailAddress2_TextBox=By.xpath("html/body/form/div//div[7]/div/div/input");
		By ContinueButton_underTheWebOrderingPropertyInformation=By.xpath(".//*[@id='ctl00_ctl00_cphBody_cphMainContent_btnContinue']");
		
		public static WebDriver wd;
		public static String SubParentWndow;
		public static String SubParent1Wndow;
		public static Set<String> s;
		ExcelR1 obj=new ExcelR1("..\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
		  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
		    {
		           JavascriptExecutor jse=(JavascriptExecutor)wd;
		          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		          Thread.sleep(3000);
		          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
		       
		    }
		  
		  public void windowScroll()
			{
				JavascriptExecutor jse = (JavascriptExecutor)wd;
				jse.executeScript("window.scrollBy(0,120)", "");
			}
		  
		  
		public Validate_continueButtonFunctionality_underTheProjectInformationPag_TC18(WebDriver wd)
		{
			this.wd=wd;
		}
		
		public void check_contentAvailability_EDRWEB_propertyInfoPage() throws InterruptedException
		{
			String s0=wd.getTitle();
			System.out.println("Page Title is: "+s0);
			
			List<WebElement> e1= wd.findElements(GeneralXpath_projectInfoContents_underTheWebOrderingPropertyInformation);
		    for(WebElement e0:e1)
		    {
		    	windowScroll();
				HighlightElement(wd, e0);
				String s1=e0.getText();
				System.out.println(s1);
		    }
		    
		    List<WebElement> e2= wd.findElements(GeneralXpath_DeliveryInfoContents_underTheWebOrderingPropertyInformation);
		    for(WebElement e01:e2)
		    {
		    	windowScroll();
				HighlightElement(wd, e01);
				String s2=e01.getText();
				System.out.println(s2);
		    }
			
			
			
	    }
		
		public void enterValuesOnCurrespondingTextBox() throws InterruptedException
		{
			WebElement e1=wd.findElement(CommentTextBox_);
			HighlightElement(wd, e1);
			e1.sendKeys("Hi ordering a data base by A");
			
			WebElement e2=wd.findElement(Commercial_OfficeRadioButton);
			HighlightElement(wd, e2);
			e2.click();
			
			WebElement e3=wd.findElement(EmailAddress2_TextBox);
			HighlightElement(wd, e3);
			e3.sendKeys("Hi ordering a data base by A");
			
		}
		
		public void click_onContinueButton() throws InterruptedException
		{

			
			WebElement e2=wd.findElement(ContinueButton_underTheWebOrderingPropertyInformation);
			HighlightElement(wd, e2);
			e2.click();
		
			
		}
		
		public void mainMethod() throws InterruptedException
		{
			this.check_contentAvailability_EDRWEB_propertyInfoPage();
			this.enterValuesOnCurrespondingTextBox();
			this.click_onContinueButton();
		}

}
