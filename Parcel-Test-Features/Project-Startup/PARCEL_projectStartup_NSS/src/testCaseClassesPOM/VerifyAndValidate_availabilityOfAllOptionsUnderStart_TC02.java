package testCaseClassesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyAndValidate_availabilityOfAllOptionsUnderStart_TC02 {
	
	By GeneralXpathForStartOptions=By.xpath("//*[@id=('contentstart-content')]/ul/li/a");
	By NSSP=By.className("feature157");
	By NewPortfolio=By.className("feature158");
	By OrderPlaceOnEDR=By.className("feature159");
	
	
    public WebDriver wd;
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
	
	public VerifyAndValidate_availabilityOfAllOptionsUnderStart_TC02(WebDriver wd)
	{
		this.wd=wd;
	} 
	/* Method for verifying availability of all three options under the start menu */
	public void availabilityOFStart() throws InterruptedException
	{
		List<WebElement> l=wd.findElements(GeneralXpathForStartOptions);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
			String s=e.getText();
			System.out.println(": "+s);
		}
	}
	/* Method for validating New 'Single Site Project' option of start menu */
	public void validateNsspOption() throws InterruptedException
	{
		WebElement e1=wd.findElement(NSSP);
		HighlightElement(wd, e1);
		e1.click();
		//Thread.sleep(10000);
		String s=wd.getTitle();
		System.out.println("After click on 'New Single Site Project', new page title is: "+s);
		wd.navigate().back();
				
	}
	/* Method for validating New 'New Portfolio' option of start menu */
	public void validatNewPortfolioOption() throws InterruptedException
	{
		WebElement e2=wd.findElement(NewPortfolio);
		HighlightElement(wd, e2);
		e2.click();
		//Thread.sleep(10000);
		String s=wd.getTitle();
		System.out.println("After click on 'New Portfolio', new page title is: "+s);
		wd.navigate().back();
	}
	/* Method for validating New 'Order placed on EDR' options of start menu */
	public void validateOrderPlaceOnEDROption() throws InterruptedException
	{
		WebElement e3=wd.findElement(OrderPlaceOnEDR);
		HighlightElement(wd, e3);
		e3.click();
		//Thread.sleep(10000);
		String s=wd.getTitle();
		System.out.println("After click on 'Order Place On EDR', new page title is: "+s);
		wd.navigate().back();
				
	}
	/* Method for calling all methods related to this test case together */
	public void allOptionasOfStart() throws InterruptedException
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.availabilityOFStart();
		this.validateNsspOption();
		this.validatNewPortfolioOption();
		this.validateOrderPlaceOnEDROption();
	}

}
