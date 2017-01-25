package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_impersonateAnUser_TC10 {
	
	By ImpersonateButton=By.xpath("html/body/div//div/table/tbody/tr/td/div/a[3]");
	By AllLinksRelatedToTarrynFullr=By.xpath(".//*[@id='printAreaTable']/tbody/tr[6]/td/a");
	By TarrynFullerLink=By.xpath(".//*[@id='printAreaTable']/tbody/tr[6]/td[1]/a");
	By UserAccountName=By.id("link_164");
	By Logout=By.className("feature166"); 
	
	
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	
	
	public static WebDriver wd;
	public static Set<String> s;
	public String parent1Window;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_impersonateAnUser_TC10(WebDriver wd)
	{
		this.wd=wd;
	}
	
	
	public void observeAllLinksRelatedToPerticullarUser() throws InterruptedException
	{
		List<WebElement> els = wd.findElements(AllLinksRelatedToTarrynFullr);
		for ( WebElement el : els ) {
			HighlightElement(wd, el);
			String s=el.getText();
			System.out.println(" : "+s);
			
		    
		}
	}
	
	public void click_onUserNameLink() throws InterruptedException
	{
		WebElement e=wd.findElement(TarrynFullerLink);
		HighlightElement(wd, e);
		e.click();
	}
	
	public void click_onImpersonatetButton() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement e=wd.findElement(ImpersonateButton);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(5000);
		WebElement e1=wd.findElement(UserAccountName);
		HighlightElement(wd, e1);
		
		
	}
	
	public void logoutUser() throws InterruptedException
	{
		WebElement e1=wd.findElement(UserAccountName);
		HighlightElement(wd, e1);
		e1.click();
		
		WebElement e2=wd.findElement(Logout);
		HighlightElement(wd, e2);
		e2.click();
		
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.observeAllLinksRelatedToPerticullarUser();
		this.click_onUserNameLink();
		this.click_onImpersonatetButton();
		this.logoutUser();
	}

}
