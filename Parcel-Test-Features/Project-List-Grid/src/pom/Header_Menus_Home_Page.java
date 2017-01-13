package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Header_Menus_Home_Page {
	
	WebDriver driver;
	String ExcelSite_Id;
	
	@FindBy(how=How.XPATH,using="//*[@id='header-nav']/li[3]/a")
	WebElement Home_tab;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/div[4]/ul/li[1]/a")
	WebElement classic_Home_tab;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li")
	WebElement All_Header_Menus;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[4]/a")
	WebElement Project_Dropdown;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/nav/a[2]/span")
	WebElement Header_EDR_Logo;
	
	@FindBy(how=How.XPATH,using="//*[@id='header-nav']/li[2]/form/input[1]")
	WebElement SiteId_Field;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[1]/a")
	WebElement Setup_Tab;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[3]/a")
	WebElement Appendices_Tab;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[4]/a")
	WebElement Sign_Tab;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[5]/a")
	WebElement Assemble_Tab;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[3]/div[4]/div/table/tbody/tr[2]/td[4]")
	WebElement first_report_in_grid;
	 
	@FindBy(how=How.ID,using="gs_SiteID")
	WebElement Search_SiteID;
 
	@FindBy(how=How.XPATH,using="//*[@id='ProjectsMenu']/li/ul[1]/li[1]/a")
	WebElement New_single_site_project_option;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement single_site_project_Page_Header;
		
	@FindBy(how=How.XPATH,using="//*[@id='ProjectsMenu']/li/ul[1]/li[2]/a")
	WebElement New_Portfolio_Option;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement New_Portfolio_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='ProjectsMenu']/li/ul[1]/li[3]/a")
	WebElement Project_Search;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Project_Search_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='ProjectsMenu']/li/ul[2]/li[2]/a")
	WebElement Order_Placed_On_EDR_Website;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Order_Placed_On_EDR_Website_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='ProjectsMenu']/li/ul[2]/li[3]/a")
	WebElement Recent_Portfolio_Deliverables;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Recent_Portfolio_Deliverables_Page_Header;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[5]/a")
	WebElement Bids_Dropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='BidsMenu']/li/ul/li[1]/a")
	WebElement Bids_Received;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/div/div/div/div/div[1]/h3")
	WebElement Bids_Received_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='BidsMenu']/li/ul/li[2]/a")
	WebElement Bids_Submitted;
	
	@FindBy(how=How.XPATH,using="html/body/div[4]/div/div/div/div/div/h3")
	WebElement Bids_Submitted_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='header-nav']/li[6]/a")
	WebElement Company_Dropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='header-nav']/li[7]/a")
	WebElement Help_Dropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='HelpMenu']/li/ul/li[2]/a")
	WebElement ELearning_Option;
	
	@FindBy(how=How.XPATH,using="//*[@id='sites-chrome-userheader-title']")
	WebElement ELearning_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='HelpMenu']/li/ul/li[3]/a")
	WebElement Whats_New_Option;
		
	@FindBy(how=How.XPATH,using="//button[text()='End tour']")
	WebElement EndTour_Button_In_Whats_New_Alert;
	
	@FindBy(how=How.XPATH,using="//*[@id='header-nav']/li[8]/a")
	WebElement Username_Option;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[1]/a")
	WebElement Account_Setting_Option;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Account_Setting_PageHeader;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[2]/a")
	WebElement Administrative_Tools_Option;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/div/b")
	WebElement Administrative_Tools_PageHeader;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[3]/a")
	WebElement Switch_Portal_Option;
	
	@FindBy(how=How.XPATH,using="//*[@id='genericmodal']/div[3]/button")
	WebElement Switch_Portal_Alert_Close_Button;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[4]/a")
	WebElement Logout_Option;
	
	public Header_Menus_Home_Page(WebDriver driver){
		this.driver = driver;	
	}	
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	}
	
	public void highlight_All_Headers() throws Exception{
		List<String> All_Headers_array=new ArrayList<>();
		for(int i=1; i<=8; i++){
		
		WebElement All_Headers= driver.findElement(By.xpath("html/body/div[1]/div/nav/div/ul/li["+i+"]"));	
		HighlightElement(driver, All_Headers);
		All_Headers_array.add(All_Headers.getText());
	}
		System.out.println("All Menu Options present on Header: "+All_Headers_array);	
	}
	
	public void highlight_Project_Dropdown_Options() throws Exception{
	List<String> All_Project_Options_Array=new ArrayList<>();
	for(int u=1; u<=2; u++){
		
		for(int i=1; i<=3; i++){		
		WebElement Project_Options= driver.findElement(By.xpath("html/body/div[1]/div/nav/div/ul/li[4]/ul/li/ul["+u+"]/li["+i+"]/a"));	
		HighlightElement(driver, Project_Options);
		All_Project_Options_Array.add(Project_Options.getText());
		}
	}
	System.out.println("All Options present under Project Dropdown: "+All_Project_Options_Array);
	}
	
	public void highlight_Company_Dropdown_Options() throws Exception{
	List<String> All_Company_Options_Array=new ArrayList<>();
	for(int u=1; u<=3; u++){
		
		for(int i=1; i<=4; i++){
		Company_Dropdown.click();
		Thread.sleep(1000);
		WebElement Company_Options= driver.findElement(By.xpath("//*[@id='CompanyMenu']/li/ul["+u+"]/li["+i+"]/a"));
		HighlightElement(driver, Company_Options);
		All_Company_Options_Array.add(Company_Options.getText());
		Company_Options.click();
		Thread.sleep(5000);	
		Home_tab.click();
		Thread.sleep(5000);
		}
	}
	System.out.println("All Options present under Company Dropdown: "+All_Company_Options_Array);
	}
	
	public void highlight_Help_Dropdown_Options() throws Exception{
		List<String> All_Help_Options_Array=new ArrayList<>();
		All_Help_Options_Array.add("Email Support");
		for(int i=2; i<=3; i++){
			Help_Dropdown.click();
			Thread.sleep(1000);
			WebElement Help_Options= driver.findElement(By.xpath("//*[@id='HelpMenu']/li/ul/li["+i+"]/a"));
			HighlightElement(driver, Help_Options);
			All_Help_Options_Array.add(Help_Options.getText());
			Help_Options.click();
			Thread.sleep(5000);
			
			
			if(ELearning_Option.equals(Help_Options)){
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
				Thread.sleep(3000);
			}
			if(Whats_New_Option.equals(Help_Options)){
				HighlightElement(driver, EndTour_Button_In_Whats_New_Alert);
				EndTour_Button_In_Whats_New_Alert.click();
				
			}
		}
		System.out.println("All Options present under Help Dropdown: "+All_Help_Options_Array);
	}
	
	public void highlight_Username_Dropdown_Options() throws Exception{
		List<String> All_Username_Options_Array=new ArrayList<>();
		
		for(int i=1; i<=4; i++){
			Username_Option.click();
			WebElement Username_Options= driver.findElement(By.xpath("html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li["+i+"]/a"));
			All_Username_Options_Array.add(Username_Options.getText());
			HighlightElement(driver, Username_Options);
			if(Account_Setting_Option.equals(Username_Options)){
				HighlightElement(driver, Account_Setting_Option);
				Account_Setting_Option.click();
				Thread.sleep(3000);
				HighlightElement(driver, Account_Setting_PageHeader);
				System.out.println("Page Header present on Account Setting Page : "+Account_Setting_PageHeader.getText());
				Home_tab.click();
				Thread.sleep(10000);
			}
			else if(Administrative_Tools_Option.equals(Username_Options)){
				HighlightElement(driver, Administrative_Tools_Option);
				Administrative_Tools_Option.click();
				Thread.sleep(10000);	
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
				Thread.sleep(10000);
			}
			else if(Switch_Portal_Option.equals(Username_Options)){
				HighlightElement(driver, Switch_Portal_Option);
				Switch_Portal_Option.click();
				Thread.sleep(2000);
				HighlightElement(driver, Switch_Portal_Alert_Close_Button);
				Switch_Portal_Alert_Close_Button.click();
				Thread.sleep(5000);
				
			}
			else if(Logout_Option.equals(Username_Options)){
				HighlightElement(driver, Logout_Option);
				Logout_Option.click();
				Thread.sleep(5000);	
				Login_page login_page = PageFactory.initElements(driver, Login_page.class);
				Excel_Data excel= new Excel_Data(2, "src\\Test_Data\\Project_List_Grid_Feature.xlsx");
				String ExcelUsername="";
				String ExcelPassword="";
				for(int e=1; e<=excel.rowcount3; e++){
					ExcelUsername=excel.Username(1, 0);
					ExcelPassword=excel.Password(1, 1);
				}
				login_page.logintoparcel(ExcelUsername, ExcelPassword);
				Thread.sleep(8000);	
			}
		}
		System.out.println("All Options present under Username Dropdown: "+All_Username_Options_Array);
	}
	public void Open_Report_In_Simplified() throws Exception{
		
		Excel_Data excel= new Excel_Data(1, "src\\Test_Data\\Project_List_Grid_Feature.xlsx");
		for(int i=1; i<=excel.rowcount2; i++)
		{
		ExcelSite_Id=excel.Site_Id(i, 0);
		}
		Search_SiteID.sendKeys(ExcelSite_Id);	
		Search_SiteID.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		HighlightElement(driver, first_report_in_grid);
		Actions action = new Actions(driver);
		action.moveToElement(first_report_in_grid).doubleClick().perform();
		Thread.sleep(8000);		
	}
	
