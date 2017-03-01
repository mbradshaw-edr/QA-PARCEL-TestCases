package testCaseNSPOM;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_stepFourAttachDocument_TC10 {
	
	By Step1=By.xpath("/html/body/div/div/div/div/div/div/form/table/tbody/tr[3]/td");
	By BrowseButton=By.name("userfile");
	By Step2=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr[6]/td");
	By DescriptionTextField=By.name("description");
	By Step3=By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr[9]/td");
	By AttachButton=By.name("attach");
	By ContinoueButton=By.name("attachmentsComplete");
	By DeleteLink=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[4]/td[4]/a");
	
	public static WebDriver wd;
	
	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	   
	   public Validate_stepFourAttachDocument_TC10(WebDriver wd)
		{
			this.wd=wd;
		} 
	   
	   public void Step1() throws InterruptedException
		{
			WebElement e=wd.findElement(Step1);
			String s1=e.getText();
			HighlightElement(wd, e);
			System.out.println(": "+s1);
			Thread.sleep(2000);
			WebElement e1=wd.findElement(BrowseButton);
			HighlightElement(wd, e1);
			//e1.sendKeys("..\\PARCEL_projectStartUP_NewPortfolio\\src\\testData\\Campbell, Introduction to Cardiology Transcription.doc");
			
			File file = new File("src\\testData\\Campbell_Introduction to Cardiology Transcription.doc");
			e1.sendKeys(file.getAbsolutePath());
			
		}
	   public void Step2() throws InterruptedException
		{
			WebElement e=wd.findElement(Step2);
			String s2=e.getText();
			HighlightElement(wd, e);
			System.out.println(": "+s2);
			WebElement e1=wd.findElement(DescriptionTextField);
			HighlightElement(wd, e1);
			e1.sendKeys("PACEL Document");
			
		}
	   public void Step3() throws InterruptedException
		{
			WebElement e=wd.findElement(Step3);
			String s3=e.getText();
			HighlightElement(wd, e);
			System.out.println(": "+s3);
			WebElement e1=wd.findElement(AttachButton);
			HighlightElement(wd, e1);
			e1.click();
			
		}
	   public void attacheFileAgain() throws InterruptedException
	   {
		    Thread.sleep(6000);
			WebElement e1=wd.findElement(BrowseButton);
			HighlightElement(wd, e1);
			//e1.sendKeys("..\\PARCEL_projectStartUP_NewPortfolio\\src\\testData\\Campbell, Introduction to Cardiology Transcription.doc");
			
			File file = new File("src\\testData\\Campbell_Introduction to Cardiology Transcription.doc");
			e1.sendKeys(file.getAbsolutePath());
			
			WebElement e2=wd.findElement(DescriptionTextField);
			HighlightElement(wd, e2);
			e2.sendKeys("PACEL Document");
			WebElement e3=wd.findElement(AttachButton);
			HighlightElement(wd, e3);
			e3.click();
	   }
	   public void click_deleteLink() throws InterruptedException
		{
		   Thread.sleep(5000);
			WebElement e1=wd.findElement(DeleteLink);
			HighlightElement(wd, e1);
			e1.click();
		}
	   public void click_continueButton() throws InterruptedException
		{
		   Thread.sleep(5000);
			WebElement e1=wd.findElement(ContinoueButton);
			HighlightElement(wd, e1);
			e1.click();
		}
	 
	   
	   public void mainMethod() throws InterruptedException
	   {
		   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   this.Step1();
		   this.Step2();
		   this.Step3();
		   this.attacheFileAgain();
		   this.click_deleteLink();
		   this.click_continueButton();
	   }

}
