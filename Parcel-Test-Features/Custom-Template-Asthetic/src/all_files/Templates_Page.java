package all_files;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Templates_Page {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id='link_134']")
	WebElement Company_Dropdown;

	@FindBy(how = How.XPATH, using = "//*[@id='CompanyMenu']/li/ul[1]/li[1]/a")
	WebElement Templates_Option;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/form/select[@name='companyID']")
	WebElement Templates_Company_Dropdown;

	@FindBy(how = How.XPATH, using = "//*[@id='divTempdefView']/table/tbody/tr[2]/td[1]/a")
	WebElement First_Template;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div/form[2]/table/tbody/tr[2]/td[2]/select[@name='action']")
	WebElement I_Want_to_Dropdown;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/table/tbody/tr[1]/td[2]/input")
	WebElement New_Template_Name;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td/input[@value='Save']")
	WebElement Save_Template_Changes;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td/select[@name='dashboardClass']")
	WebElement Dashboard_DropDown;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div/form[2]/table/tbody/tr/td/select[@name='templateID']")
	WebElement Select_Template_DropDown;

	@FindBy(how = How.XPATH, using = "//a[text()='Edit All']")
	WebElement Edit_All;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/nav/div/ul/li[8]/a")
	WebElement user_dropdown;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[4]/a")
	WebElement logout_button;

	public Templates_Page(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private void Open_Templates_Page(String Company_ID) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, Company_Dropdown);
		Company_Dropdown.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, Templates_Option);
		Templates_Option.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, Templates_Company_Dropdown);
		Select Select_Company = new Select(Templates_Company_Dropdown);
		Select_Company.selectByValue(Company_ID);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	private void Open_Template(String Template_Name) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> All_Templates = driver
				.findElements(By.xpath("//*[@id='divTempdefView']/table/tbody/tr/td[1]/a"));
		for (WebElement AT : All_Templates) {
			if (AT.getText().equals(Template_Name)) {
				JavascriptExecutor JS = (JavascriptExecutor) driver;
				JS.executeScript("arguments[0].scrollIntoView(true);", AT);
				Thread.sleep(5000);
				HighlightElement(driver, AT);
				AT.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				break;
			}
		}

	}

	private void New_Template_Name_And_Save_Template_Webelement(String Template_Name, String Template_Option)
			throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, I_Want_to_Dropdown);
		Select Select_Action = new Select(I_Want_to_Dropdown);
		Select_Action.selectByValue(Template_Option);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement New_Template_Name = driver
				.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/form/table/tbody/tr[1]/td[2]/input"));
		WebElement Save_Template_Changes = driver.findElement(
				By.xpath("html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td/input[@value='Save']"));
		HighlightElement(driver, New_Template_Name);
		New_Template_Name.clear();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		New_Template_Name.sendKeys(Template_Name);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, Save_Template_Changes);
		Save_Template_Changes.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void Copy_Template_Into_New_Template_With_Different_Name() throws Exception {
		Excel_Data excel = new Excel_Data("src\\Test_Data\\Templates_Feature.xlsx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Open_Templates_Page(excel.Company_Id("Template Information", 1, 0));
		HighlightElement(driver, First_Template);
		First_Template.click();
		New_Template_Name_And_Save_Template_Webelement(excel.Template_Name("Template Information", 1, 1), "showCopy");
	}

	public void Edit_And_Save_All_Setup_Options_For_Template() throws Exception {
		Excel_Data excel_Template_Setup = new Excel_Data("src\\Test_Data\\Templates_Feature.xlsx");
		Excel_Data excel = new Excel_Data("src\\Test_Data\\Templates_Feature.xlsx");
		Open_Templates_Page(excel.Company_Id("Template Information", 1, 0));

		for (int i = 1; i <= 2; i++) {
			HighlightElement(driver, Edit_All);
			Edit_All.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			List<WebElement> All_Templates = driver
					.findElements(By.xpath("//*[@id='divTempdefEdit']/form/table/tbody/tr/td[1]"));
			int Template_Counter = 2;
			for (WebElement AT : All_Templates) {
				if (AT.getText().equals(excel.Template_Name("Template Information", 1, 1))) {
					JavascriptExecutor JS = (JavascriptExecutor) driver;
					JS.executeScript("arguments[0].scrollIntoView(true);", AT);
					Thread.sleep(3000);
					HighlightElement(driver, AT);
					Thread.sleep(3000);
					break;
				}
				Template_Counter++;
			}
			WebElement Default_Language_Library_Dropdown = driver.findElement(
					By.xpath("//*[@id='divTempdefEdit']/form/table/tbody/tr[" + Template_Counter + "]/td[2]/select"));
			WebElement Report_Setup_Dropdown = driver.findElement(
					By.xpath("//*[@id='divTempdefEdit']/form/table/tbody/tr[" + Template_Counter + "]/td[3]/select"));
			WebElement TOC_Setup_Dropdown = driver.findElement(
					By.xpath("//*[@id='divTempdefEdit']/form/table/tbody/tr[" + Template_Counter + "]/td[4]/select"));
			WebElement Transmittal_Letter_Dropdown = driver.findElement(
					By.xpath("//*[@id='divTempdefEdit']/form/table/tbody/tr[" + Template_Counter + "]/td[5]/select"));
			WebElement Cover_Page_Dropdown = driver.findElement(
					By.xpath("//*[@id='divTempdefEdit']/form/table/tbody/tr[" + Template_Counter + "]/td[6]/select"));
			WebElement Save_Changes = driver.findElement(By.xpath("//input[@value='Save Changes']"));
			String Old_Language_Option;
			String Old_Report_Setup_Option;
			String Old_TOC_Setup_Option;
			String Old_Transmittal_Letter_Option;
			String Old_Cover_Page_Option;
			List<String> Language_Options_array = new ArrayList<>();
			HighlightElement(driver, Default_Language_Library_Dropdown);
			Select Select_Language = new Select(Default_Language_Library_Dropdown);
			Old_Language_Option = (Select_Language.getFirstSelectedOption()).getAttribute("Value");
			if (i == 1) {
				Select_Language.selectByIndex(3);
			} else {
				List<WebElement> All_Language_Options = Select_Language.getOptions();
				for (WebElement ALO : All_Language_Options) {
					Language_Options_array.add(ALO.getAttribute("Value"));
				}
				if (Language_Options_array.contains(excel_Template_Setup.Template_Setup("Template Setup", 1, 0))) {
					Select_Language.selectByValue(excel_Template_Setup.Template_Setup("Template Setup", 1, 0));

				} else {
					Select_Language.selectByValue(Old_Language_Option);
				}
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			HighlightElement(driver, Report_Setup_Dropdown);
			List<String> Report_Setup_Options_array = new ArrayList<>();
			Select Select_Report_Setup = new Select(Report_Setup_Dropdown);
			Old_Report_Setup_Option = (Select_Report_Setup.getFirstSelectedOption()).getAttribute("Value");
			if (i == 1) {
				Select_Report_Setup.selectByIndex(3);
			} else {
				List<WebElement> All_Report_Setup_Options = Select_Report_Setup.getOptions();
				for (WebElement ARSO : All_Report_Setup_Options) {
					Report_Setup_Options_array.add(ARSO.getAttribute("Value"));
				}
				if (Report_Setup_Options_array.contains(excel_Template_Setup.Template_Setup("Template Setup", 1, 1))) {
					Select_Report_Setup.selectByValue(excel_Template_Setup.Template_Setup("Template Setup", 1, 1));

				} else {
					Select_Report_Setup.selectByValue(Old_Report_Setup_Option);
				}

			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			HighlightElement(driver, TOC_Setup_Dropdown);
			List<String> TOC_Setup_Options_array = new ArrayList<>();
			Select Select_TOC_Setup = new Select(TOC_Setup_Dropdown);
			Old_TOC_Setup_Option = (Select_TOC_Setup.getFirstSelectedOption()).getAttribute("Value");
			if (i == 1) {
				Select_TOC_Setup.selectByIndex(3);
			} else {
				List<WebElement> All_TOC_Setup_Options = Select_TOC_Setup.getOptions();
				for (WebElement ATSO : All_TOC_Setup_Options) {
					TOC_Setup_Options_array.add(ATSO.getAttribute("Value"));
				}
				if (All_TOC_Setup_Options.contains(excel_Template_Setup.Template_Setup("Template Setup", 1, 2))) {
					Select_TOC_Setup.selectByValue(excel_Template_Setup.Template_Setup("Template Setup", 1, 2));

				} else {
					Select_TOC_Setup.selectByValue(Old_TOC_Setup_Option);
				}
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			HighlightElement(driver, Transmittal_Letter_Dropdown);
			List<String> Transmittal_Letter_Options_array = new ArrayList<>();
			Select Select_Transmittal_Letter = new Select(Transmittal_Letter_Dropdown);
			Old_Transmittal_Letter_Option = (Select_Transmittal_Letter.getFirstSelectedOption()).getAttribute("Value");
			if (i == 1) {
				Select_Transmittal_Letter.selectByIndex(3);
			} else {
				List<WebElement> All_Transmittal_Letter_Options = Select_Transmittal_Letter.getOptions();
				for (WebElement ATLO : All_Transmittal_Letter_Options) {
					Transmittal_Letter_Options_array.add(ATLO.getAttribute("Value"));
				}
				if (Transmittal_Letter_Options_array
						.contains(excel_Template_Setup.Template_Setup("Template Setup", 1, 3))) {
					Select_Transmittal_Letter
							.selectByValue(excel_Template_Setup.Template_Setup("Template Setup", 1, 3));
				} else {
					Select_Transmittal_Letter.selectByValue(Old_Transmittal_Letter_Option);
				}
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			HighlightElement(driver, Cover_Page_Dropdown);
			List<String> Cover_Page_Options_array = new ArrayList<>();
			Select Select_Cover_Page = new Select(Cover_Page_Dropdown);
			Old_Cover_Page_Option = (Select_Cover_Page.getFirstSelectedOption()).getAttribute("Value");
			if (i == 1) {
				Select_Cover_Page.selectByIndex(3);
			} else {
				List<WebElement> All_Cover_Page_Options = Select_Cover_Page.getOptions();
				for (WebElement ACPO : All_Cover_Page_Options) {
					Cover_Page_Options_array.add(ACPO.getAttribute("Value"));
				}
				if (Cover_Page_Options_array.contains(excel_Template_Setup.Template_Setup("Template Setup", 1, 4))) {
					Select_Cover_Page.selectByValue(excel_Template_Setup.Template_Setup("Template Setup", 1, 4));
				} else {
					Select_Cover_Page.selectByValue(Old_Cover_Page_Option);
				}
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			JavascriptExecutor JT = (JavascriptExecutor) driver;
			JT.executeScript("arguments[0].scrollIntoView(true);", Save_Changes);
			HighlightElement(driver, Save_Changes);
			Save_Changes.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

	public void Make_Default_And_Rename_Template() throws Exception {
		Excel_Data excel = new Excel_Data("src\\Test_Data\\Templates_Feature.xlsx");
		// Open_Templates_Page(excel.Company_Id(1, 0));
		Open_Template(excel.Template_Name("Template Information", 1, 1));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, I_Want_to_Dropdown);
		try {
			Select Select_Action = new Select(I_Want_to_Dropdown);
			Select_Action.selectByValue("makeDefault");
		} catch (Exception e) {

		}
		WebElement Save_Template_Changes = driver
				.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/form[2]/table/tbody/tr[3]/td"));
		HighlightElement(driver, Save_Template_Changes);
		New_Template_Name_And_Save_Template_Webelement(excel.Template_Name("Template Information", 1, 2), "showRename");
	}

	public void Shortname_Template() throws Exception {
		String Renamed_Template_Name;
		String Shortname_Template_Name;
		Excel_Data excel = new Excel_Data("src\\Test_Data\\Templates_Feature.xlsx");
		Renamed_Template_Name = excel.Template_Name("Template Information", 1, 2);
		Open_Templates_Page(excel.Company_Id("Template Information", 1, 0));
		Open_Template(Renamed_Template_Name);
		Shortname_Template_Name = excel.Template_Name("Template Information", 1, 3);
		New_Template_Name_And_Save_Template_Webelement(Shortname_Template_Name, "showShortName");
		Open_Templates_Page(excel.Company_Id("Template Information", 1, 0));
		Open_Template(Renamed_Template_Name);
	}

	public void View_Report_Section_Structure_And_Define_Rules() throws Exception {
		HighlightElement(driver, I_Want_to_Dropdown);
		Select Select_Action = new Select(I_Want_to_Dropdown);
		Select_Action.selectByValue("showStructure");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> Report_Structure_Main_Heading = driver.findElements(By.xpath(
				"html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td[2 and @style='font-weight:bold;']"));
		for (WebElement RSMH : Report_Structure_Main_Heading) {
			HighlightElement(driver, RSMH);
			JavascriptExecutor JR = (JavascriptExecutor) driver;
			JR.executeScript("arguments[0].scrollIntoView(true);", RSMH);
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, I_Want_to_Dropdown);
		Select Select_Option = new Select(I_Want_to_Dropdown);
		Select_Option.selectByValue("showRules");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void Define_Dashboard() throws Exception {
		for (int i = 2; i >= 1; i--) {
			HighlightElement(driver, I_Want_to_Dropdown);
			Select Select_Action = new Select(I_Want_to_Dropdown);
			Select_Action.selectByValue("showDashboard");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			HighlightElement(driver, Dashboard_DropDown);
			Select Dashboard_Action = new Select(Dashboard_DropDown);
			Dashboard_Action.selectByIndex(i);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement Save_Template_Changes = driver.findElement(
					By.xpath("html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td/input[@value='Save']"));
			HighlightElement(driver, Save_Template_Changes);
			Save_Template_Changes.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

	public void Move_Template_ToAnotherCompany_And_Delete_Template() throws Exception {
		Excel_Data excel = new Excel_Data("src\\Test_Data\\Templates_Feature.xlsx");
		String Move_Template_Into_Company_ID;
		HighlightElement(driver, I_Want_to_Dropdown);
		Select Select_Action = new Select(I_Want_to_Dropdown);
		Select_Action.selectByValue("showMove");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement New_Company_Dropdown = driver.findElement(
				By.xpath("html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td/select[@name='toCompanyID']"));
		Move_Template_Into_Company_ID = excel.Company_Id("Template Information", 1, 4);
		HighlightElement(driver, New_Company_Dropdown);
		Select Select_Company = new Select(New_Company_Dropdown);
		Select_Company.selectByValue(Move_Template_Into_Company_ID);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Save_Template_Changes = driver.findElement(
				By.xpath("html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td/input[@value='Save']"));
		HighlightElement(driver, Save_Template_Changes);
		Save_Template_Changes.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Open_Templates_Page(excel.Company_Id("Template Information", 1, 0));
		List<WebElement> All_Templates = driver
				.findElements(By.xpath("//*[@id='divTempdefView']/table/tbody/tr/td[1]/a"));
		String Splice_Template_Name = excel.Template_Name("Template Information", 1, 2).substring(3);
		List<String> All_Templates_array = new ArrayList<>();
		for (WebElement AT : All_Templates) {
			All_Templates_array.add(AT.getText());
			if (AT.getText().contains(Splice_Template_Name)) {
				JavascriptExecutor JS = (JavascriptExecutor) driver;
				JS.executeScript("arguments[0].scrollIntoView(true);", AT);
				HighlightElement(driver, AT);
			}
		}
		if (All_Templates_array.contains(excel.Template_Name("Template Information", 1, 2))) {
			System.out
					.println("After did Move template operation on " + excel.Template_Name("Template Information", 1, 2)
							+ " Template still present in Company having ID= "
							+ excel.Company_Id("Template Information", 1, 0));
		} else {
			System.out.println(excel.Template_Name("Template Information", 1, 2)
					+ " Template was moved into Company ID= " + Move_Template_Into_Company_ID
					+ " and not present in Company having ID= " + excel.Company_Id("Template Information", 1, 0));
		}

		Open_Templates_Page(Move_Template_Into_Company_ID);
		Open_Template(excel.Template_Name("Template Information", 1, 2));
		HighlightElement(driver, I_Want_to_Dropdown);
		Select Select_option = new Select(I_Want_to_Dropdown);
		Select_option.selectByValue("showDelete");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Delete_Now = driver.findElement(
				By.xpath("html/body/div[2]/div/div/div/div/div/form/table/tbody/tr/td/input[@value='Delete Now']"));
		HighlightElement(driver, Delete_Now);
		Delete_Now.click();
		System.out.println(excel.Template_Name("Template Information", 1, 2) + " Template deleted from Company ID: "
				+ Move_Template_Into_Company_ID + "");
		Thread.sleep(2000);
		Open_Templates_Page(Move_Template_Into_Company_ID);
	}

	public void LogOut() throws Exception {
		Thread.sleep(2000);
		HighlightElement(driver, user_dropdown);
		user_dropdown.click();
		Thread.sleep(2000);
		HighlightElement(driver, logout_button);
		logout_button.click();
		Thread.sleep(8000);
	}

}
