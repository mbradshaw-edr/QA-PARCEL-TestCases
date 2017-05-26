package detailTestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_finishOrderButton_underTheOrderPlacedOnEdrWebsitePage_TC04 {
	
	By ProjectTab=By.id("link_131");
	By OrderPlaceedOnEDRWebsite=By.className("feature139");
	
	By SixthFinishOrderButton=By.xpath("html/body/div//div/table/tbody/tr[7]/td/a");
	By SixthOrderNumber=By.xpath("html/body/div//div/table/tbody/tr[7]/td[1]");
	
	By ProjectNameField=By.id("project_name");
	By DateDraftDueField=By.id("draft_date");
	By DateFinelDueField=By.id("final_date");
	By PropertyNumber=By.name("prop_number");
	By PropertyName=By.name("prop_name");
	By AddressField=By.id("prop_address1");
	By City=By.id("prop_city");
	By PropZip=By.id("prop_zip");
	By CountryDropDown=By.id("prop_country");
	By StateDropdown=By.id("prop_state");
	By Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox=By.xpath("//*[@value='PhaseI.2149']");
	By Project_ID=By.xpath("//*[@id='divFeePhaseI.2149']/input[2]");
	By SubmitButton=By.name("submitExpress");
	By ToolIcon=By.xpath("html/body/div/div/div/div/div/div/div/div/div[2]/a");
	By AddProjectReportOption=By.xpath("html/body/div/div/div/div/div/div/div/div/div/ul/li[8]/a");
	
	By GoToFirstProjectReport=By.xpath(".//*[@id='1217624']/td[1]/a");
	By GoToFirstProjectDashboard=By.xpath(".//*[@id='1217624']/td[2]/a");
	
	By ReportHederName=By.className("report-title");
	
	
	By Redirected_PageHeader_AfterClickedOn_FinishOrderButton=By.xpath("html/body/div[2]/div/div/div/div/div/h3");
	By NextOrderNumber=By.xpath("html/body/div/div//div/table/tbody/tr[6]/td[1]");
	By NextFinishOrderButton=By.xpath("html/body/div//div/table/tbody/tr[6]/td/a");
	By SecondDDOnAdvanceProjectCreationPage=By.xpath("html/body/div//div/form/table/tbody/tr[3]/td/table/tbody/tr[2]/td/select/option[2]");
	By ContinueButton1WithAdvanceSetup=By.name("reports");
	By ContinueButton2WithAdvanceSetu=By.name("consultantFee");
	By ContinueButton3WithAdvanceSetup=By.name("attachmentsComplete");
	By ContinueButton4WithAdvanceSetup=By.name("submitSetAccess");
	By ContinueButton5WithAdvanceSetup=By.name("confirmation");
	By CCTextBoxWithAdvanceSetup=By.name("cc");
	By MessageBoxWithAdvanceSetup=By.name("comments");
	By EmailButtonWithAdvanceSetup=By.name("email");
	By CreatedSuccessMessageBy=By.xpath("html/body/div//div/table/tbody/tr/td/h4");
	
	By ThisProjectNameAllreadtExist=By.xpath(".//*[@id='divButtons']");
	
	
	
	
	public String s;
	public String s0;
	public WebDriver wd;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectStartUp_OrderPlacedOnEDRwebsite\\src\\testData\\OrderPlaced.xlsx");

	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
		public Validate_finishOrderButton_underTheOrderPlacedOnEdrWebsitePage_TC04(WebDriver wd)
		{
			this.wd=wd;
		} 
		public void click_NewSingleSiteProjectButton() throws InterruptedException
		{
			WebElement e=wd.findElement(SixthOrderNumber);
			HighlightElement(wd, e);
			String s1=e.getText();
			System.out.println("The order Number, from where 'Finish Order' have been performed, is : "+s1);
					
			WebElement e1=wd.findElement(SixthFinishOrderButton);
			HighlightElement(wd, e1);
			e1.click();
			
			Thread.sleep(10000);
			
			WebElement e2=wd.findElement(Redirected_PageHeader_AfterClickedOn_FinishOrderButton);
			HighlightElement(wd, e2);
			s=e2.getText();
			System.out.println("The page header name, after clicked on 'FinishOrder' button : "+s);
		}
		
		public void goBackTo_orderPlacedOnEDRwebsite() throws InterruptedException
		{
			Thread.sleep(4000);
			WebElement e1=wd.findElement(ProjectTab);
			HighlightElement(wd, e1);
			e1.click();
			
			WebElement e2=wd.findElement(OrderPlaceedOnEDRWebsite);
			HighlightElement(wd, e2);
			e2.click();
		}
		
		public void click_againNewSingleSiteProjectButton() throws InterruptedException
		{ 
			
			
			wd.navigate().back();
			Thread.sleep(4000);
			WebElement e=wd.findElement(NextOrderNumber);
			HighlightElement(wd, e);
			String s1=e.getText();
			System.out.println("The order Number, from where 'Finish Order' have been performed, is : "+s1);
					
			WebElement e1=wd.findElement(NextFinishOrderButton);
			HighlightElement(wd, e1);
			e1.click();
			
			Thread.sleep(7000);
			
			WebElement e2=wd.findElement(Redirected_PageHeader_AfterClickedOn_FinishOrderButton);
			HighlightElement(wd, e2);
			s=e2.getText();
			System.out.println("The page header name, after clicked on 'FinishOrder' button : "+s1);
		}
		
		
		public void set_DateDraftDueField() throws InterruptedException
		{
			WebElement e1=wd.findElement(DateDraftDueField);
			HighlightElement(wd, e1);
			e1.sendKeys("11/01/2016");
			
		}
		public void set_DateFineDueField() throws InterruptedException
		{
			WebElement e1=wd.findElement(DateFinelDueField);
			HighlightElement(wd, e1);
			e1.sendKeys("11/30/2016");
		}
		
		public void set_PropertyNumber() throws InterruptedException
		{
			WebElement e1=wd.findElement(PropertyNumber);
			e1.sendKeys(ExcelR1.getData("Finish Order",1,2));
			HighlightElement(wd, e1);
		}
		
		public void set_PropertyName() throws InterruptedException
		{
			WebElement e1=wd.findElement(PropertyName);
			e1.sendKeys(ExcelR1.getData("Finish Order",1,3));
			HighlightElement(wd, e1);
		}
		public void set_prop_AddressField() throws InterruptedException
		{
			WebElement e1=wd.findElement(AddressField);
			e1.sendKeys(ExcelR1.getData("Finish Order",1,4));
			HighlightElement(wd, e1);
		}
		public void set_City() throws InterruptedException
		{
			WebElement e1=wd.findElement(City);
			e1.sendKeys(ExcelR1.getData("Finish Order",1,6));
			HighlightElement(wd, e1);
		}
		
		public void set_zip() throws InterruptedException
		{
			WebElement e1=wd.findElement(City);
			e1.sendKeys(ExcelR1.getData("Finish Order",1,7));
			HighlightElement(wd, e1);
		}
		
		public void set_CountryDropDown() throws InterruptedException
		{
			WebElement e1=wd.findElement(CountryDropDown);
			e1.click();
					HighlightElement(wd, e1);
			Select s1=new Select(e1);
			s1.selectByValue("US");
			e1.click();
		}
		public void set_StateDropdown() throws InterruptedException
		{
			WebElement e1=wd.findElement(StateDropdown);
					HighlightElement(wd, e1);
					e1.click();
			Select s1=new Select(e1);
			s1.selectByValue("TX");
			e1.click();
		}
		
		public void click_checkBoxUnderReportSection() throws InterruptedException
		{
			WebElement e1=wd.findElement(Phase1ESA_ParcelOptimizedPhase1Template2013ChechBox);
			HighlightElement(wd, e1);
			e1.click();
			Thread.sleep(2000);
			
			WebElement e2=wd.findElement(Project_ID);
			e2.sendKeys(ExcelR1.getData("Phase 1 ESA",1,1));
			HighlightElement(wd, e2);
		}
		
		public void click_SubmitButton() throws InterruptedException
		{
			WebElement e1=wd.findElement(SubmitButton);
			HighlightElement(wd, e1);
			e1.click();
			Thread.sleep(7000);
		}
		public void ReportPageVarification() throws InterruptedException
		{
			WebElement e1=wd.findElement(ReportHederName);
					HighlightElement(wd, e1);
			String s1=e1.getText();
			System.out.println("After project created successfully, it will redirest to project report page,"
					+ "and report heder is: "+s1);
			String s2=wd.getTitle();
			System.out.println("Report Page Tital is : "+s2);
		}
		
		
		
		
		
		
		
		
		public void createAdvanceProjectSetup() throws InterruptedException
		{
			System.out.println("1");
			WebElement e01=wd.findElement(SecondDDOnAdvanceProjectCreationPage);
			HighlightElement(wd, e01);
			e01.click();
			
			System.out.println("1");
			WebElement e1=wd.findElement(ContinueButton1WithAdvanceSetup);
			HighlightElement(wd, e1);
			e1.click();
			System.out.println("1");
			Thread.sleep(4000);
			
			System.out.println("2");
			WebElement e2=wd.findElement(ContinueButton2WithAdvanceSetu);
			HighlightElement(wd, e2);
			e2.click();
			System.out.println("2");
			Thread.sleep(4000);
			
			WebElement e3=wd.findElement(ContinueButton3WithAdvanceSetup);
			HighlightElement(wd, e3);
			e3.click();
			Thread.sleep(4000);
			
			WebElement e4=wd.findElement(ContinueButton4WithAdvanceSetup);
			HighlightElement(wd, e4);
			e4.click();
			Thread.sleep(4000);
			
			WebElement e5=wd.findElement(ContinueButton5WithAdvanceSetup);
			HighlightElement(wd, e5);
			e5.click();
			Thread.sleep(4000);
			
			WebElement e6=wd.findElement(CCTextBoxWithAdvanceSetup);
			HighlightElement(wd, e6);
			e6.sendKeys("nkatiyar@edrnet.com");
			Thread.sleep(4000);
			
			WebElement e7=wd.findElement(MessageBoxWithAdvanceSetup);
			HighlightElement(wd, e7);
			e7.sendKeys("action performes on+ 'Finish Order Button' under the Order Placed On EDR Website Page" );
			Thread.sleep(4000);
			
			WebElement e9=wd.findElement(EmailButtonWithAdvanceSetup);
			HighlightElement(wd, e9);
			e9.click();
			Thread.sleep(7000);
			
			WebElement e8=wd.findElement(CreatedSuccessMessageBy);
			HighlightElement(wd, e8);
			e8.click();
			Thread.sleep(4000);
			
		}
		
		
		
		
		/* Method for calling all methods related to this test case together */
		public void mainMethod() throws InterruptedException
		{
			this.click_NewSingleSiteProjectButton();
			if(s.equals("Quick Project Setup"))
			{
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.set_DateDraftDueField();
			this.set_DateFineDueField();
			this.set_PropertyNumber();
			//this.set_PropertyName();
			//this.set_prop_AddressField();
			//this.set_City();
			//this.set_CountryDropDown();
			//this.set_StateDropdown();
			this.click_checkBoxUnderReportSection();
			this.click_SubmitButton();
			this.goBackTo_orderPlacedOnEDRwebsite();
			//this.ReportPageVarification();
			/*if(s0.equals("The Project Name you entered already exists on PARCEL."))
			{
				this.click_againNewSingleSiteProjectButton();
			}
			else
			{
				System.out.println("Success");
			}*/
			}
			
			else //(s.equals("Advanced Project Setup"))
			{
				this.createAdvanceProjectSetup();
				this.goBackTo_orderPlacedOnEDRwebsite();
			}
			
		}

}
