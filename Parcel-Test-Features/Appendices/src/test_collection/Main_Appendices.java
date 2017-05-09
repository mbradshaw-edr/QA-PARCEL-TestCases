package test_collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import test_cases.Add_Supporting_Documentation;
import test_cases.Appendices_Subtab;
import test_cases.Browsers;
import test_cases.Comments_Subtab;
import test_cases.Login_page;

public class Main_Appendices {
	WebDriver driver = Browsers.startbrowser("chrome", "https://www.parcelplatform.com/reporting/login.php");

	Login_page Login_page = PageFactory.initElements(driver, Login_page.class);
	Appendices_Subtab Appendices_Subtab = PageFactory.initElements(driver, Appendices_Subtab.class);
	Comments_Subtab Comments_Subtab = PageFactory.initElements(driver, Comments_Subtab.class);
	Add_Supporting_Documentation Add_Supporting_Documentation = PageFactory.initElements(driver, Add_Supporting_Documentation.class);
	
	@Test (priority=1)
	public void login() throws Exception{
	Login_page.logintoparcel();
	}
	
	@Test (priority=2)
	public void Check_Appendices_Tab() throws Exception{
	Appendices_Subtab.Check_Appendices_Tab();
	}
	
	@Test (priority=3)
	public void Add_Image() throws Exception{
	Appendices_Subtab.Add_Image();	
	}
	
	@Test (priority=4)
	public void Drag_And_Drop_Image() throws Exception{
	Appendices_Subtab.Drag_And_Drop_Image();
	}
	
	@Test (priority=5)
	public void View_Image() throws Exception{
	Appendices_Subtab.View_Image();
	}
	
	@Test (priority=6)
	public void Edit_All_Option() throws Exception{
	Appendices_Subtab.Edit_All_Option();
	}
	
	@Test (priority=7)
	public void Include_Exclude_Zoom_Delete_Options() throws Exception{
	Appendices_Subtab.Include_Exclude_Zoom_Delete_Options();
	}
	
	@Test (priority=8)
	public void Check_Upload_PDF() throws Exception{
	Appendices_Subtab.Check_Upload_PDF();
	}
	
	@Test (priority=9)
	public void Check_PDF_Exclude_Include_Sort_Delete() throws Exception{
	Appendices_Subtab.Check_PDF_Exclude_Include_Sort_Delete();
	}

	@Test (priority=10)
	public void Check_Comments_Subtab() throws Exception{
	Comments_Subtab.Check_Comments_Subtab();	
	}
	
	@Test (priority=11)
	public void Add_Comment() throws Exception{
	Comments_Subtab.Add_Comments_And_Address();	
	}

	@Test (priority=12)
	public void Check_Section_Dropdown() throws Exception{
	Comments_Subtab.Check_Section_Dropdown();	
	}
	
	@Test (priority=13)
	public void Check_Checkboxes_Functionality() throws Exception{
	Comments_Subtab.Checkboxes_Functionality();	
	}

	@Test (priority=14)
	public void Refresh_OpenAll_CloseAll_Delete_Functionality() throws Exception{
	Comments_Subtab.Refresh_OpenAll_CloseAll_Delete_Functionality();	
	}
	
	@Test (priority=15)
	public void Add_Communication_Record() throws Exception{
	Add_Supporting_Documentation.Add_Communication_Record();	
	}

	@Test (priority=16)
	public void Add_ADA_Checklist() throws Exception{
	Add_Supporting_Documentation.Add_ADA_Checklist();	
	}
	
	@Test (priority=17)
	public void Add_FHA_Checklist() throws Exception{
	Add_Supporting_Documentation.Add_FHA_Checklist();	
	}
	
	@Test (priority=18)
	public void Add_User_Questionnaire() throws Exception{
	Add_Supporting_Documentation.Add_User_Questionnaire();	
	}
	
	@Test (priority=19)
	public void Send_Questionnaire_Email() throws Exception{
	Add_Supporting_Documentation.Send_Questionnaire_Email();	
	}
}
