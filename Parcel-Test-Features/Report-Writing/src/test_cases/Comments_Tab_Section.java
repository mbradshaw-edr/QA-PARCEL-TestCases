package test_cases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Comments_Tab_Section {
	WebDriver driver;
	static List<String> All_Toc_Sections_Array = new ArrayList<>();

	By Comments_Tab = By.xpath("//a[text()='Comments']");
	By TOC_Tab = By.xpath("//a[text()='ToC']");
	By All_Toc_Sections = By.xpath("//*[@id='simplifiedtoc']/li/ul/li/div/a");
	By Comments_Dropdown = By.xpath(".//*[@id='s2id_autogen4']/a");
	By All_Comments_Dropdown_Options = By.xpath(".//*[@id='select2-drop']/ul/li/div");
	By Add_New_Comment = By.xpath(".//*[@id='contentcomments-tab']/div[1]/div[2]/div[2]/div/a[3]");
	By Add_New_Comment_Textarea = By.xpath(".//*[@id='contentcomments-tab']/div[1]/div[3]/div/div/textarea");
	By Add_New_Comment_Save = By.xpath("//div[@class='new-comment']/div/input[@value='Save']");
	By Open_All = By.xpath("//a[@title='Open all addressed comments']");
	By Close_All = By.xpath("//a[@title='Close all addressed comments']");
	By Select_All_Comments = By.xpath("//a[@name='select-all-comments']");
	By Delete_Comments = By.xpath("//a[contains(@class,'delete')]");
	By Refresh_Comments = By.xpath("//div[@title='Refresh Section Comments']");
	By Comment_boxes = By
			.xpath(".//*[@id='contentcomments-tab']/div[2]/div/div[contains(@class,'simplified-comment-unit')]");

	public Comments_Tab_Section(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private void scrollelement(WebElement Element) {
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		JJ.executeScript("arguments[0].scrollIntoView(true);", Element);
	}

	private void Scroll_Commentboxes() throws Exception {
		for (WebElement CB : driver.findElements(Comment_boxes)) {
			scrollelement(CB);
			HighlightElement(driver, CB);
		}
	}

	private void Scroll_Checkboxes(String Highlight) throws Exception {
		int Checkbox_Counter = 1;
		By All_Checkboxes = By.xpath(".//*[@id='contentcomments-tab']/div[2]/div/div/div[1]/input[@type='checkbox']");
		for (WebElement AC : driver.findElements(All_Checkboxes)) {
			if (Highlight.equals("Checkbox")) {
				scrollelement(AC);
				HighlightElement(driver, AC);
			} else if (Highlight.equals("Delete")) {
				if (Checkbox_Counter <= 2) {
					scrollelement(AC);
					HighlightElement(driver, AC);
					AC.click();
					Thread.sleep(2000);
					if(!AC.isSelected()){
						AC.click();	
					}
				}
			}
			Checkbox_Counter++;
		}
	}

	private void Select_Comments_Dropdown_Option(int option) throws Exception {
		int All_Comments_Dropdown_Options_Counter = 1;
		HighlightElement(driver, driver.findElement(Comments_Dropdown));
		driver.findElement(Comments_Dropdown).click();
		Thread.sleep(2000);
		for (WebElement ACDO : driver.findElements(All_Comments_Dropdown_Options)) {
			if (All_Comments_Dropdown_Options_Counter == option) {
				HighlightElement(driver, ACDO);
				ACDO.click();
				Thread.sleep(3000);
				break;
			}
			All_Comments_Dropdown_Options_Counter++;
		}

	}

	private void Add_New_Comment(int datacounter, String testdata) throws Exception {
		for (int i = 1; i <= datacounter; i++) {
			HighlightElement(driver, driver.findElement(Add_New_Comment));
			driver.findElement(Add_New_Comment).click();
			Thread.sleep(3000);
			HighlightElement(driver, driver.findElement(Add_New_Comment_Textarea));
			driver.findElement(Add_New_Comment_Textarea).sendKeys(testdata);
			HighlightElement(driver, driver.findElement(Add_New_Comment_Save));
			driver.findElement(Add_New_Comment_Save).click();
			Thread.sleep(3000);
		}
	}

	public void Add_Edit_Comments() throws Exception {
		int All_Toc_Sections_Counter = 1;
		int All_Toc_Sections_Counter1 = 1;

		HighlightElement(driver, driver.findElement(TOC_Tab));
		driver.findElement(TOC_Tab).click();
		Thread.sleep(3000);
		for (WebElement ATS : driver.findElements(All_Toc_Sections)) {
			if (All_Toc_Sections_Counter <= 2) {
				if (All_Toc_Sections_Counter > 1) {
					HighlightElement(driver, driver.findElement(TOC_Tab));
					driver.findElement(TOC_Tab).click();
					Thread.sleep(3000);
					for (WebElement ATS1 : driver.findElements(All_Toc_Sections)) {
						if (All_Toc_Sections_Counter == All_Toc_Sections_Counter1) {
							HighlightElement(driver, ATS1);
							ATS1.click();
							All_Toc_Sections_Array.add(ATS1.getAttribute("data-section-id"));
							break;
						}
						All_Toc_Sections_Counter1++;
					}
				} else {
					HighlightElement(driver, ATS);
					ATS.click();
					All_Toc_Sections_Array.add(ATS.getAttribute("data-section-id"));
				}
				try {
					Thread.sleep(2000);
					driver.switchTo().alert().dismiss();
					driver.switchTo().defaultContent();
				} catch (Exception e) {

				}
				Thread.sleep(3000);
				HighlightElement(driver, driver.findElement(Comments_Tab));
				driver.findElement(Comments_Tab).click();
				Thread.sleep(4000);
				Select_Comments_Dropdown_Option(1);
				Add_New_Comment(2, "Test Current Section");
			}
			All_Toc_Sections_Counter++;
		}
		Select_Comments_Dropdown_Option(3);
		for (int i = 1; i <= All_Toc_Sections_Array.size(); i++) {
			WebElement Edit_Comments = driver.findElement(By.xpath("(//div[@data-section-id="
					+ All_Toc_Sections_Array.get(i - 1) + "]/div/div/input[@value='Edit'])[1]"));
			scrollelement(Edit_Comments);
			HighlightElement(driver, Edit_Comments);
			Edit_Comments.click();
			Thread.sleep(3000);
			try {
				WebElement Edit_Comments1 = driver.findElement(By.xpath("(//div[@data-section-id="
						+ All_Toc_Sections_Array.get(i - 1) + "]/div/div/input[@value='Edit'])[1]"));
				Edit_Comments1.click();
				Thread.sleep(3000);
			} catch (Exception e) {

			}
			WebElement Edit_Comments_Textarea = driver.findElement(By.xpath(
					"(//div[@data-section-id=" + All_Toc_Sections_Array.get(i - 1) + "]/div/div/div[2]/textarea)[1]"));
			HighlightElement(driver, Edit_Comments_Textarea);
			Edit_Comments_Textarea.sendKeys("Edit Current Section");
			WebElement Edit_Comments_Save = driver.findElement(By.xpath("(//div[@data-section-id="
					+ All_Toc_Sections_Array.get(i - 1) + "]/div/div/div[2]/div/input[@value='Save'])[1]"));
			HighlightElement(driver, Edit_Comments_Save);
			Edit_Comments_Save.click();
			Thread.sleep(3000);
		}
	}

	public void Add_Address() throws Exception {
		for (int i = 1; i <= All_Toc_Sections_Array.size(); i++) {
			WebElement Address = driver.findElement(By.xpath("(//div[@data-section-id="
					+ All_Toc_Sections_Array.get(i - 1) + "]/div/div/input[@value='Address'])[1]"));
			scrollelement(Address);
			HighlightElement(driver, Address);
			Address.click();
			Thread.sleep(2000);
			try {
				WebElement Address1 = driver.findElement(By.xpath("(//div[@data-section-id="
						+ All_Toc_Sections_Array.get(i - 1) + "]/div/div/input[@value='Address'])[1]"));
				Address1.click();
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			WebElement Address_Textarea = driver.findElement(By.xpath(
					"(//div[@data-section-id=" + All_Toc_Sections_Array.get(i - 1) + "]/div/div/div/div/textarea)[1]"));
			HighlightElement(driver, Address_Textarea);
			Address_Textarea.sendKeys("Add Address");
			WebElement Save_Address = driver.findElement(By.xpath("(//div[@data-section-id="
					+ All_Toc_Sections_Array.get(i - 1) + "]/div/div/div/div/div/input[@value='Save'])[1]"));
			HighlightElement(driver, Save_Address);
			Save_Address.click();
			Thread.sleep(3000);
		}
	}

	public void All_Sections_Comments() throws Exception {
		Select_Comments_Dropdown_Option(1);
		Scroll_Commentboxes();
		Select_Comments_Dropdown_Option(2);
		Scroll_Commentboxes();
		Select_Comments_Dropdown_Option(3);
		Scroll_Commentboxes();
		Select_Comments_Dropdown_Option(4);
		Scroll_Commentboxes();
	}

	public void Refresh_OpenAll_CloseAll_SelectAll_Delete_Functionality() throws Exception {
		Select_Comments_Dropdown_Option(3);
		HighlightElement(driver, driver.findElement(Refresh_Comments));
		driver.findElement(Refresh_Comments).click();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Open_All));
		driver.findElement(Open_All).click();
		Thread.sleep(3000);
		Scroll_Commentboxes();
		HighlightElement(driver, driver.findElement(Close_All));
		driver.findElement(Close_All).click();
		Thread.sleep(3000);
		Scroll_Commentboxes();
		HighlightElement(driver, driver.findElement(Select_All_Comments));
		driver.findElement(Select_All_Comments).click();
		Thread.sleep(3000);
		Scroll_Checkboxes("Checkbox");
		driver.findElement(Select_All_Comments).click();
		Thread.sleep(3000);
		Scroll_Checkboxes("Checkbox");
		Thread.sleep(3000);
		Scroll_Checkboxes("Delete");
		HighlightElement(driver, driver.findElement(Delete_Comments));
		driver.findElement(Delete_Comments).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
}