public void Open_SiteID_In_Simplified() throws Exception{
		
		Excel_Data excel= new Excel_Data(1, "src\\Test_Data\\Project_List_Grid_Feature.xlsx");
		for(int i=1; i<=excel.rowcount2; i++)
		{
		ExcelSite_Id=excel.Site_Id(i, 0);
		}
		HighlightElement(driver, SiteId_Field);
		SiteId_Field.sendKeys(ExcelSite_Id);
		SiteId_Field.sendKeys(Keys.ENTER);
		Thread.sleep(6000);	
	}
	
	public void Check_Header_Menus() throws Exception{
	Thread.sleep(2000);	
	HighlightElement(driver, Header_EDR_Logo);
	highlight_All_Headers();
	Thread.sleep(4000);
	Open_SiteID_In_Simplified();
	HighlightElement(driver, Header_EDR_Logo);
	highlight_All_Headers();
	Setup_Tab.click();
	Thread.sleep(6000);
	Appendices_Tab.click();
	Thread.sleep(6000);
	Sign_Tab.click();
	Thread.sleep(6000);
	Assemble_Tab.click();
	Thread.sleep(6000);
	HighlightElement(driver, Header_EDR_Logo);
	highlight_All_Headers();
	Home_tab.click();
	Thread.sleep(8000);
	Open_Report_In_Simplified();	
	
	try {
		classic_Home_tab.click();
		
	}catch (Exception e) {
		//e.printStackTrace();
	}
	Home_tab.click();
	Thread.sleep(5000);
	}
	
	public void Check_Page_Headers() throws Exception{
	Project_Dropdown.click();
	Thread.sleep(2000);
	highlight_Project_Dropdown_Options();
	HighlightElement(driver, New_single_site_project_option);
	New_single_site_project_option.click();
	Thread.sleep(5000);
	HighlightElement(driver, single_site_project_Page_Header);
	System.out.println("Page Header on Single site Project page: "+single_site_project_Page_Header.getText());
	Home_tab.click();
	Thread.sleep(8000);
	Project_Dropdown.click();
	Thread.sleep(1000);
	HighlightElement(driver, New_Portfolio_Option);
	New_Portfolio_Option.click();
	Thread.sleep(5000);
	HighlightElement(driver, New_Portfolio_Page_Header);
	System.out.println("Page Header on New Portfolio page: "+New_Portfolio_Page_Header.getText());
	Home_tab.click();
	Thread.sleep(8000);
	Project_Dropdown.click();
	Thread.sleep(1000);
	HighlightElement(driver, Project_Search);
	Project_Search.click();
	Thread.sleep(5000);
	HighlightElement(driver, Project_Search_Page_Header);
	System.out.println("Page Header on Project Search page: "+Project_Search_Page_Header.getText());
	Home_tab.click();
	Thread.sleep(8000);
	Project_Dropdown.click();
	Thread.sleep(1000);
	HighlightElement(driver, Order_Placed_On_EDR_Website);
	Order_Placed_On_EDR_Website.click();
	Thread.sleep(5000);
	HighlightElement(driver, Order_Placed_On_EDR_Website_Page_Header);
	System.out.println("Page Header on Order placed on EDR Website page: "+Order_Placed_On_EDR_Website_Page_Header.getText());
	Home_tab.click();
	Thread.sleep(5000);
	Project_Dropdown.click();
	Thread.sleep(1000);
	HighlightElement(driver, Recent_Portfolio_Deliverables);
	Recent_Portfolio_Deliverables.click();
	Thread.sleep(8000);
	HighlightElement(driver, Recent_Portfolio_Deliverables_Page_Header);
	System.out.println("Page Header on Recent Portfolio Deliverables page: "+Recent_Portfolio_Deliverables_Page_Header.getText());
	Home_tab.click();
	Thread.sleep(8000);
	Bids_Dropdown.click();
	Thread.sleep(8000);
	try{
	HighlightElement(driver, Bids_Received);
	Bids_Received.click();
	Thread.sleep(5000);
	}catch (Exception e) {
		
		//e.printStackTrace();
	}	
	HighlightElement(driver, Bids_Received_Page_Header);
	System.out.println("Page Header on Bids Received page: "+Bids_Received_Page_Header.getText());
	Home_tab.click();
	Thread.sleep(5000);
	
	try{
	Bids_Dropdown.click();
	Thread.sleep(1000);
	HighlightElement(driver, Bids_Submitted);
	Bids_Submitted.click();
	Thread.sleep(5000);
	HighlightElement(driver, Bids_Submitted_Page_Header);
	System.out.println("Page Header on Bids Submitted page: "+Bids_Submitted_Page_Header.getText());
	Home_tab.click();
	Thread.sleep(8000);
	}catch (Exception e) {
		
		//e.printStackTrace();
	}	
	
	highlight_Company_Dropdown_Options();
	highlight_Help_Dropdown_Options();
	highlight_Username_Dropdown_Options();
	}
}
