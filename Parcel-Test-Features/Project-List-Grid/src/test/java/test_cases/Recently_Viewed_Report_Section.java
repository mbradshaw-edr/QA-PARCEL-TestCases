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

public class Recently_Viewed_Report_Section {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[3]/div[4]/div/table/tbody/tr[2]/td[3]")
	WebElement Main_Grid_Firstrow_Project_Name;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Home')]")
	WebElement Home_tab;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Home')])[1]")
	WebElement classic_Home_tab;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div[1]/div/div[1]/a[1]")
	WebElement Project_Name_Recently_Viewed_Report;

	@FindBy(how = How.XPATH, using = "//*[@id='contentrecentlyviewed-content']/span/i[1]")
	WebElement Collapse_Button;

	@FindBy(how = How.XPATH, using = "//*[@id='contentrecentlyviewed-content']/span/i[2]")
	WebElement Expand_Button;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/a[2]/text()")
	WebElement All_Recently_Viewed_Reports;

	@FindBy(how = How.XPATH, using = "//*[@id='contentrecentlyviewed-content']/div/div/div[1]/div[1]/div/div[2]/a")
	WebElement Address_Recently_Viewed_Report;

	@FindBy(how = How.XPATH, using = "//*[@id='contentrecentlyviewed-content']/div/div/div[1]/div[1]/div")
	WebElement First_Recently_Viewed_Report;

	@FindBy(how = How.XPATH, using = "//a[@title='Open Project Dashboard.']")
	WebElement TOC_projectname;

	@FindBy(how = How.XPATH, using = "(//h1/a)[1]")
	WebElement classic_TOC_projectname;

	@FindBy(how = How.XPATH, using = "//*[@id='divViewProjectInfo']/table/tbody/tr[2]/td")
	WebElement PD_projectname;

	@FindBy(how = How.ID, using = "gs_pName")
	WebElement Search_project;

	public Recently_Viewed_Report_Section(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private String Recently_Created_Project() throws Exception {
		Excel_Data excel = new Excel_Data("src\\test\\java\\Test_Data\\Project_List_Grid_Feature.xlsx");

		String Recently_Created_Project = excel.Project_Name("Create Project", 1, 0);
		return Recently_Created_Project;
	}

	public void Check_Recently_Viewed_Reports() throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Recently_Created_Project;
		Recently_Created_Project = Recently_Created_Project();
		HighlightElement(driver, Search_project);
		Search_project.sendKeys(Recently_Created_Project);
		Search_project.sendKeys(Keys.ENTER);
		Thread.sleep(15000);
		HighlightElement(driver, Main_Grid_Firstrow_Project_Name);
		Actions action = new Actions(driver);
		action.moveToElement(Main_Grid_Firstrow_Project_Name).doubleClick().perform();
		Thread.sleep(8000);

		try {
			HighlightElement(driver, TOC_projectname);
			System.out.println(
					"Double click on Project_Name in Thirdrow of Main_Grid which is " + TOC_projectname.getText());
			Home_tab.click();
		} catch (Exception e) {

		}

		try {
			HighlightElement(driver, classic_TOC_projectname);
			System.out.println("Double click on Project_Name in Thirdrow of Main_Grid which is "
					+ classic_TOC_projectname.getText());
			classic_Home_tab.click();

		} catch (Exception e) {

		}

		Thread.sleep(12000);
		HighlightElement(driver, Project_Name_Recently_Viewed_Report);
		HighlightElement(driver, Collapse_Button);
		Collapse_Button.click();
		Thread.sleep(5000);
		HighlightElement(driver, Expand_Button);
		Expand_Button.click();
		Thread.sleep(5000);
		HighlightElement(driver, Expand_Button);
		Expand_Button.click();
		Thread.sleep(3000);
		// for scroll up to certain element
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id='contentrecentlyviewed-content']/span/i[2]"));
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);

		List<WebElement> Viewedreports = driver.findElements(
				By.xpath("html/body/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/a[2]"));
		List<String> Viewed_reports = new ArrayList<>();
		for (WebElement V : Viewedreports) {
			Viewed_reports.add(V.getText());
		}
		System.out.println("Project Names for all Recently Viewed Reports: " + Viewed_reports);
		System.out.println("Total No. of Recently Viewed Reports: " + Viewed_reports.size());
		HighlightElement(driver, Collapse_Button);
		Collapse_Button.click();
		Thread.sleep(2000);

		JavascriptExecutor JE = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath(
				"html/body/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div[1]/div/div[1]/a[1]"));
		JE.executeScript("arguments[0].scrollIntoView(true);", Element);
		Thread.sleep(3000);

		HighlightElement(driver, Project_Name_Recently_Viewed_Report);
		Project_Name_Recently_Viewed_Report.click();
		Thread.sleep(5000);
		HighlightElement(driver, PD_projectname);
		System.out.println(
				"Project Name on project dashboard page which is display after click on first report of recently viewed report: "
						+ PD_projectname.getText());
		Home_tab.click();
		Thread.sleep(5000);
		HighlightElement(driver, First_Recently_Viewed_Report);
		Address_Recently_Viewed_Report.click();
		Thread.sleep(5000);
		Home_tab.click();
	}

}
