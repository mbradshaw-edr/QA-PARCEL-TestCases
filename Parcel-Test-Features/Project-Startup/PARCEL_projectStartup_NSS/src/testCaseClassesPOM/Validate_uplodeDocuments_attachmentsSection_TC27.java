package testCaseClassesPOM;

import java.awt.Robot;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Validate_uplodeDocuments_attachmentsSection_TC27 {
	
	By HomeButton=By.className("feature130");
	By NSSP=By.className("feature157");
	
	By AttachmentsSection=By.xpath("html/body/div/div/div/div/div/div/form/table[8]/tbody/tr/td/b");
	By AttachmentsShowLink=By.xpath(".//*[@id='divShowAttach']/b/a");
	By AttachmentsHide=By.xpath(".//*[@id='divHideAttach']/b/a");
	
	By BrowseOrChoseFileButton=By.name("attachment");
	By AddFileButton=By.name("submitAttach");
	By RemoveOption=By.xpath(".//*[@id='divAttach']/table/tbody/tr/td/li/a");
	By CurrentlyUplodedFileName=By.xpath(".//*[@id='divAttach']/table/tbody/tr/td[2]");
	By FileSizeOfCurrenUploded=By.xpath(".//*[@id='divAttach']/table/tbody/tr/td[3]");
	By UPploadSuccessMessage=By.xpath(".//*[@id='divAttach']/div");
	
	By Element1=By.xpath("html/body/div/div/div/div/div/div/form/table[1]/tbody/tr/td/b");
	By Element2=By.xpath(".//*[@id='divEmailHeader']/table/tbody/tr/td/b");
	
	public WebDriver wd;
	 public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_uplodeDocuments_attachmentsSection_TC27(WebDriver wd)
	{
		this.wd=wd;
	} 

	
	/* Method for click on "New Single Site Project" */
	public void click_NewSingleSiteProject() throws InterruptedException
	{
		System.out.println("*** Validate 'Attachments' section on New Single Site Project page. ***");
		System.out.println(" ");
		WebElement e1=wd.findElement(HomeButton);
		HighlightElement(wd, e1);
		e1.click();
		WebElement e2=wd.findElement(NSSP);
		HighlightElement(wd, e2);
		e2.click();
	}
	public void goToAttachementsSection_clickOnShow() throws InterruptedException
	{
		System.out.println("When user clicked on 'Show' link for this section, it get expended"
				+ "displayad fields is as follows-");
		WebElement e1=wd.findElement(AttachmentsShowLink);
		HighlightElement(wd, e1);
		e1.click();
    }
	public void fileUploadWithAddFunctionality() throws InterruptedException
	{
		WebElement e1=wd.findElement(BrowseOrChoseFileButton);
		HighlightElement(wd, e1);
		File file = new File("src\\filesStore\\Extra1.jpg");
		e1.sendKeys(file.getAbsolutePath());
		
		WebElement e2=wd.findElement(AddFileButton);
		HighlightElement(wd, e2);
		e2.click();
		System.out.println("File uploaded successfully ");
		//Robot r=new Robot();
		
		
    }
	public void newThingsVisibleAfterUploadFileSuccess() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("New things visible after upload a file successfuly under the 'Attachments' section as below-");
		WebElement e1=wd.findElement(UPploadSuccessMessage);
		HighlightElement(wd, e1);
		String s3=e1.getText();
		System.out.println("Message : "+s3);
		WebElement e2=wd.findElement(RemoveOption);
		HighlightElement(wd, e2);
		String s=e2.getText();
		System.out.println(" : "+s);
		WebElement e3=wd.findElement(CurrentlyUplodedFileName);
		HighlightElement(wd, e3);
		String s1=e3.getText();
		System.out.println(" : "+s1);
		WebElement e4=wd.findElement(FileSizeOfCurrenUploded);
		HighlightElement(wd, e4);
		String s2=e4.getText();
		System.out.println(" : "+s2);
		System.out.println("Uploaded things visible successfully");
		
	}
	public void removeFunctionalityUnderAttachments() throws InterruptedException
	{
		System.out.println("No file available, when clicked on remove option");
		WebElement e1=wd.findElement(RemoveOption);
		HighlightElement(wd, e1);
		e1.click();
	}
	public void scrollWondow()
	{
		/*Actions ac=new Actions(wd);
		WebElement e1=wd.findElement(Element1);
		WebElement e2=wd.findElement(Element2);
		ac.dragAndDrop(e1, e2);*/
		
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("window.scrollBy(0,-500)", "");
		

	}
	
	
	public void mainMethod() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.click_NewSingleSiteProject();
		this.goToAttachementsSection_clickOnShow();
		this.fileUploadWithAddFunctionality();
		this.newThingsVisibleAfterUploadFileSuccess();
		this.removeFunctionalityUnderAttachments();
		this.scrollWondow();
	}

}
