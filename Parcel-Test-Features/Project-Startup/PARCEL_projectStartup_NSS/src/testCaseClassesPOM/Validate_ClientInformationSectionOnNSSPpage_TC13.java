package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_ClientInformationSectionOnNSSPpage_TC13 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	
	By ClientInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[2]/tbody/tr/td/b");
	By ClientInformationShow=By.xpath("//*[@id=('divShowClient')]/b/a");
	By AllFieldsUnderclientInformation=By.xpath("//*[@id='divClient']/table/tbody/tr/td[1]");
	By ClientInformationHide=By.xpath("//*[@id=('divHideClient')]/b/a");
	
	
	 public WebDriver wd;
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_ClientInformationSectionOnNSSPpage_TC13(WebDriver wd)
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
		/* Method for showing "Show" link on "Client Information" section, which is available and clickable */
		public void clientInfoSectionHavingShowFunctionality() throws InterruptedException
		{
			System.out.println("*** Validation of 'Client Information'  section on New Single Site Project page ***");
			System.out.println("'Client section is Not mendetory (Or Optional) and colapsed because it has 'Show' link whch is clickable- ");
			WebElement e1=wd.findElement(ClientInformation);
			HighlightElement(wd, e1);
			String s=e1.getText();
			Boolean b=wd.findElement(ClientInformationShow).isDisplayed();
			Boolean c=wd.findElement(ClientInformationShow).isEnabled();
			System.out.println("First non medetory or colapsed Section : "+s);
			System.out.println("and it displayed 'Show' option  : "+b);
			System.out.println("and it's clickability  : "+c);
		}
		/* Method for showing "Hide" link when user clicked on "show" option on "Client Information" section, which is available and clickable
		 * and this section will be expended */
		public void clientInfoSectionHavingHideFunctionality() throws InterruptedException
		{
			System.out.println("After clicked on 'Show' Link, 'Client Information' section expended and it has 'Hide' link instead of 'Show' link whch is clickable- ");
			Thread.sleep(20000);
			WebElement e1=wd.findElement(ClientInformation);
			HighlightElement(wd, e1);
			String s=e1.getText();
			Boolean b=wd.findElement(ClientInformationHide).isDisplayed();
			Boolean c=wd.findElement(ClientInformationHide).isEnabled();
			System.out.println("First non medetory or colapsed Section : "+s);
			System.out.println("and it displayed 'Hide' option after clicked on 'Show'  : "+b);
			System.out.println("and it's clickability  : "+c);
		}
		/* Method of observing all field available, when this section is expended */
		public void observeFieldsUnderClientInformation() throws InterruptedException
		{
			WebElement e1=wd.findElement(ClientInformationShow);
			HighlightElement(wd, e1);
			e1.click();
			System.out.println("Available fields under 'Client Information' section are- ");
			List<WebElement> l=wd.findElements(AllFieldsUnderclientInformation);
			for(WebElement e:l)
			{
				HighlightElement(wd, e);
				String s=e.getText();
						System.out.println(" :"+s);
			}
		}
		/* Method for calling all method related to this test case */
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			this.click_NewSingleSiteProject();
			this.clientInfoSectionHavingHideFunctionality();
			this.clientInfoSectionHavingHideFunctionality();
			this.observeFieldsUnderClientInformation();
		}

}
