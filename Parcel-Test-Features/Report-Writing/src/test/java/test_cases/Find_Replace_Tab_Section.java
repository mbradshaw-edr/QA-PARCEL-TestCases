package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Find_Replace_Tab_Section {
	WebDriver driver;
	By Find_Replace_Tab = By.xpath("//a[text()='Find / Replace']");
	By Find_Replace_In_Section = By.xpath("//a[@title='Find / Replace in Section']");
	By Find_Replace_In_FullReport = By.xpath("//a[@title='Find / Replace in Full Report']");
	By Find_Replace_Close_Button = By.id("find-replace-close");
	By Find_What = By.id("find_what");
	By Replace_With = By.id("replace_with");
	By Find_Next = By.id("btn_find_next");
	By Replace = By.id("btn_replace");
	By Replace_FindNext = By.id("btn_replace_and_find_next");
	By Replace_All = By.id("btn_replace_all");
	By Match_Case_Checkbox = By.id("match_case");
	By Find_Whole_Words_Only_Checkbox = By.id("find_whole_words_only");
	By Tinymce_Editor = By.cssSelector(".mceContentBody");

	public Find_Replace_Tab_Section(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private void Find_Next() throws Exception {
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Find_Next));
		driver.findElement(Find_Next).click();
		Accept_Alert();
		Thread.sleep(3000);
	}

	private void Accept_Alert() throws Exception {
		Thread.sleep(1000);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {

		}
	}

	private void Find_Replace_Options() throws Exception {
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Find_What));
		driver.findElement(Find_What).sendKeys("Reports");
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(Replace_With));
		driver.findElement(Replace_With).sendKeys("Test");
		Find_Next();
		HighlightElement(driver, driver.findElement(Replace));
		driver.findElement(Replace).click();
		Find_Next();
		HighlightElement(driver, driver.findElement(Replace_FindNext));
		driver.findElement(Replace_FindNext).click();
		HighlightElement(driver, driver.findElement(Replace_All));
		driver.findElement(Replace_All).click();
		Accept_Alert();
		Thread.sleep(3000);
		driver.findElement(Find_What).clear();
		driver.findElement(Find_What).sendKeys("Report");
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(Match_Case_Checkbox));
		driver.findElement(Match_Case_Checkbox).click();
		Find_Next();
		driver.findElement(Match_Case_Checkbox).click();
		HighlightElement(driver, driver.findElement(Find_Whole_Words_Only_Checkbox));
		driver.findElement(Find_Whole_Words_Only_Checkbox).click();
		Find_Next();
		driver.findElement(Find_Whole_Words_Only_Checkbox).click();
	}

	public void Find_Replace_Functionality() throws Exception {
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		HighlightElement(driver, driver.findElement(Find_Replace_Tab));
		driver.findElement(Find_Replace_Tab).click();
		Accept_Alert();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Find_Replace_In_FullReport));
		driver.findElement(Find_Replace_In_FullReport).click();
		Accept_Alert();
		Thread.sleep(6000);
		for (int i = 1; i <= 2; i++) {
			WebElement Tinymce_iframe = driver.findElement(By.xpath("(//iframe[contains(@id,'content')])[" + i + "]"));
			driver.switchTo().frame(Tinymce_iframe);
			JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));
			HighlightElement(driver, driver.findElement(Tinymce_Editor));
			Thread.sleep(3000);
			JJ.executeScript(
					"arguments[0].innerHTML = '<h2>Reporta Reporta Reporta Reporta Reporta</h2><break><h2>Reporta Reporta Reporta Reporta Reporta</h2>'",
					driver.findElement(Tinymce_Editor));
			driver.switchTo().defaultContent();
		}
		HighlightElement(driver, driver.findElement(Find_Replace_Close_Button));
		driver.findElement(Find_Replace_Close_Button).click();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Find_Replace_In_Section));
		driver.findElement(Find_Replace_In_Section).click();
		Accept_Alert();
		try {
			Find_Replace_Options();
		} catch (Exception e1) {

		}
		HighlightElement(driver, driver.findElement(Find_Replace_Close_Button));
		driver.findElement(Find_Replace_Close_Button).click();
		Accept_Alert();
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(Find_Replace_In_FullReport));
		driver.findElement(Find_Replace_In_FullReport).click();
		Accept_Alert();
		Thread.sleep(6000);
		driver.findElement(Find_What).clear();
		driver.findElement(Replace_With).clear();
		try {
			Find_Replace_Options();
		} catch (Exception e1) {

		}
	}
}
