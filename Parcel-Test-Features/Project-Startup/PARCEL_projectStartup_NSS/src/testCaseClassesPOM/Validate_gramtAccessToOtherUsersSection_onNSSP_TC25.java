package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_gramtAccessToOtherUsersSection_onNSSP_TC25 {
	
	By HomeButton=By.className("feature130");
	By ProjectTab=By.id("link_131");
	By NewSingleSiteOption=By.className("feature135");
	By GrantAccessToOptions=By.xpath("//*[@id=('divAccess')]/table/tbody/tr/td[2]");
	By GrantAccessSection=By.xpath("html/body/div/div/div/div/div/div/form/table[7]/tbody/tr/td/b");
	By GrantAccessShowOption=By.xpath(".//*[@id='divShowAccess']/b/a");
	By YourOrganizationDD=By.name("access_self");
	By YourClientDD=By.name("access_client");
	By AThirdParty=By.name("access_third");
	By GrantAccessHideOption=By.xpath(".//*[@id='divHideAccess']/b/a");
	By GrantAccessTo=By.xpath(".//*[@id='divAccess']/table/tbody/tr/td/b");
	
	
	public WebDriver wd;

	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_gramtAccessToOtherUsersSection_onNSSP_TC25(WebDriver wd)
		{
			this.wd=wd;
		} 
		public void click_NewSingleSiteProjectButton() throws InterruptedException
		{
			System.out.println("*** Validation of create project functionality with blank data ***");
			WebElement e1=wd.findElement(HomeButton);
			HighlightElement(wd, e1);
			e1.click();
			WebElement e2=wd.findElement(ProjectTab);
			HighlightElement(wd, e2);
			e2.click();
			WebElement e3=wd.findElement(NewSingleSiteOption);
			HighlightElement(wd, e3);
			e3.click();
		}
		public void availablityOfGrantAccessAnfItsOptions() throws InterruptedException
		{
			WebElement e1=wd.findElement(GrantAccessSection);
			HighlightElement(wd, e1);
			String s1=e1.getText();
			System.out.println(" : "+s1);
			
			//Thread.sleep(5000);
			//WebElement e7=wd.findElement(GrantAccessShowOption);
			//HighlightElement(wd, e7);
			//e7.click();
			
			
			WebElement e2=wd.findElement(GrantAccessTo);
			HighlightElement(wd, e2);
			String s2=e2.getText();
			System.out.println(" : "+s2);
			
			List<WebElement> m=wd.findElements(GrantAccessToOptions);
			for(WebElement e:m)
			{
				HighlightElement(wd, e);
				String s=e.getText();
				System.out.println(" : "+s);
			}
			
			WebElement e3=wd.findElement(YourOrganizationDD);
			HighlightElement(wd, e3);
			Select ss=new Select(e3);
			
			
			WebElement e4=wd.findElement(YourClientDD);
			HighlightElement(wd, e4);
			Select ss1=new Select(e4);
			
			WebElement e5=wd.findElement(AThirdParty);
			HighlightElement(wd, e5);
			Select ss3=new Select(e5);
			
			WebElement e6=wd.findElement(GrantAccessHideOption);
			HighlightElement(wd, e6);
			String ss4=e6.getText();
			System.out.println(" : "+ss4);
		}
		
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_NewSingleSiteProjectButton();
			this.availablityOfGrantAccessAnfItsOptions();
		}

}
