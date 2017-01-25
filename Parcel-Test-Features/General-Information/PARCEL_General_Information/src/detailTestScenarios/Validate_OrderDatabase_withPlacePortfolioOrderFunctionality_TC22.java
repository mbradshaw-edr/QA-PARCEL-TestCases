package detailTestScenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_OrderDatabase_withPlacePortfolioOrderFunctionality_TC22 {
	
	By OrderDatabaseButton=By.name("butShowVendors");
	By YesRadioButton=By.xpath("html/body/div[1]/div/form/p[3]/span[2]/input[1]"); 
	By ContinueWithSingleSiteButton=By.name("submitDataOrder");
	By CheckBoxForDataProvider=By.xpath("html/body/div/div/form/table/tbody/tr/td[3]/input[3]");
	
	
	By AccountIdTextField=By.xpath("html/body/div/div/form/table/tbody/tr/td[3]/input[1]");
	By AccountPasswordTextField=By.xpath("html/body/div/div/form/table/tbody/tr/td[3]/input[2]");
	By CheckBox=By.xpath("html/body/div/div/form/table/tbody/tr/td[3]/input[3]");
	
	By PlacePortfolioOrderButton=By.name("submitPortfolioOrder");
	
	By DeleteCompanyLinkForNewlyAddedCompany=By.xpath("html/body/div//div/form/table/tbody/tr[10]/td/a[3]");
	
	
	
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	
	
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
	public Validate_OrderDatabase_withPlacePortfolioOrderFunctionality_TC22(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void click_onPlacePortfolioButton() throws InterruptedException
	{
		
		WebElement e=wd.findElement(YesRadioButton);
		HighlightElement(wd, e);
		e.click();
		
		WebElement e1=wd.findElement(AccountIdTextField);
		HighlightElement(wd, e1);
		e1.clear();
		e1.sendKeys(ExcelR1.getData("Data Provider For Order Databas",1,1));
		
		WebElement e2=wd.findElement(AccountPasswordTextField);
		HighlightElement(wd, e2);
		e2.clear();
		e2.sendKeys(ExcelR1.getData("Data Provider For Order Databas",1,2));
		
		WebElement e3=wd.findElement(CheckBoxForDataProvider);
		HighlightElement(wd, e3);
		 if (!e3.isSelected())
		    {
		        e3.click();
		    }
	
		 
		WebElement e4=wd.findElement(PlacePortfolioOrderButton);
			HighlightElement(wd, e4);
			e4.click();
			Thread.sleep(50000);
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
             
             /*WebElement e1=wd.findElement(EditSignatureButton);
     		HighlightElement(wd, e1);
     		e1.click();*/
	}
	
	
	Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13 m2=new Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13(wd);
		public void mainMethod() throws InterruptedException
		{
			
			this.click_onOrderDatabaseButton();
			this.click_onPlacePortfolioButton();
		}

}
