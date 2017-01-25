package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_availablityClickablityFunctionality_viewMapLink_TC06 {
	
	By ViewMap=By.xpath(".//*[@id='viewGI']/table/tbody/tr/td/table/tbody/tr[1]/td/a");
	By Print=By.xpath(".//*[@id='primaryPanel']/div/section/div/button[1]");
	By FindPaces_getDireactions=By.xpath("html/body/div/nav/nav/a/span");
	By favorite_share_more_nerBy_direction=By.xpath(".//*[@id='schema-name-address']/div/button");
	By MainMenue=By.xpath(".//*[@id='main-menu-toggle']");
	By GeneralXPathForMainMenue=By.xpath("html/body/div[2]/div/nav/ul/li[1]/ul/li/a");
	By GeneralXPath=By.xpath(".//*[@id='layers-bar-nav']/dl[1]/dd/button");
	
	public static WebDriver wd;
	public static Set<String> s;
	public String parent1Window;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_availablityClickablityFunctionality_viewMapLink_TC06(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_viewMap_MapQuest() throws InterruptedException
	{
		WebElement e=wd.findElement(ViewMap);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(5000);
	}
	
	public void observeMapContent1() throws InterruptedException
	{
		List<WebElement> e1= wd.findElements(FindPaces_getDireactions);
	    for(WebElement e:e1)
	    {
			HighlightElement(wd, e);
			String s1=e.getText();
			System.out.println(s1 );
	    }
	}
	public void observedMapContent2() throws InterruptedException
	{
		List<WebElement> e1= wd.findElements(favorite_share_more_nerBy_direction);
	    for(WebElement e:e1)
	    {
			HighlightElement(wd, e);
			String s1=e.getText();
			System.out.println(s1 );
	    }
	}
	public void observedMapContent3() throws InterruptedException
	{
		List<WebElement> e1= wd.findElements(GeneralXPath);
	    for(WebElement e:e1)
	    {
			HighlightElement(wd, e);
			String s1=e.getText();
			System.out.println(s1 );
	    }
	}
	public void observedMapContent4() throws InterruptedException
	{
		WebElement e=wd.findElement(MainMenue);
		HighlightElement(wd, e);
		e.click();
		List<WebElement> e1= wd.findElements(GeneralXPathForMainMenue);
	    for(WebElement e2:e1)
	    {
			HighlightElement(wd, e2);
			String s1=e2.getText();
			System.out.println(s1 );
	    }
	}
	
	
	Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2 m1=new Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2(wd);
	
	
	public void mainMethod() throws InterruptedException
	{
		parent1Window=wd.getWindowHandle();
		this.click_viewMap_MapQuest();
		
		
         s = wd.getWindowHandles();
              for (String handle1 : s) 
              {
               System.out.println(handle1);
               wd.switchTo().window(handle1);
	          }
              Thread.sleep(6000);
              wd.manage().window().maximize();
              this.observeMapContent1();
              this.observedMapContent2();
              this.observedMapContent3();
              this.observedMapContent4();
              Thread.sleep(5000);
              wd.close();
              
              wd.switchTo().window(parent1Window);
              wd.close();
              //this.click_viewMap_MapQuest();
              
	    		wd.switchTo().window(m1.parentWindow);
	}

}
