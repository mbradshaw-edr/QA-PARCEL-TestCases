package test_collection;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import test_cases.Browsers;
import test_cases.Comments_Tab_Section;
import test_cases.Find_Replace_Tab_Section;
import test_cases.History_Tab_Section;
import test_cases.Library_Tab_Section;
import test_cases.Login_page;
import test_cases.Spellcheck_Tab_Section;
import test_cases.Toc_Tab_Section;
import test_cases.Tools;

public class Report_Writing_Tests {

	public static WebDriver driver;

	@Test(priority = 0)
	public void startbrowser() throws Exception {
		Browsers Browser = new Browsers();
		driver = Browser.startbrowser();
	}

	@Test(priority = 1)
	public void Login() throws Exception {
		Login_page Login_page = new Login_page(driver);
		Login_page.logintoparcel();
	}
	
	@Test(priority = 2, description = "Toc Tab Section")
	public void All_SectionMode() throws Exception {
		Toc_Tab_Section Toc_Tab_Section = new Toc_Tab_Section(driver);
		Toc_Tab_Section.All_SectionMode();
	}

	@Test(priority = 3, description = "Toc Tab Section")
	public void Edit_Tinymce_Editor() throws Exception {
		Toc_Tab_Section Toc_Tab_Section = new Toc_Tab_Section(driver);
		Toc_Tab_Section.Edit_Tinymce_Editor();
	}

	@Test(priority = 4, description = "Toc Tab Section")
	public void Black_All() throws Exception {
		Toc_Tab_Section Toc_Tab_Section = new Toc_Tab_Section(driver);
		Toc_Tab_Section.Black_All();
	}

	@Test(priority = 5, description = "Toc Tab Section")
	public void Highlight_Veriable() throws Exception {
		Toc_Tab_Section Toc_Tab_Section = new Toc_Tab_Section(driver);
		Toc_Tab_Section.Highlight_Veriable();
	}

	@Test(priority = 6, description = "Toc Tab Section")
	public void Save_All() throws Exception {
		Toc_Tab_Section Toc_Tab_Section = new Toc_Tab_Section(driver);
		Toc_Tab_Section.Save_All();
	}

	@Test(priority = 7, description = "Toc Tab Section")
	public void Show_Next_Previous_Section() throws Exception {
		Toc_Tab_Section Toc_Tab_Section = new Toc_Tab_Section(driver);
		Toc_Tab_Section.Show_Next_Previous_Section();
	}

	@Test(priority = 8, description = "Library Tab Section")
	public void Drag_Drop_Library() throws Exception {
		Library_Tab_Section Library_Tab_Section = new Library_Tab_Section(driver);
		Library_Tab_Section.Drag_Drop_Library();
	}

	@Test(priority = 9, description = "Comments Tab Section")
	public void Add_Edit_Comments() throws Exception {
		Comments_Tab_Section Comments_Tab_Section = new Comments_Tab_Section(driver);
		Comments_Tab_Section.Add_Edit_Comments();
	}

	@Test(priority = 10, description = "Comments Tab Section")
	public void Add_Address() throws Exception {
		Comments_Tab_Section Comments_Tab_Section = new Comments_Tab_Section(driver);
		Comments_Tab_Section.Add_Address();
	}

	@Test(priority = 11, description = "Comments Tab Section")
	public void All_Sections_Comments() throws Exception {
		Comments_Tab_Section Comments_Tab_Section = new Comments_Tab_Section(driver);
		Comments_Tab_Section.All_Sections_Comments();
	}

	@Test(priority = 12, description = "Comments Tab Section")
	public void Refresh_OpenAll_CloseAll_SelectAll_Delete_Functionality() throws Exception {
		Comments_Tab_Section Comments_Tab_Section = new Comments_Tab_Section(driver);
		Comments_Tab_Section.Refresh_OpenAll_CloseAll_SelectAll_Delete_Functionality();
	}

	@Test(priority = 13, description = "History Tab Section")
	public void Drag_Drop_History() throws Exception {
		History_Tab_Section History_Tab_Section = new History_Tab_Section(driver);
		History_Tab_Section.Drag_Drop_History();
	}

	@Test(priority = 14, description = "Spellcheck Tab Section")
	public void Spellcheck_Replace_Functionality() throws Exception {
		Spellcheck_Tab_Section Spellcheck_Tab_Section = new Spellcheck_Tab_Section(driver);
		Spellcheck_Tab_Section.Spellcheck_Replace_Functionality();
	}

	@Test(priority = 15, description = "Find/Replace Tab Section")
	public void Find_Replace_Functionality() throws Exception {
		Find_Replace_Tab_Section Find_Replace_Tab_Section = new Find_Replace_Tab_Section(driver);
		Find_Replace_Tab_Section.Find_Replace_Functionality();
	}

	@Test(priority = 16, description = "Tools Dropdown")
	public void Veriable_Replacer() throws Exception {
		Tools Tools = new Tools(driver);
		Tools.Variable_Replacer();
	}

	@Test(priority = 17, description = "Tools Dropdown")
	public void Tools_Dropdown() throws Exception {
		Tools Tools = new Tools(driver);
		Tools.Tools_Dropdown();
	}
}
