package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Spellcheck_Tab_Section {
	WebDriver driver;

	By Spellcheck_Tab = By.xpath("//a[text()='Spellcheck']");
	By Spellcheck_In_Section = By.xpath("//a[@title='Spellcheck in Section']");
	By Spellcheck_In_FullReport = By.xpath("//a[@title='Spellcheck in Full Report']");
	By Ignore_Button = By.xpath("//div[text()='Ignore']");
	By IgnoreAll_Button = By.xpath("//div[text()='Ignore All']");
	By AddtoMyDictionary_Button = By.xpath("//div[text()='Add to My Dictionary']");
	By Replace_With = By.xpath(".//*[@id='spellcheckReplaceWith']");
	By Spellcheck_Suggestions = By.xpath(".//*[@id='spellcheckSuggestions']/option[1]");
	By Replace_Button = By.xpath(".//*[@id='btn_replace_sp']");
	By ReplaceAll_Button = By.xpath(".//*[@id='btn_replace_all_sp']");
	By Tinymce_Editor = By.cssSelector(".mceContentBody");
	By Spellcheck_Close_Button = By.xpath(".//*[@id='spellcheck-close']");

	public Spellcheck_Tab_Section(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private void Spellcheck_Options() throws Exception {
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Ignore_Button));
		driver.findElement(Ignore_Button).click();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(IgnoreAll_Button));
		driver.findElement(IgnoreAll_Button).click();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(AddtoMyDictionary_Button));
		driver.findElement(AddtoMyDictionary_Button).click();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Spellcheck_Suggestions));
		driver.findElement(Spellcheck_Suggestions).click();
		Thread.sleep(1000);
		driver.findElement(Spellcheck_Suggestions).click();
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(Replace_Button));
		driver.findElement(Replace_Button).click();
		Thread.sleep(1000);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {

		}
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(Spellcheck_Suggestions));
		driver.findElement(Spellcheck_Suggestions).click();
		Thread.sleep(1000);
		driver.findElement(Spellcheck_Suggestions).click();
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(ReplaceAll_Button));
		driver.findElement(ReplaceAll_Button).click();
		Thread.sleep(1000);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {

		}
		Thread.sleep(2000);
	}

	public void Spellcheck_Replace_Functionality() throws Exception {
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		HighlightElement(driver, driver.findElement(Spellcheck_Tab));
		driver.findElement(Spellcheck_Tab).click();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Spellcheck_In_FullReport));
		driver.findElement(Spellcheck_In_FullReport).click();
		Thread.sleep(1000);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {

		}
		Thread.sleep(6000);
		for (int i = 1; i <= 2; i++) {
			WebElement Tinymce_iframe = driver.findElement(By.xpath("(//iframe[contains(@id,'content')])[" + i + "]"));
			driver.switchTo().frame(Tinymce_iframe);
			JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));
			HighlightElement(driver, driver.findElement(Tinymce_Editor));
			Thread.sleep(3000);
			JJ.executeScript(
					"arguments[0].innerHTML = '<h2>Reporta Writinga Featurea in Spellchecka taba</h2><break><h2>Reporta Writinga Featurea in Spellchecka taba</h2>'",
					driver.findElement(Tinymce_Editor));
			driver.switchTo().defaultContent();
		}
		HighlightElement(driver, driver.findElement(Spellcheck_Close_Button));
		driver.findElement(Spellcheck_Close_Button).click();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Spellcheck_In_Section));
		driver.findElement(Spellcheck_In_Section).click();
		Thread.sleep(1000);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {

		}
		try {
			Spellcheck_Options();
		} catch (Exception e1) {

		}
		HighlightElement(driver, driver.findElement(Spellcheck_Close_Button));
		driver.findElement(Spellcheck_Close_Button).click();
		Thread.sleep(1000);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {

		}
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(Spellcheck_In_FullReport));
		driver.findElement(Spellcheck_In_FullReport).click();
		Thread.sleep(1000);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {

		}
		Thread.sleep(6000);
		try {
			Spellcheck_Options();
		} catch (Exception e1) {

		}
	}
}
