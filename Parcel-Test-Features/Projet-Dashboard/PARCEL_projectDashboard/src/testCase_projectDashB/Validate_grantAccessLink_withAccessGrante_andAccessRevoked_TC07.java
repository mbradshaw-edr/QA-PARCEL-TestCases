package testCase_projectDashB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.ExcelR1;

public class Validate_grantAccessLink_withAccessGrante_andAccessRevoked_TC07 {
	
	// Grant Access or Access Management
	
	    By GrantAccessLink=By.xpath("html/body/div/div/div/div/div/div/div/p/a[5]");
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
		By SuccessMessageAfterRevokedAccess_revokedAccess=By.xpath("html/body/div[8]/div");
		By RevokeAccesstoreportsandusersselectedabove=By.xpath(".//*[@id='theSites']/div[4]/a");
		
		public static WebDriver wd;
		ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
		
		   public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
		    {
		           JavascriptExecutor jse=(JavascriptExecutor)wd;
		          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		          Thread.sleep(2000);
		          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
		       
		    }
		   
		   public Validate_grantAccessLink_withAccessGrante_andAccessRevoked_TC07(WebDriver wd)
			{
				this.wd=wd;
			}
		   
		   
		   public void click_grantAccessLink_underProjectDashboard() throws InterruptedException
			{
				WebElement e=wd.findElement(GrantAccessLink);
				HighlightElement(wd, e);
				e.click();
				Thread.sleep(6000);
				String s=wd.getTitle();
				System.out.println(" :"+s);
				
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
				Thread.sleep(6000);
				WebElement e8=wd.findElement(SearchForUserTextBox);
				HighlightElement(wd, e8);
				e8.sendKeys(ExcelR1.getData("Searchable Dta For Grant Access",1,1));
				WebElement e9=wd.findElement(SearchButton);
				HighlightElement(wd, e9);
				e9.click();
				Thread.sleep(6000);
				WebElement e10=wd.findElement(NoelAlonsoCheckBox);
				HighlightElement(wd, e10);
				e10.click();
				Thread.sleep(5000);
				WebElement e11=wd.findElement(AddSelectedLink);
				HighlightElement(wd, e11);
				e11.click();
				Thread.sleep(6000);
				
				WebElement e12=wd.findElement(AddPreconfiguredOrSavedTeamLink);
				HighlightElement(wd, e12);
				e12.click();
				Thread.sleep(6000);
				WebElement e13=wd.findElement(OrganizationDD);
				HighlightElement(wd, e13);
				e13.click();
				Thread.sleep(1000);
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
				a.sendKeys(ExcelR1.getData("Searchable Dta For Grant Access",1,2));
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
				
				WebElement e18=wd.findElement(SuccessMessageAfterRevokedAccess_revokedAccess);
				HighlightElement(wd, e18);
				Thread.sleep(3000);
				
				WebElement e19=wd.findElement(RevokeAccesstoreportsandusersselectedabove);
				HighlightElement(wd, e19);
				e19.click();
				
				
				WebElement e20=wd.findElement(SuccessMessageAfterRevokedAccess_revokedAccess);
				HighlightElement(wd, e20);
				
				Thread.sleep(3000);
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
			   wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			   this.click_grantAccessLink_underProjectDashboard();
			   this.goBackFromGrantAccessPage();
			   this.goBackFromGrantAccessPage();
			   
			
		   }

}
