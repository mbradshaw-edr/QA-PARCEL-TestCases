package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_editDeleteFunctionalityForUsers_TC09 {
	
	By EditButton=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td/div/a[1]");
	By EditPageHeader=By.xpath("html/body/div[2]/div//div/h3");
	By EmailTextField=By.name("email");
	//By FirstNameTextField=By.name("first");
	By DefaultAccessLevelDD=By.name("role"); //Select by visible text: Corporate User
	By MiddNameTextField=By.name("mi");
	By LastNameTextField=By.name("last");
	By SubmitButton=By.name("addAccount");
	By CancelButton=By.name("cancel");
	By BrowseButton=By.xpath("/html/body/div//form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/input");
	By EditSuccessMSG=By.xpath("/html/body/div/div/div/div/div/div/div[1]");
	By EditCancelMsg=By.xpath("/html/body/div/div/div/div/div/div/div");
	By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	
	By FirstUserNameValue=By.xpath("html/body/div//div/table[2]/tbody/tr[1]/td");
	By FirstUserNamelebel=By.xpath("html/body/div//div/table/tbody/tr[1]/th");
	By FirstNameForEditOperation=By.name("first");
	By UserNameForEditOperation=By.name("userName");
	
	By DeleteButton=By.xpath("html/body/div//div/table/tbody/tr/td/div/a[2]");
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	//By ListOfUsers=By.xpath(".//*[@id='printAreaTable']/tbody/tr/td[1]/a");
	
	
	public static WebDriver wd;
	public static Set<String> s;
	public String parent1Window;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_editDeleteFunctionalityForUsers_TC09(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void click_onEditButton() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement e=wd.findElement(EditButton);
		HighlightElement(wd, e);
		e.click();
		
		WebElement e1=wd.findElement(EditPageHeader);
		HighlightElement(wd, e1);
		String s=e1.getText();
		System.out.println("Page header is: "+s);
	}
	
	public void observingEditedUserInTheUserList() throws InterruptedException
	{
		Thread.sleep(5000);
		try{
			
			WebElement e1=wd.findElement(FirstUserNamelebel);
			HighlightElement(wd, e1);
			String s1=e1.getText();
			System.out.println(" : "+s1);
			
			WebElement e2=wd.findElement(FirstUserNameValue);
			HighlightElement(wd, e2);
			String s2=e2.getText();
			System.out.println(" : "+s2);
		}
		catch(Exception e)
		{
			e.printStackTrace(System.out);
		}
	}
	
	public void performingEditOperationWithSubmitButton() throws InterruptedException
	{
		WebElement e=wd.findElement(UserNameForEditOperation);
		HighlightElement(wd, e);
		e.sendKeys(ExcelR1.getData("Data for creatite or add a user",3,5));
		
		WebElement e3=wd.findElement(FirstNameForEditOperation);
		HighlightElement(wd, e3);
		e3.sendKeys(ExcelR1.getData("Data for creatite or add a user",3,2));
		
		WebElement e1=wd.findElement(SubmitButton);
		HighlightElement(wd, e1);
		e1.click();
		
		WebElement e2=wd.findElement(EditSuccessMSG);
		HighlightElement(wd, e2);
		String s=e2.getText();
		System.out.println("Edit Success MSG: "+s);
		
	}
	
	public void cancelEditOperationWithCancelButton() throws InterruptedException
	{
		WebElement e=wd.findElement(UserNameForEditOperation);
		HighlightElement(wd, e);
		e.sendKeys(ExcelR1.getData("Data for creatite or add a user",3,2));
		
		WebElement e3=wd.findElement(FirstNameForEditOperation);
		HighlightElement(wd, e3);
		e3.sendKeys(ExcelR1.getData("Data for creatite or add a user",3,2));
		
		WebElement e1=wd.findElement(CancelButton);
		HighlightElement(wd, e1);
		e1.click();
		
		WebElement e2=wd.findElement(EditCancelMsg);
		HighlightElement(wd, e2);
		String s=e2.getText();
		System.out.println("Edit Cancel MSG: "+s);
		
	}
	
	public void mactchingWithNewlyCreatedUser() throws InterruptedException
	{
		
		String s=ExcelR1.getData("Data for creatite or add a user",3,2);
		System.out.println(s);
		
		try{
			
		List<WebElement> l= wd.findElements(ListOfUsers);
	    for(WebElement w:l)
	    {
			
			String s1=w.getText();
			//System.out.println(s1 );
			Thread.sleep(5000);
			if(s1.contains(s))
			{
				HighlightElement(wd, w);
				//System.out.println(s);
				w.click();
				
				Thread.sleep(3000);
				break;
			}
			
	    }
		}
		catch(Exception e)
		{
			e.printStackTrace(System.out);
		}
	}
	
	public void deleteNewlyCreatedUserWithDeleteButton() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement e=wd.findElement(DeleteButton);
		HighlightElement(wd, e);
		e.click();
		
		Alert a=wd.switchTo().alert();
		a.accept();
	}
	
	public void mainMethod() throws InterruptedException
	{
	   this.observingEditedUserInTheUserList();
	   this.click_onEditButton();
	   //this.observingEditedUserInTheUserList();
	   this.performingEditOperationWithSubmitButton();
	   this.observingEditedUserInTheUserList();
	   this.click_onEditButton();
	   this.cancelEditOperationWithCancelButton();
	   this.mactchingWithNewlyCreatedUser();
	   this.deleteNewlyCreatedUserWithDeleteButton();
	   
	}
	
	

}
