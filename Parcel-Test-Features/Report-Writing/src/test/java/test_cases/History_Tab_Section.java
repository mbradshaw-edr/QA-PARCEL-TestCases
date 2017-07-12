package test_cases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utility.ExcelR;

public class History_Tab_Section {
	WebDriver driver;
	static List<String> All_Toc_Sections_Array = new ArrayList<>();
	By History_Tab = By.xpath("//a[text()='History']");
	By SectionMode_Button = By.xpath("//*[@id='write-mode-switch']");
	By Tinymce_Editor = By.cssSelector(".mceContentBody");
	By Save_All_Dropdown = By.xpath("//button/span[contains(text(),'Save')]");
	By All_Summaries = By.xpath("//a[@class='save-all-summaries']/span[text()='All Summaries']");
	By Refresh_History = By.xpath("//div[contains(@class,'refresh-history')]");
	By All_Toc_Sections = By.xpath("//*[@id='simplifiedtoc']/li/ul/li/div/a");
	By TOC_Tab = By.xpath("//a[text()='ToC']");

	public History_Tab_Section(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private boolean Exists_History(String History) {
		try {
			driver.findElement(By.xpath("" + History + "")).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void Drag_Drop_History() throws Exception {
		ExcelR excel = new ExcelR("src\\test\\java\\Test_Data\\Report Writing Test Data.xlsx");
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		WebElement History = null;
		HighlightElement(driver, driver.findElement(TOC_Tab));
		driver.findElement(TOC_Tab).click();
		Thread.sleep(2000);
		if (driver.findElement(SectionMode_Button).getText().contains("All Sections Mode")) {
			HighlightElement(driver, driver.findElement(SectionMode_Button));
			driver.findElement(SectionMode_Button).click();
			Thread.sleep(10000);
		}
		for (WebElement ATS : driver.findElements(All_Toc_Sections)) {
			ATS.click();
			Thread.sleep(5000);
			All_Toc_Sections_Array.add(ATS.getAttribute("data-section-id"));
			break;
		}
		HighlightElement(driver, driver.findElement(History_Tab));
		driver.findElement(History_Tab).click();
		Thread.sleep(3000);
		WebElement Tinymce_iframe = driver
				.findElement(By.xpath("//*[@id='content" + All_Toc_Sections_Array.get(0) + "_ifr']"));
		driver.switchTo().frame(Tinymce_iframe);
		JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));
		HighlightElement(driver, driver.findElement(Tinymce_Editor));
		Thread.sleep(3000);
		JJ.executeScript("arguments[0].innerHTML = '" + excel.getEditor_Text("Test Data", 1, 1) + "'",
				driver.findElement(Tinymce_Editor));
		// JJ.executeScript("arguments[0].innerHTML = 'Testing history
		// functionality'", driver.findElement(Tinymce_Editor));
		driver.switchTo().defaultContent();
		HighlightElement(driver, driver.findElement(Save_All_Dropdown));
		driver.findElement(Save_All_Dropdown).click();
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(All_Summaries));
		driver.findElement(All_Summaries).click();
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Refresh_History));
		driver.findElement(Refresh_History).click();
		Thread.sleep(1000);
		driver.findElement(Refresh_History).click();
		Thread.sleep(3000);
		if (Exists_History(
				"(//div[contains(@id,'history" + All_Toc_Sections_Array.get(0) + "')]/div)[2]/div/div[2]/p[1]")) {
			History = driver.findElement(By.xpath(
					"(//div[contains(@id,'history" + All_Toc_Sections_Array.get(0) + "')]/div)[2]/div/div[2]/p[1]"));
		} else {
			History = driver.findElement(By
					.xpath("(//div[contains(@id,'history" + All_Toc_Sections_Array.get(0) + "')]/div)[2]/div/div[2]"));
		}
		HighlightElement(driver, History);
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.clickAndHold(History);
		Action action = builder.build();
		action.perform();
		driver.switchTo().frame(Tinymce_iframe);
		JJ.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Tinymce_Editor));
		HighlightElement(driver, driver.findElement(Tinymce_Editor));
		builder = new Actions(driver);
		builder.moveToElement(driver.findElement(Tinymce_Editor)).perform();
		builder.build();
		builder.release();
		builder.release(driver.findElement(Tinymce_Editor)).perform();
		HighlightElement(driver, driver.findElement(Tinymce_Editor));
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	}
}
