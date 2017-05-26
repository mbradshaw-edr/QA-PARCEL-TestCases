package testCaseNSPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_step5GrantAccess_andrestOfallSteps_TC11 {
	
	By GrantAccessToDD=By.name("accessType");                           // Everyone in the test on parcel team
	By ContinueButtonForGrantAccessStep5=By.name("submitSetAccess");
	By ContinoueButton=By.name("consultantFee");
	
	By ProjectNameWithEidLinlk=By.xpath("html/body/div/div/div/div/div/div/table[2]/tbody/tr[2]/td/a");
	By EidLinlkForProjectName=By.xpath("html/body/div/div/div/div/div/div/table[2]/tbody/tr/td[2]/a");
	By SiteNameWithEidLinlk=By.xpath("html/body/div/div/div/div/div/div/table[4]/tbody/tr/td/table[1]/tbody/tr/td/a");
	By EidLinlkForSiteName=By.xpath("html/body/div/div/div/div/div/div/table[4]/tbody/tr/td/table/tbody/tr/td[2]/a");
	By EidLinlkForReportName=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[3]/a");
	By ReportNameWithEidLinlk=By.xpath("html/body/div/div/div/div/div/div/table[5]/tbody/tr/td/table[1]/tbody/tr/td/a");
	By ConformInfoButton=By.name("confirmation");
	By CCField=By.name("cc");
	By MessageField=By.name("comments");
	By SendMailButton=By.name("email");
	By ConformProjectInformationForStep6Link=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[6]/td/a");
	
	
	public static WebDriver wd;
	
	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	   
	   public Validate_step5GrantAccess_andrestOfallSteps_TC11(WebDriver wd)
		{
			this.wd=wd;
		} 
	   
	   public void click_andSelectGrantAccessTo() throws InterruptedException
		{
		   System.out.println("\n\n");
	    	System.out.println("Validating Edit operation, under this feature like: edit link for project name, site name, report name etc..");
			WebElement e=wd.findElement(GrantAccessToDD);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(1000);
			e.click();
			Select s=new Select(e);
			HighlightElement(wd, e);
			s.selectByVisibleText("Everyone in the test on parcel team");
		}
	   
	   public void click_continueButtonForGrantAccess() throws InterruptedException
		{
			WebElement e1=wd.findElement(ContinueButtonForGrantAccessStep5);
			HighlightElement(wd, e1);
			e1.click();
		}
	   public void click_editProjectNameLinks() throws InterruptedException
		{
			WebElement e1=wd.findElement(ProjectNameWithEidLinlk);
			HighlightElement(wd, e1);
			
			WebElement e2=wd.findElement(EidLinlkForProjectName);
			HighlightElement(wd, e2);
			e2.click();
			Thread.sleep(3000);
			WebElement e3=wd.findElement(ConformInfoButton);
			HighlightElement(wd, e3);
			e3.click();
			
			
			/*WebElement e2=wd.findElement(SiteNameWithEidLinlk);
			HighlightElement(wd, e2);
			
			WebElement e3=wd.findElement(ReportNameWithEidLinlk);
			HighlightElement(wd, e3);
			
			WebElement e4=wd.findElement(ReportNameWithEidLinlk);
			HighlightElement(wd, e4);*/
			
		}
	   public void click_editForSiteLinks() throws InterruptedException
		{
			WebElement e1=wd.findElement(SiteNameWithEidLinlk);
			HighlightElement(wd, e1);
			
			WebElement e2=wd.findElement(EidLinlkForSiteName);
			HighlightElement(wd, e2);
			e2.click();
			Thread.sleep(3000);
			WebElement e3=wd.findElement(ConformInfoButton);
			HighlightElement(wd, e3);
			e3.click();
		}
	   public void click_onEditForReportLink() throws InterruptedException
		{
			WebElement e1=wd.findElement(ReportNameWithEidLinlk);
			HighlightElement(wd, e1);
			
			WebElement e2=wd.findElement(EidLinlkForReportName);
			HighlightElement(wd, e2);
			e2.click();
			Thread.sleep(3000);
			WebElement e3=wd.findElement(ConformInfoButton);
			HighlightElement(wd, e3);
			e3.click();
		}
	   public void click_onStep6_conformProjectInfoLink() throws InterruptedException
		{
			WebElement e1=wd.findElement(ConformProjectInformationForStep6Link);
			HighlightElement(wd, e1);
			e1.click();
		}
	   
	   
	   
	   
	   
	   
	   
	   
	   public void mainMethod() throws InterruptedException
	   {
		   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   this.click_andSelectGrantAccessTo();
		   this.click_continueButtonForGrantAccess();
		   Thread.sleep(5000);
		   this.click_editProjectNameLinks();
		   Thread.sleep(5000);
		   this.click_onStep6_conformProjectInfoLink();
		   Thread.sleep(5000);
		   this.click_editForSiteLinks();
		   Thread.sleep(5000);
		   this.click_onStep6_conformProjectInfoLink();
		   Thread.sleep(5000);
		   this.click_onEditForReportLink();
	   }

}
