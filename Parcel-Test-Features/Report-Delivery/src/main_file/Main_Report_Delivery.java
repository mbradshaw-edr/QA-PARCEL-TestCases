package main_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import all_files.Browsers;
import all_files.Login_page;
import all_files.Assemble_Tab;

public class Main_Report_Delivery {

	WebDriver driver = Browsers.startbrowser("chrome","https://www.parcelplatform.com/reporting/login.php");
	Login_page Login_page = PageFactory.initElements(driver, Login_page.class);
	Assemble_Tab Assemble_Tab = PageFactory.initElements(driver, Assemble_Tab.class);

	@Test(priority = 1)
	public void login() throws Exception {
		Login_page.logintoparcel();
	}

	@Test(priority = 2)
	public void Download_Report() throws Exception {
		Assemble_Tab.Download_Report();
	}

	@Test(priority = 3)
	public void View_Transmittal_Letter() throws Exception {
		Assemble_Tab.View_Transmittal_Letter();
	}

	@Test(priority = 4)
	public void View_Cover_Page() throws Exception {
		Assemble_Tab.View_Cover_Page();
	}

	@Test(priority = 5)
	public void Edit_Transmittal_Letter() throws Exception {
		Assemble_Tab.Edit_Transmittal_Letter();
	}

	@Test(priority = 6)
	public void Edit_Cover_Page() throws Exception {
		Assemble_Tab.Edit_Cover_Page();
	}

	@Test(priority = 7)
	public void Download_Previously_Generated_Reports() throws Exception {
		Assemble_Tab.Download_Previously_Generated_Reports();
	}

	@Test(priority = 8)
	public void Upload_Document_Transmittal_Letter() throws Exception {
		Assemble_Tab.Upload_Document_Transmittal_Letter();
	}

	@Test(priority = 9)
	public void Upload_Document_Cover_Page() throws Exception {
		Assemble_Tab.Upload_Document_Cover_Page();
	}

	@Test(priority = 10)
	public void Upload_Invalid_File_Transmittal_Letter() throws Exception {
		Assemble_Tab.Upload_Invalid_File_Transmittal_Letter();
	}

	@Test(priority = 11)
	public void Upload_Invalid_File_Cover_Page() throws Exception {
		Assemble_Tab.Upload_Invalid_File_Cover_Page();
	}

	@Test(priority = 12)
	public void Email_Link_To_Client() throws Exception {
		Assemble_Tab.Email_Link_To_Client();
	}

	@Test(priority = 13)
	public void Disable_Email_Link() throws Exception {
		Assemble_Tab.Disable_Email_Link();
	}

	@Test(priority = 14)
	public void LogOut() throws Exception {
		Assemble_Tab.LogOut();
	}
}
