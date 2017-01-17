package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Verify_orderStatusPage_TC21 {
	
	By OrderStatusPageHeader=By.xpath(".//*[@id='contentrightedge']/table/tbody/tr[7]/td/table/tbody/tr/td");
	By GeneralXpathForNewlyCreated_orderStatusDetail=By.xpath(".//*[@id='OSS_ResultTable']/tbody/tr[3]/td");
	By ProjectID_textBox=By.xpath(".//*[@id='_Section__OrderStatusContent__FilterProject']");
	By ApplyButton=By.xpath(".//*[@id='_Section__OrderStatusContent__ApplyOrderTypesFilter']");
	By GeneralXpathAfterClicked_onApplyButton=By.xpath(".//*[@id='OSS_ResultTable']/tbody/tr/td");
	
	
	
	
	
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
	  
	public Verify_orderStatusPage_TC21(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void verifyNewlyCreatedOrder_onOrderPage() throws InterruptedException
	{
		String s0=wd.getTitle();
		System.out.println("Page Title is: "+s0);
		
		WebElement e=wd.findElement(OrderStatusPageHeader);
		HighlightElement(wd, e);
		String s=e.getText();
		System.out.println("Page Header is: "+s);
		
		List<WebElement> l1= wd.findElements(GeneralXpathForNewlyCreated_orderStatusDetail);
	    for(WebElement e1:l1)
	    {
			HighlightElement(wd, e1);
			String s1=e1.getText();
			System.out.println(s1);
	    }
	    
		
	}
	
	public void searchByProjectID_newlyCreatedOrder_onOrderPage() throws InterruptedException
	{
		WebElement e=wd.findElement(ProjectID_textBox);
		HighlightElement(wd, e);
		e.sendKeys("A01");
		
		WebElement e1=wd.findElement(ApplyButton);
		HighlightElement(wd, e1);
		e1.click();
		
	}
	
	public void observationAfterClickingOnApplyButton_onOrderPage() throws InterruptedException
	{
			List<WebElement> e1= wd.findElements(GeneralXpathAfterClicked_onApplyButton);
			int counter=0;
		    for(WebElement e:e1)
		    {
				HighlightElement(wd, e);
				counter++;
				
				String s1=e.getText();
				System.out.println(s1 );
				if(counter==24)
				{
					break;
				}
		    }
	}
	
	Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13 m2=new Validate_availabilityOfOrderDatabasButton_andFunctionality_TC13(wd);
	
	public void mainMethod() throws InterruptedException
	{
		this.verifyNewlyCreatedOrder_onOrderPage();
		this.searchByProjectID_newlyCreatedOrder_onOrderPage();
		this.observationAfterClickingOnApplyButton_onOrderPage();
		Thread.sleep(7000);
		wd.close();
		wd.switchTo().window(m2.SubParent1Wndow);
		this.windowScroll();
		
		
	}
		
}
