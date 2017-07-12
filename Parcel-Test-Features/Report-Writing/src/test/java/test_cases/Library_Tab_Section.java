package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Library_Tab_Section {
	WebDriver driver;

	By Library_Tab = By.xpath("//a[text()='Library']");
	By Library_Dropdown = By.xpath(".//*[@id='s2id_autogen2']/a");
	By Library_Dropdown_Options = By.xpath(".//*[@id='select2-drop']/ul/li/div");
	By Tinymce_Editor = By.cssSelector(".mceContentBody");
	By Refresh_Language_Library = By.xpath("//div[@title='Refresh Language Library']");

	public Library_Tab_Section(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private boolean Exists_Library(String library_Option) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			driver.findElement(By.xpath("" + library_Option + ""));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("static-access")
	public void Drag_Drop_Library() throws Exception {
		Toc_Tab_Section Toc_Tab_Section = new Toc_Tab_Section(driver);
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		int Library_Dropdown_Options_Counter = 1;
		WebElement Library = null;

		HighlightElement(driver, driver.findElement(Library_Tab));
		driver.findElement(Library_Tab).click();
		Thread.sleep(5000);
		HighlightElement(driver, driver.findElement(Library_Dropdown));
		driver.findElement(Library_Dropdown).click();
		Thread.sleep(3000);
		for (WebElement LDO : driver.findElements(Library_Dropdown_Options)) {
			if (Library_Dropdown_Options_Counter <= 5) {
				if (Library_Dropdown_Options_Counter > 1) {
					HighlightElement(driver, driver.findElement(Library_Dropdown));
					driver.findElement(Library_Dropdown).click();
					Thread.sleep(3000);
					int Library_Dropdown_Options_Counter1 = 1;
					for (WebElement LDO1 : driver.findElements(Library_Dropdown_Options)) {
						if (Library_Dropdown_Options_Counter == Library_Dropdown_Options_Counter1) {
							HighlightElement(driver, LDO1);
							LDO1.click();
							Thread.sleep(2000);
							break;
						}
						Library_Dropdown_Options_Counter1++;
					}
				} else {
					HighlightElement(driver, LDO);
					LDO.click();
					Thread.sleep(2000);
				}
				driver.findElement(Refresh_Language_Library).click();
				Thread.sleep(3000);
				if (Exists_Library("(//div[@class='dll-handle']/div[contains(@id,'dll-text')]/p)[1]")) {
					Library = driver
							.findElement(By.xpath("(//div[@class='dll-handle']/div[contains(@id,'dll-text')]/p)[1]"));
					break;
				} else if (Exists_Library("(//div[@class='dll-handle']/div[contains(@id,'dll-text')])[1]")) {
					Library = driver
							.findElement(By.xpath("(//div[@class='dll-handle']/div[contains(@id,'dll-text')])[1]"));
					break;
				}
			} else {
				System.out.println(
						"Note: Language Library not available for first 5 libraries, for time saving we need to skip drag and drop functionality of Language Library.");
				break;
			}
			Library_Dropdown_Options_Counter++;
		}

		try {
			HighlightElement(driver, Library);
			Thread.sleep(2000);
			Actions builder = new Actions(driver);
			builder.clickAndHold(Library);
			Action action = builder.build();
			action.perform();
			WebElement Tinymce_iframe;
			try {
				Tinymce_iframe = driver.findElement(
						By.xpath("//*[@id='content" + Toc_Tab_Section.Tables_Section_Id.get(0) + "_ifr']"));
			} catch (Exception e) {
				Tinymce_iframe = driver.findElement(By.xpath("//*[@id='content4_ifr']"));
			}
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
		} catch (Exception e) {

		}
		Thread.sleep(3000);
	}

}
