package detailTestScenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2 {
	
	By siteID=By.name("s");
	By GILink=By.xpath(".//*[@id='simplifiedtoc']/li[1]/a/span");
	By EditBuuton=By.id("toggle-edit-button");
	By ProjectNameTextBox=By.name("ProjectName");
	By ConsultingFirmTextBox=By.name("ConsultantName");
	By ConsultantAddressTextBox=By.name("ConsultantAddress");
	By ConsultantCityTextBox=By.name("ConsultantCity");
	By ConsultantStateTextBox=By.name("ConsultantState");
	By ConsultantZipTextBox=By.name("ConsultantZip");
	By ConsultantPhoneTextBox=By.name("ConsultantPhone");
	By ConsultantFaxTextBox=By.name("ConsultantFax");
	By ConsultantEmailTextBox=By.name("ConsultantEmail");
	By SiteAssessorTextBox=By.name("SiteAssessor");
	By SeniorReviewerTextBox=By.name("SeniorReviewer");
	By InspectionDateTextBox=By.name("Date");
	By SiteNameTextBox=By.name("SiteName");
	By SiteAddressTextBox=By.name("SiteAddress");
	By SiteCityTextBox=By.name("SiteCity");
	By SiteStateTextBox=By.name("SiteState");
	By SiteZipTextBox=By.name("SiteZip");
	By SiteCountyTextBox=By.name("SiteCounty");
	By SiteLatitudeTextBox=By.name("SiteLatitude");
	By SiteLongitudeTextBox=By.name("SiteLongitude");
	By SiteAccessContactTextBox=By.name("SiteAccessContact");
	By ClientNameTextBox=By.name("ClientName");
	By ClientContactTextBox=By.name("ClientContact");
	By ClientAddressTextBox=By.name("ClientAddress");
	By ClientCityTextBox=By.name("ClientCity");
	By ClientStateTextBox=By.name("ClientState");
	By ClientZipTextBox=By.name("ClientZip");
	By SubmitChangesButton=By.name("submitGI");
	By CancelButton=By.name("cancelGI");
	
	public static WebDriver wd;
	public static String parentWindow;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_GILinkavailability_Clickability_andFunctionality_underTOCTab_TC2(WebDriver wd)
	{
		this.wd=wd;
	} 

	
	/* Method for click on "New Single Site Project" */
	public void enterSiteID() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println(" *******Validation of 'Order Database Reports' button with 'PlaceSingleSiteProject' in 'General Info'******");
		WebElement e=wd.findElement(siteID);
		e.sendKeys(ExcelR1.getData("Site IDs",1,0));
		Thread.sleep(2000);
		e.sendKeys(Keys.ENTER);
		  Thread.sleep(10000);
	}
		
		
		public static void newWindow() throws InterruptedException
		{
	        
		
			 parentWindow= wd.getWindowHandle();
			 
		        System.out.println(parentWindow);
	 
		        // Click on the Button "New Message Window"
	 
		       /* WebElement e=wd.findElement(GILink);
		        HighlightElement(wd, e);
		        e.click();*/
		        
	 
		        // Store and Print the name of all the windows open	              
	 
		        Set childWndows = wd.getWindowHandles();
	 
		        System.out.println(childWndows);
	 
		        // Pass a window handle to the other window
	 
		        for (String handle1 : wd.getWindowHandles()) {
	 
		        	System.out.println(handle1);
	 
		        	wd.switchTo().window(handle1);
		        	//driver.get("http://google.com");
	 
		        	}
		}
		
		public void click_GILinkAndPerformEditOperation() throws InterruptedException
		{
			System.out.println(" ");
			WebElement e=wd.findElement(GILink);
			HighlightElement(wd, e);
			e.click();
			
			newWindow();
			//wd.manage().window().maximize();
			WebElement e1=wd.findElement(EditBuuton);
			HighlightElement(wd, e1);
			e1.click();
				WebElement e2=wd.findElement(ProjectNameTextBox);
				HighlightElement(wd, e2);
				e2.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,0));
				
				WebElement e3=wd.findElement(ConsultingFirmTextBox);
				HighlightElement(wd, e3);
				e3.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,1));
				
				WebElement e4=wd.findElement(ConsultantAddressTextBox);
				HighlightElement(wd, e4);
				e2.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,2));
				
				WebElement e5=wd.findElement(ConsultantCityTextBox);
				HighlightElement(wd, e5);
				e5.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,3));
				
				WebElement e6=wd.findElement(ConsultantStateTextBox);
				HighlightElement(wd, e6);
				e6.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,4));
				
				WebElement e7=wd.findElement(ConsultantZipTextBox);
				HighlightElement(wd, e7);
				e7.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,5));
				
				WebElement e8=wd.findElement(ConsultantPhoneTextBox);
				HighlightElement(wd, e8);
				e8.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,6));
				
				WebElement e9=wd.findElement(ConsultantFaxTextBox);
				HighlightElement(wd, e9);
				e9.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,7));
				
				WebElement e10=wd.findElement(ConsultantEmailTextBox);
				HighlightElement(wd, e10);
				e10.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,8));
				
				WebElement e11=wd.findElement(SiteAssessorTextBox);
				HighlightElement(wd, e11);
				e11.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,9));
				
				WebElement e12=wd.findElement(SeniorReviewerTextBox);
				HighlightElement(wd, e12);
				e12.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,10));
				
				WebElement e13=wd.findElement(InspectionDateTextBox);
				HighlightElement(wd, e13);
				e13.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,11));
				
				WebElement e14=wd.findElement(SiteNameTextBox);
				HighlightElement(wd, e14);
				e14.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,12));
				
				WebElement e15=wd.findElement(SiteAddressTextBox);
				HighlightElement(wd, e15);
				e15.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,13));
				
				WebElement e16=wd.findElement(SiteCityTextBox);
				HighlightElement(wd, e16);
				e16.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,14));
				
				WebElement e17=wd.findElement(SiteStateTextBox);
				HighlightElement(wd, e17);
				e17.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,15));
				
				WebElement e18=wd.findElement(SiteZipTextBox);
				HighlightElement(wd, e18);
				e18.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,16));
				
				WebElement e19=wd.findElement(SiteCountyTextBox);
				HighlightElement(wd, e19);
				e19.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,17));
				
				WebElement e20=wd.findElement(SiteLatitudeTextBox);
				HighlightElement(wd, e20);
				e20.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,18));
				
				
				WebElement e21=wd.findElement(SiteLongitudeTextBox);
				HighlightElement(wd, e21);
				e21.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,19));
				
				WebElement e22=wd.findElement(SiteAccessContactTextBox);
				HighlightElement(wd, e22);
				e22.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,20));
				
				WebElement e23=wd.findElement(ClientNameTextBox);
				HighlightElement(wd, e23);
				e23.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,21));
				
				WebElement e24=wd.findElement(ClientContactTextBox);
				HighlightElement(wd, e24);
				e24.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,22));//////////////////////////////////////////////////////
				
				WebElement e25=wd.findElement(ClientAddressTextBox);
				HighlightElement(wd, e25);
				e25.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,0));
				
				WebElement e26=wd.findElement(ClientCityTextBox);
				HighlightElement(wd, e26);
				e26.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,0));
				
				WebElement e27=wd.findElement(ClientStateTextBox);
				HighlightElement(wd, e27);
				e27.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,0));
				
				WebElement e28=wd.findElement(ClientZipTextBox);
				HighlightElement(wd, e28);
				e28.sendKeys(ExcelR1.getData("General Information Main PgeDat",1,0));
			
		}
		
		public void click_submitChangesButton() throws InterruptedException
		{
			WebElement e=wd.findElement(SubmitChangesButton);
			HighlightElement(wd, e);
			e.click();
		}
		
		public void mainMethod() throws InterruptedException
		{
			this.enterSiteID();
			this.click_GILinkAndPerformEditOperation();
			this.click_submitChangesButton();
			
		}

}
