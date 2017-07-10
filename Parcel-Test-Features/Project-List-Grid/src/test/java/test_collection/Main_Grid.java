package test_collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import test_cases.Browsers;
import test_cases.Header_Menus_Home_Page;
import test_cases.Home_page;
import test_cases.Login_page;
import test_cases.Other_Menu_Home_Page;
import test_cases.Project_Setup_page;
import test_cases.Recently_Viewed_Report_Section;
import test_cases.Start_Menu_Home_Page;
import test_cases.Support_Help_Home_Page;
import test_cases.Upload_Company_Logo_Page;

public class Main_Grid {
	WebDriver driver = Browsers.startbrowser("chrome", "https://www.parcelplatform.com/reporting/login.php");
	Login_page Login_page = PageFactory.initElements(driver, Login_page.class);
	Home_page Home_page = PageFactory.initElements(driver, Home_page.class);
	Project_Setup_page Project_Setup_page = PageFactory.initElements(driver, Project_Setup_page.class);
	Upload_Company_Logo_Page Upload_Company_Logo_Page = PageFactory.initElements(driver,
			Upload_Company_Logo_Page.class);
	Recently_Viewed_Report_Section Recently_Viewed_Report_Section = PageFactory.initElements(driver,
			Recently_Viewed_Report_Section.class);
	Header_Menus_Home_Page Header_Menus_Home_Page = PageFactory.initElements(driver, Header_Menus_Home_Page.class);
	Start_Menu_Home_Page Start_Menu_Home_Page = PageFactory.initElements(driver, Start_Menu_Home_Page.class);
	Other_Menu_Home_Page Other_Menu_Home_Page = PageFactory.initElements(driver, Other_Menu_Home_Page.class);
	Support_Help_Home_Page Support_Help_Home_Page = PageFactory.initElements(driver, Support_Help_Home_Page.class);

	@Test(priority = 1)
	public void login() throws Exception {
		Login_page.logintoparcel();
	}

	@Test(priority = 2)
	public void allreports_list() throws Exception {
		Home_page.allreports_list();
	}

	@Test(priority = 3)
	public void create_project() throws Exception {
		Home_page.create_project();
		Project_Setup_page.create_projectsetup(2, 2, 2);
	}

	@Test(priority = 4)
	public void check_project() throws Exception {
		Home_page.check_project();
	}

	@Test(priority = 5)
	public void search_project() throws Exception {
		Home_page.search_project();
	}

	@Test(priority = 6)
	public void Date_Range() throws Exception {
		Home_page.Date_Range();
	}

	@Test(priority = 7)
	public void Check_calendar() throws Exception {
		Home_page.check_calendar();
	}

	@Test(priority = 8)
	public void Check_status() throws Exception {
		Home_page.check_status();
	}

	@Test(priority = 9)
	public void Search_Project_Dropdown() throws Exception {
		Home_page.Search_Project_Dropdown();
	}

	@Test(priority = 10)
	public void Check_Grid_Control() throws Exception {
		Home_page.Check_Grid_Control();
	}

	@Test(priority = 11)
	public void Check_Company_Logo() throws Exception {
		Upload_Company_Logo_Page.Check_Company_Logo();
	}

	@Test(priority = 12)
	public void Check_Recently_Viewed_Reports() throws Exception {
		Recently_Viewed_Report_Section.Check_Recently_Viewed_Reports();
	}

	@Test(priority = 13)
	public void Check_Header_Menus() throws Exception {
		Header_Menus_Home_Page.Check_Header_Menus();
	}

	@Test(priority = 14)
	public void Check_Page_Headers() throws Exception {
		Header_Menus_Home_Page.Check_Page_Headers();
	}

	@Test(priority = 15)
	public void Check_Start_Menus() throws Exception {
		Start_Menu_Home_Page.Check_Start_Menus();
	}

	@Test(priority = 16)
	public void Check_Other_Menus() throws Exception {
		Other_Menu_Home_Page.Check_Other_Menus();
	}

	@Test(priority = 17)
	public void Check_Support_Help_Button() throws Exception {
		Support_Help_Home_Page.Support_Help_Button();
	}

}
