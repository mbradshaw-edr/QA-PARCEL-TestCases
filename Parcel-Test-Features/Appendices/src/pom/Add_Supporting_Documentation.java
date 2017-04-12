package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Add_Supporting_Documentation {
	
	WebDriver driver;
	String winHandleBefore;
		
	@FindBy(how=How.XPATH,using="//*[@id='Appendices-tab']/div/div[1]/div/div/div/ul/li[1]/a")
	WebElement Appendices_SubTab;

	@FindBy(how=How.XPATH,using="//a[text()='Add Communication Record']")
	WebElement Add_Communication_Record;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement Communication_Name;

	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[2]/td[2]/select")
	WebElement Communication_Affiliation_Dropdown;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[3]/td[2]/input")
	WebElement Communication_Affiliation_Telephone;
	
	@FindBy(how=How.XPATH,using="//*[@id='conversationDateButton']")
	WebElement Communication_Date_Icon;
	
	@FindBy(how=How.XPATH,using="//button[text()='15']")
	WebElement Communication_Date_15;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[5]/td[2]/input")
	WebElement Communication_RE;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[7]/td/textarea")
	WebElement Communication_Comments;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[8]/td/input[1]")
	WebElement Communication_Save;
	
	@FindBy(how=How.XPATH,using="//a[text()='Add ADA Checklist']")
	WebElement Add_ADA_Checklist;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table/tbody/tr[69]/td/input[@value='Save Changes']")
	WebElement ADA_Checklist_Save;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table/tbody/tr[13]/td[2]/b")
	WebElement ADA_Checklist_Exterior_Accessible_Route;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table/tbody/tr[21]/td[2]/b")
	WebElement ADA_Checklist_Building_Entrances;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table/tbody/tr[30]/td[2]/b")
	WebElement ADA_Checklist_Interior_Accessible_Routes_and_Amenities;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table/tbody/tr[69]/td/input[2]")
	WebElement ADA_Checklist_Put_File_in_Appendix;
	
	@FindBy(how=How.XPATH,using="//a[text()='Add FHA Checklist']")
	WebElement Add_FHA_Checklist;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table/tbody/tr[30]/td/input[1]")
	WebElement Add_FHA_Save;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table/tbody/tr[30]/td/input[2]")
	WebElement FHA_Checklist_Put_File_in_Appendix;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/a")
	WebElement user_dropdown;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[4]/a")
	 WebElement logout_button;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[3]/a")
	WebElement Appendices_Tab;

	@FindBy(how=How.XPATH,using="//a[text()='Add User Questionnaire']")
	WebElement Add_User_Questionnaire;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table[2]/tbody/tr/td/table/tbody/tr[1]/td[2]/input")
	WebElement Questionnaire_Respondent_Name;
	
	@FindBy(how=How.XPATH,using="//*[@id='responseDate']")
	WebElement Questionnaire_Date_Icon;
	
	@FindBy(how=How.XPATH,using="//button[text()='15']")
	WebElement Questionnaire_Date_15;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table[2]/tbody/tr/td/table/tbody/tr[3]/td[2]")
	WebElement Questionnaire_Address;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table[13]/tbody/tr/td/input[1]")
	WebElement Questionnaire_Save;
	
	@FindBy(how=How.XPATH,using="html/body/center/form/table[13]/tbody/tr/td/input[2]")
	WebElement Questionnaire_Checklist_Put_File_in_Appendix;
	
	@FindBy(how=How.XPATH,using="//a[text()='Send Questionnaire Email']")
	WebElement Send_Questionnaire_Email;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[6]/td[2]/input")
	WebElement Questionnaire_To_Name;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[7]/td[2]/input")
	WebElement Questionnaire_To_Email;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[8]/td[2]/textarea")
	WebElement Questionnaire_Note;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[10]/td/input[1]")
	WebElement Questionnaire_Send_Email_Button;
	
	
	public Add_Supporting_Documentation(WebDriver driver){
		this.driver = driver;	
	}	
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	}
	
	private void Scroll_Element(WebElement Element) throws Exception{
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		JJ.executeScript("arguments[0].scrollIntoView(true);",Element);	
		Thread.sleep(1500);
	}
	
	private void Open_Report_For_Questionnaire() throws Exception{
		Appendices_Subtab Appendices_Subtab = PageFactory.initElements(driver, Appendices_Subtab.class);
		Thread.sleep(2000);
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(3000);	
		Appendices_Subtab.Search_SiteId(1,1);
		HighlightElement(driver, Appendices_Tab);
		Appendices_Tab.click();
		Thread.sleep(8000);	
	}
	
	private List<String> All_Documents(WebElement Document_Name)throws Exception{
		Thread.sleep(2000);	
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);	
		List<WebElement> All_Sections = driver.findElements(By.xpath("//*[@id='sectionsList']/li/a"));
		List<String> Current_Sections_Id_array=new ArrayList<>();	
		WebElement Section_Name;
		for(WebElement A:All_Sections){	
			if((A.getText()).contains("Document")){
				HighlightElement(driver, A);
				A.click();
				Thread.sleep(5000);
				
				if(Document_Name.isEnabled()){
				Current_Sections_Id_array.add(A.getAttribute("data-section-id"));
				Section_Name= driver.findElement(By.xpath("//*[@id='appendixTitle"+Current_Sections_Id_array.get(0)+"']/h2"));	
				Scroll_Element(Section_Name);	
				HighlightElement(driver, Document_Name);	
				Document_Name.click();
				Thread.sleep(4000);
				break;
				}

			}

		}
		return Current_Sections_Id_array;
	}
	
	private void Open_Newly_Added_Appendix_Record(String Id) throws Exception{
		
		WebElement Add_Files= driver.findElement(By.xpath("//*[@id='appendixUploadForm"+Id+"_browse']/span[text()='Add Files']"));	
		List<WebElement> All_Appendix_Records= driver.findElements(By.xpath("//*[@id='appendicesFilesTable"+Id+"']/tbody/tr/td[1]/a"));	
		Scroll_Element(Add_Files);		
		Thread.sleep(1000);
		winHandleBefore = driver.getWindowHandle();
		int Record_Counter=1;
			for(WebElement AAR:All_Appendix_Records){
			if(Record_Counter==All_Appendix_Records.size()){
			HighlightElement(driver, AAR);
			AAR.click();	
			Thread.sleep(12000);
			
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
				}
			 ((JavascriptExecutor)driver).executeScript("scroll(0,900)");
			Thread.sleep(5000);
				driver.close();
			}
			Record_Counter++;
		}

	}

	public void Add_Communication_Record() throws Exception{
		List<String> Current_Sections_Id_array=All_Documents(Add_Communication_Record);
		winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		   driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		HighlightElement(driver, Communication_Name);	
		Communication_Name.sendKeys("Test Name");
		HighlightElement(driver, Communication_Affiliation_Dropdown);
		Select CommunicationAffiliationDropdown = new Select(Communication_Affiliation_Dropdown);
		CommunicationAffiliationDropdown.selectByIndex(2);
		HighlightElement(driver, Communication_Affiliation_Telephone);
		Communication_Affiliation_Telephone.sendKeys("1234567890");
		HighlightElement(driver, Communication_Date_Icon);
		Communication_Date_Icon.click();
		Thread.sleep(2000);
		HighlightElement(driver, Communication_Date_15);
		Communication_Date_15.click();
		Thread.sleep(2000);
		HighlightElement(driver, Communication_RE);
		Communication_RE.sendKeys("Test RE");
		HighlightElement(driver, Communication_Comments);
		Communication_Comments.sendKeys("Test Comments");
		Thread.sleep(3000);
		HighlightElement(driver, Communication_Save);
		Communication_Save.click();;
		Thread.sleep(4000);
		driver.switchTo().window(winHandleBefore);
		Open_Newly_Added_Appendix_Record(Current_Sections_Id_array.get(0));		

	}
	
	public void Add_ADA_Checklist() throws Exception{
		List<String> Current_Sections_Id_array=All_Documents(Add_ADA_Checklist);
		winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		   driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		List<WebElement> All_ADA_YesCheckboxes = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td[3]/input"));
		
		List<WebElement> All_ADA_Comments = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td[6]/input"));
		int YesCheckboxes_Counter=1;
		int NoCheckboxes_Counter=1;
		int ADA_Comments_Counter=1;
		int Remaining_Comments_Counter=1;
		for(WebElement AAY:All_ADA_YesCheckboxes){
			if(YesCheckboxes_Counter<=34){
				HighlightElement(driver, AAY);	
				AAY.click();
			}
			else{
				break;
				}
			YesCheckboxes_Counter++;	
			}	
		for(WebElement AAC:All_ADA_Comments){
			if(ADA_Comments_Counter<=34){
				HighlightElement(driver, AAC);	
				AAC.sendKeys("Test ADA Checklist");	
			}
			else{
				break;
				}
		ADA_Comments_Counter++;
		}
		Scroll_Element(ADA_Checklist_Save);	
		HighlightElement(driver, ADA_Checklist_Save);
		ADA_Checklist_Save.click();
		Thread.sleep(12000);
		driver.close();
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(3000);
		HighlightElement(driver, Add_ADA_Checklist);
		Add_ADA_Checklist.click();
		Thread.sleep(4000);
		
		for(String winHandle : driver.getWindowHandles()){
			   driver.switchTo().window(winHandle);
			}
		Thread.sleep(2000);
		Scroll_Element(ADA_Checklist_Exterior_Accessible_Route);	
		Scroll_Element(ADA_Checklist_Building_Entrances);
		Scroll_Element(ADA_Checklist_Interior_Accessible_Routes_and_Amenities);
		List<WebElement> All_ADA_NoCheckboxes = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td[4]/input"));
		for(WebElement AAN:All_ADA_NoCheckboxes){
			if(NoCheckboxes_Counter>34){
			HighlightElement(driver, AAN);	
			AAN.click();	
			}
		NoCheckboxes_Counter++;	
		}
		List<WebElement> Remaining_ADA_Comments = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td[6]/input"));
		for(WebElement RAC:Remaining_ADA_Comments){
			if(Remaining_Comments_Counter>34){
				HighlightElement(driver, RAC);	
				RAC.sendKeys("Test ADA Checklist");	
			}
		Remaining_Comments_Counter++;
		}
		Scroll_Element(ADA_Checklist_Put_File_in_Appendix);	
		HighlightElement(driver, ADA_Checklist_Put_File_in_Appendix);
		ADA_Checklist_Put_File_in_Appendix.click();
		Thread.sleep(7000);
		driver.switchTo().window(winHandleBefore);
		Open_Newly_Added_Appendix_Record(Current_Sections_Id_array.get(0));	

	}
	
	public void Add_FHA_Checklist() throws Exception{
	List<String> Current_Sections_Id_array=All_Documents(Add_FHA_Checklist);	 	
	winHandleBefore = driver.getWindowHandle();
	for(String winHandle : driver.getWindowHandles()){
	   driver.switchTo().window(winHandle);
	}
	Thread.sleep(2000);
	List<WebElement> All_FHA_YesCheckboxes = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td[3]/input"));
	List<WebElement> All_FHA_Comments = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td[6]/input"));
	int YesCheckboxes_Counter=1;
	int NoCheckboxes_Counter=1;
	int FHA_Comments_Counter=1;
	int Remaining_Comments_Counter=1;
	
		for (WebElement AFY : All_FHA_YesCheckboxes) {
			if (YesCheckboxes_Counter <= 10) {
				HighlightElement(driver, AFY);
				AFY.click();
			} else {
				break;
			}
			YesCheckboxes_Counter++;
		}
		for (WebElement AFC : All_FHA_Comments) {
			if (FHA_Comments_Counter <= 10) {
				HighlightElement(driver, AFC);
				AFC.sendKeys("Test FHA Checklist");
			} else {
				break;
			}
			FHA_Comments_Counter++;
		}
		Scroll_Element(Add_FHA_Save);	
		HighlightElement(driver, Add_FHA_Save);
		Add_FHA_Save.click();
		Thread.sleep(12000);
		driver.close();
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(3000);
		HighlightElement(driver, Add_FHA_Checklist);
		Add_FHA_Checklist.click();
		Thread.sleep(4000);
		for(String winHandle : driver.getWindowHandles()){
			   driver.switchTo().window(winHandle);
			}
		Thread.sleep(2000);
		List<WebElement> All_FHA_NoCheckboxes = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td[4]/input"));
		for(WebElement AFN:All_FHA_NoCheckboxes){
			if(NoCheckboxes_Counter>10){
			HighlightElement(driver, AFN);	
			AFN.click();	
			}
		NoCheckboxes_Counter++;	
		}
		List<WebElement> Remaining_FHA_Comments = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td[6]/input"));
		for(WebElement RFC:Remaining_FHA_Comments){
			if(Remaining_Comments_Counter>10){
				HighlightElement(driver, RFC);	
				RFC.sendKeys("Test FHA Checklist");	
			}
		Remaining_Comments_Counter++;
		}
		Scroll_Element(FHA_Checklist_Put_File_in_Appendix);	
		HighlightElement(driver, FHA_Checklist_Put_File_in_Appendix);
		FHA_Checklist_Put_File_in_Appendix.click();
		Thread.sleep(8000);
		driver.switchTo().window(winHandleBefore);
		Open_Newly_Added_Appendix_Record(Current_Sections_Id_array.get(0));	
	
	}
	
	
	public void Add_User_Questionnaire() throws Exception{
	Open_Report_For_Questionnaire();	
	
	List<String> Current_Sections_Id_array=All_Documents(Add_User_Questionnaire);	 	
	winHandleBefore = driver.getWindowHandle();
	for(String winHandle : driver.getWindowHandles()){
	   driver.switchTo().window(winHandle);
	}
	Thread.sleep(2000);
	
	List<WebElement> All_Questionnaire_Comments = driver.findElements(By.xpath("//table/tbody/tr[2]/td/textarea"));
	List<WebElement> All_Questionnaire_NoCheckboxes = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td/table/tbody/tr[3]/td/input[2]"));
	int YesCheckboxes_Counter=1;
	int NoCheckboxes_Counter=1;
	int Questionnaire_Comments_Counter=1;
	int Remaining_Comments_Counter=1;
	
	HighlightElement(driver, Questionnaire_Respondent_Name);
	Questionnaire_Respondent_Name.sendKeys("Test Questionnaire Respondent Name");
	HighlightElement(driver, Questionnaire_Date_Icon);
	Questionnaire_Date_Icon.click();
	Thread.sleep(1000);
	HighlightElement(driver, Questionnaire_Date_15);
	Questionnaire_Date_15.click();
	Thread.sleep(2000);
	
	for (WebElement AQN : All_Questionnaire_NoCheckboxes) {
		if (NoCheckboxes_Counter <= 5) {
			HighlightElement(driver, AQN);
			AQN.click();
		} else {
			break;
		}
		NoCheckboxes_Counter++;
	}
	for (WebElement AFC : All_Questionnaire_Comments) {
		if (Questionnaire_Comments_Counter == 4) {
			HighlightElement(driver, AFC);
			AFC.sendKeys("Test User Questionnaire");
			break;
		} 
		Questionnaire_Comments_Counter++;
	}
	
	Scroll_Element(Questionnaire_Save);	
	HighlightElement(driver, Questionnaire_Save);
	Questionnaire_Save.click();
	Thread.sleep(15000);
	driver.close();
	driver.switchTo().window(winHandleBefore);
	Thread.sleep(3000);
	HighlightElement(driver, Add_User_Questionnaire);
	Add_User_Questionnaire.click();
	Thread.sleep(4000);
	for(String winHandle : driver.getWindowHandles()){
		   driver.switchTo().window(winHandle);
		}
	Thread.sleep(2000);
	List<WebElement> All_Questionnaire_YesCheckboxes = driver.findElements(By.xpath("html/body/center/form/table/tbody/tr/td/table/tbody/tr[2]/td/input[1]"));
	for(WebElement AQY:All_Questionnaire_YesCheckboxes){
		if(YesCheckboxes_Counter>1){
		HighlightElement(driver, AQY);	
		AQY.click();	
		}
		YesCheckboxes_Counter++;	
	}
	
	List<WebElement> Remaining_Questionnaire_Comments = driver.findElements(By.xpath("//table/tbody/tr[2]/td/textarea"));
	for(WebElement RQC:Remaining_Questionnaire_Comments){
		if(Remaining_Comments_Counter>5 && Remaining_Comments_Counter<10){
			HighlightElement(driver, RQC);	
			RQC.sendKeys("Test User Questionnaire");	
		}
	Remaining_Comments_Counter++;
	}
	Scroll_Element(Questionnaire_Checklist_Put_File_in_Appendix);	
	HighlightElement(driver, Questionnaire_Checklist_Put_File_in_Appendix);
	Questionnaire_Checklist_Put_File_in_Appendix.click();
	Thread.sleep(8000);
	driver.switchTo().window(winHandleBefore);
	Open_Newly_Added_Appendix_Record(Current_Sections_Id_array.get(0));	
	}
	
	public void Send_Questionnaire_Email() throws Exception{
	for(String winHandle : driver.getWindowHandles()){
		driver.switchTo().window(winHandle);
	}
	Thread.sleep(2000);	
	Scroll_Element(Add_User_Questionnaire);		
	Thread.sleep(4000);
	HighlightElement(driver, Send_Questionnaire_Email);
	Send_Questionnaire_Email.click();
	Thread.sleep(5000);
	for(String winHandle : driver.getWindowHandles()){
		   driver.switchTo().window(winHandle);
		}
	Thread.sleep(3000);
	
	Excel_Data excel= new Excel_Data("src\\Test_Data\\Appendices.xlsx");
	HighlightElement(driver, Questionnaire_To_Name);
	Questionnaire_To_Name.sendKeys(excel.Questionnaire_Email_To_Name("Send Questionnaire Email", 1, 0));
	Thread.sleep(3000);
	HighlightElement(driver, Questionnaire_To_Email);
	Questionnaire_To_Email.sendKeys(excel.Questionnaire_Email_To_Email("Send Questionnaire Email", 1, 1));
	Thread.sleep(3000);
	HighlightElement(driver, Questionnaire_Note);
	Questionnaire_Note.sendKeys(excel.Questionnaire_Email_Message("Send Questionnaire Email", 1, 2));
	Scroll_Element(Questionnaire_Send_Email_Button);	
	Thread.sleep(3000);
	HighlightElement(driver, Questionnaire_Send_Email_Button);
	Questionnaire_Send_Email_Button.click();
	Thread.sleep(10000);
	for(String winHandle : driver.getWindowHandles()){
		   driver.switchTo().window(winHandle);
		}
	driver.close();
	for(String winHandle : driver.getWindowHandles()){
		   driver.switchTo().window(winHandle);
		}
	Thread.sleep(2000);
	HighlightElement(driver, user_dropdown);
	user_dropdown.click();
	Thread.sleep(2000);
	HighlightElement(driver, logout_button);
	logout_button.click();
	Thread.sleep(8000);	

	}

}
