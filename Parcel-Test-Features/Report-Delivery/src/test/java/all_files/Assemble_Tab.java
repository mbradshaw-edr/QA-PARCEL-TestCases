package all_files;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Assemble_Tab {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='header-nav']/li[2]/form/input[1]")
	WebElement Search_SiteId;

	@FindBy(xpath="html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li/a[text()='Assemble']")
	WebElement Assemble_Tab;
	
	@FindBy(name="check-all")
	WebElement Check_all_Option;
	
	@FindBy(xpath="//input[@value='AddTransmittalWFile']")
	WebElement Transmittal_Letter_Option;
	
	@FindBy(xpath="//input[@value='AddCoverPageWFile']")
	WebElement Cover_Page_Option;
	
	@FindBy(id="submitDownloadDeliverable")
	WebElement Download_PDF;
	
	@FindBy(id="submitStartEmailLink")
	WebElement Email_Link_Toclient_Button;
	
	@FindBy(xpath="(//div[@class='pull-right']/div/button)[1]")
	WebElement Download_File_Dropdown;
	
	@FindBy(xpath="(//div[@class='pull-right']/div/ul/li/a[text()='PDF'])[1]")
	WebElement PDF_Option_Download_File_Dropdown;
	
	@FindBy(xpath="(//div[@class='pull-right']/div/ul/li/a[text()='Word'])[1]")
	WebElement Word_Option_Download_File_Dropdown;
	
	@FindBy(xpath="(//div[@class='pull-right']/div/button)[2]")
	WebElement Email_Link_Toclient_Dropdown;
	
	@FindBy(xpath="(//div[@class='pull-right']/div/ul/li/a[text()='PDF'])[2]")
	WebElement PDF_Option_Email_Link_Toclient_Dropdown;
	
	@FindBy(xpath="(//div[@class='pull-right']/div/ul/li/a[text()='Word'])[2]")
	WebElement Word_Option_Email_Link_Toclient_Dropdown;
	
	@FindBy(xpath="//textarea[@name='toText']")
	WebElement Transmittal_Letter_Edit_To_Texrarea;
	
	@FindBy(xpath="//textarea[@name='body']")
	WebElement Transmittal_Letter_Edit_Body_Texrarea;
	
	@FindBy(xpath="//textarea[@name='closing']")
	WebElement Transmittal_Letter_Edit_Closing_Texrarea;
	
	@FindBy(xpath="//input[@name='submitSaveTransmittalLetter']")
	WebElement Transmittal_Letter_Edit_Save;
	
	@FindBy(xpath="//td[@class='message']")
	WebElement Transmittal_Letter_Edit_Message;
	
	@FindBy(xpath="//input[@name='header2']")
	WebElement Cover_Page_Edit_Header2;
	
	@FindBy(xpath="//textarea[@name='siteAddress']")
	WebElement Cover_Page_Edit_SiteAddress;
	
	@FindBy(xpath="//textarea[@name='clientName']")
	WebElement Cover_Page_Edit_Preparedfor;
	
	@FindBy(xpath="//textarea[@name='consultantName']")
	WebElement Cover_Page_Edit_Preparedby;
	
	@FindBy(xpath="//input[@name='editCover']")
	WebElement Cover_Page_Edit_Save_Changes;
	
	@FindBy(xpath="//*[@id='submit_word_popup_Report']")
	WebElement submit_word_popup;
	
	@FindBy(id="submit_word_popup")
	WebElement submit_word_popup_For_Mail;
	
	@FindBy(name="transmittalFile")
	WebElement Browse_Upload_Transmittal_Letter;
	
	@FindBy(name="submitTransmittal")
	WebElement Upload_Transmittal_Letter;
	
	@FindBy(name="coverFile")
	WebElement Browse_Upload_Cover_Page;
	
	@FindBy(name="submitCover")
	WebElement Upload_Cover_Page;
	
	@FindBy(xpath="//input[@value='AddCoverPageWFile']")
	WebElement Cover_Page_Checkbox;

	@FindBy(xpath="//input[@value='AddTransmittalWFile']")
	WebElement Transmittal_Letter_Checkbox;
		
	@FindBy(xpath="//p[text()='File is a jpg, it needs to be PDF for transmittal upload.']")
	WebElement Transmittal_Letter_JPG_Image_Upload_Warning_Message;
	
	@FindBy(xpath="//p[text()='File is a jpg, it needs to be PDF for cover page upload.']")
	WebElement Cover_Page_JPG_Image_Upload_Warning_Message;
	
	@FindBy(xpath="//a[text()='upload document' and contains(@onclick, 'uploadType=transmittal')]")
	WebElement Transmittal_Letter_Upload_document_Button;
	
	@FindBy(xpath="//a[text()='upload document' and contains(@onclick,'uploadType=cover')]")
	WebElement Cover_Page_Upload_document_Button;
	
	@FindBy(xpath="//a[text()='view' and contains(@onclick,'viewTransmittalLetter.php')]")
	WebElement Transmittal_Letter_View_Button;
	
	@FindBy(xpath="//a[text()='view' and contains(@onclick,'viewCover.php')]")
	WebElement Cover_Page_View_Button;

	@FindBy(xpath="//a[text()='upload document' and contains(@onclick,'uploadType=transmittal')]")
	WebElement Transmittal_Letter_Upload_Document_Button;
	
	@FindBy(xpath="//a[text()='upload document' and contains(@onclick,'uploadType=cover')]")
	WebElement Cover_Page_Upload_Document_Button;
	
	@FindBy(xpath="(//a[text()='Download PDF'])[1]")
	WebElement Previously_Generated_PDF;
	
	@FindBy(xpath="(//a[text()='Disable'])[1]")
	WebElement First_Previously_Emailed_Reports;
	
	@FindBy(xpath="(//a[text()='Download Word'])[1]")
	WebElement Previously_Generated_Word;
	
	@FindBy(id="to")
	WebElement Email_Deliverable_To;
	
	@FindBy(id="submitEmailDeliverableLink")
	WebElement Email_Deliverable_Submit_Button;
	
	@FindBy(xpath="//a[text()='Close']")
	WebElement Email_Deliverable_Close_Button;	
	
	@FindBy(xpath="//div[text()='Your email was sent successfully.']")
	WebElement Email_Deliverable_Success_Message;	
	
	@FindBy(xpath="//a[text()='Previously E-mailed Reports']")
	WebElement Previously_Emailed_Reports;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/a")
	WebElement user_dropdown;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[4]/a")
	WebElement logout_button;
	
	public Assemble_Tab(WebDriver driver){
	this.driver = driver;	
	}
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException{
	JavascriptExecutor jse=(JavascriptExecutor)wd;
	jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	Thread.sleep(1500);
	jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
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

	private void Send_Deliverable_Email(String Filetype) throws Exception {
		Excel_Data excel = new Excel_Data("src\\test\\java\\Test_Data\\Report Delivery Feature.xlsx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, Email_Deliverable_To);
		Email_Deliverable_To.clear();
		Email_Deliverable_To.sendKeys(excel.Email_Id("Credentials", 1, 3));
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		JJ.executeScript("arguments[0].scrollIntoView(true);",Email_Deliverable_Submit_Button);
		Thread.sleep(3000);
		HighlightElement(driver, Email_Deliverable_Submit_Button);
		Email_Deliverable_Submit_Button.click();
		Thread.sleep(15000);
		if (Filetype.equals("Word")) {
			Capture_Screenshot.Take_Screenshot(driver,"Email Deliverable Success Message for Word file");
		} else {
			Capture_Screenshot.Take_Screenshot(driver,"Email Deliverable Success Message for PDF file");
		}
		Email_Deliverable_Close_Button.click();
		Thread.sleep(3000);
		Previously_Emailed_Reports();	
	}

	private void Download_PDF_And_Word_File() throws Exception{
		if (ExistsElement(Download_PDF)) {
			HighlightElement(driver, Download_PDF);
			if (ExistsElement(Download_File_Dropdown)) {
				Capture_Screenshot.Take_Screenshot(driver,"Two_Download_PDF_Options");

			} else {
				Download_PDF.click();
				Thread.sleep(1000);
				try {
					driver.switchTo().alert().accept();

				} catch (Exception e) {

				}
				Thread.sleep(5000);
				Previously_Generated_Report();
			}

		}

		if (ExistsElement(Download_File_Dropdown)) {
			HighlightElement(driver, Download_File_Dropdown);
			Download_File_Dropdown.click();
			Thread.sleep(500);
			HighlightElement(driver, PDF_Option_Download_File_Dropdown);
			PDF_Option_Download_File_Dropdown.click();
			Thread.sleep(1000);
			try {
				driver.switchTo().alert().accept();

			} catch (Exception e) {

			}
			Thread.sleep(5000);
			Previously_Generated_Report();
			Download_Word_File();
			Thread.sleep(5000);
			Previously_Generated_Report();
		}

	}

	private void Download_Word_File() throws Exception{
	Thread.sleep(3000);	
	HighlightElement(driver, Download_File_Dropdown);
	Download_File_Dropdown.click();
	Thread.sleep(500);
	HighlightElement(driver, Word_Option_Download_File_Dropdown);
	Word_Option_Download_File_Dropdown.click();
	Thread.sleep(1000);
	HighlightElement(driver, submit_word_popup);
	submit_word_popup.click();
	Thread.sleep(1000);
		try{
		driver.switchTo().alert().accept();
		
		}catch (Exception e){

		}

	}

	private void Previously_Emailed_Reports() throws Exception{
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, Previously_Emailed_Reports);
		Previously_Emailed_Reports.click();	
		Thread.sleep(2000);
		WebElement Previously_Emailed_Report = driver.findElement(By.xpath("(//*[@id='contentpreviouslyemailedreports-tab']/div/table/tbody/tr/td[2])[1]"));
		HighlightElement(driver, Previously_Emailed_Report);
		System.out.println("Previously Emailed Report is: "+Previously_Emailed_Report.getText());
		Thread.sleep(3000);	
	}
	
	private void Previously_Generated_Report() throws Exception{
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement Previously_Generated_Report = driver.findElement(By.xpath("(//*[@id='contentpreviouslygeneratedreports-tab']/div/table/tbody/tr/td[2])[1]"));
	HighlightElement(driver, Previously_Generated_Report);
	System.out.println("Previously Generated Report name is: "+Previously_Generated_Report.getText());
	}
	
	private void View_Button(String FileName) throws Exception{
	List<WebElement> All_View_Options = driver.findElements(By.xpath("//*[@id='deliverableForm']/div[2]/div[1]/div/div/label/a[1]"));	
	 for(WebElement AVO:All_View_Options){
		 if(AVO.getAttribute("onclick").contains(FileName)){
			 HighlightElement(driver, AVO);	 
			 AVO.click();
			 Thread.sleep(4000);
			 String winHandleBefore = driver.getWindowHandle();
			for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
			}
			Thread.sleep(5000);
			driver.close();
			driver.switchTo().window(winHandleBefore);
			Thread.sleep(3000);
			break;
			}

		}

	}

	private void Edit_Button(String FileName) throws Exception{
		String Edit_Button_Attribute;
		List<WebElement> All_Edit_Options = driver.findElements(By.xpath("//*[@id='deliverableForm']/div[2]/div[1]/div/div/label/a[2]"));
		for (WebElement AEO : All_Edit_Options) {
			if (AEO.getAttribute("onclick").contains(FileName)) {
				Edit_Button_Attribute = AEO.getAttribute("onclick");
				HighlightElement(driver, AEO);
				AEO.click();
				Thread.sleep(4000);
				String winHandleBefore = driver.getWindowHandle();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
				Thread.sleep(5000);
				if (Edit_Button_Attribute.contains("editTransmittalLetter.php")) {
					HighlightElement(driver,Transmittal_Letter_Edit_To_Texrarea);
					Transmittal_Letter_Edit_To_Texrarea.sendKeys(" Test, Test, Test, Test ");
					Thread.sleep(2000);
					HighlightElement(driver,Transmittal_Letter_Edit_Body_Texrarea);
					Transmittal_Letter_Edit_Body_Texrarea.sendKeys(" Test, Test, Test, Test ");
					Thread.sleep(2000);
					HighlightElement(driver,Transmittal_Letter_Edit_Closing_Texrarea);
					Transmittal_Letter_Edit_Closing_Texrarea.sendKeys(" Test, Test ");
					Thread.sleep(2000);
					HighlightElement(driver, Transmittal_Letter_Edit_Save);
					Transmittal_Letter_Edit_Save.click();
					try {
						Thread.sleep(2000);
						JavascriptExecutor JJ = (JavascriptExecutor) driver;
						JJ.executeScript("arguments[0].scrollIntoView(true);",
								Transmittal_Letter_Edit_Message);
					} catch (Exception e) {

					}
					Thread.sleep(3000);
				}

				if (Edit_Button_Attribute.contains("editCover.php")) {
					HighlightElement(driver, Cover_Page_Edit_Header2);
					Cover_Page_Edit_Header2.sendKeys(" Test ");
					Thread.sleep(2000);
					HighlightElement(driver, Cover_Page_Edit_SiteAddress);
					Cover_Page_Edit_SiteAddress.sendKeys(" Test, Test ");
					Thread.sleep(2000);
					HighlightElement(driver, Cover_Page_Edit_Preparedfor);
					Cover_Page_Edit_Preparedfor.sendKeys(" Test, Test ");
					Thread.sleep(2000);
					HighlightElement(driver, Cover_Page_Edit_Preparedby);
					Cover_Page_Edit_Preparedby.sendKeys(" Test, Test ");
					Thread.sleep(2000);
					HighlightElement(driver, Cover_Page_Edit_Save_Changes);
					Cover_Page_Edit_Save_Changes.click();
					Thread.sleep(3000);
				}
				driver.close();
				driver.switchTo().window(winHandleBefore);
				Thread.sleep(3000);
				break;
			}

		}

	}
	
	private void Delete_Document(String FileName) throws Exception{
		List<WebElement> All_Delete_Document = driver.findElements(By.xpath("//a[text()='delete document']"));
		for (WebElement ADD : All_Delete_Document) {
			if (ADD.getAttribute("onclick").contains(FileName)) {
				HighlightElement(driver, ADD);
				ADD.click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	
	private void Upload_PDF() throws Exception{
		String BrowserName;
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		BrowserName = cap.getBrowserName().toLowerCase();	
		if (BrowserName.equals("chrome")) {
			Runtime.getRuntime().exec("src\\test\\java\\Test_Data\\PDF upload for Chrome.exe");
		} else if (BrowserName.equals("internet explorer")) {
			Runtime.getRuntime().exec("src\\test\\java\\Test_Data\\PDF upload for IE.exe");
		}
		else{
			Runtime.getRuntime().exec("src\\test\\java\\Test_Data\\PDF upload for Firefox.exe");
		}
		Thread.sleep(15000);
	}
	
	private void Upload_Image() throws Exception{
		String BrowserName;
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		BrowserName = cap.getBrowserName().toLowerCase();	
		if (BrowserName.equals("chrome")) {
			Runtime.getRuntime().exec("src\\test\\java\\Test_Data\\Image upload for Chrome.exe");
		} else if (BrowserName.equals("internet explorer")) {
			Runtime.getRuntime().exec("src\\test\\java\\Test_Data\\Image upload for IE.exe");
		}
		else{
			Runtime.getRuntime().exec("src\\test\\java\\Test_Data\\Image upload for Firefox.exe");
		}
		Thread.sleep(15000);
	}

	private String Upload_Document_Button(String FileName) throws Exception{
		String Upload_Document_Attribute = null;
		List<WebElement> All_Upload_Documents = driver.findElements(By.xpath("//a[text()='upload document']"));

		for (WebElement AUD : All_Upload_Documents) {
			if (AUD.getAttribute("onclick").contains(FileName)) {
				Upload_Document_Attribute = AUD.getAttribute("onclick");
				HighlightElement(driver, AUD);
				AUD.click();
				Thread.sleep(4000);
				break;
			}

		}
		return Upload_Document_Attribute;
	}
	
	private void Upload_Document(String FileName)throws Exception {
		String Upload_Document_Attribute = Upload_Document_Button(FileName);

		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		Thread.sleep(3000);
		if (Upload_Document_Attribute.contains(FileName) & FileName == "uploadType=transmittal") {
			HighlightElement(driver, Browse_Upload_Transmittal_Letter);
			Browse_Upload_Transmittal_Letter.click();
			Thread.sleep(1000);
			Upload_PDF();
			HighlightElement(driver, Upload_Transmittal_Letter);
			Upload_Transmittal_Letter.click();
			driver.switchTo().window(winHandleBefore);
			Thread.sleep(1000);
			if (!Transmittal_Letter_Checkbox.isSelected()) {
				HighlightElement(driver, Transmittal_Letter_Checkbox);
				Transmittal_Letter_Checkbox.click();
			}
			Download_PDF_And_Word_File();
			Delete_Document("uploadType=transmittal");
		} else if (Upload_Document_Attribute.contains(FileName)	& FileName == "uploadType=cover") {
			HighlightElement(driver, Browse_Upload_Cover_Page);
			Browse_Upload_Cover_Page.click();
			Thread.sleep(1000);
			Upload_PDF();
			HighlightElement(driver, Upload_Cover_Page);
			Upload_Cover_Page.click();
			driver.switchTo().window(winHandleBefore);
			Thread.sleep(1000);
			if (!Cover_Page_Checkbox.isSelected()) {
				HighlightElement(driver, Cover_Page_Checkbox);
				Cover_Page_Checkbox.click();
			}
			Download_PDF_And_Word_File();
			Delete_Document("uploadType=cover");
		}
	}

	private void Upload_Invalid_File(String FileName) throws Exception {
		String Upload_Document_Attribute = Upload_Document_Button(FileName);
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		Thread.sleep(5000);
		if (Upload_Document_Attribute.contains(FileName) & FileName=="uploadType=transmittal") {
			HighlightElement(driver, Browse_Upload_Transmittal_Letter);
			Browse_Upload_Transmittal_Letter.click();
			Thread.sleep(1000);
			Upload_Image();
			HighlightElement(driver, Upload_Transmittal_Letter);
			Upload_Transmittal_Letter.click();
			Thread.sleep(1000);
			HighlightElement(driver, Transmittal_Letter_JPG_Image_Upload_Warning_Message);
			Capture_Screenshot.Take_Screenshot(driver,"Invalid_File_Upload_For_Transmittal_Letter");
			driver.close();
			driver.switchTo().window(winHandleBefore);
			Thread.sleep(3000);
		}
		else if (Upload_Document_Attribute.contains(FileName) & FileName=="uploadType=cover") {
			HighlightElement(driver, Browse_Upload_Cover_Page);
			Browse_Upload_Cover_Page.click();
			Thread.sleep(1000);
			Upload_Image();
			HighlightElement(driver, Upload_Cover_Page);
			Upload_Cover_Page.click();
			Thread.sleep(1000);
			HighlightElement(driver, Cover_Page_JPG_Image_Upload_Warning_Message);
			Capture_Screenshot.Take_Screenshot(driver,"Invalid_File_Upload_For_Cover_Page");
			driver.close();
			driver.switchTo().window(winHandleBefore);
			Thread.sleep(3000);
		}
	}
	
	public void Download_Report() throws Exception{
	Excel_Data excel = new Excel_Data("src\\test\\java\\Test_Data\\Report Delivery Feature.xlsx");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	HighlightElement(driver, Search_SiteId);
	Search_SiteId.clear();
	Search_SiteId.sendKeys(excel.Site_Id("Credentials", 1, 2));
	Search_SiteId.sendKeys(Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	HighlightElement(driver, Assemble_Tab);
	Assemble_Tab.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	HighlightElement(driver, Check_all_Option);
	Check_all_Option.click();
	Thread.sleep(5000);
	HighlightElement(driver, Check_all_Option);
	Check_all_Option.click();
	Thread.sleep(5000);
	HighlightElement(driver, Check_all_Option);
	Check_all_Option.click();
	Download_PDF_And_Word_File();
	}

	public void View_Transmittal_Letter() throws Exception {
		if (ExistsElement(Transmittal_Letter_View_Button)) {
			View_Button("viewTransmittalLetter.php");
		}
	}

	public void View_Cover_Page() throws Exception {
		if (ExistsElement(Cover_Page_View_Button)) {
			View_Button("viewCover.php");
		}
	}

	public void Edit_Transmittal_Letter() throws Exception {
		if (ExistsElement(Transmittal_Letter_Upload_Document_Button)) {
			Edit_Button("editTransmittalLetter.php");
			if (!Transmittal_Letter_Checkbox.isSelected()) {
				HighlightElement(driver, Transmittal_Letter_Checkbox);
				Transmittal_Letter_Checkbox.click();
			}
			Download_PDF_And_Word_File();
		}

	}

	public void Edit_Cover_Page() throws Exception {

		if (ExistsElement(Cover_Page_Upload_Document_Button)) {
			Edit_Button("editCover.php");
			if (!Cover_Page_Checkbox.isSelected()) {
				HighlightElement(driver, Cover_Page_Checkbox);
				Cover_Page_Checkbox.click();
			}
			Download_PDF_And_Word_File();
		}

	}

	public void Upload_Document_Transmittal_Letter() throws Exception {

		if(ExistsElement(Transmittal_Letter_Upload_document_Button)){
			Upload_Document("uploadType=transmittal");
			Thread.sleep(5000);
		}
	}

	public void Upload_Document_Cover_Page() throws Exception {

		if(ExistsElement(Cover_Page_Upload_document_Button)){
			Upload_Document("uploadType=cover");
			Thread.sleep(5000);
		}
	}

	public void Upload_Invalid_File_Transmittal_Letter() throws Exception {

		if(ExistsElement(Transmittal_Letter_Upload_document_Button)){
			Upload_Invalid_File("uploadType=transmittal");
			Thread.sleep(5000);
		}

	}

	public void Upload_Invalid_File_Cover_Page() throws Exception {

		if(ExistsElement(Cover_Page_Upload_document_Button)){
			Upload_Invalid_File("uploadType=cover");
			Thread.sleep(5000);
		}
	}

	public void Download_Previously_Generated_Reports() throws Exception {
		if (ExistsElement(Previously_Generated_PDF)) {
			HighlightElement(driver, Previously_Generated_PDF);
			Previously_Generated_PDF.click();
			Thread.sleep(1000);
			try {
				driver.switchTo().alert().accept();

			} catch (Exception e) {

			}
			Thread.sleep(5000);
		}

		if (ExistsElement(Previously_Generated_Word)) {
			HighlightElement(driver, Previously_Generated_Word);
			Previously_Generated_Word.click();
			Thread.sleep(1000);
			try {
				driver.switchTo().alert().accept();

			} catch (Exception e) {

			}
			Thread.sleep(5000);
		}

	}

	public void Email_Link_To_Client() throws Exception{
		if (ExistsElement(Email_Link_Toclient_Button)) {
			HighlightElement(driver, Email_Link_Toclient_Button);
			if (ExistsElement(Email_Link_Toclient_Dropdown)) {
				Capture_Screenshot.Take_Screenshot(driver,"Two Email Link Toclient Options");
			}else{
			Email_Link_Toclient_Button.click();
			Send_Deliverable_Email("PDF");
			}
		} 
		if (ExistsElement(Email_Link_Toclient_Dropdown)) {
			HighlightElement(driver, Email_Link_Toclient_Dropdown);
			Email_Link_Toclient_Dropdown.click();	
			Thread.sleep(1000);
			HighlightElement(driver, PDF_Option_Email_Link_Toclient_Dropdown);
			PDF_Option_Email_Link_Toclient_Dropdown.click();
			Send_Deliverable_Email("PDF");
			HighlightElement(driver, Email_Link_Toclient_Dropdown);
			Email_Link_Toclient_Dropdown.click();	
			Thread.sleep(1000);
			HighlightElement(driver, Word_Option_Email_Link_Toclient_Dropdown);
			Word_Option_Email_Link_Toclient_Dropdown.click();
			Thread.sleep(1000);
			HighlightElement(driver, submit_word_popup_For_Mail);
			submit_word_popup_For_Mail.click();
			Send_Deliverable_Email("Word");
		}
	}

	public void Disable_Email_Link() throws Exception {

		if (ExistsElement(First_Previously_Emailed_Reports)) {
			HighlightElement(driver, First_Previously_Emailed_Reports);
			First_Previously_Emailed_Reports.click();
			Thread.sleep(1000);
			WebElement Previously_disabled_Emailed_Report = driver.findElement(By.xpath("(//*[@id='contentpreviouslyemailedreports-tab']/div/table/tbody/tr/td[contains(text(),'Sent PDF link to:') or contains(text(),'Sent Word link to:')])[1]"));
			HighlightElement(driver, Previously_disabled_Emailed_Report);
			System.out.println("Previously Disabled Emailed Report is: "+ Previously_disabled_Emailed_Report.getText());
			Thread.sleep(3000);
		}

	}
	
	public void LogOut() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HighlightElement(driver, user_dropdown);
		user_dropdown.click();
		Thread.sleep(1000);
		HighlightElement(driver, logout_button);
		logout_button.click();
		Thread.sleep(8000);		
	}
}
