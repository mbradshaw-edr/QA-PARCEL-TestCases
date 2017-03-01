package testCaseNSPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate_availabilityOfAllStepsToCreateNewPortfolio_TC02 {
	
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
		public Validate_availabilityOfAllStepsToCreateNewPortfolio_TC02(WebDriver wd)
		{
			this.wd=wd;
		} 
		
		public void validatingSeriesOfSteps_fieldsName_FieldsOnNewPortfolioPage() throws InterruptedException
		{
			System.out.println("***********  when user clicked on 'New Portfolio' link, anew page opened, in this page a "
					+ "list od steps are available for user help is visible as follows :- *********");	
			List<WebElement> l=wd.findElements(AllStepsDiscripription);
			for(WebElement e:l)
			{
				HighlightElement(wd, e);
		            String s=e.getText();
					System.out.println(" "+s );
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
			this.validatingSeriesOfSteps_fieldsName_FieldsOnNewPortfolioPage();
		}

}
