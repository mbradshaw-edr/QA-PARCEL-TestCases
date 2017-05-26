package main_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import all_files.Browsers;
import all_files.Login_page;
import all_files.Templates_Page;

public class Main_Templates {

	WebDriver driver = Browsers.startbrowser("chrome", "https://www.parcelplatform.com/reporting/login.php");

	Login_page Login_page = PageFactory.initElements(driver, Login_page.class);
	Templates_Page Templates_Page = PageFactory.initElements(driver, Templates_Page.class);

	@Test(priority = 1)
	public void login() throws Exception {
		Login_page.logintoparcel();
	}

	@Test(priority = 2)
	public void Copy_Template_Into_New_Template_With_Different_Name() throws Exception {
		Templates_Page.Copy_Template_Into_New_Template_With_Different_Name();
	}

	@Test(priority = 3)
	public void Edit_And_Save_All_Setup_Options_For_Template() throws Exception {
		Templates_Page.Edit_And_Save_All_Setup_Options_For_Template();
	}

	@Test(priority = 4)
	public void Make_Default_And_Rename_Template() throws Exception {
		Templates_Page.Make_Default_And_Rename_Template();
	}

	@Test(priority = 5)
	public void Shortname_Template() throws Exception {
		Templates_Page.Shortname_Template();
	}

	@Test(priority = 6)
	public void View_Report_Section_Structure_And_Define_Rules() throws Exception {
		Templates_Page.View_Report_Section_Structure_And_Define_Rules();
	}

	@Test(priority = 7)
	public void Define_Dashboard() throws Exception {
		Templates_Page.Define_Dashboard();
	}

	@Test(priority = 8)
	public void Move_Template_ToAnotherCompany_And_Delete_Template() throws Exception {
		Templates_Page.Move_Template_ToAnotherCompany_And_Delete_Template();
	}

	@Test(priority = 9)
	public void LogOut() throws Exception {
		Templates_Page.LogOut();
	}

}
