package testCaseClassesPOM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_findContactLink_underClientInformation_TC14 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	
	By ClientInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[2]/tbody/tr/td/b");
	By ClientInformationShow=By.xpath("//*[@id='divShowClient']/b/a");
	By AllFieldsUnderclientInformation=By.xpath("//*[@id='divClient']/table/tbody/tr/td[1]");
	By ClientInformationHide=By.xpath("//*[@id=('divHideClient')]/b/a");
	
	By FindContact=By.xpath(".//*[@id='divClient']/table/tbody/tr/td/b/a");   ////*[@id="divClient"]/table/tbody/tr[1]/td[2]/b/a
	By Link1UnderNewWindow=By.xpath("html/body/table/tbody/tr[4]/td[2]/a");
	
	By GeneralXpathForImportContentsOfDataField=By.xpath("html/body/div[2]/div/div/div/div/div/form/div/table/tbody/tr[1]/td[2]/input");
	
	By CompanyName=By.id("client_name");
	By Contact=By.id("client_contact");
	By Address=By.id("client_address");
	By City=By.id("client_city");
	By CountryDD=By.id("client_country");
	By StateDD=By.id("client_state");
	By Zip=By.name("client_zip");
	
	 public WebDriver wd;
	 public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_findContactLink_underClientInformation_TC14(WebDriver wd)
		{
			this.wd=wd;
		} 
	
		
		/* Method for click on "New Single Site Project" */
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
		
		
		
			public void click_showLinkOnClientInfo() throws InterruptedException
			{
				System.out.println("After clicked on 'Show' Link, 'Client Information' section expended and it has 'Hide' link instead of 'Show' link ");
				WebElement e1=wd.findElement(ClientInformationShow);
				HighlightElement(wd, e1);
				e1.click();
			}
			/* Method of observing all field available, when this section is expended */
			public void observeFieldsUnderClientInformation() throws InterruptedException
			{
				System.out.println("Available fields Data under 'Client Information' section are- ");
				WebElement e1=wd.findElement(CompanyName);
				HighlightElement(wd, e1);
				String s=e1.getAttribute("value");
				System.out.println(" : "+s);
				WebElement e2=wd.findElement(Contact);
				HighlightElement(wd, e2);
				String s1=e2.getAttribute("value");
				System.out.println(" : "+s1);
				WebElement e3=wd.findElement(Address);
				HighlightElement(wd, e3);
				String s2=e3.getAttribute("value");
				System.out.println(" : "+s2);
				WebElement e4=wd.findElement(City);
				HighlightElement(wd, e4);
				String s3=e4.getAttribute("value");
				System.out.println(" : "+s3);
				WebElement e5=wd.findElement(CountryDD);
				Select dd1=new Select(e5);
				HighlightElement(wd, e5);
				WebElement e=dd1.getFirstSelectedOption();
				HighlightElement(wd, e);
				String s4=e.getText();
				System.out.println(" : "+s4);
				WebElement e6=wd.findElement(StateDD);
				HighlightElement(wd, e6);
				Select dd2=new Select(e6);
				WebElement e8=dd2.getFirstSelectedOption();
				HighlightElement(wd, e8);
				String s5=e8.getText();
				System.out.println(" : "+s5);
				WebElement e9=wd.findElement(Zip);
				HighlightElement(wd, e8);
				String s6=e9.getAttribute("value");
				System.out.println(" : "+s6);
				Thread.sleep(4000);
				
				
			}
			
			public void click_onFindContactAndObservation() throws InterruptedException
			{
		        
			
				 String parentWindow= wd.getWindowHandle();
				 
			        System.out.println(parentWindow);
		 
			        // Click on the Button "New Message Window"
		 
			        WebElement e1=wd.findElement(FindContact);
			        HighlightElement(wd, e1);
			        e1.click();
		 
			        // Store and Print the name of all the windows open	              
		 
			        Set childWndows = wd.getWindowHandles();
		 
			        System.out.println(childWndows);
		 
			        // Pass a window handle to the other window
		 
			        for (String handle1 : wd.getWindowHandles()) {
		 
			        	System.out.println(handle1);
		 
			        	wd.switchTo().window(handle1);
			        	//driver.get("http://google.com");
		 
			        	}
			       
			        /*wd.get("http://google.com");
			        wd.switchTo().window(parentWindow);
			        wd.get("http://gmail.com");*/
				
			Thread.sleep(10000);	
			System.out.println("when user clicked on 'FindContact' link, all the clients, company list for 10 members is visible as follows :- ");	
			WebElement t= wd.findElement(By.xpath("/html/body/table[2]/tbody"));
			List<WebElement> r1=t.findElements(By.tagName("tr"));
			
			for(int i=0; i<20;i++)
			{
				List<WebElement> c1=r1.get(i).findElements(By.tagName("td"));
				for(int j=0;j<c1.size(); j++)
				{
					WebElement e2=c1.get(j);
					String s1=e2.getText();
					System.out.println(s1 );
				
				}
			}
			
			WebElement e=wd.findElement(Link1UnderNewWindow);
			HighlightElement(wd, e);
			e.click();
			wd.switchTo().window(parentWindow);
			
			}
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_NewSingleSiteProject();
			this.click_showLinkOnClientInfo();
			System.out.println("Data Not available, when user clicked on 'Show' link (or when 'Client Information' expended only");
			this.observeFieldsUnderClientInformation();
			this.click_onFindContactAndObservation();
			System.out.println("When user clicked on any link on 'FindContact' window, data get available (or import) in all filds under 'Client Information'");
			this.observeFieldsUnderClientInformation();
			
		}
			

}
