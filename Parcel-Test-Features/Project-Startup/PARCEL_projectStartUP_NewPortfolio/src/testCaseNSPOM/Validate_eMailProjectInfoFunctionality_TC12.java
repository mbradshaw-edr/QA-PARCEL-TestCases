package testCaseNSPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Validate_eMailProjectInfoFunctionality_TC12 {
	
	By FunctionalContentAndInformationOnThisPage=By.xpath("html/body/div[2]/div/div/div/div/div/form/table/tbody/tr");
	By ButtonsOnThisPage=By.xpath(".//*[@id='divButtons']/input");
	By CCTextBox=By.name("cc");
	By MessageTextBox=By.name("comments");
	By SendEmailButton=By.name("email");
	
	public static WebDriver wd;
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
   
   public Validate_eMailProjectInfoFunctionality_TC12(WebDriver wd)
	{
		this.wd=wd;
	} 
   
   public void check_FunctinalObjectAvailability() throws InterruptedException
   {
	   System.out.println("\n\n");
   	System.out.println("Validating e-mail functionality to the appropriate person related to project information");
		List<WebElement> l=wd.findElements(FunctionalContentAndInformationOnThisPage);
		for(WebElement e:l)
		{
		HighlightElement(wd, e);
		String s=e.getText();
		System.out.println(" :"+s);
		Thread.sleep(1000);
    }
   }
		 public void check_ButtonsAvailability() throws InterruptedException
		   {
				List<WebElement> l=wd.findElements(ButtonsOnThisPage);
				for(WebElement e:l)
				{
				HighlightElement(wd, e);
				String s=e.getAttribute("value");
				System.out.println(" :"+s);
				Thread.sleep(1000);
		    }
		   
				
   }
		
		  public void passingEmailsAndMessage() throws InterruptedException
		   {
				WebElement e1=wd.findElement(CCTextBox);
				HighlightElement(wd, e1);
				e1.sendKeys("nkatiyar@edrnet.com");                        // Email: nkatiyar@edrnet.com
				WebElement e2=wd.findElement(MessageTextBox);
				HighlightElement(wd, e2);
				e2.sendKeys("Hi, I have created a 'New Portfolio' as automation perspective, Thanks");
				WebElement e3=wd.findElement(SendEmailButton);
				HighlightElement(wd, e3);
				e3.click();
		   }
   
   public void mainMethod() throws InterruptedException
   {
	   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   this.check_FunctinalObjectAvailability();
	   this.check_ButtonsAvailability();
	   this.passingEmailsAndMessage();
   }
}
