package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Project_Setup_page {
	WebDriver driver;
	String excelProject_Name;
	String excelClient_Property_Number;
	String excelProperty_Name;
	String excelAddress;
	String excelCity;
	String excelCountry;
	String excelState;
	String excelZip;
	String excelTemplate;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[1]/table/tbody/tr[1]/td[2]/input")
	WebElement projectname;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[1]/table/tbody/tr[2]/td[2]/input[1]")
	WebElement Date_Draft_Due;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[1]/table/tbody/tr[3]/td[2]/input[1]")
	WebElement Date_Final_Due;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[3]/table/tbody/tr[1]/td[2]/input")
	WebElement Client_Property_Number;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[3]/table/tbody/tr[2]/td[2]/input")
	WebElement Property_Name;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[3]/table/tbody/tr[3]/td[2]/input")
	WebElement Address;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[3]/table/tbody/tr[5]/td[2]/input")
	WebElement City;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[3]/table/tbody/tr[6]/td[2]/select")
	WebElement Country;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[3]/table/tbody/tr[7]/td[2]/div/select")
	WebElement State;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[3]/table/tbody/tr[8]/td[2]/input")
	WebElement Zip;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[4]/table/tbody/tr[9]/td[1]/input")
	WebElement EMG_Narrative_05ESA_template;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[4]/table/tbody/tr[9]/td[2]/div/input[2]")
	WebElement Project_No;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/div[4]/table/tbody/tr[9]/td[2]/div/select")
	WebElement Language_Library;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/div/div/div/form/center/div[1]/input[1]")
	WebElement Create_Project_button;

	public Project_Setup_page(WebDriver driver) {

		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");

	}

	public void create_projectsetup(int C, int S, int L) throws Exception {
		Excel_Data excel = new Excel_Data("src\\Test_Data\\Project_List_Grid_Feature.xlsx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		HighlightElement(driver, projectname);
		projectname.sendKeys(excel.Project_Name("Create Project", 1, 0));

		HighlightElement(driver, Date_Draft_Due);
		Date_Draft_Due.sendKeys("10/10/2016");

		HighlightElement(driver, Date_Final_Due);
		Date_Final_Due.sendKeys("10/12/2016");

		HighlightElement(driver, Client_Property_Number);
		Client_Property_Number.sendKeys(excel.Client_Property_Number("Create Project", 1, 1));

		HighlightElement(driver, Property_Name);
		Property_Name.sendKeys("Property_Name");

		HighlightElement(driver, Address);
		Address.sendKeys(excel.Address("Create Project", 1, 2));

		HighlightElement(driver, City);
		City.sendKeys(excel.City("Create Project", 1, 3));

		HighlightElement(driver, Country);
		Select country = new Select(Country);
		country.selectByIndex(C);

		HighlightElement(driver, State);
		Select state = new Select(State);
		state.selectByIndex(S);

		HighlightElement(driver, Zip);
		Zip.sendKeys("444604");

		HighlightElement(driver, EMG_Narrative_05ESA_template);
		EMG_Narrative_05ESA_template.click();

		if (EMG_Narrative_05ESA_template.isSelected()) {
			HighlightElement(driver, Language_Library);
			Select Library = new Select(Language_Library);
			Library.selectByIndex(L);

		}

		HighlightElement(driver, Create_Project_button);
		Create_Project_button.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
