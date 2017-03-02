package detailTestScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_availabilityOfShortSummary_ofOPEW_TC03 {
	
	By GeneralXpathForOrdersPlacedList=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td");
	By OrdersPlacedOnEDRWebsiteOprion=By.className("feature139");
	By OrderPlacedOnEDRWebsitePageHeader=By.className("general-panel-name");
	By PageMessage=By.xpath("html/body/div[2]/div//div/p");
	By FourthOrder=By.xpath("html/body/div//div/table/tbody/tr[5]/td[1]");
	
	
    public WebDriver wd;
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
	
	public Validate_availabilityOfShortSummary_ofOPEW_TC03(WebDriver wd)
	{
		this.wd=wd;
	}
	
	/* Method for validating New 'Order placed on EDR' options of start menu */
	
		public void observedOrderPlacedSummaryList() throws InterruptedException
		{
			List<WebElement> e1= wd.findElements(GeneralXpathForOrdersPlacedList);
			int counter=0;
		    for(WebElement e:e1)
		    {
				HighlightElement(wd, e);
				counter++;
				
				String s1=e.getText();
				System.out.println(s1+"\n" );
				if(counter==24)
				{
					break;
				}
		    }
		}
		
	public void gettingOrderNumberBeforeDeletion()
	{
	 
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.observedOrderPlacedSummaryList();
		
	}

}
