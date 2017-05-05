package test_cases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR;

public class Toc_Tab_Section {
	WebDriver driver;
	String Toc_Section_Id;
	List<String> Tables_Id = new ArrayList<>();
	static List<String> Tables_Section_Id = new ArrayList<>();
	String Table_Id = "";

	By Search_SiteId = By.xpath("//input[contains(@class,'search-query-site')]");
	By Write_Tab = By.xpath("//a[text()='Write']");
	By SectionMode_Button = By.xpath("//*[@id='write-mode-switch']");
	By Tinymce_Editor = By.cssSelector(".mceContentBody");
	By All_Toc_Sections = By.xpath("//*[@id='simplifiedtoc']/li/ul/li/div/a");
	By All_Toc_SubSections = By.xpath("//*[@id='simplifiedtoc']/li/ul/li/ul/li/div/a");
	By Black_All_Dropdown = By.xpath("//*[@id='contenttinymce-content']/div[1]/div[2]/ul[1]/li/div/button");
	By Black_All_TheseSummaries = By.id("change-this-summary");
	By Black_All_AllSummaries = By.id("change-all-summary");
	By Tools_Dropdown = By.xpath("//div[@title='Tools']/a");
	By Variable_Replacer = By.xpath("//div[@title='Tools']/ul/li/a[text()='Variable Replacer']");
	By All_Sections_Variable_Replacer = By.xpath("//form[@name='VRForm']/table/tbody/tr/td/a");
	By Highlight_Variables = By.xpath("//input[@value='Highlight Variables' or @value='✓ Highlight Variables']");
	By All_Create_Table_Buttons = By.xpath("//input[contains(@id, 'addBlanks') and @value='Create Table With']");
	By All_Edit_Table_Buttons = By.xpath(".//div[contains(@id,'divEditAddSpreadsheet')]/a[text()='Edit Table']");
	By Save_All_Dropdown = By.xpath("//button/span[contains(text(),'Save')]");
	By These_Summaries_Tables = By.xpath("//a/span[text()='These Summaries & Tables']");
	By All_Summaries_Tables = By.xpath("//a/span[text()='All Summaries & Tables']");
	By All_Summaries = By.xpath("//a[@class='save-all-summaries']/span[text()='All Summaries']");
	By All_Tables = By.xpath("//a/span[text()='All Tables']");
	By Previous_Section = By.id("section-previous");
	By Next_Section = By.id("section-next");

