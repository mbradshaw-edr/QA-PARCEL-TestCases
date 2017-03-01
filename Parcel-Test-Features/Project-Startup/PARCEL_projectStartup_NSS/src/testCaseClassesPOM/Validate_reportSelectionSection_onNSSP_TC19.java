package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_reportSelectionSection_onNSSP_TC19 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	By AllTeplatesOfReportSection=By.xpath("//*[@id=('divReports')]/table/tbody/tr/td/b");
	By PARCELOptimizedPhase_ITemplateASTM2013=By.xpath(".//*[@id='divReports']/table/tbody/tr[9]/td[3]/input");
	By AllFieldsUnderAReportSection=By.xpath(".//*[@id='divFeePhaseI.2149']/b");
	
	
	
	 public WebDriver wd;
	 public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_reportSelectionSection_onNSSP_TC19(WebDriver wd)
		{
			this.wd=wd;
		} 
	
		
		/* Method for click on "New Single Site Project" */
		public void click_NewSingleSiteProject() throws InterruptedException
		{
			System.out.println("*** Validate 'Report Selection' section on New Single Site Project page. ***");
			System.out.println(" ");
			WebElement e1=wd.findElement(HomeButton);
			HighlightElement(wd, e1);
			e1.click();
			WebElement e2=wd.findElement(NSSP);
			HighlightElement(wd, e2);
			e2.click();
			
		}
		public void templatesObservationUnderReportSection() throws InterruptedException
		{
			System.out.println("Report section is mendetory because it doesn't has 'Show/Hide' functionality");
			System.out.println("Availability of all the templates comes under the report section and list is-- ");
			  List<WebElement> l=wd.findElements(AllTeplatesOfReportSection);
		        for(WebElement e:l)
		        {
		        	HighlightElement(wd, e);
		        	String s=e.getText();
		        	System.out.println(" : "+s);
		        }
		}
		public void fieldsObservationUnderReport() throws InterruptedException
		{
			System.out.println("Availability of all the fields comes under the report section and list is-- ");
			WebElement e1=wd.findElement(PARCELOptimizedPhase_ITemplateASTM2013);
			HighlightElement(wd, e1);
			e1.click();
			  List<WebElement> l=wd.findElements(AllFieldsUnderAReportSection);
		        for(WebElement e2:l)
		        {
		        	HighlightElement(wd, e2);
		        	String s=e2.getText();
		        	System.out.println(" : "+s);
		        }
			
			
		}
		
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_NewSingleSiteProject();
			this.templatesObservationUnderReportSection();
			this.fieldsObservationUnderReport();
		}

}
