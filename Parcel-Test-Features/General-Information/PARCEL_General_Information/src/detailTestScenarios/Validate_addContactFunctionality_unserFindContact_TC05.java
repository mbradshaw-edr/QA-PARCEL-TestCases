package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_addContactFunctionality_unserFindContact_TC05 {
	
	By AddContactLink=By.id("addContactShow");
	By FirstNameTextField=By.xpath(".//*[@id='addContactForm']/form/table/tbody/tr[1]/td/input");
	By LastNameTextField=By.xpath(".//*[@id='addContactForm']/form/table/tbody/tr[2]/td/input");
	By CompanyNameTextBox=By.xpath(".//*[@id='addContactForm']/form/table/tbody/tr[3]/td/input");
	By ContactTextBox=By.xpath(".//*[@id='addContactForm']/form/table/tbody/tr[9]/td/input");
	By EmailTextBox=By.xpath(".//*[@id='addContactForm']/form/table/tbody/tr[11]/td/input");
	By SubmitChangeButton=By.xpath(".//*[@id='addContactForm']/form/table/tbody/tr[12]/td/input[1]");
	By CancelButton=By.xpath(".//*[@id='addContactForm']/form/table/tbody/tr[12]/td/input[2]");
	By CloseWindowButton=By.name("close");
	By SuccessMessage=By.xpath("html/body/form/table/tbody/tr[3]/td");
	By ContentOfAddedContactTable=By.xpath("html/body/table[2]/tbody/tr/td/a");
	By failureMessage= By.xpath("html/body/form/table/tbody/tr[3]/td");
	By FindContactLink=By.xpath("//*[@id='viewGI']/table/tbody/tr/td/table/tbody/tr[9]/td/a");
	
	//Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2 obj1=new Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2(wd);
	
	
	public static WebDriver wd;
	public static Set<String> s;
	public static Set<String> s1;
	public static Set<String> s2;
	public static Set<String> s3;
	public String parent1Window;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_addContactFunctionality_unserFindContact_TC05(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_addContactLink() throws InterruptedException
	{
		WebElement e=wd.findElement(AddContactLink);
		HighlightElement(wd, e);
		e.click();
	}
	
	public void AddContact_withValidInputData() throws InterruptedException
	{   wd.manage().window().maximize();
		WebElement e=wd.findElement(FirstNameTextField);
		HighlightElement(wd, e);
		e.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",1,1));
		
		WebElement e1=wd.findElement(LastNameTextField);
		HighlightElement(wd, e1);
		e1.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",1,2));
		
		WebElement e2=wd.findElement(CompanyNameTextBox);
		HighlightElement(wd, e2);
		e2.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",1,3));
		
		WebElement e3=wd.findElement(ContactTextBox);
		HighlightElement(wd, e3);
		e3.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",1,4));
		
		WebElement e4=wd.findElement(EmailTextBox);
		HighlightElement(wd, e4);
		e4.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",1,5));
	}
	
	public void AddContact_withInvalidInputData() throws InterruptedException
	{   wd.manage().window().maximize();
		WebElement e=wd.findElement(FirstNameTextField);
		HighlightElement(wd, e);
		e.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",2,1));
		
		WebElement e1=wd.findElement(LastNameTextField);
		HighlightElement(wd, e1);
		e1.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",2,2));
		
		WebElement e2=wd.findElement(CompanyNameTextBox);
		HighlightElement(wd, e2);
		e2.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",2,3));
		
		WebElement e3=wd.findElement(ContactTextBox);
		HighlightElement(wd, e3);
		e3.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",2,4));
		
		WebElement e4=wd.findElement(EmailTextBox);
		HighlightElement(wd, e4);
		e4.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",2,5));
	}
	
	public void AddContact_withBlankInputData() throws InterruptedException
	{   wd.manage().window().maximize();
		WebElement e=wd.findElement(FirstNameTextField);
		HighlightElement(wd, e);
		e.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",3,1));
		
		WebElement e1=wd.findElement(LastNameTextField);
		HighlightElement(wd, e1);
		e1.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",3,2));
		
		WebElement e2=wd.findElement(CompanyNameTextBox);
		HighlightElement(wd, e2);
		e2.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",3,3));
		
		WebElement e3=wd.findElement(ContactTextBox);
		HighlightElement(wd, e3);
		e3.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",3,4));
		
		WebElement e4=wd.findElement(EmailTextBox);
		HighlightElement(wd, e4);
		e4.sendKeys(ExcelR1.getData("Data for AddContacr_unserFinfCo",3,5));
	}
	
	public void click_submitChangesButton() throws InterruptedException
	{
		WebElement e=wd.findElement(SubmitChangeButton);
		HighlightElement(wd, e);
		e.click();
		
	}
	
	public void click_addContact_withCancelButton() throws InterruptedException
	{
		WebElement e=wd.findElement(CancelButton);
		HighlightElement(wd, e);
		e.click();
	}
	
	public void finalMessage() throws InterruptedException
	{
	    WebElement e=wd.findElement(SuccessMessage);
		HighlightElement(wd, e);
		String s=e.getText();
		System.out.println(": "+s);
	}
	
	public void click_closeWindowButton() throws InterruptedException
	{
	    WebElement e=wd.findElement(CloseWindowButton);
		HighlightElement(wd, e);
		e.click();
		//wd.switchTo().window(parent1Window);
		
	}
	
	public void observedAddedContactsTable() throws InterruptedException
	{
		
		
		List<WebElement> e1= wd.findElements(ContentOfAddedContactTable);
		int counter=0;
	    for(WebElement e:e1)
	    {
			HighlightElement(wd, e);
			counter++;
			
			String s1=e.getText();
			System.out.println(s1 );
			if(counter==12)
			{
				break;
			}
	    }
	}
	
	Vailidate_availabilityAndClickability_FindContact_TC04 m1=new Vailidate_availabilityAndClickability_FindContact_TC04(wd);
	
	public void addWindow() throws InterruptedException
	{
        //String parentWindow= wd.getWindowHandle();
		// System.out.println(parentWindow);
		
		this.click_addContactLink();
		this.AddContact_withValidInputData();
		this.click_submitChangesButton();
		this.finalMessage();
		System.out.println("Added new Contact with valid input data: ");
		this.observedAddedContactsTable();
		this.click_closeWindowButton();
		
		wd.switchTo().window(m1.parentWindow);
		this.click_onFindContactLink();
		
         s = wd.getWindowHandles();
              for (String handle1 : s) 
              {
               System.out.println(handle1);
               wd.switchTo().window(handle1);
	          }
              
              
              
      	    this.click_addContactLink();
      		this.AddContact_withInvalidInputData();
      		this.click_submitChangesButton();
      		this.finalMessage();
      		System.out.println("AddContact with invalid input data: ");
      		this.observedAddedContactsTable();
      		this.click_closeWindowButton();
      		
      		wd.switchTo().window(m1.parentWindow);
      		this.click_onFindContactLink();
      		s1 = wd.getWindowHandles();
            for (String handle1 : s1) 
            {
             System.out.println(handle1);
             wd.switchTo().window(handle1);
	          }
            
    	    this.click_addContactLink();
    	    this.click_submitChangesButton();
    		System.out.println("AddContact with blank input data: ");
    		this.finalMessage();
    		this.click_closeWindowButton();
    		
    		wd.switchTo().window(m1.parentWindow);
    		this.click_onFindContactLink();
    		s2 = wd.getWindowHandles();
            for (String handle1 : s2) 
            {
             System.out.println(handle1);
             wd.switchTo().window(handle1);
	          }
            
            this.click_addContactLink();
    		this.AddContact_withValidInputData();
    		this.click_addContact_withCancelButton();
    		System.out.println("Added new Contact with valid input data by click on cancel button: ");
    		this.observedAddedContactsTable();
    		Thread.sleep(5000);
    		this.click_closeWindowButton();
    		wd.switchTo().window(m1.parentWindow);
    		
    		
    		
    		
              
              
	      
	}
	
	public void click_onFindContactLink() throws InterruptedException
	{ 
		WebElement e1=wd.findElement(FindContactLink);
		HighlightElement(wd, e1);
		e1.click();
		Thread.sleep(3000);
	}
	
	/*public void mainMethid() throws InterruptedException
	{

		this.click_addContactLink();
		this.AddContact_withValidInputData();
		this.click_submitChangesButton();
		this.finalMessage();
		System.out.println("Added new Contact with valid input data: ");
		this.observedAddedContactsTable();
		this.click_closeWindowButton();
		
	    this.click_onFindContactLink();
	    this.click_addContactLink();
		this.AddContact_withInvalidInputData();
		this.click_submitChangesButton();
		this.finalMessage();
		System.out.println("AddContact with invalid input data: ");
		this.observedAddedContactsTable();
		this.click_closeWindowButton();
		
		this.click_onFindContactLink();
	    this.click_addContactLink();
	    this.click_submitChangesButton();
		System.out.println("AddContact with blank input data: ");
		this.finalMessage();
		this.click_closeWindowButton();
	}*/

}
