package testCaseNSPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_addNewLicationLink_onProjectCreationWithUploadSpredSheet_TC05 {
	
	By AddANewLocationLink=By.xpath("/html/body/div/div/div/div/div/div/form/a");
	By AllFieldsNames=By.xpath("/html/body/div/div/div/div/div/div/form/table/tbody/tr/td[1]");
	By AllButtons=By.xpath("html/body/div/div/div/div/div/div/form/input");
	By PropertyTextBox=By.name("referenceNumber");
	By NameField=By.name("name");
	By AddressField=By.name("address1");
	By CityField=By.name("city");
	By StateField=By.name("state");
	By ZipField=By.name("zip");
	By CountyField=By.name("county");
	By CountryField=By.name("country");
	By LatitudeField=By.name("latitude");
	By LongitudeField=By.name("longitude");
	By ContactField=By.name("contact");
	By PhoneField=By.name("phone");
	By FaxField=By.name("fax");
	By EmailField=By.name("email");
	By PoNumberField=By.name("poNumber");
	By AddThisSiteButton=By.name("submitAddSite");
	
	public static WebDriver wd;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectStartUP_NewPortfolio\\src\\testData\\TestData_NewPortfolio.xlsx");

    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
    public Validate_addNewLicationLink_onProjectCreationWithUploadSpredSheet_TC05(WebDriver wd)
	{
		this.wd=wd;
	} 
		
		public void click_addNewLocation() throws InterruptedException
		{
			WebElement e=wd.findElement(AddANewLocationLink);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(5000);
		}
		public void observation_onAddNewLink() throws InterruptedException
		{
			System.out.println("All the fields are available, names are - ");	
			List<WebElement> l1=wd.findElements(AllFieldsNames);
			for(WebElement e:l1)
			{
				HighlightElement(wd, e);
		            String s1=e.getText();
					System.out.println(" : "+s1 );
			}
			
			System.out.println("Buttons are available, names are - ");	
			List<WebElement> l2=wd.findElements(AllButtons);
			for(WebElement e1:l2)
			{
				HighlightElement(wd, e1);
		            String s2=e1.getAttribute("value");
					System.out.println(" : "+s2 );
			}
		}
		public void setValuesOnFields() throws InterruptedException
		{
			WebElement e1=wd.findElement(PropertyTextBox);
			e1.sendKeys(ExcelR1.getData("Add Report Entries",1,0));
			HighlightElement(wd, e1);
			Thread.sleep(1000);
			System.out.println(ExcelR1.getData("Add Report Entries",1,0));
			System.out.println("User Enterd Success");
			
			WebElement e2=wd.findElement(NameField);
			e2.sendKeys(ExcelR1.getData("Add Report Entries",1,1));
			HighlightElement(wd, e2);
			Thread.sleep(1000);
			
			WebElement e3=wd.findElement(AddressField);
			e3.sendKeys(ExcelR1.getData("Add Report Entries",1,2));
			HighlightElement(wd, e3);
			Thread.sleep(1000);
			
			WebElement e4=wd.findElement(CityField);
			e4.sendKeys(ExcelR1.getData("Add Report Entries",1,3));
			HighlightElement(wd, e4);
			Thread.sleep(1000);
			
			WebElement e5=wd.findElement(StateField);
			e5.sendKeys(ExcelR1.getData("Add Report Entries",1,4));
			HighlightElement(wd, e5);
			Thread.sleep(1000);
			
			WebElement e6=wd.findElement(ZipField);
			e6.sendKeys(ExcelR1.getData("Add Report Entries",1,5));
			HighlightElement(wd, e6);
			Thread.sleep(1000);
			
			WebElement e7=wd.findElement(CountyField);
			e7.sendKeys(ExcelR1.getData("Add Report Entries",1,6));
			HighlightElement(wd, e7);
			Thread.sleep(1000);
			
			WebElement e8=wd.findElement(CountryField);
			e8.sendKeys(ExcelR1.getData("Add Report Entries",1,7));
			HighlightElement(wd, e8);
			Thread.sleep(1000);
			
			/*WebElement e9=wd.findElement(LongitudeField);
			e9.sendKeys(ExcelR1.getData(0,1,8));
			HighlightElement(wd, e9);
			Thread.sleep(1000);*/
			
			WebElement e10=wd.findElement(LatitudeField);
			e10.sendKeys(ExcelR1.getData("Add Report Entries",1,8));
			HighlightElement(wd, e10);
			Thread.sleep(1000);
			
			WebElement e11=wd.findElement(LongitudeField);
			e11.sendKeys(ExcelR1.getData("Add Report Entries",1,9));
			HighlightElement(wd, e11);
			Thread.sleep(1000);
			
			WebElement e12=wd.findElement(ContactField);
			e12.sendKeys(ExcelR1.getData("Add Report Entries",1,10));
			HighlightElement(wd, e12);
			Thread.sleep(1000);
			
			WebElement e13=wd.findElement(PhoneField);
			e13.sendKeys(ExcelR1.getData("Add Report Entries",1,11));
			HighlightElement(wd, e13);
			Thread.sleep(1000);
			
			WebElement e14=wd.findElement(FaxField);
			e14.sendKeys(ExcelR1.getData("Add Report Entries",1,12));
			HighlightElement(wd, e14);
			Thread.sleep(1000);
			
			WebElement e15=wd.findElement(EmailField);
			e15.sendKeys(ExcelR1.getData("Add Report Entries",1,13));
			HighlightElement(wd, e15);
			Thread.sleep(1000);
			
			WebElement e16=wd.findElement(PoNumberField);
			e16.sendKeys(ExcelR1.getData("Add Report Entries",1,14));
			HighlightElement(wd, e16);
			Thread.sleep(1000);
			
			WebElement e17=wd.findElement(AddThisSiteButton);
			
			HighlightElement(wd, e17);
			Thread.sleep(2000);
			e17.click();
			Thread.sleep(1000);
			
			
		}
		public void mainMethod() throws Exception
		{
			this.click_addNewLocation();
			this.observation_onAddNewLink();
			this.setValuesOnFields();
			Thread.sleep(5000);
		}

}
