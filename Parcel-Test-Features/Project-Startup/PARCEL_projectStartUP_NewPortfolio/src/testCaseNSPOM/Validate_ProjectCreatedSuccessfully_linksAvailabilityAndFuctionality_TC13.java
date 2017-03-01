package testCaseNSPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_ProjectCreatedSuccessfully_linksAvailabilityAndFuctionality_TC13 {
	
	By ProjectcreatedSuccessMessage=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td/h4");
	By AllLinksOnThisPage=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr/td/a");
	By ReturnToHomePageLink=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[2]/td/a");
	By SetupAnotherPageLink=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[3]/td/a");
	By GrantAccessLink=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[4]/td/a");
	By ViewProjectDashboardLink=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[5]/td/a");
	By ExitPARCELLink=By.xpath("html/body/div/div/div/div/div/div/table/tbody/tr[6]/td/a");
	
	// Grant Access or Access Management
	
	By PageHeaderForGrantAccess=By.className("general-panel-name");
	By SelectAProjectDD=By.name("project");
	By SelectByCompanyOfficeLink=By.id("selectCoLink");
	By SelectOrganizationDD=By.xpath(".//*[@id='entities']");
	By CompanyDD=By.xpath(".//*[@id='company']");
	By OfficeDD=By.xpath(".//*[@id='office']");
	By SelectByUserSearchLink=By.xpath(".//*[@id='selectSrcLink']");
	By SearchForUserTextBox=By.xpath(".//*[@id='acctsrch']");
	By SearchButton=By.xpath(".//*[@id='searchblock']/div/input[2]");
	By NoelAlonsoCheckBox=By.xpath(".//*[@id='49101']");
	By AddSelectedLink=By.xpath(".//*[@id='userchecks']/div/a[3]");
	By LevelOfAccessDD=By.xpath(".//*[@id='role']");
	By AddPreconfiguredOrSavedTeamLink=By.xpath(".//*[@id='selectTeamLink']");
	By OrganizationDD=By.xpath(".//*[@id='sysAdminEntities']");
	
	By SaveSelecteAsNewProjectTeam=By.xpath(".//*[@id='theUserRoles']/div[3]/a");
	By SelectCheckBox=By.xpath("html/body/div/div/div/div/div/div/div/div/div[7]/form/table/tbody/tr/td/input");
	By GrantAccesToReportAndUsersSelectedAbove=By.xpath(".//*[@id='theSites']/div[3]/a");
	By SuccessMessageAfterGrantAccess_revokedEccess=By.xpath("html/body/div[8]/div");
	By RevokeAccesstoreportsandusersselectedabove=By.xpath(".//*[@id='theSites']/div[4]/a");
	
	
	public static WebDriver wd;
	ExcelR1 obj=new ExcelR1("..\\PARCEL_projectStartUP_NewPortfolio\\src\\testData\\TestData_NewPortfolio.xlsx");
	
	   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	   
	   public Validate_ProjectCreatedSuccessfully_linksAvailabilityAndFuctionality_TC13(WebDriver wd)
		{
			this.wd=wd;
		} 
	   public void check_LinkAvailability() throws InterruptedException
	   {
		    WebElement e=wd.findElement(ProjectcreatedSuccessMessage);
			HighlightElement(wd, e);
			String s1=e.getText();
			System.out.println(" :"+s1);
			List<WebElement> l=wd.findElements(AllLinksOnThisPage);
			for(WebElement e1:l)
			{
			HighlightElement(wd, e1);
			String s=e1.getText();
			System.out.println(" :"+s);
	        }
	   }
	   public void click_returnToHomePageLink() throws InterruptedException
		{
			WebElement e=wd.findElement(ReturnToHomePageLink);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(5000);
			wd.navigate().back();
			Thread.sleep(5000);
		}
	   public void click_setupAnotherPageLink() throws InterruptedException
		{
			WebElement e=wd.findElement(SetupAnotherPageLink);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(5000);
			wd.navigate().back();
			Thread.sleep(5000);
		}
	   public void click_grantAccessLink() throws InterruptedException
		{
			WebElement e=wd.findElement(GrantAccessLink);
			HighlightElement(wd, e);
			e.click();
			String s=wd.getTitle();
			System.out.println(" :"+s);
			
			Thread.sleep(5000);
			WebElement e1=wd.findElement(PageHeaderForGrantAccess);
			HighlightElement(wd, e1);
			WebElement e2=wd.findElement(SelectAProjectDD);
			HighlightElement(wd, e2);
			e2.click();
			Thread.sleep(1000);
			e2.click();
			
			WebElement e3=wd.findElement(SelectByCompanyOfficeLink);
			HighlightElement(wd, e3);
			e3.click();
			WebElement e4=wd.findElement(SelectOrganizationDD);
			HighlightElement(wd, e4);
			e4.click();
			Thread.sleep(1000);
			e4.click();
			WebElement e5=wd.findElement(CompanyDD);
			HighlightElement(wd, e5);
			e5.click();
			Thread.sleep(1000);
			e5.click();
			WebElement e6=wd.findElement(OfficeDD);
			HighlightElement(wd, e6);
			e6.click();
			Thread.sleep(1000);
			e6.click();
			
			WebElement e7=wd.findElement(SelectByUserSearchLink);
			HighlightElement(wd, e7);
			e7.click();
			Thread.sleep(5000);
			WebElement e8=wd.findElement(SearchForUserTextBox);
			HighlightElement(wd, e8);
			e8.sendKeys(ExcelR1.getData("Grant Access Entries",1,1));
			WebElement e9=wd.findElement(SearchButton);
			HighlightElement(wd, e9);
			e9.click();
			Thread.sleep(5000);
			WebElement e10=wd.findElement(NoelAlonsoCheckBox);
			HighlightElement(wd, e10);
			e10.click();
			Thread.sleep(5000);
			WebElement e11=wd.findElement(AddSelectedLink);
			HighlightElement(wd, e11);
			e11.click();
			Thread.sleep(5000);
			
			WebElement e12=wd.findElement(AddPreconfiguredOrSavedTeamLink);
			HighlightElement(wd, e12);
			e12.click();
			Thread.sleep(5000);
			WebElement e13=wd.findElement(OrganizationDD);
			HighlightElement(wd, e13);
			e13.click();
			Thread.sleep(5000);
			e3.click();
			
			WebElement e14=wd.findElement(LevelOfAccessDD);
			HighlightElement(wd, e14);
			e4.click();
			Select s1=new Select(e14);
			s1.selectByVisibleText("Field Staff");
			WebElement e15=wd.findElement(SaveSelecteAsNewProjectTeam);
			HighlightElement(wd, e15);
			e15.click();
			Alert a=wd.switchTo().alert();
			a.sendKeys(ExcelR1.getData("Grant Access Entries",1,0));
			Thread.sleep(3000);
			a.accept();
			Thread.sleep(5000);
			WebElement e16=wd.findElement(SelectCheckBox);
			HighlightElement(wd, e16);
			e16.click();
			Thread.sleep(5000);
			WebElement e17=wd.findElement(GrantAccesToReportAndUsersSelectedAbove);
			HighlightElement(wd, e17);
			e17.click();
			
			WebElement e18=wd.findElement(SuccessMessageAfterGrantAccess_revokedEccess);
			HighlightElement(wd, e18);
			Thread.sleep(2000);
			
			WebElement e19=wd.findElement(RevokeAccesstoreportsandusersselectedabove);
			HighlightElement(wd, e19);
			e19.click();
			
			WebElement e20=wd.findElement(SuccessMessageAfterGrantAccess_revokedEccess);
			HighlightElement(wd, e20);
			Thread.sleep(3000);
			}
	   public void click_viewProjectDashboardLink() throws InterruptedException
		{
			WebElement e=wd.findElement(ViewProjectDashboardLink);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(5000);
			wd.navigate().back();
			Thread.sleep(5000);
		}
	   public void click_exitPARCELLink() throws InterruptedException
		{
			WebElement e=wd.findElement(ExitPARCELLink);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(5000);
			wd.navigate().back();
			Thread.sleep(5000);
		}
	   public void goBackFromGrantAccessPage() throws InterruptedException
	 		{
	 			Thread.sleep(5000);
	 			System.out.println("nevigation started");
	 			wd.navigate().back();
	 			Thread.sleep(4000);
	 			//wd.navigate().to("https://www.parcelplatform.com/workOrder/success.php?token=smffzee6jbvg&PID=361844");
	 			//Thread.sleep(10000);
	 			System.out.println("nevigation success");
	 			//Thread.sleep(5000);
	 		}
	   
	   public void mainMethod() throws InterruptedException
	   {
		   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   this.check_LinkAvailability();
		   this.click_returnToHomePageLink();
		   this.click_setupAnotherPageLink();
		   this.click_grantAccessLink();
		   this.goBackFromGrantAccessPage();
		   this.goBackFromGrantAccessPage();
		   this.click_viewProjectDashboardLink();
		   this.click_exitPARCELLink();
	   }

}
