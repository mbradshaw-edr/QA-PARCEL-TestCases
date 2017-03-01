package testCaseNSPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_step2EnterProjectInformation_selectManualOption_TC02 {
	
	By AllFieldsName=By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td[1]");
	By PropertyNameTextField=By.name("name");
	By PropertyTypeDD=By.name("propertyType");
	By Address1TextField=By.name("address1");
	By Address2TextBox=By.name("address2");
	By CountryDD=By.id("country");
	By CityTextField=By.name("city");
	By StateDD=By.name("state");
	By ZipTextField=By.name("zip");
	By CountyTextField=By.name("county");
	By LatitudeTextField=By.name("latitude");
	By LongitudeTextField=By.name("longitude");
	By ContactTextField=By.name("contact");
	By PhoneTextField=By.name("phone");
	By FaxTextField=By.name("fax");
	By EmailTextField=By.name("email");
	By PoNumberTextField=By.name("ponumber");
	By Property=By.name("referenceNumber");
	By ReportRequest=By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr[21]/td/select/option[2]");
	By ConinueButton=By.name("location");
	
	public static WebDriver wd;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectStartUP_NewPortfolio\\src\\testData\\TestData_NewPortfolio.xlsx");

    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }
    public void windowScroll(WebDriver wd,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
	}
    public Validate_step2EnterProjectInformation_selectManualOption_TC02(WebDriver wd)
	{
		this.wd=wd;
	} 
		
		public void observation_onAddNewLink() throws InterruptedException
		{
			System.out.println("All the fields are available, names are - ");	
			List<WebElement> l1=wd.findElements(AllFieldsName);
			for(WebElement e:l1)
			{
				JavascriptExecutor jse = (JavascriptExecutor)wd;
				jse.executeScript("window.scrollBy(0,60)", "");
				HighlightElement(wd, e);
		            String s1=e.getText();
					System.out.println(" : "+s1 );
			}
			
			/*System.out.println("Buttons are available, names are - ");	
			List<WebElement> l2=wd.findElements(AllButtons);
			for(WebElement e1:l2)
			{
				HighlightElement(wd, e1);
		            String s2=e1.getAttribute("value");
					System.out.println(" : "+s2 );
			}*/
		}
		public void setValuesOnFields() throws InterruptedException
		{
			WebElement e1=wd.findElement(PropertyNameTextField);
			e1.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,0));
			//windowScroll(wd, e1);
			HighlightElement(wd, e1);
			Thread.sleep(1000);
			System.out.println(ExcelR1.getData("Data_createNewPortfolioManualy",1,0));
			System.out.println("User Enterd Success");
			
			WebElement e2=wd.findElement(PropertyTypeDD);
			//windowScroll(wd, e2);
			HighlightElement(wd, e2);
			e2.click();
			Thread.sleep(2000);
			Select s=new Select(e2);
			s.selectByVisibleText("Office/Commercial");
			Thread.sleep(2000);
			e2.click();
			Thread.sleep(1000);
			
			WebElement e3=wd.findElement(Address1TextField);
			//windowScroll(wd, e3);
			e3.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,1));
			HighlightElement(wd, e3);
			Thread.sleep(1000);
			
			WebElement e4=wd.findElement(Address2TextBox);
			//windowScroll(wd, e4);
			e4.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,2));
			HighlightElement(wd, e4);
			Thread.sleep(1000);
			
			WebElement e5=wd.findElement(CountryDD);
			//windowScroll(wd, e5);
			HighlightElement(wd, e5);
			e5.click();
			Thread.sleep(2000);
			Select s1=new Select(e5);
			s1.selectByVisibleText("United States");
			e5.click();
			
			WebElement e6=wd.findElement(CityTextField);
			//windowScroll(wd, e6);
			e6.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,3));
			HighlightElement(wd, e6);
			Thread.sleep(1000);
			
			WebElement e7=wd.findElement(StateDD);
			//windowScroll(wd, e7);
			HighlightElement(wd, e7);
			e7.click();
			Thread.sleep(2000);
			Select s2=new Select(e7);
			s2.selectByVisibleText("Texas");
			e7.click();
			
			WebElement e8=wd.findElement(ZipTextField);
			//windowScroll(wd, e8);
			e8.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,4));
			HighlightElement(wd, e8);
			Thread.sleep(1000);
			
			/*WebElement e9=wd.findElement(LongitudeField);
			e9.sendKeys(ExcelR1.getData(0,1,8));
			HighlightElement(wd, e9);
			Thread.sleep(1000);*/
			
			WebElement e10=wd.findElement(CountyTextField);
			JavascriptExecutor jse = (JavascriptExecutor)wd;
			jse.executeScript("window.scrollBy(0,250)", "");
			e10.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,5));
			HighlightElement(wd, e10);
			Thread.sleep(1000);
			
			WebElement e11=wd.findElement(LatitudeTextField);
			//windowScroll(wd, e11);
			e11.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,6));
			HighlightElement(wd, e11);
			Thread.sleep(1000);
			
			WebElement e12=wd.findElement(LongitudeTextField);
			//windowScroll(wd, e12);
			e12.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,7));
			HighlightElement(wd, e12);
			Thread.sleep(1000);
			
			WebElement e13=wd.findElement(ContactTextField);
			//windowScroll(wd, e13);
			e13.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,8));
			HighlightElement(wd, e13);
			Thread.sleep(1000);
			
			WebElement e14=wd.findElement(PhoneTextField);
			//windowScroll(wd, e14);
			e14.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,9));
			HighlightElement(wd, e14);
			Thread.sleep(1000);
			
			WebElement e15=wd.findElement(FaxTextField);
			//windowScroll(wd, e15);
			e15.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,10));
			HighlightElement(wd, e15);
			Thread.sleep(1000);
			
			WebElement e16=wd.findElement(EmailTextField);
			//windowScroll(wd, e16);
			e16.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,11));
			HighlightElement(wd, e16);
			Thread.sleep(1000);
			
			WebElement e17=wd.findElement(PoNumberTextField);
			//windowScroll(wd, e17);
			HighlightElement(wd, e17);
			e16.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,12));
			Thread.sleep(1000);
			
			WebElement e18=wd.findElement(Property);
			//windowScroll(wd, e18);
			HighlightElement(wd, e18);
			e16.sendKeys(ExcelR1.getData("Data_createNewPortfolioManualy",1,13));
			Thread.sleep(1000);
			
			WebElement e19=wd.findElement(ReportRequest);
			//windowScroll(wd, e19);
			HighlightElement(wd, e19);
			e19.click();
			Thread.sleep(1000);
			
			
		}
		public void click_ContinueButton() throws InterruptedException
		{
			WebElement e=wd.findElement(ConinueButton);
			windowScroll(wd, e);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(1000);
		}
		public void mainMethod() throws Exception
		{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.observation_onAddNewLink();
			this.setValuesOnFields();
			this.click_ContinueButton();
			Thread.sleep(5000);
		}

}
