package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Vaidate_orderCofirmation_TC024 {
	
	By OrderDatabaseButton=By.name("butShowVendors");
	
	By GeneralXpathForPageHeaderAndRelatedInformation=By.xpath("html/body/p/span");
	By GeneralXpathForOrderNewPortfolioInformations=By.xpath("html/body/table/tbody/tr/td"); 
	By GeneraXpathPageContentsOrInformationAboutThePortfolioOrder=By.xpath(".//*[@id='edrPort']/table/tbody/tr/td/input");
	By CheckAllButton=By.xpath(".//*[@id='edrPort']/table[2]/tbody/tr/td[1]/input[1]");
	By PkgDD1=By.xpath("html/body/form/table/tbody/tr/td[3]/select");                 // EDR Standard Lightbox Package
	By FieldChk_checkBox=By.xpath("html/body/div/div/form/table/tbody/tr/td[3]/input[2]");
	By SrchDistDD2=By.xpath("html/body/form/table/tbody/tr/td[5]/select");             // EDR-Test
	
	By EmailNotificationsTo_textArea=By.xpath("html/body/form/table/tbody/tr/td[1]/textarea");
	By SiteComments_textArea=By.xpath("html/body/form/table/tbody/tr/td[2]/textarea");
	By ContinueButton=By.xpath("html/body/form/table[2]/tbody/tr/td[2]/input");
	
	
	
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
		  
		  public void windowScroll()
			{
				JavascriptExecutor jse = (JavascriptExecutor)wd;
				jse.executeScript("window.scrollBy(0,400)", "");
			}
		public Vaidate_orderCofirmation_TC024(WebDriver wd)
		{
			this.wd=wd;
		}
		
		public void observationOfConfirmation_orderNewPortfolioPage() throws InterruptedException
		{
			List<WebElement> l1= wd.findElements(GeneralXpathForPageHeaderAndRelatedInformation);
		    for(WebElement e1:l1)
		    {
				HighlightElement(wd, e1);
				String s1=e1.getText();
				System.out.println(s1);
		    }
		    
		    List<WebElement> l2= wd.findElements(GeneralXpathForOrderNewPortfolioInformations);
		    for(WebElement e2:l2)
		    {
				HighlightElement(wd, e2);
				String s2=e2.getText();
				System.out.println(s2);
		    }
		}
		
		
		
		public void click_onOrderDatabaseButton() throws InterruptedException
		{
			WebElement e0=wd.findElement(OrderDatabaseButton);
			HighlightElement(wd, e0);
			e0.click();
			
	        s = wd.getWindowHandles();                                                    // code for switching in to parent window and and again opene a new child window
	             for (String handle1 : s) 
	             {
	              System.out.println(handle1);
	              wd.switchTo().window(handle1);
		          }
	             wd.manage().window().maximize();
	             
	             /*WebElement e1=wd.findElement(EditSignatureButton);
	     		HighlightElement(wd, e1);
	     		e1.click();*/
		}
		
		
		
		
		Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13 m3=new Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13(wd);
		public void mainMethod() throws InterruptedException
		{
			this.observationOfConfirmation_orderNewPortfolioPage();
			Thread.sleep(7000);
			wd.close();
			wd.switchTo().window(m3.SubParent1Wndow);
			windowScroll();
			
			
		}
		
		

}
