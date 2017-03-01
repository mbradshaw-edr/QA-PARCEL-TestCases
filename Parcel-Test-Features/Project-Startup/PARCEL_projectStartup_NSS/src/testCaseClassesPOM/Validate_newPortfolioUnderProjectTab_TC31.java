package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_newPortfolioUnderProjectTab_TC31 {
	
     By HomeButton=By.className("feature130");
     By ProjectTab=By.id("link_131");
     By NewPortfolioLink=By.className("feature136");
     By AllStepsDiscripription=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td[2]");
     By AllButtonsOfThePage=By.xpath("/html/body/div/div/div/div/div/div/form/table/tbody/tr[8]/td/input");
     By MessageForMendetoryFields=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[8]/td/b");
    
     
     
     
     public WebDriver wd;

     public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
     {
            JavascriptExecutor jse=(JavascriptExecutor)wd;
           jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
           Thread.sleep(2000);
           jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
        
     }
		public Validate_newPortfolioUnderProjectTab_TC31(WebDriver wd)
		{
			this.wd=wd;
		} 
		public void availibilityOfNewPortfolioLinkUnderTheProjectTab() throws InterruptedException
		{
			System.out.println("*** Checke availability of 'AddReportsToProjectTool' under the tool Icon, After create the project ***");
			WebElement e1=wd.findElement(HomeButton);
			HighlightElement(wd, e1);
			e1.click();
			WebElement e2=wd.findElement(ProjectTab);
			HighlightElement(wd, e2);
			e2.click();
			WebElement e3=wd.findElement(NewPortfolioLink);
			HighlightElement(wd, e3);
			String s=e3.getText();
			
			System.out.println("The name of this option : "+s);
			Boolean b=wd.findElement(NewPortfolioLink).isDisplayed();
			System.out.println("Checking the availability of this option : "+b);
			Boolean b1=wd.findElement(NewPortfolioLink).isSelected();
			System.out.println("Checking the clickability of this option : "+b1);
			
		}
		public void click_newPortfolioLink() throws InterruptedException
		{
			WebElement e1=wd.findElement(NewPortfolioLink);
			HighlightElement(wd, e1);
			e1.click();
			String s=wd.getTitle();
			System.out.println("The Title of this new pge, afer click on 'New Protfolio' link is :"+s);
		}
		public void validatingNewPortfolioLink() throws InterruptedException
		{
			System.out.println("when user clicked on 'New Portfolio' link, anew page opened, in this page a "
					+ "list od steps are available for user help is visible as follows :- ");	
			List<WebElement> l=wd.findElements(AllStepsDiscripription);
			for(WebElement e:l)
			{
				HighlightElement(wd, e);
		            String s=e.getText();
					System.out.println(" step: "+s );
			}
			
			System.out.println("Tow buttons are also available, names are - ");	
			List<WebElement> l1=wd.findElements(AllButtonsOfThePage);
			for(WebElement e1:l1)
			{
				HighlightElement(wd, e1);
		            String s1=e1.getAttribute("value");
					System.out.println(" : "+s1 );
			}
			WebElement e4=wd.findElement(MessageForMendetoryFields);
			HighlightElement(wd, e4);
			String s2=e4.getText();
			
			System.out.println("Message aboute mendetory field : "+s2);
			
		}
		
		public void mainMethod() throws InterruptedException
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.availibilityOfNewPortfolioLinkUnderTheProjectTab();
			this.click_newPortfolioLink();
			this.validatingNewPortfolioLink();
		}
}
