package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Other_Menu_Home_Page {
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[1]/a")
	WebElement Help_And_ELearning;
	
	@FindBy(how=How.XPATH,using="//*[@id='sites-chrome-userheader-title']")
	WebElement ELearning_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[2]/a")
	WebElement Update_My_Personal_Info;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Update_My_Personal_Info_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[3]/a")
	WebElement Add_A_New_User;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Add_A_New_User_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[4]/a")
	WebElement Grant_Access_TO_A_Report;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[3]/div[4]/div/table/tbody/tr[2]/td[4]")
	WebElement first_report_in_grid;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Grant_Access_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[5]/a")
	WebElement Update_Default_Language;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Default_Language_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[6]/a")
	WebElement View_My_Company_Statistics;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Company_Statistics_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[7]/a")
	WebElement PARCEL_Intel;
	
	@FindBy(how=How.XPATH,using="/html/body/form/div[1]")
	WebElement PARCEL_Intel_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[8]/a")
	WebElement EDR_Advisory_Partner_Portal;
	
	@FindBy(how=How.XPATH,using="//*[@id='Welcome']/h1")
	WebElement EDR_Advisory_Partner_Portal_Page_Header;
		
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[9]/a")
	WebElement Feedback_or_Support;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentother-content']/ul/li[10]/a")
	WebElement Administrative_Tools;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/div/b")
	WebElement Administrative_Tools_PageHeader;
	
	@FindBy(how=How.XPATH,using="//*[@id='header-nav']/li[3]/a")
	WebElement Home_tab;
	
	@FindBy(how=How.XPATH,using="//*[@id='mainlevel-nav']/li[1]/a")
	WebElement Classic_Home_tab;
	
	
	public Other_Menu_Home_Page(WebDriver driver){
		this.driver = driver;	
	}
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	}
	
	public void Check_Other_Menus() throws Exception{
		List<String> All_Other_Menus_Array=new ArrayList<>();
		Thread.sleep(3000);	
		for(int i=1; i<=10; i++){
			Home_tab.click();
			Thread.sleep(5000);
			WebElement Other_Menus= driver.findElement(By.xpath("//*[@id='contentother-content']/ul/li["+i+"]/a"));
			HighlightElement(driver, Other_Menus);	
			All_Other_Menus_Array.add(Other_Menus.getText());
			
		if(Help_And_ELearning.equals(Other_Menus)){
		Help_And_ELearning.click();
		Thread.sleep(5000);
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(10000);	
		try {
		HighlightElement(driver, ELearning_Page_Header);
		System.out.println("Page Header Present on "+ELearning_Page_Header.getText());
		}catch (Exception e) {
			//e.printStackTrace();
		}
		driver.close();
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(5000);
		}		
		else if(Update_My_Personal_Info.equals(Other_Menus)){
		Update_My_Personal_Info.click();
		Thread.sleep(5000);
		HighlightElement(driver, Update_My_Personal_Info_Page_Header);
		System.out.println("Page Header Present on Update My Personal Info Page: "+Update_My_Personal_Info_Page_Header.getText());
		}
		else if((Add_A_New_User.equals(Other_Menus))){
		Add_A_New_User.click();
		Thread.sleep(5000);
		HighlightElement(driver, Add_A_New_User_Page_Header);
		System.out.println("Page Header Present on Add A New User Page: "+Add_A_New_User_Page_Header.getText());
		}
		else if(Grant_Access_TO_A_Report.equals(Other_Menus)){
		/*	   WebDriverWait wait = new WebDriverWait(driver, 10);
			   Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			   alert.accept();
			   Thread.sleep(2000);
			   first_report_in_grid.click();
			   Thread.sleep(3000);*/
		HighlightElement(driver, first_report_in_grid);
		first_report_in_grid.click();
		Thread.sleep(3000);
		Grant_Access_TO_A_Report.click();
		Thread.sleep(5000);
		HighlightElement(driver, Grant_Access_Page_Header);
		System.out.println("Page Header Present on Grant Access Page: "+Grant_Access_Page_Header.getText());
		}
		else if(Update_Default_Language.equals(Other_Menus)){
		Update_Default_Language.click();
		Thread.sleep(5000);
		HighlightElement(driver, Default_Language_Page_Header);	
		System.out.println("Page Header Present on Default Language Page: "+Default_Language_Page_Header.getText());
		}
		else if(View_My_Company_Statistics.equals(Other_Menus)){
		View_My_Company_Statistics.click();	
		Thread.sleep(5000);
		HighlightElement(driver, Company_Statistics_Page_Header);
		System.out.println("Page Header Present on Company Statistics Page: "+Company_Statistics_Page_Header.getText());
		}
		else if(PARCEL_Intel.equals(Other_Menus)){
		PARCEL_Intel.click();
		Thread.sleep(5000);
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(10000);	
		try {
		HighlightElement(driver, PARCEL_Intel_Page_Header);
		System.out.println("Page Header Present on PARCEL Intel Page: "+PARCEL_Intel_Page_Header.getText());	
		}catch (Exception e) {
			//e.printStackTrace();
		}
		driver.close();
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(5000);		
		}	
		else if(EDR_Advisory_Partner_Portal.equals(Other_Menus)){
		EDR_Advisory_Partner_Portal.click();
		Thread.sleep(5000);	
		HighlightElement(driver, EDR_Advisory_Partner_Portal_Page_Header);
		System.out.println("Page Header Present on EDR Advisory Partner Portal Page: "+EDR_Advisory_Partner_Portal_Page_Header.getText());	
		Classic_Home_tab.click();
		Thread.sleep(5000);	
		}
		else if(Administrative_Tools.equals(Other_Menus)){
		Administrative_Tools.click();	
		Thread.sleep(8000);	
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(10000);	
		try{
		HighlightElement(driver, Administrative_Tools_PageHeader);
		System.out.println("Page Header Present on Administrative Tools Page: "+Administrative_Tools_PageHeader.getText());
		}catch (Exception e) {
			//e.printStackTrace();
		}
		driver.close();
		driver.switchTo().window(winHandleBefore);
		Home_tab.click();
		Thread.sleep(5000);
		}
	  }
		System.out.println("All Options present under Other Menu: "+All_Other_Menus_Array);	
	}
}
