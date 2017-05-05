package test_cases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Tools {
	WebDriver driver;
	By Variable_Replacer = By.xpath("//a[text()='Variable Replacer']");
	By All_Sections_Variable_Replacer = By.xpath("//form[@name='VRForm']/table/tbody/tr/td/a");
	By Highlight_Variables = By.xpath("//input[@value='Highlight Variables' or @value='✓ Highlight Variables']");
	By Tools_Dropdown = By.xpath("//div[@title='Tools']");
	By Tools_Compare = By.xpath("//a[text()='Compare']");
	By Tools_KickoffReport = By.xpath("//a[text()='Kickoff Report']");
	By Tools_AdministrativeTools = By.xpath("//a[text()='Administrative Tools']");
	By All_Replacewith = By.xpath("//form[@name='VRForm']/table/tbody/tr/td[3]/input");
	By Include_All = By.id("chkIncludeAll");
	By Submit_Changes = By.xpath("(//input[@name='submitVR'])[1]");
	By Close_Window = By.xpath("//a[contains(text(),'Close Window')]");
	By Check_All = By.xpath("(//input[@name='check'])[1]");
	By Uncheck_All = By.xpath("(//input[@name='uncheck'])[1]");
	By Write_Tab = By.xpath("//a[text()='Write']");
	By All_Toc_Sections = By.xpath("//*[@id='simplifiedtoc']/li/ul/li/div/a");
	By Tinymce_Editor = By.cssSelector(".mceContentBody");
	By All_Toc_SubSections = By.xpath("//*[@id='simplifiedtoc']/li/ul/li/ul/li/div/a");
	By Continue_without_saving = By.xpath("//a[text()='Continue without saving']");
	By user_dropdown = By.xpath("html/body/div[1]/div/nav/div/ul/li[8]/a");
	By logout_button = By.xpath("html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[4]/a");

	public Tools(WebDriver driver) {
		this.driver = driver;
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}

	private void Scroll_Element(WebElement element) {
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		JJ.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	private boolean Exists_Section(int all_Replacewith_Counter) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			@SuppressWarnings("unused")
			WebElement S = driver.findElement(
					By.xpath("//form[@name='VRForm']/table/tbody/tr[" + all_Replacewith_Counter + "]/td[4]/a[1]"));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private void Select_Tools_dropdown_Option(By Option) throws Exception {
		HighlightElement(driver, driver.findElement(Tools_Dropdown));
		driver.findElement(Tools_Dropdown).click();
		Thread.sleep(1000);
		HighlightElement(driver, driver.findElement(Option));
		driver.findElement(Option).click();
		Thread.sleep(2000);
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		if (Option.equals(Tools_Compare)) {
			System.out.println("page title for Compare page is: " + driver.getTitle());
		} else if (Option.equals(Tools_KickoffReport)){
			System.out.println("page title for Kickoff Report page is: " + driver.getTitle());
		} else if (Option.equals(Tools_AdministrativeTools)){
			System.out.println("page title for Admin Tools page is: " + driver.getTitle());
		} 
		driver.close();
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(3000);
	}

	private void Select_Section(WebElement element) throws Exception {
		String Toc_Section_Id;
		HighlightElement(driver, element);
		element.click();
		try {
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			driver.switchTo().defaultContent();
		} catch (Exception e) {

		}
		Toc_Section_Id = element.getAttribute("data-section-id");
		Thread.sleep(3000);
		WebElement Tinymce_iframe = driver.findElement(By.xpath("//*[@id='content" + Toc_Section_Id + "_ifr']"));
		driver.switchTo().frame(Tinymce_iframe);
		Scroll_Element(driver.findElement(Tinymce_Editor));
		HighlightElement(driver, driver.findElement(Tinymce_Editor));
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
	}

	private void Highlight_Section(String Variable) throws Exception {
		HighlightElement(driver, driver.findElement(Write_Tab));
		driver.findElement(Write_Tab).click();
		Thread.sleep(5000);
		for (WebElement ATS : driver.findElements(All_Toc_Sections)) {
			if (Variable.contains(ATS.getText())) {
				Select_Section(ATS);
				break;
			}
		}
		for (WebElement ATSS : driver.findElements(All_Toc_SubSections)) {
			if (Variable.contains(ATSS.getText())) {
				Select_Section(ATSS);
				break;
			}
		}
	}

	public void Variable_Replacer() throws Exception {
		String winHandleBefore;
		String Variable = null;
		int All_Replacewith_Counter = 3;
		WebElement Section;

		HighlightElement(driver, driver.findElement(Tools_Dropdown));
		driver.findElement(Tools_Dropdown).click();
		Thread.sleep(1000);
		HighlightElement(driver, driver.findElement(Variable_Replacer));
		driver.findElement(Variable_Replacer).click();
		try {
			Thread.sleep(2000);
			HighlightElement(driver, driver.findElement(Continue_without_saving));
			driver.findElement(Continue_without_saving).click();
		} catch (Exception e1) {

		}
		Thread.sleep(3000);
		winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		HighlightElement(driver, driver.findElement(Uncheck_All));
		driver.findElement(Uncheck_All).click();
		HighlightElement(driver, driver.findElement(Check_All));
		driver.findElement(Check_All).click();
		HighlightElement(driver, driver.findElement(Uncheck_All));
		driver.findElement(Uncheck_All).click();
		Thread.sleep(3000);
		for (WebElement ARW : driver.findElements(All_Replacewith)) {
			if (Exists_Section(All_Replacewith_Counter)) {
				Section = driver.findElement(
						By.xpath("//form[@name='VRForm']/table/tbody/tr[" + All_Replacewith_Counter + "]/td[4]/a[1]"));
				if (!Section.getText().contains("✔")) {
					Scroll_Element(Section);
					Thread.sleep(3000);
					HighlightElement(driver, Section);
					Actions action = new Actions(driver);
					action.moveToElement(Section).perform();
					Thread.sleep(6000);
					Variable = Section.getText();
					HighlightElement(driver, ARW);
					ARW.clear();
					ARW.sendKeys("Testing Variable Replacer");
					WebElement Include_Checkbox = driver.findElement(By.xpath(
							"//form[@name='VRForm']/table/tbody/tr[" + All_Replacewith_Counter + "]/td[1]/input"));
					HighlightElement(driver, Include_Checkbox);
					Include_Checkbox.click();
					Thread.sleep(2000);
					break;
				}
			}
			All_Replacewith_Counter++;
		}
		Scroll_Element(driver.findElement(Close_Window));
		HighlightElement(driver, driver.findElement(Submit_Changes));
		driver.findElement(Submit_Changes).click();
		Thread.sleep(1000);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {

		}
		Thread.sleep(3000);
		HighlightElement(driver, driver.findElement(Close_Window));
		driver.findElement(Close_Window).click();
		Thread.sleep(2000);
		driver.switchTo().window(winHandleBefore);
		Highlight_Section(Variable);
	}

	public void Tools_Dropdown() throws Exception {
		Select_Tools_dropdown_Option(Tools_Compare);
		Select_Tools_dropdown_Option(Tools_KickoffReport);
		Select_Tools_dropdown_Option(Tools_AdministrativeTools);
		HighlightElement(driver, driver.findElement(user_dropdown));
		driver.findElement(user_dropdown).click();
		Thread.sleep(2000);
		HighlightElement(driver, driver.findElement(logout_button));
		driver.findElement(logout_button).click();
		Thread.sleep(8000);	

	}
}