	public Toc_Tab_Section(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private boolean Exists_Highlight_Variables() {
		try {
			driver.findElement(Highlight_Variables).getText();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private void All_Toc_Sections(String Edit) throws Exception {
		int Toc_Section_Counter = 1;
		int Toc_Section_Editor_Counter = 1;
		ExcelR excel = new ExcelR("src\\Test_Data\\Report Writing Test Data.xlsx");

		Thread.sleep(3000);
		for (WebElement ATS : driver.findElements(All_Toc_Sections)) {
			if (Edit.equals("Edit Tinymce editor")) {
				HighlightElement(driver, ATS);
				ATS.click();
				try {
					Thread.sleep(2000);
					driver.switchTo().alert().dismiss();
					driver.switchTo().defaultContent();
				} catch (Exception e) {

				}
				Thread.sleep(3000);
				Toc_Section_Id = ATS.getAttribute("data-section-id");
				WebElement Tinymce_iframe = driver
						.findElement(By.xpath("//*[@id='content" + Toc_Section_Id + "_ifr']"));
				driver.switchTo().frame(Tinymce_iframe);
				JavascriptExecutor JJ = (JavascriptExecutor) driver;
				JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));
				HighlightElement(driver, driver.findElement(Tinymce_Editor));
				Thread.sleep(3000);
				JJ.executeScript("arguments[0].innerHTML = '" + excel.getEditor_Text("Test Data", 1, 1) + "'",
						driver.findElement(Tinymce_Editor));

				if (Toc_Section_Editor_Counter >= 2) {
					driver.findElement(Tinymce_Editor).click();
					driver.findElement(Tinymce_Editor).sendKeys(Keys.CONTROL + "a");
					Thread.sleep(3000);
					driver.switchTo().defaultContent();
					By Tinymce_Bold = By.xpath("//a[@id='content" + Toc_Section_Id + "_bold']");
					By Tinymce_Italic = By.xpath("//a[@id='content" + Toc_Section_Id + "_italic']");
					By Tinymce_Underline = By.xpath("//a[@id='content" + Toc_Section_Id + "_underline']");
					By Tinymce_Bullets = By.xpath("//a[@id='content" + Toc_Section_Id + "_bullist']");
					By Tinymce_Indent = By.xpath("//a[@id='content" + Toc_Section_Id + "_indent']");
					By Tinymce_Outdent = By.xpath("//a[@id='content" + Toc_Section_Id + "_outdent']");
					By Tinymce_Date = By.xpath("//a[@id='content" + Toc_Section_Id + "_insertdate']");
					By Tinymce_Trackchanges = By.xpath("//a[@id='content" + Toc_Section_Id + "_ice_togglechanges']");
					By Tinymce_Trackchanges_accept = By.xpath("//a[@id='content" + Toc_Section_Id + "_iceacceptall']");
					By Tinymce_Trackchanges_reject = By.xpath("//a[@id='content" + Toc_Section_Id + "_icerejectall']");
					By Tinymce_Undo = By.xpath("//a[@id='content" + Toc_Section_Id + "_undo']");
					By Tinymce_Redo = By.xpath("//a[@id='content" + Toc_Section_Id + "_redo']");
					By Tinymce_Save = By.xpath("//a[@id='content" + Toc_Section_Id + "_save']");
					HighlightElement(driver, driver.findElement(Tinymce_Bold));
					driver.findElement(Tinymce_Bold).click();
					driver.switchTo().frame(Tinymce_iframe);
					driver.findElement(Tinymce_Editor).click();
					Thread.sleep(4000);
					driver.findElement(Tinymce_Editor).sendKeys(Keys.CONTROL + "a");
					driver.switchTo().defaultContent();
					HighlightElement(driver, driver.findElement(Tinymce_Italic));
					driver.findElement(Tinymce_Italic).click();
					driver.switchTo().frame(Tinymce_iframe);
					driver.findElement(Tinymce_Editor).click();
					Thread.sleep(4000);
					driver.findElement(Tinymce_Editor).sendKeys(Keys.CONTROL + "a");
					driver.switchTo().defaultContent();
					HighlightElement(driver, driver.findElement(Tinymce_Underline));
					driver.findElement(Tinymce_Underline).click();
					driver.switchTo().frame(Tinymce_iframe);
					driver.findElement(Tinymce_Editor).click();
					Thread.sleep(4000);
					driver.switchTo().defaultContent();
					HighlightElement(driver, driver.findElement(Tinymce_Bullets));
					driver.findElement(Tinymce_Bullets).click();
					Thread.sleep(4000);
					HighlightElement(driver, driver.findElement(Tinymce_Indent));
					driver.findElement(Tinymce_Indent).click();
					Thread.sleep(4000);
					HighlightElement(driver, driver.findElement(Tinymce_Outdent));
					driver.findElement(Tinymce_Outdent).click();
					Thread.sleep(4000);
					driver.switchTo().frame(Tinymce_iframe);
					driver.findElement(Tinymce_Editor).click();
					driver.switchTo().defaultContent();
					HighlightElement(driver, driver.findElement(Tinymce_Date));
					driver.findElement(Tinymce_Date).click();
					Thread.sleep(4000);
					driver.switchTo().defaultContent();
					HighlightElement(driver, driver.findElement(Tinymce_Undo));
					driver.findElement(Tinymce_Undo).click();
					Thread.sleep(4000);
					HighlightElement(driver, driver.findElement(Tinymce_Redo));
					driver.findElement(Tinymce_Redo).click();
					Thread.sleep(4000);
					driver.switchTo().frame(Tinymce_iframe);
					driver.findElement(Tinymce_Editor).click();
					driver.findElement(Tinymce_Editor).sendKeys(Keys.CONTROL + "a");
					driver.switchTo().defaultContent();
					HighlightElement(driver, driver.findElement(Tinymce_Trackchanges));
					driver.findElement(Tinymce_Trackchanges).click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(2000);
					driver.switchTo().alert().accept();
					driver.switchTo().frame(Tinymce_iframe);
					driver.findElement(Tinymce_Editor).sendKeys(Keys.DELETE);
					Thread.sleep(4000);
					driver.switchTo().defaultContent();
					HighlightElement(driver, driver.findElement(Tinymce_Trackchanges_accept));
					driver.findElement(Tinymce_Trackchanges_accept).click();
					Thread.sleep(4000);
					HighlightElement(driver, driver.findElement(Tinymce_Undo));
					driver.findElement(Tinymce_Undo).click();
					Thread.sleep(4000);
					HighlightElement(driver, driver.findElement(Tinymce_Trackchanges_reject));
					driver.findElement(Tinymce_Trackchanges_reject).click();
					Thread.sleep(4000);
					HighlightElement(driver, driver.findElement(Tinymce_Save));
					driver.findElement(Tinymce_Save).click();
					driver.navigate().refresh();
					try {
						Thread.sleep(2000);
						driver.switchTo().alert().accept();
					} catch (Exception e) {

					}
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					WebElement Tinymce_iframe1 = driver
							.findElement(By.xpath("//*[@id='content" + Toc_Section_Id + "_ifr']"));
					driver.switchTo().frame(Tinymce_iframe1);
					JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));
					Thread.sleep(3000);
					HighlightElement(driver, driver.findElement(Tinymce_Editor));
					driver.switchTo().defaultContent();
					break;
				}
				driver.switchTo().defaultContent();
				Toc_Section_Editor_Counter++;
			} else {

				if (Toc_Section_Counter <= 5) {
					HighlightElement(driver, ATS);
					ATS.click();
					Thread.sleep(2000);
					Toc_Section_Counter++;
				}
			}
		}
	}

	private void Colour_Toc_Sections(String Highlight) throws Exception {
		int Section_Counter = 1;
		for (WebElement ATS : driver.findElements(All_Toc_Sections)) {
			HighlightElement(driver, ATS);
			ATS.click();
			try {
				Thread.sleep(2000);
				driver.switchTo().alert().dismiss();
				driver.switchTo().defaultContent();
			} catch (Exception e) {

			}
			Thread.sleep(3000);
			Toc_Section_Id = ATS.getAttribute("data-section-id");
			WebElement Tinymce_iframe = driver.findElement(By.xpath("//*[@id='content" + Toc_Section_Id + "_ifr']"));
			driver.switchTo().frame(Tinymce_iframe);
			JavascriptExecutor JJ = (JavascriptExecutor) driver;
			JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));

			if (Highlight.equals("Red")) {
				HighlightElement(driver, driver.findElement(Tinymce_Editor));
				Thread.sleep(3000);
				driver.findElement(Tinymce_Editor).click();
				driver.findElement(Tinymce_Editor).sendKeys(Keys.CONTROL + "a");
				Thread.sleep(3000);
				driver.switchTo().defaultContent();
				By Tinymce_Colordropdown = By.xpath("//a[@id='content" + Toc_Section_Id + "_forecolor_open']");
				By Tinymce_RedColor = By.xpath("//div[@id='content" + Toc_Section_Id
						+ "_forecolor_menu']/div/table/tbody/tr/td/a[contains(@data-mce-color,'#FF0000')]");
				HighlightElement(driver, driver.findElement(Tinymce_Colordropdown));
				driver.findElement(Tinymce_Colordropdown).click();
				Thread.sleep(2000);
				HighlightElement(driver, driver.findElement(Tinymce_RedColor));
				driver.findElement(Tinymce_RedColor).click();
				driver.switchTo().frame(Tinymce_iframe);
				driver.findElement(Tinymce_Editor).click();
				Thread.sleep(2000);
				driver.findElement(Tinymce_Editor).click();
				HighlightElement(driver, driver.findElement(Tinymce_Editor));
				Thread.sleep(3000);
				if (Section_Counter >= 3) {
					driver.switchTo().defaultContent();
					break;
				}

			} else if (Highlight.equals("Black All TheseSummaries")) {

				if (Section_Counter >= 3) {
					HighlightElement(driver, driver.findElement(Tinymce_Editor));
					Thread.sleep(3000);
					driver.switchTo().defaultContent();
					break;
				}

			} else if (Highlight.equals("Black All AllSummaries")) {
				HighlightElement(driver, driver.findElement(Tinymce_Editor));
				Thread.sleep(3000);
				if (Section_Counter >= 3) {
					driver.switchTo().defaultContent();
					break;
				}

			}
			Section_Counter++;
			driver.switchTo().defaultContent();
		}

	}

	private void Highlight_Summaries_And_Tables(int Edit_Table_Counter, String Save_All_Option) throws Exception {
		WebElement Table;
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		for (int j = 1; j <= Edit_Table_Counter; j++) {
			for (WebElement ATS : driver.findElements(All_Toc_Sections)) {
				if (ATS.getAttribute("data-section-id").equals(Tables_Section_Id.get(j - 1))) {
					JJ.executeScript("arguments[0].scrollIntoView(true);", ATS);
					HighlightElement(driver, ATS);
					ATS.click();
					try {
						Thread.sleep(2000);
						driver.switchTo().alert().dismiss();
					} catch (Exception e) {

					}
					Thread.sleep(4000);
					break;
				}
			}
			for (WebElement ATSS : driver.findElements(All_Toc_SubSections)) {
				if (ATSS.getAttribute("data-section-id").equals(Tables_Section_Id.get(j - 1))) {
					JJ.executeScript("arguments[0].scrollIntoView(true);", ATSS);
					HighlightElement(driver, ATSS);
					ATSS.click();
					try {
						Thread.sleep(2000);
						driver.switchTo().alert().dismiss();
					} catch (Exception e) {

					}
					Thread.sleep(4000);
					break;
				}
			}

			if (Save_All_Option.equals("All Summaries")) {
				Table = driver
						.findElement(By.xpath(".//*[@id='frmPrintEditSpreadsheet" + Tables_Id.get(j - 1) + "']/table"));
			} else {
				Table = driver.findElement(By.xpath(".//*[@id='tableID" + Tables_Id.get(j - 1) + "']"));
			}
			JJ.executeScript("arguments[0].scrollIntoView(true);", Table);
			HighlightElement(driver, Table);
			Thread.sleep(3000);
			WebElement Tinymce_iframe = driver
					.findElement(By.xpath("//*[@id='content" + Tables_Section_Id.get(j - 1) + "_ifr']"));
			driver.switchTo().frame(Tinymce_iframe);
			JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));
			HighlightElement(driver, driver.findElement(Tinymce_Editor));
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
		}

	}

	@SuppressWarnings("unused")
	private By Exist_Create_And_Edit_Table_Buttons() {
		int All_Create_Table_Buttons_counter = 1;
		int All_Edit_Table_Buttons_counter = 1;
		By Table_Buttons = null;

		for (WebElement ACTB : driver.findElements(All_Create_Table_Buttons)) {
			All_Create_Table_Buttons_counter++;
		}

		if (All_Create_Table_Buttons_counter >= 2) {
			Table_Buttons = All_Create_Table_Buttons;
		} else {
			for (WebElement AETB : driver.findElements(All_Edit_Table_Buttons)) {
				All_Edit_Table_Buttons_counter++;
			}
		}
		if (All_Edit_Table_Buttons_counter >= 2) {
			Table_Buttons = All_Edit_Table_Buttons;
		} else if (All_Create_Table_Buttons_counter == 1) {
			Table_Buttons = All_Create_Table_Buttons;
		} else if (All_Edit_Table_Buttons_counter == 1) {
			Table_Buttons = All_Edit_Table_Buttons;
		}
		return Table_Buttons;
	}

	private void Summaries_And_Tables(int Edit_Table_Counter, By Summaries_Tables) throws Exception {
		String Summary_Table_Name;
		int table_counter = 1;
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		for (WebElement ACTB : driver.findElements(Exist_Create_And_Edit_Table_Buttons())) {
			if (table_counter <= Edit_Table_Counter) {
				JJ.executeScript("arguments[0].scrollIntoView(true);", ACTB);
				HighlightElement(driver, ACTB);
				if (Exist_Create_And_Edit_Table_Buttons().equals(All_Create_Table_Buttons)) {
					String arr[] = ACTB.getAttribute("id").trim().split("[a-zA-Z ]+");
					for (int i = 0; i < arr.length; i++) {
						Table_Id = Table_Id + arr[i];
					}
				} else {
					Table_Id = ACTB.getAttribute("data-table-id");
				}
				Tables_Id.add(Table_Id);
				ACTB.click();
				Thread.sleep(5000);
				WebElement Table1_Form = driver.findElement(By.xpath(
						"//form[@data-table-id='" + Table_Id + "' and @id='frmPrintEditSpreadsheet" + Table_Id + "']"));
				Tables_Section_Id.add(Table1_Form.getAttribute("data-section-id"));
				List<WebElement> table_Textarea = driver.findElements(
						By.xpath("//form[@data-table-id='" + Table_Id + "']/table/tbody/tr[2]/td/div/textarea"));
				for (WebElement TT : table_Textarea) {
					HighlightElement(driver, TT);
					TT.sendKeys("Test Save All functionality");
					Thread.sleep(2000);
				}
			}
			Table_Id = "";
			table_counter++;
		}

		if (Edit_Table_Counter == 1) {
			for (WebElement ATS : driver.findElements(All_Toc_Sections)) {
				if (ATS.getAttribute("data-section-id").equals(Tables_Section_Id.get(0))) {
					JJ.executeScript("arguments[0].scrollIntoView(true);", ATS);
					HighlightElement(driver, ATS);
					ATS.click();
					Thread.sleep(5000);
					break;
				}
			}
			for (WebElement ATSS : driver.findElements(All_Toc_SubSections)) {
				if (ATSS.getAttribute("data-section-id").equals(Tables_Section_Id.get(0))) {
					JJ.executeScript("arguments[0].scrollIntoView(true);", ATSS);
					HighlightElement(driver, ATSS);
					ATSS.click();
					Thread.sleep(5000);
					break;
				}
			}
			try {
				Thread.sleep(2000);
				driver.switchTo().alert().dismiss();
				driver.switchTo().defaultContent();
			} catch (Exception e) {

			}
		}

		for (int i = 1; i <= Edit_Table_Counter; i++) {
			WebElement Tinymce_iframe = driver
					.findElement(By.xpath("//*[@id='content" + Tables_Section_Id.get(i - 1) + "_ifr']"));
			driver.switchTo().frame(Tinymce_iframe);
			JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));
			HighlightElement(driver, driver.findElement(Tinymce_Editor));
			Thread.sleep(3000);
			JJ.executeScript("arguments[0].innerHTML = 'Test Save All functionality'",
					driver.findElement(Tinymce_Editor));
			driver.switchTo().defaultContent();
		}
		HighlightElement(driver, driver.findElement(Save_All_Dropdown));
		driver.findElement(Save_All_Dropdown).click();
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(Summaries_Tables));
		Summary_Table_Name = driver.findElement(Summaries_Tables).getText();
		driver.findElement(Summaries_Tables).click();
		Thread.sleep(5000);
		Highlight_Summaries_And_Tables(Tables_Section_Id.size(), Summary_Table_Name);
	}

	public void All_SectionMode() throws Exception {
		int Section_Counter = 1;
		ExcelR excel = new ExcelR("src\\Test_Data\\Report Writing Test Data.xlsx");
		HighlightElement(driver, driver.findElement(Search_SiteId));
		driver.findElement(Search_SiteId).sendKeys(excel.getSiteId("Test Data", 1, 0));
		driver.findElement(Search_SiteId).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (driver.findElement(SectionMode_Button).getText().contains("All Sections Mode")) {
			HighlightElement(driver, driver.findElement(SectionMode_Button));
			driver.findElement(SectionMode_Button).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		List<WebElement> All_Sections = driver.findElements(By.xpath("//*[@class='section-title-text']"));
		for (WebElement AS : All_Sections) {
			if (Section_Counter <= 5) {
				JavascriptExecutor JJ = (JavascriptExecutor) driver;
				JJ.executeScript("arguments[0].scrollIntoView(true);", AS);
				Thread.sleep(2000);
				HighlightElement(driver, AS);
				Section_Counter++;
			}
		}
		All_Toc_Sections("null");
		HighlightElement(driver, driver.findElement(SectionMode_Button));
		driver.findElement(SectionMode_Button).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		All_Toc_Sections("null");

	}

	public void Edit_Tinymce_Editor() throws Exception {
		All_Toc_Sections("Edit Tinymce editor");
	}

	public void Black_All() throws Exception {
		Colour_Toc_Sections("Red");
		HighlightElement(driver, driver.findElement(Black_All_Dropdown));
		driver.findElement(Black_All_Dropdown).click();
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(Black_All_TheseSummaries));
		driver.findElement(Black_All_TheseSummaries).click();
		try {
			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {

		}
		Thread.sleep(4000);
		Colour_Toc_Sections("Black All TheseSummaries");
		HighlightElement(driver, driver.findElement(Black_All_Dropdown));
		driver.findElement(Black_All_Dropdown).click();
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(Black_All_AllSummaries));
		driver.findElement(Black_All_AllSummaries).click();
		try {
			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {

		}
		Thread.sleep(4000);
		Colour_Toc_Sections("Black All AllSummaries");
	}

	public void Highlight_Veriable() throws Exception {
		String winHandleBefore;
		String Veriable_Replacer = null;
		if (Exists_Highlight_Variables()) {
			HighlightElement(driver, driver.findElement(Tools_Dropdown));
			driver.findElement(Tools_Dropdown).click();
			Thread.sleep(2000);
			HighlightElement(driver, driver.findElement(Variable_Replacer));
			driver.findElement(Variable_Replacer).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			winHandleBefore = driver.getWindowHandle();
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}
			Thread.sleep(3000);
			for (WebElement ASVR : driver.findElements(All_Sections_Variable_Replacer)) {
				HighlightElement(driver, ASVR);
				Thread.sleep(3000);
				Veriable_Replacer = ASVR.getText();
				break;
			}
			driver.close();
			driver.switchTo().window(winHandleBefore);
			for (WebElement ATS : driver.findElements(All_Toc_Sections)) {
				if (Veriable_Replacer.contains(ATS.getText())) {
					HighlightElement(driver, ATS);
					ATS.click();
					try {
						Thread.sleep(2000);
						driver.switchTo().alert().dismiss();
						driver.switchTo().defaultContent();
					} catch (Exception e) {

					}
					Toc_Section_Id = ATS.getAttribute("data-section-id");
					Thread.sleep(3000);
					WebElement Tinymce_iframe = driver
							.findElement(By.xpath("//*[@id='content" + Toc_Section_Id + "_ifr']"));
					driver.switchTo().frame(Tinymce_iframe);
					JavascriptExecutor JJ = (JavascriptExecutor) driver;
					JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));
					HighlightElement(driver, driver.findElement(Tinymce_Editor));
					Thread.sleep(2000);
					driver.switchTo().defaultContent();
					HighlightElement(driver, driver.findElement(Highlight_Variables));
					if (driver.findElement(Highlight_Variables).getAttribute("value").contains("✓")) {
						driver.findElement(Highlight_Variables).click();
						Thread.sleep(3000);
					}
					Thread.sleep(2000);
					driver.findElement(Highlight_Variables).click();
					Thread.sleep(2000);
					driver.switchTo().frame(Tinymce_iframe);
					HighlightElement(driver, driver.findElement(Tinymce_Editor));
					Thread.sleep(4000);
					driver.switchTo().defaultContent();
					break;
				}

			}

		} else {
			System.out.println("Highlight Veriables functionality not available for this Site Id.");
		}

	}

	public void Save_All() throws Exception {
		if (driver.findElement(SectionMode_Button).getText().contains("All Sections Mode")) {
			HighlightElement(driver, driver.findElement(SectionMode_Button));
			driver.findElement(SectionMode_Button).click();
			Thread.sleep(8000);
		}

		try {
			Summaries_And_Tables(1, These_Summaries_Tables);
			Tables_Id.clear();
			Tables_Section_Id.clear();
			Summaries_And_Tables(2, All_Summaries_Tables);
			Tables_Id.clear();
			Tables_Section_Id.clear();
			Summaries_And_Tables(2, All_Summaries);
			Tables_Id.clear();
			Tables_Section_Id.clear();
			Summaries_And_Tables(2, All_Tables);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {

		}

	}

	public void Show_Next_Previous_Section() throws Exception {
		HighlightElement(driver, driver.findElement(Next_Section));
		driver.findElement(Next_Section).click();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Previous_Section));
		driver.findElement(Previous_Section).click();
		Thread.sleep(3000);
	}
}
