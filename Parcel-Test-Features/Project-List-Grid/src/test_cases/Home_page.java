package test_cases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_page {

	WebDriver driver;
	String ExcelProject_Name;
	String Excel_address;
	String Excel_city;
	String AllReports_name = "";
	String Report_name = "";
	public static String Created_Report_SiteId;

	@FindBy(how = How.XPATH, using = ".//*[@id='contentstart-content']/ul/li[1]/a")
	WebElement New_single_site_project;

	@FindBy(how = How.XPATH, using = "//ul/li[contains(text(),'Last 90 Days')]")
	WebElement Date_Range_90days;

	@FindBy(how = How.XPATH, using = "//ul/li[contains(text(),'This Year')]")
	WebElement Date_Range_thisyear;

	@FindBy(how = How.XPATH, using = "//ul/li[contains(text(),'Last Year')]")
	WebElement Date_Range_lastyear;

	@FindBy(how = How.XPATH, using = "//ul/li[contains(text(),'All Time')]")
	public WebElement Date_Range_alltime;

	@FindBy(how = How.XPATH, using = "//div[label[text()='From']]/input")
	WebElement Date_Range_from;

	@FindBy(how = How.XPATH, using = "(//th[@class='month'])[2]/select[@class='monthselect']")
	WebElement Date_Range_frommonth;

	@FindBy(how = How.XPATH, using = "(//th[@class='month'])[2]/select[@class='yearselect']")
	WebElement Date_Range_fromyear;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/table/tbody")
	WebElement Date_Range_fromdate;

	@FindBy(how = How.XPATH, using = "//ul/li[contains(text(),'Custom Range')]")
	WebElement custom_range;

	@FindBy(how = How.XPATH, using = "//button[text()='Apply']")
	WebElement Date_Range_apply;

	@FindBy(how = How.XPATH, using = "//button[text()='Cancel']")
	WebElement Date_Range_cancel;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/input")
	WebElement Date_Range;

	@FindBy(how = How.XPATH, using = "//*/div[1]/div[3]/div[2]/div/div/ul/li[3]")
	WebElement Status_ALL;

	@FindBy(how = How.XPATH, using = "//*/div[1]/div[3]/div[2]/div/div/ul/li[1]")
	WebElement Status_nonfinal;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div/button")
	WebElement status_button;

	@FindBy(how = How.XPATH, using = "//*/div[1]/div[3]/div[2]/div/div/ul/li[2]")
	WebElement status_final;

	@FindBy(how = How.XPATH, using = "//table[@id='gridfindreports']/tbody/tr[2]/td[1]/a")
	WebElement Report_icon;

	@FindBy(how = How.XPATH, using = "//table[@id='gridfindreports']/tbody/tr[2]/td[2]/a")
	WebElement Project_icon;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Home')]")
	WebElement Home_tab;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Home')])[1]")
	WebElement classic_Home_tab;

	@FindBy(how = How.XPATH, using = "//*[@id='divViewProjectInfo']/table/tbody/tr[th[text()='Project Name:']]/td")
	WebElement PD_projectname;

	@FindBy(how = How.XPATH, using = "//a[@title='Open Project Dashboard.']")
	WebElement TOC_projectname;

	@FindBy(how = How.XPATH, using = "(//h1/a)[1]")
	WebElement classic_TOC_projectname;

	@FindBy(how = How.XPATH, using = "//table[@id='gridfindreports']/tbody/tr[2]/td[4]")
	WebElement first_report_in_grid;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[3]/div/div/div/ul/li[4]/a")
	WebElement grantaccess;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/h3")
	WebElement accessmanagement_heading;

	@FindBy(how = How.ID, using = "gs_pName")
	WebElement Search_project;

	@FindBy(how = How.ID, using = "gs_city")
	WebElement Search_city;

	@FindBy(how = How.ID, using = "gs_address1")
	WebElement Search_address;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[3]/div[3]/div/table/thead/tr[1]/th/div")
	WebElement Grid_columns;

	@FindBy(how = How.XPATH, using = "//*[@id='gview_gridfindreports']/div[3]/div/table/thead/tr[1]")
	WebElement Grid_columnsrow;

	@FindBy(how = How.XPATH, using = "//*[@id='gridfindreports']/tbody/tr[2]")
	WebElement First_Gridrow;

	@FindBy(how = How.XPATH, using = "//*[@id='gview_gridfindreports']/div[3]/div/table/thead/tr[2]/th[4]/div/table/tbody/tr/td[3]/a")
	WebElement remove_projectfilter; // use xpath for firefox:
										// //*[@id='gview_gridfindreports']/div[3]/div/table/thead/tr[2]/th[3]/div/table/tbody/tr/td[3]/a

	@FindBy(how = How.XPATH, using = "//*[@id='gview_gridfindreports']/div[3]/div/table/thead/tr[2]/th[7]/div/table/tbody/tr/td[3]/a")
	WebElement remove_addressfilter; // use xpath for
										// firefox://*[@id='gview_gridfindreports']/div[3]/div/table/thead/tr[2]/th[6]/div/table/tbody/tr/td[3]/a

	@FindBy(how = How.XPATH, using = "//*[@id='gview_gridfindreports']/div[3]/div/table/thead/tr[2]/th[8]/div/table/tbody/tr/td[3]/a")
	WebElement remove_cityfilter; // use xpath for firefox:
									// //*[@id='gview_gridfindreports']/div[3]/div/table/thead/tr[2]/th[7]/div/table/tbody/tr/td[3]/a

	@FindBy(how = How.ID, using = "jqgh_gridfindreports_pName")
	WebElement Project_columnheader;

	@FindBy(how = How.ID, using = "jqgh_gridfindreports_city")
	WebElement city_columnheader;

	@FindBy(how = How.ID, using = "jqgh_gridfindreports_state")
	WebElement state_columnheader;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/table/thead/tr[1]/th[3]")
	WebElement calendar_nextmonth;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/table/thead/tr[1]/th[1]")
	WebElement calendar_previousmonth;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div/table/thead/tr[1]/th[2]/select[1]")
	WebElement Date_Range_tomonth;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div/table/thead/tr[1]/th[2]/select[2]")
	WebElement Date_Range_toyear;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/nav/div/ul/li[8]/a")
	WebElement user_dropdown;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[4]/a")
	WebElement logout_button;

	@FindBy(how = How.XPATH, using = "//*[@id='s2id_select-project']")
	WebElement Project_dropdown;

	@FindBy(how = How.XPATH, using = "//*[@id='select2-drop']/div/input")
	WebElement Search_Project_dropdown;

	@FindBy(how = How.XPATH, using = "//*[@id='select2-drop']/ul/li")
	WebElement Alertmessage_Project_dropdown;

	@FindBy(how = How.XPATH, using = "//*[@id='gridfindreports-content']/div[1]/div[3]/div[4]/input")
	WebElement Disabled_goto_project_button;

	@FindBy(how = How.XPATH, using = "//*[@id='gridfindreports-content']/div[1]/div[3]/div[4]/input")
	WebElement goto_project_button;

	@FindBy(how = How.XPATH, using = "//*[@id='select2-drop']/ul")
	WebElement Search_Project_results;

	@FindBy(how = How.XPATH, using = "//*[@id='s2id_select-project']/a/abbr")
	WebElement Search_Project_clear;

	@FindBy(how = How.XPATH, using = "//*[@id='next_t_gridfindreports_toppager']/span")
	WebElement Grid_Next_Page;

	@FindBy(how = How.XPATH, using = "//*[@id='prev_t_gridfindreports_toppager']/span")
	WebElement Grid_Previous_Page;

	@FindBy(how = How.XPATH, using = "//*[@id='last_t_gridfindreports_toppager']/span")
	WebElement Grid_Last_Page;

	@FindBy(how = How.XPATH, using = "//*[@id='first_t_gridfindreports_toppager']/span")
	WebElement Grid_First_Page;

	@FindBy(how = How.XPATH, using = "//*[@id='refresh_gridfindreports_top']/div/span")
	WebElement Reload_Grid;

	@FindBy(how = How.XPATH, using = "//*[@id='gridfindreports_toppager_csv']/div/span")
	WebElement Export_to_CSV_Icon;

	@FindBy(how = How.XPATH, using = "//*[@id='gridfindreports_toppager_left']/table/tbody/tr/td[5]/div")
	WebElement Clear_Gridfilters;

	@FindBy(how = How.XPATH, using = "//*[@id='gridfindreports_toppager_left']/table/tbody/tr/td[4]/div")
	WebElement Columns_Option;

	@FindBy(how = How.XPATH, using = "//*[@id='colchooser_gridfindreports']/div/div/div[2]/ul/li[2]/a/span")
	WebElement Add_Column;

	@FindBy(how = How.XPATH, using = "//*[@id='colchooser_gridfindreports']/div/div/div[1]/ul/li[14]/a/span")
	WebElement Remove_Column;

	@FindBy(how = How.XPATH, using = "//*[@id='colchooser_gridfindreports']/div/div/div[1]/div/a")
	WebElement RemoveAll_Column;

	@FindBy(how = How.XPATH, using = "//*[@id='colchooser_gridfindreports']/div/div/div[2]/div/a")
	WebElement AddAll_Column;

	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement Ok_Button_Selectcolumnpopup;

	@FindBy(how = How.XPATH, using = "//*[@id='gridfindreports_toppager_right']/div")
	WebElement Grid_Totalview;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[3]/div[4]/div/table/tbody/tr/td[4]")
	WebElement All_Project_Names_in_Project_Column;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div/div[2]/a")
	WebElement PD_Close_Button;

	public Home_page(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private boolean ExistsElement(WebElement Element) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			Element.getText();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void Print_Project_name(WebElement classic_TOC_projectname, WebElement TOC_projectname) throws Exception {

		if (!classic_TOC_projectname.isDisplayed()) {
			HighlightElement(driver, TOC_projectname);
			System.out.println("Newly Created Project name on report page: " + TOC_projectname.getText());
			Home_tab.click();
		}
		if (!TOC_projectname.isDisplayed()) {
			HighlightElement(driver, classic_TOC_projectname);
			System.out.println(classic_TOC_projectname.getText() + " on report page in classic view.");
			classic_Home_tab.click();

		}
	}

	public void change_Date_Range() throws InterruptedException {
		driver.findElement(
				By.xpath("html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/input"))
				.click();
		Date_Range_90days.click();
		// Date_Range_alltime.click();
	}

	public void change_Status() throws InterruptedException {
		// for click on button
		driver.findElement(
				By.xpath("html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div/button"))
				.click();
		Status_ALL.click();
	}

	public void allreports_list() throws InterruptedException {
		// Thread.sleep(8000);
		// Date_Range.click();
		// Date_Range_alltime.click();
		// change_Status();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> reports = driver.findElements(By.xpath("//*[@id]/td[4]"));
		int Counter = 0;
		for (WebElement R : reports) {
			Report_name = R.getText();
			System.out.println("Project Name:" + Report_name);
			if (Counter == 10) {
				break;
			}
			Counter++;
		}

	}

	public void create_project() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, New_single_site_project);
		New_single_site_project.click();
	}

	public void check_project() throws InterruptedException {
		Home_tab.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		change_Date_Range();
		change_Status();
		Thread.sleep(12000);
		HighlightElement(driver, Report_icon);
		Report_icon.click();
		Thread.sleep(8000);

		if (ExistsElement(TOC_projectname)) {
			HighlightElement(driver, TOC_projectname);
			System.out.println("Newly Created Project name on report page: " + TOC_projectname.getText());
			Home_tab.click();
		} else if (ExistsElement(classic_TOC_projectname)) {
			HighlightElement(driver, classic_TOC_projectname);
			System.out.println(classic_TOC_projectname.getText() + " on report page in classic view.");
			classic_Home_tab.click();
		} else {
			driver.navigate().back();
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, Project_icon);
		Project_icon.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, PD_projectname);
		System.out.println("Project name on Project Dashborad page: " + PD_projectname.getText());
		HighlightElement(driver, Home_tab);
		Home_tab.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, first_report_in_grid);
		Actions action = new Actions(driver);
		action.moveToElement(first_report_in_grid).doubleClick().perform();
		Thread.sleep(8000);
		if (ExistsElement(TOC_projectname)) {
			HighlightElement(driver, TOC_projectname);
			System.out.println("Project name on TOC section of report page after double click on report in grid: "
					+ TOC_projectname.getText());
			Home_tab.click();
		} else if (ExistsElement(classic_TOC_projectname)) {
			HighlightElement(driver, classic_TOC_projectname);
			System.out.println("Project name on report page in classic view after double click on report in grid: "
					+ classic_TOC_projectname.getText());
			classic_Home_tab.click();
		} else {
			driver.navigate().back();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		first_report_in_grid.click();
		HighlightElement(driver, grantaccess);
		grantaccess.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, accessmanagement_heading);
		System.out.println("Heading on Access Management page: " + accessmanagement_heading.getText());
		HighlightElement(driver, Home_tab);
		Home_tab.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void All_Projects_In_ProjectColumn() throws Exception {
		List<WebElement> All_Projects = driver.findElements(By.xpath("//*[@id]/td[4]"));
		List<String> All_Projects_array = new ArrayList<>();
		int Counter = 0;
		for (WebElement P : All_Projects) {
			All_Projects_array.add(P.getText());
			System.out.println("Project Name:" + Report_name);
			if (Counter == 10) {
				break;
			}
			Counter++;
		}

	}

	public void Clear_Column_Filters() throws Exception {

		for (int i = 3; i <= 19; i++) {

			WebElement Clear_Column_Filter = driver
					.findElement(By.xpath(".//*[@id='gview_gridfindreports']/div[3]/div/table/thead/tr[2]/th[" + i
							+ "]/div/table/tbody/tr/td[3]/a"));
			Clear_Column_Filter.click();
		}

	}

	public void search_project() throws Exception {
		Excel_Data excel = new Excel_Data("src\\Test_Data\\Project_List_Grid_Feature.xlsx");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> Grid_Columns = driver.findElements(By.xpath(
				"html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[3]/div[3]/div/table/thead/tr[1]/th/div"));

		for (WebElement e1 : Grid_Columns) {
			System.out.println("Column: " + e1.getText());
		}
		Search_city.sendKeys("texas");
		Search_city.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		remove_cityfilter.click();
		Thread.sleep(8000);
		Search_project.sendKeys(excel.Project_Name("Create Project", 1, 0));
		Search_address.sendKeys(excel.Address("Create Project", 1, 2));
		Search_city.sendKeys(excel.City("Create Project", 1, 3));
		Search_city.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		Created_Report_SiteId = driver.findElement(By.xpath("//td[contains(@aria-describedby, 'SiteID')]")).getText();
		Clear_Column_Filters();
		Thread.sleep(8000);
		HighlightElement(driver, Project_columnheader);
		Project_columnheader.click();
		Thread.sleep(8000);
		HighlightElement(driver, Project_columnheader);
		Project_columnheader.click();
		Thread.sleep(8000);
		HighlightElement(driver, city_columnheader);
		city_columnheader.click();
		Thread.sleep(8000);
		HighlightElement(driver, city_columnheader);
		city_columnheader.click();
		Thread.sleep(8000);
		HighlightElement(driver, state_columnheader);
		state_columnheader.click();
		Thread.sleep(8000);
		HighlightElement(driver, state_columnheader);
		state_columnheader.click();
		Thread.sleep(8000);
		HighlightElement(driver, first_report_in_grid);
		Actions action = new Actions(driver);
		action.moveToElement(first_report_in_grid).doubleClick().perform();
		Thread.sleep(8000);

		try {
			HighlightElement(driver, TOC_projectname);
			System.out.println("Project name on TOC section of report page: " + TOC_projectname.getText());
			Home_tab.click();
		} catch (Exception e) {

		}

		try {
			HighlightElement(driver, classic_TOC_projectname);
			System.out.println(classic_TOC_projectname.getText() + " on report page in classic view.");
			classic_Home_tab.click();

		} catch (Exception e) {

		}

		Thread.sleep(8000);
		HighlightElement(driver, Project_icon);
		Project_icon.click();
		Thread.sleep(8000);
		HighlightElement(driver, PD_projectname);
		System.out.println("Project name on Project Dashborad page: " + PD_projectname.getText());
		Home_tab.click();
		Thread.sleep(8000);
		HighlightElement(driver, Report_icon);
		Report_icon.click();
		Thread.sleep(8000);

		try {
			HighlightElement(driver, TOC_projectname);
			System.out.println("Project name on TOC section of report page: " + TOC_projectname.getText());
			Home_tab.click();
		} catch (Exception e) {

		}

		try {
			HighlightElement(driver, classic_TOC_projectname);
			System.out.println(classic_TOC_projectname.getText() + " on report page in classic view.");
			classic_Home_tab.click();

		} catch (Exception e) {

		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> Allreports = driver.findElements(By.xpath("//*[@id]/td[4]"));
		List<String> Allreports_array = new ArrayList<>();
		for (WebElement A : Allreports) {
			AllReports_name = A.getText();
			Allreports_array.add(AllReports_name);
			System.out.println("Report Name: " + AllReports_name);
		}
		System.out.println("Total Reports in Grid: " + Allreports_array.size());
	}

	public void Date_Range() throws Exception {
		change_Status();
		Date_Range.click();
		Date_Range_90days.click();
		Thread.sleep(8000);
		Date_Range.click();
		Date_Range_thisyear.click();
		Thread.sleep(15000);
		Date_Range.click();
		Date_Range_lastyear.click();
		Thread.sleep(15000);
		/*
		 * Date_Range.click(); Date_Range_alltime.click(); Thread.sleep(15000);
		 */
		Date_Range.click();
		custom_range.click();
		Select DateRange_frommonth = new Select(Date_Range_frommonth);
		DateRange_frommonth.selectByIndex(9);
		Select DateRange_fromyear = new Select(Date_Range_fromyear);
		DateRange_fromyear.selectByIndex(11);
		List<WebElement> fromdates = driver.findElements(By.xpath(
				"html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/table/tbody/tr/td"));
		List<String> fromalldates = new ArrayList<>();

		for (WebElement d1 : fromdates) {

			fromalldates.add(d1.getText());
		}

		for (int i = 0; i < fromalldates.size(); i++) {

			if (fromalldates.get(i).equals("16")) {

				fromdates.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		HighlightElement(driver, Date_Range_cancel);
		Date_Range_cancel.click();
		Thread.sleep(5000);
		Date_Range.click();
		Date_Range_90days.click();
		Thread.sleep(8000);

	}

	public void check_calendar() throws Exception {
		Login_page login_page = PageFactory.initElements(driver, Login_page.class);

		Date_Range.click();
		custom_range.click();
		Thread.sleep(1000);
		calendar_nextmonth.click();
		Thread.sleep(3000);
		HighlightElement(driver, calendar_nextmonth);
		calendar_nextmonth.click();
		Thread.sleep(3000);
		HighlightElement(driver, calendar_nextmonth);
		calendar_nextmonth.click();
		Thread.sleep(3000);
		HighlightElement(driver, calendar_nextmonth);
		calendar_nextmonth.click();
		Thread.sleep(3000);
		HighlightElement(driver, calendar_previousmonth);
		calendar_previousmonth.click();
		Thread.sleep(3000);
		HighlightElement(driver, calendar_previousmonth);
		calendar_previousmonth.click();
		Thread.sleep(3000);
		HighlightElement(driver, calendar_previousmonth);
		calendar_previousmonth.click();
		Thread.sleep(3000);
		HighlightElement(driver, calendar_previousmonth);
		calendar_previousmonth.click();
		Thread.sleep(3000);
		Select DateRange_fromyear = new Select(Date_Range_fromyear);
		DateRange_fromyear.selectByIndex(8);
		List<WebElement> fromdates = driver.findElements(By.xpath(
				"html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/table/tbody/tr/td"));
		List<String> fromalldates = new ArrayList<>();

		for (WebElement d1 : fromdates) {

			fromalldates.add(d1.getText());
		}

		for (int i = 0; i < fromalldates.size(); i++) {

			if (fromalldates.get(i).equals("8")) {

				fromdates.get(i).click();
				break;
			}
		}

		Select DateRange_tomonth = new Select(Date_Range_tomonth);
		DateRange_tomonth.selectByIndex(4);
		Select DateRange_toyear = new Select(Date_Range_toyear);
		DateRange_toyear.selectByIndex(5);
		List<WebElement> todates = driver.findElements(By.xpath(
				"html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div/table/tbody/tr/td"));
		List<String> toalldates = new ArrayList<>();
		for (WebElement t1 : todates) {
			toalldates.add(t1.getText());
		}
		for (int i = 0; i < toalldates.size(); i++) {

			if (toalldates.get(i).equals("10")) {
				todates.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		HighlightElement(driver, Date_Range_apply);
		Date_Range_apply.click();
		Thread.sleep(20000);
		// Date_Range.click();
		// Date_Range_alltime.click();
		Date_Range.click();
		Date_Range_90days.click();
		Thread.sleep(15000);
		HighlightElement(driver, Date_Range);
		System.out.println("Before log out Date range is " + Date_Range.getAttribute("value"));
		HighlightElement(driver, user_dropdown);
		user_dropdown.click();
		HighlightElement(driver, logout_button);
		logout_button.click();
		login_page.logintoparcel();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, Date_Range);
		Thread.sleep(8000);
		System.out.println("After logged in Date range is " + Date_Range.getAttribute("value"));

	}

	public void check_status() throws Exception {
		Date_Range.click();
		Date_Range_90days.click();
		HighlightElement(driver, status_button);
		status_button.click();
		HighlightElement(driver, Status_nonfinal);
		Status_nonfinal.click();
		Thread.sleep(8000);
		HighlightElement(driver, status_button);
		status_button.click();
		HighlightElement(driver, status_final);
		status_final.click();
		Thread.sleep(8000);
		HighlightElement(driver, status_button);
		status_button.click();
		HighlightElement(driver, Status_ALL);
		Status_ALL.click();
		Thread.sleep(8000);
	}

	public void Search_Project_Dropdown() throws Exception {
		Excel_Data excel = new Excel_Data("src\\Test_Data\\Project_List_Grid_Feature.xlsx");

		ExcelProject_Name = excel.Project_Name("Create Project", 1, 0);
		Project_dropdown.click();
		HighlightElement(driver, Search_Project_dropdown);
		Search_Project_dropdown.sendKeys("zzz");
		Thread.sleep(3000);
		HighlightElement(driver, Alertmessage_Project_dropdown);
		HighlightElement(driver, Disabled_goto_project_button);
		HighlightElement(driver, Search_Project_dropdown);
		Search_Project_dropdown.clear();
		Thread.sleep(2000);
		Search_Project_dropdown.sendKeys("test");
		Thread.sleep(5000);
		Search_Project_dropdown.clear();
		Thread.sleep(2000);
		Search_Project_dropdown.sendKeys(ExcelProject_Name);
		List<WebElement> Search_project_Results = driver.findElements(By.xpath("//*[@id='select2-drop']/ul/li"));
		String Searchproject_Results;
		for (WebElement S : Search_project_Results) {
			Searchproject_Results = S.getText();
			if (Searchproject_Results.equalsIgnoreCase(ExcelProject_Name)) {
				S.click();
				break;
			}

		}
		Thread.sleep(12000);
		HighlightElement(driver, First_Gridrow);
		HighlightElement(driver, Search_Project_clear);
		Search_Project_clear.click();
		Thread.sleep(8000);
		Project_dropdown.click();
		HighlightElement(driver, Search_Project_dropdown);
		Search_Project_dropdown.sendKeys("pca");
		Thread.sleep(8000);
		List<WebElement> Search_project_Result = driver.findElements(By.xpath("//*[@id='select2-drop']/ul/li"));
		for (WebElement S : Search_project_Result) {

			if (S.getText().equalsIgnoreCase(ExcelProject_Name)) {

				S.click();
				break;
			}
		}
		Thread.sleep(12000);
		HighlightElement(driver, First_Gridrow);
		HighlightElement(driver, goto_project_button);
		goto_project_button.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		HighlightElement(driver, PD_projectname);
		System.out.println("Project Name on project dashboard page which appears after click on Go to Project button: "
				+ PD_projectname.getText());
		driver.close();
		driver.switchTo().window(winHandleBefore);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Search_Project_clear.click();
		Thread.sleep(10000);
	}

	public void Check_Grid_Control() throws Exception {
		Excel_Data excel = new Excel_Data("src\\Test_Data\\Project_List_Grid_Feature.xlsx");

		Thread.sleep(5000);
		HighlightElement(driver, Grid_Next_Page);
		Grid_Next_Page.click();
		Thread.sleep(18000);
		HighlightElement(driver, Reload_Grid);
		Actions refreshhover = new Actions(driver);
		refreshhover.moveToElement(Reload_Grid).perform();
		Thread.sleep(8000);
		Reload_Grid.click();
		Thread.sleep(8000);
		HighlightElement(driver, Export_to_CSV_Icon);
		Actions excelhover = new Actions(driver);
		excelhover.moveToElement(Export_to_CSV_Icon).perform();
		Thread.sleep(3000);
		Export_to_CSV_Icon.click();
		Thread.sleep(3000);
		HighlightElement(driver, Columns_Option);
		Actions Columnshover = new Actions(driver);
		Columnshover.moveToElement(Columns_Option).perform();
		Thread.sleep(3000);
		Columns_Option.click();
		Thread.sleep(3000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver
				.findElement(By.xpath("//*[@id='colchooser_gridfindreports']/div/div/div[1]/ul/li[14]/a/span"));
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
		HighlightElement(driver, Remove_Column);
		Remove_Column.click();
		// Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> Removed_Column = driver
				.findElements(By.xpath("//*[@id='colchooser_gridfindreports']/div/div/div[2]/ul/li"));
		List<String> Removed_Columns = new ArrayList<>();
		for (WebElement R : Removed_Column) {
			Removed_Columns.add(R.getText());
		}
		System.out.println("Removed Column name: " + Removed_Columns.get(Removed_Columns.size() - 1));
		Thread.sleep(3000);
		HighlightElement(driver, Ok_Button_Selectcolumnpopup);
		Ok_Button_Selectcolumnpopup.click();
		Thread.sleep(8000);
		HighlightElement(driver, Grid_columnsrow);
		HighlightElement(driver, Columns_Option);
		Columns_Option.click();
		Thread.sleep(3000);
		HighlightElement(driver, Add_Column);
		Add_Column.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> Added_Column = driver
				.findElements(By.xpath("//*[@id='colchooser_gridfindreports']/div/div/div[1]/ul/li"));
		List<String> Added_Columns = new ArrayList<>();
		for (WebElement A : Added_Column) {
			Added_Columns.add(A.getText());
		}
		System.out.println("Added Column name: " + Added_Columns.get(Removed_Columns.size() - 1));
		Thread.sleep(3000);
		HighlightElement(driver, Ok_Button_Selectcolumnpopup);
		Ok_Button_Selectcolumnpopup.click();
		Thread.sleep(8000);
		HighlightElement(driver, Grid_columnsrow);
		HighlightElement(driver, Columns_Option);
		Columns_Option.click();
		Thread.sleep(3000);
		HighlightElement(driver, RemoveAll_Column);
		RemoveAll_Column.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> RemovedALL_Column = driver
				.findElements(By.xpath("//*[@id='colchooser_gridfindreports']/div/div/div[2]/ul/li"));
		List<String> RemovedAll_Columns = new ArrayList<>();
		for (WebElement RA : RemovedALL_Column) {
			RemovedAll_Columns.add(RA.getText());
		}
		System.out.println("Removed All Columns names: " + RemovedAll_Columns);
		Thread.sleep(3000);
		HighlightElement(driver, Ok_Button_Selectcolumnpopup);
		Ok_Button_Selectcolumnpopup.click();
		Thread.sleep(8000);
		HighlightElement(driver, Grid_columnsrow);
		HighlightElement(driver, Columns_Option);
		Columns_Option.click();
		Thread.sleep(3000);
		HighlightElement(driver, AddAll_Column);
		AddAll_Column.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> AddedALL_Column = driver
				.findElements(By.xpath("//*[@id='colchooser_gridfindreports']/div/div/div[1]/ul/li"));
		List<String> AddedAll_Columns = new ArrayList<>();
		for (WebElement AA : AddedALL_Column) {
			AddedAll_Columns.add(AA.getText());
		}
		System.out.println("Addedd All Columns names: " + AddedAll_Columns);
		Thread.sleep(3000);
		HighlightElement(driver, Ok_Button_Selectcolumnpopup);
		Ok_Button_Selectcolumnpopup.click();
		Thread.sleep(8000);
		HighlightElement(driver, Grid_columnsrow);
		HighlightElement(driver, Columns_Option);
		Columns_Option.click();
		Thread.sleep(3000);
		WebElement Sourcelocator = driver
				.findElement(By.xpath("//*[@id='colchooser_gridfindreports']/div/div/div[1]/ul/li[9]"));
		WebElement Destinationlocator = driver
				.findElement(By.xpath("//*[@id='colchooser_gridfindreports']/div/div/div[1]/ul/li[8]"));
		HighlightElement(driver, Sourcelocator);
		HighlightElement(driver, Destinationlocator);
		Actions drag = new Actions(driver);
		drag.dragAndDrop(Sourcelocator, Destinationlocator).perform();
		Thread.sleep(3000);
		HighlightElement(driver, Ok_Button_Selectcolumnpopup);
		Ok_Button_Selectcolumnpopup.click();
		Thread.sleep(8000);
		HighlightElement(driver, Search_project);
		Search_project.sendKeys(excel.Project_Name("Create Project", 1, 0));
		HighlightElement(driver, Search_address);
		Search_address.sendKeys(excel.Address("Create Project", 1, 2));
		HighlightElement(driver, Search_city);
		Search_city.sendKeys(excel.City("Create Project", 1, 3));
		Thread.sleep(8000);
		HighlightElement(driver, Clear_Gridfilters);
		Clear_Gridfilters.click();
		Thread.sleep(8000);
		HighlightElement(driver, Grid_Last_Page);
		Grid_Last_Page.click();
		Thread.sleep(10000);
		HighlightElement(driver, Grid_First_Page);
		Grid_First_Page.click();
		Thread.sleep(8000);
		HighlightElement(driver, Grid_Totalview);
		System.out.println("Grid_Totalviews are: " + Grid_Totalview.getText());
		Thread.sleep(5000);
	}

}
