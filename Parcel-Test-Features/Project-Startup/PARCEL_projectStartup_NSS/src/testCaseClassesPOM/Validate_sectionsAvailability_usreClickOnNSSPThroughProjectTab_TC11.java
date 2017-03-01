package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_sectionsAvailability_usreClickOnNSSPThroughProjectTab_TC11 {
	
	By HomeButton=By.className("feature130");
	By ProjectMenuTab=By.id("link_131");
	By NSSPOptionUnderProjectMenuTab=By.className("feature135");
	By AllMainFields=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td[1]/b");
	By AllButtons=By.xpath("//*[@id=('divButtons')]/input");
	By NewPortfolioLink=By.linkText("Advanced Project Setup");
	
	By AllFieldsUnderProjectInformation=By.xpath("//*[@id=('divProject')]/table/tbody/tr/td[1]");
	By AllFieldsUnderclientInformation=By.xpath("//*[@id='divClient']/table/tbody/tr/td[1]");
	By AllFieldsUnderPropertyInformation=By.xpath(".//*[@id='divProperty']/table/tbody/tr/td[1]");
	By AllFieldsUnderReportSection=By.xpath(".//*[@id='divReports']/table/tbody/tr/td/b");
	By AllFieldsUnderAdditionalPropertyInformation=By.xpath("//*[@id='divPropAdditional']/table/tbody/tr/td[1]");
	By AllFieldsUnderSiteContactInformation=By.xpath(".//*[@id='divContact']/table/tbody/tr/td[1]");
	By AllFieldsUnderGrantAccessToOtherUsers=By.xpath(".//*[@id='divAccess']/table/tbody/tr/td[2]");
	By AllFieldsUnderAttachments=By.xpath(".//*[@id='divAttach']/table/tbody/tr/td/input[2]");
	By AllFieldsUnderEmailNotification=By.xpath(".//*[@id='divEmail']/table/tbody/tr/td[1]");
	
	By ProjectInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[1]/tbody/tr/td/b");
	By ClientInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[2]/tbody/tr/td/b");
	By PropertyInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[3]/tbody/tr/td/b");
	By ReportSection=By.xpath("html/body/div/div/div/div/div/div/form/table[4]/tbody/tr/td[1]/b");
	By AdditionalPropertyInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[5]/tbody/tr/td/b");
	By SiteContactInformation=By.xpath("html/body/div/div/div/div/div/div/form/table[6]/tbody/tr/td/b");
	By GrantAccessToOtherUsers=By.xpath("html/body/div/div/div/div/div/div/form/table[7]/tbody/tr/td/b");
	By Attachments=By.xpath("html/body/div/div/div/div/div/div/form/table[8]/tbody/tr/td/b");
	By EmailNotification=By.xpath(".//*[@id='divEmailHeader']/table/tbody/tr/td/b");
	
	By ClientInformationShow=By.xpath("//*[@id=('divShowClient')]/b/a");
	By AdditionalPropertyInformationShow=By.xpath("//*[@id='divShowPropAdditional']/b/a");
	By SiteContactInformationShow=By.xpath("//*[@id='divShowContact']/b/a");
	By GrantAccessToOtherUsersShow=By.xpath("//*[@id='divShowAccess']/b/a");
	By AttachmentsShow=By.xpath("//*[@id='divShowAttach']/b/a");
	By EmailNotificationShow=By.xpath("//*[@id='divShowEmail']/b/a");
	
	public WebDriver wd;

	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_sectionsAvailability_usreClickOnNSSPThroughProjectTab_TC11(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	/* Method for click on 'Single Site Project' option of start menu */
	public void click_NsspOption() throws InterruptedException
	{
		WebElement e1=wd.findElement(HomeButton);
		HighlightElement(wd, e1);
		e1.click();
		WebElement e2=wd.findElement(ProjectMenuTab);
		HighlightElement(wd, e2);
		e2.click();
		WebElement e3=wd.findElement(NSSPOptionUnderProjectMenuTab);
		HighlightElement(wd, e3);
		e3.click();
		String s=wd.getTitle();
		System.out.println("After click on 'New Single Site Project', new page title is: "+s);
	}
	
	public void observeFieldsUnderProjectInformation() throws InterruptedException
	{
		System.out.println("Available fields under 'project Information' are- ");
		List<WebElement> l=wd.findElements(AllFieldsUnderProjectInformation);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
					System.out.println(" :"+s);
		}
	}
	public void observeFieldsUnderPropertyInformation() throws InterruptedException
	{
		System.out.println("Available fields under 'Property Information' section are- ");
		List<WebElement> l=wd.findElements(AllFieldsUnderPropertyInformation);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
					System.out.println(" :"+s);
		}
	}
	public void observeFieldsUnderReportSection() throws InterruptedException
	{
		System.out.println("Available fields under 'Report' section are- ");
		List<WebElement> l=wd.findElements(AllFieldsUnderReportSection);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
					System.out.println(" :"+s);
		}
	}
	public void observeFieldsUnderAdditonalProprtyInformation() throws InterruptedException
	{
		WebElement e1=wd.findElement(AdditionalPropertyInformationShow);
		HighlightElement(wd, e1);
		e1.click();
		System.out.println("Available fields under 'AdditionalProprtyInformation' section are- ");
		List<WebElement> l=wd.findElements(AllFieldsUnderAdditionalPropertyInformation);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
					System.out.println(" :"+s);
		}
	}
	public void observeFieldsUnderSiteContactInformation() throws InterruptedException
	{
		WebElement e1=wd.findElement(SiteContactInformationShow);
		HighlightElement(wd, e1);
		e1.click();
		System.out.println("Available fields under 'SiteContactInformation' section are- ");
		List<WebElement> l=wd.findElements(AllFieldsUnderSiteContactInformation);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
					System.out.println(" :"+s);
		}
	}
	public void observeFieldsUndeGrantAccessToOtherUsers() throws InterruptedException
	{
		//WebElement e1=wd.findElement(GrantAccessToOtherUsersShow);
		//HighlightElement(wd, e1);
		//e1.click();
		System.out.println("Available fields under 'Grant Access To Other Users' section are- ");
		List<WebElement> l=wd.findElements(AllFieldsUnderGrantAccessToOtherUsers);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
					System.out.println(" :"+s);
		}
	}
	public void observeFieldsUnderAttachments() throws InterruptedException
	{
		WebElement e1=wd.findElement(AttachmentsShow);
		HighlightElement(wd, e1);
		e1.click();
		System.out.println("Available fields under 'Attachments' section are- ");
		List<WebElement> l=wd.findElements(AllFieldsUnderAttachments);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getAttribute("Value");
					System.out.println(" :"+s);
		}
	}
	public void observeFieldsUnderEmailNotification() throws InterruptedException
	{
		System.out.println("Available fields under 'Email Notification' section are- ");
		WebElement e1=wd.findElement(EmailNotificationShow);
		HighlightElement(wd, e1);
		e1.click();
		List<WebElement> l=wd.findElements(AllFieldsUnderEmailNotification);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
					System.out.println(" :"+s);
		}
	}
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
	
	
	
	
	
	
	
	
	public void validatingNSSPPageContent() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_NsspOption();
		this.observeFieldsUnderProjectInformation();
		this.observeFieldsUnderClientInformation();
		this.observeFieldsUnderPropertyInformation();
		this.observeFieldsUnderReportSection();
		this.observeFieldsUnderAdditonalProprtyInformation();
		this.observeFieldsUnderSiteContactInformation();
		this.observeFieldsUndeGrantAccessToOtherUsers();
		this.observeFieldsUnderAttachments();
		this.observeFieldsUnderEmailNotification();
		
	}
	

}
