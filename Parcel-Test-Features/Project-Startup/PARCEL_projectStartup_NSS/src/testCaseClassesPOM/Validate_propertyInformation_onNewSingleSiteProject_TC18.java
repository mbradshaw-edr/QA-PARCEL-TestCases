package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_propertyInformation_onNewSingleSiteProject_TC18 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	
	By PropertyInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[3]/tbody/tr/td/b");
	By allFieldsLabels=By.xpath("//*[@id=('divProperty')]/table/tbody/tr/td[1]");
	By AllWarningMessages=By.xpath("//*[@id=('divProperty')]/div");
	
	By ProjectNameField=By.id("project_name");
	By DateDraftDueField=By.id("draft_date");
	By DateFineDueField=By.id("final_date");
	By PropertyNumber=By.name("prop_number");
	By PropertyZip=By.id("prop_zip");
	By Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox=By.xpath("//*[@id='divReports']/table/tbody/tr[9]/td[3]/input");
	By Project_ID=By.xpath("//*[@id='divFeePhaseI.2149']/input[2]");
	By SubmitButton=By.name("submitExpress");
	By ToolIcon=By.xpath("html/body/div/div/div/div/div/div/div/div/div[2]/a");
	By AddProjectReportOption=By.xpath("html/body/div/div/div/div/div/div/div/div/div/ul/li[8]/a");
	
	 public WebDriver wd;
	 public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_propertyInformation_onNewSingleSiteProject_TC18(WebDriver wd)
		{
			this.wd=wd;
		} 
	
		
		/* Method for click on "New Single Site Project" */
		public void click_NewSingleSiteProject() throws InterruptedException
		{
			System.out.println("*** Validate that message is displayed, when   required fields of 'Project Information' section is left blank. ***");
			System.out.println(" ");
			WebElement e1=wd.findElement(HomeButton);
			HighlightElement(wd, e1);
			e1.click();
			WebElement e2=wd.findElement(NSSP);
			HighlightElement(wd, e2);
			e2.click();
		}
		
		public void dataFieldDisplay() throws InterruptedException
		{
			System.out.println("All fields avalable for the section 'Property Information', fields names are--");
			  List<WebElement> l=wd.findElements(allFieldsLabels);
		        for(WebElement e:l)
		        {
		        	HighlightElement(wd, e);
		        	String s=e.getText();
		        	System.out.println(" : "+s);
		        }
		}
		
		public void saveProjectWithoutFillingAllMendetoryFildsOgPropertyInfo() throws InterruptedException
		{
			WebElement e1=wd.findElement(ProjectNameField);
			HighlightElement(wd, e1);
			e1.sendKeys("rtyui");
			WebElement e2=wd.findElement(DateDraftDueField);
			HighlightElement(wd, e2);
			e2.sendKeys("07/28/2016");
			WebElement e3=wd.findElement(DateFineDueField);
			HighlightElement(wd, e3);
			e3.sendKeys("10/30/2016");
			WebElement e4=wd.findElement(PropertyNumber);
			HighlightElement(wd, e4);
			e4.sendKeys("567");
			WebElement e5=wd.findElement(PropertyZip);
			HighlightElement(wd, e5);
			e5.sendKeys("Prop11");
		
			WebElement e6=wd.findElement(Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox);
			HighlightElement(wd, e6);
			e6.click();
			WebElement e7=wd.findElement(Project_ID);
			HighlightElement(wd, e7);
			e7.sendKeys("34567");
			WebElement e8=wd.findElement(SubmitButton);
			HighlightElement(wd, e8);
			e8.click();
		}
		public void observationPromptedMessages() throws InterruptedException
		{
			System.out.println("All warning message displayed when mendetory fields of 'Property Information', left empty--");
			  List<WebElement> l=wd.findElements(AllWarningMessages);
		        for(WebElement e:l)
		        {
		        	HighlightElement(wd, e);
		        	String s=e.getText();
		        	System.out.println(" : "+s);
		        }
		}
		
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.click_NewSingleSiteProject();
			this.dataFieldDisplay();
			this.saveProjectWithoutFillingAllMendetoryFildsOgPropertyInfo();
			this.observationPromptedMessages();
		}

}
