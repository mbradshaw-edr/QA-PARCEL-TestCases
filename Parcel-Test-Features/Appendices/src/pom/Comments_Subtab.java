package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Comments_Subtab {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id='Appendices-tab']/div/div[1]/div/div/div/ul/li[2]/a")
	WebElement Comments_SubTab;
	
	@FindBy(how=How.XPATH,using="//*[@id='s2id_autogen6']/a")
	WebElement Sections_Dropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentappendicescomments-tab']/div[1]/div[1]/div[2]/div")
	WebElement Refresh_Button;
	
	@FindBy(how=How.XPATH,using="//*[@id='s2id_autogen6']/a/span[1]")
	WebElement Section_Dropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentappendicescomments-tab']/div[1]/div[2]/div[2]/div/a[3]")
	WebElement Add_New_Comment;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentappendicescomments-tab']/div[1]/div[3]/div/div/textarea")
	WebElement Add_New_Comment_textarea;
	
	@FindBy(how=How.XPATH,using="//*[@id='Appendices-tab']/div/div[1]/div/div/div/ul/li[1]/a")
	WebElement Appendices_SubTab;
	
	@FindBy(how=How.XPATH,using="//*[@id='Appendices-tab']/div/div[1]/div/div/div/ul/li[2]/a")
	WebElement Comments_subtab;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentappendicescomments-tab']/div[1]/div[3]/div/div/div/input[1]")
	WebElement Save_Comment;
	
	@FindBy(how=How.XPATH,using="//*[@id='select2-drop']/ul/li[1]/div")
	WebElement Current_Section_Under_Dropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='select2-drop']/ul/li[3]/div")
	WebElement All_Section_Under_Dropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentappendicescomments-tab']/div[1]/div[2]/div[1]/div/a[1]")
	WebElement SelectAll_Comments_Checkboxes;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentappendicescomments-tab']/div[1]/div[1]/div[2]/div")
	WebElement Refresh_Comments;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentappendicescomments-tab']/div[1]/div[2]/div[2]/div/a[1]")
	WebElement OpenAll_Addressed_Comments;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentappendicescomments-tab']/div[1]/div[2]/div[2]/div/a[2]")
	WebElement CloseAll_Addressed_Comments;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentappendicescomments-tab']/div[1]/div[2]/div[1]/div/a[2]")
	WebElement Delete_Comments;
	
	public Comments_Subtab(WebDriver driver){
		this.driver = driver;	
	}	
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	}
	
	
	public void Highlight_SelectAll_Delete_OpenAll_CloseAll_AddNew() throws Exception{
	List<String> All_Comments_Options=new ArrayList<>();
	for(int D=1; D<=2; D++){
		
		if(D==1){
			for(int A=1; A<=2; A++){		
				WebElement element = driver.findElement(By.xpath("//*[@id='contentappendicescomments-tab']/div[1]/div[2]/div["+D+"]/div/a["+A+"]"));
				HighlightElement(driver, element);	
				Thread.sleep(2000);
				try{
					All_Comments_Options.add(element.getAttribute("name"));
				}catch (Exception e) {
			
				}
			}
		}
		if(D==2){
			for(int A=1; A<=3; A++){
				WebElement element = driver.findElement(By.xpath("//*[@id='contentappendicescomments-tab']/div[1]/div[2]/div["+D+"]/div/a["+A+"]/span"));
				HighlightElement(driver, element);	
				Thread.sleep(2000);
				All_Comments_Options.add(element.getText());
				}	
		}
	}	
	System.out.println("All Buttons Options under Comments subtab: "+All_Comments_Options);
	}
	
	public void Highlight_Section_Dropdown_Options() throws Exception{
		HighlightElement(driver, Section_Dropdown);
		Section_Dropdown.click();
		Thread.sleep(1000);
		List<WebElement> Dropdown_Options = driver.findElements(By.xpath("//*[@id='select2-drop']/ul/li/div"));
		List<String> Section_Dropdown_Options=new ArrayList<>();
		int counter=1;
		for(WebElement Option : Dropdown_Options){
			HighlightElement(driver, Option);
			Section_Dropdown_Options.add(Option.getText());
			Thread.sleep(1000);
			if(Dropdown_Options.size()==counter){
				Option.click();	
			}
			counter++;
		}
	
	System.out.println("Options present under Section Dropdown are: "+Section_Dropdown_Options);
	Thread.sleep(1000);
	}
	
	
	public void Check_Comments_Subtab() throws Exception{
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript("arguments[0].scrollIntoView(true);",Comments_SubTab);
		Thread.sleep(3000);
		HighlightElement(driver, Comments_SubTab);
		Comments_SubTab.click();
		Thread.sleep(5000);
		HighlightElement(driver, Sections_Dropdown);
		Thread.sleep(3000);
		HighlightElement(driver, Refresh_Button);
		System.out.println("Refresh Button title name: "+Refresh_Button.getAttribute("title"));
		Thread.sleep(3000);
		Highlight_SelectAll_Delete_OpenAll_CloseAll_AddNew();
		Highlight_Section_Dropdown_Options();
	}
	
	private void Add_New_Comment(String Current_Section) throws Exception{
		HighlightElement(driver, Add_New_Comment);	
		Add_New_Comment.click();
		Thread.sleep(3000);	
		HighlightElement(driver, Add_New_Comment_textarea);	
		Add_New_Comment_textarea.sendKeys(Current_Section);
		Thread.sleep(3000);
		HighlightElement(driver, Save_Comment);
		Save_Comment.click();
		Thread.sleep(4000);	
	}
	
	public void Add_Comments_And_Address() throws Exception{
	String Current_Section;	
	int Section_No=3;
	HighlightElement(driver, Appendices_SubTab);
	Appendices_SubTab.click();
	Thread.sleep(3000);
	List<WebElement> All_Sections = driver.findElements(By.xpath("//*[@id='sectionsList']/li/a"));
	for(WebElement A:All_Sections){	
	if(Section_No==3 || Section_No==4)	{
	Appendices_SubTab.click();
	Thread.sleep(2000);
	Current_Section=A.getText();
	HighlightElement(driver, A);	
	A.click();	
	Thread.sleep(3000);
	HighlightElement(driver, Comments_subtab);
	Comments_subtab.click();
	Thread.sleep(3000);
	HighlightElement(driver, Section_Dropdown);
	Section_Dropdown.click();
	Thread.sleep(1000);
	HighlightElement(driver, Current_Section_Under_Dropdown);	
	Current_Section_Under_Dropdown.click();
	Thread.sleep(1000);
	
	Add_New_Comment(Current_Section);
	Add_New_Comment(Current_Section);
	
	List<WebElement> All_Edit_Comments = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div["+Section_No+"]/div/div/input[2]"));
	
	for(WebElement EC:All_Edit_Comments){
		int Counter=1;
		try{
		if(EC.isDisplayed()){
			
			if(Counter==1){
			HighlightElement(driver, EC);	
			EC.click();
			Thread.sleep(3000);
			List<WebElement> All_Edit_Textarea = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div["+Section_No+"]/div/div/div[2]/textarea"));	
			for(WebElement ET:All_Edit_Textarea){
			try{	
			if(ET.isDisplayed()){
			HighlightElement(driver, ET);	
			ET.sendKeys(" Test ");	
			Thread.sleep(3000);
			
			List<WebElement> All_Edit_Save = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div["+Section_No+"]/div/div/div[2]/div/input[1]"));	
			for(WebElement ES:All_Edit_Save){
				try{
				if(ES.isDisplayed()){
					HighlightElement(driver, ES);	
					ES.click();
					Thread.sleep(4000);
												}
											} catch (Exception e) {

											}

										}

									}
								} catch (Exception e) {

								}

							}

							Counter++;
						}
					}

				} catch (Exception e) {

				}

			}
	
	List<WebElement> All_Address = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div["+Section_No+"]/div/div/input[3]"));	
	for(WebElement AA:All_Address){
		int Address_Counter=1;
		try{
		if(AA.isDisplayed()){
			
			if(Address_Counter==1){
				HighlightElement(driver, AA);	
				AA.click();
				Thread.sleep(3000);	
				List<WebElement> All_Address_Textarea = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div["+Section_No+"]/div/div/div[3]/div/textarea"));		
				for(WebElement AAT:All_Address_Textarea){
					try{	
						if(AAT.isDisplayed()){
						HighlightElement(driver, AAT);	
						AAT.sendKeys(Current_Section+" Test Address");	
						Thread.sleep(3000);
						List<WebElement> All_Address_Save = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div["+Section_No+"]/div/div/div[3]/div/div/input[1]"));	
						for(WebElement AAS:All_Address_Save){
							try{
							if(AAS.isDisplayed()){
								HighlightElement(driver, AAS);		
								AAS.click();
								Thread.sleep(4000);
													}
												} catch (Exception e) {

												}

											}

										}
									} catch (Exception e) {

									}

								}
								Address_Counter++;

							}

						}
					} catch (Exception e) {

					}

				}
				Section_No++;
			}

		}

	}

	public void Check_Section_Dropdown() throws Exception{
		Comments_subtab.click();
		HighlightElement(driver, Section_Dropdown);
		Section_Dropdown.click();
		Thread.sleep(1000);
		List<String> Section_Dropdown_Options_Array=new ArrayList<>();
		List<String> Current_Section=new ArrayList<>();
		List<String> Current_Section_Unaddressed_Comments=new ArrayList<>();
		List<String> All_Sections=new ArrayList<>();
		List<String> All_Sections_Unaddressed_Comments=new ArrayList<>();
		List<WebElement> Dropdown_Option = driver.findElements(By.xpath("//*[@id='select2-drop']/ul/li/div"));
		for(WebElement Option : Dropdown_Option){
			Section_Dropdown_Options_Array.add(Option.getText());
		
		}	
		
		for(int A=1; A<=Section_Dropdown_Options_Array.size(); A++){
			try{
			JavascriptExecutor JJ = (JavascriptExecutor) driver;
			JJ.executeScript("arguments[0].scrollIntoView(true);",Section_Dropdown);
			Thread.sleep(3000);
			HighlightElement(driver, Section_Dropdown);
			Section_Dropdown.click();
			Thread.sleep(1000);	
			}catch (Exception e) {
				
			}
		WebElement All_Dropdown_Options= driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li["+A+"]/div"));	
		
		if((All_Dropdown_Options.getText()).equalsIgnoreCase("Current Section")){
		All_Dropdown_Options.click();
		Thread.sleep(3000);
		List<WebElement> All_Sections_of_Left_Panel = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div/h5"));
		for(WebElement Section : All_Sections_of_Left_Panel){
		
			if(Section.isDisplayed()){
				
				Current_Section.add(Section.getText());	
				JavascriptExecutor JJ = (JavascriptExecutor) driver;
				JJ.executeScript("arguments[0].scrollIntoView(true);",Section);
				Thread.sleep(8000);

			}
		}
		System.out.println("Section displaying after select Current Section option: "+Current_Section);
		}
		else if((All_Dropdown_Options.getText()).equalsIgnoreCase("Current Section Unaddressed Comments")){	
			
			All_Dropdown_Options.click();
			Thread.sleep(3000);
			List<WebElement> All_Sections_of_Left_Panel = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div/h5"));
			for(WebElement Section : All_Sections_of_Left_Panel){
			
				if(Section.isDisplayed()){
					
					Current_Section_Unaddressed_Comments.add(Section.getText());	
					Current_Section.add(Section.getText());	
					JavascriptExecutor JE = (JavascriptExecutor) driver;
					JE.executeScript("arguments[0].scrollIntoView(true);",Section);
					Thread.sleep(8000);
				}
			}
			System.out.println("Section displaying after select Current Section Unaddressed Comments option: "+Current_Section_Unaddressed_Comments);
		}
		else if((All_Dropdown_Options.getText()).equalsIgnoreCase("All Sections")){	
			int Comment_Counter=1;
			All_Dropdown_Options.click();
			Thread.sleep(3000);
			List<WebElement> All_Sections_of_Left_Panel = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div/h5"));
			for(WebElement Section : All_Sections_of_Left_Panel){
			
				if(Section.isDisplayed()){
					
					All_Sections.add(Section.getText());
					if(Comment_Counter==2 || Comment_Counter==3){
						JavascriptExecutor JJ = (JavascriptExecutor) driver;
						JJ.executeScript("arguments[0].scrollIntoView(true);",Section);	
						Thread.sleep(8000);	
						
					}
				}
			Comment_Counter++;	
			}
			System.out.println("Section displaying after select All Sections option: "+All_Sections);
		}
		else if((All_Dropdown_Options.getText()).equalsIgnoreCase("All Sections Unaddressed Comments")){	
			int Counter=1;
			All_Dropdown_Options.click();
			Thread.sleep(3000);
			List<WebElement> All_Sections_of_Left_Panel = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div/h5"));
			for(WebElement Section : All_Sections_of_Left_Panel){
			
				if(Section.isDisplayed()){
					
					All_Sections_Unaddressed_Comments.add(Section.getText());
					All_Sections.add(Section.getText());
					if(Counter==2 || Counter==3){
						JavascriptExecutor JJ = (JavascriptExecutor) driver;
						JJ.executeScript("arguments[0].scrollIntoView(true);",Section);	
						Thread.sleep(8000);	
						
					}
				}
			Counter++;
			}
			System.out.println("Section displaying after select All Sections Unaddressed Comments option: "+All_Sections_Unaddressed_Comments);
			JavascriptExecutor JJ = (JavascriptExecutor) driver;
			JJ.executeScript("arguments[0].scrollIntoView(true);",Section_Dropdown);
			Thread.sleep(3000);
			}

		}

	}
	
	private void Check_Checkboxes() throws Exception{
		List<WebElement> All_Checkboxes = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div/div/div/input[1]"));
		for(WebElement AC:All_Checkboxes){
		JavascriptExecutor JJ = (JavascriptExecutor) driver;
		JJ.executeScript("arguments[0].scrollIntoView(true);",AC);	
		Thread.sleep(1000);
		HighlightElement(driver, AC);	
		AC.click();
		Thread.sleep(2000);
		}	
		
	}
	
	private void Scroll_Checkboxes() throws Exception{
		List<WebElement> All_Checkboxes = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div/div/div/input[1]"));
		for(WebElement SC:All_Checkboxes){
			JavascriptExecutor JS = (JavascriptExecutor) driver;
			JS.executeScript("arguments[0].scrollIntoView(true);",SC);
			Thread.sleep(2000);
		}	
		
	}
	
	public void Checkboxes_Functionality() throws Exception{
	JavascriptExecutor JC = (JavascriptExecutor) driver;
	JC.executeScript("arguments[0].scrollIntoView(true);",Comments_subtab);
	Thread.sleep(2000);
	Comments_subtab.click();
	HighlightElement(driver, Section_Dropdown);
	Section_Dropdown.click();
	Thread.sleep(1000);
	HighlightElement(driver, All_Section_Under_Dropdown);	
	All_Section_Under_Dropdown.click();
	Thread.sleep(4000);
	Check_Checkboxes();
	Thread.sleep(3000);
	Check_Checkboxes();
	Thread.sleep(3000);
	HighlightElement(driver, SelectAll_Comments_Checkboxes);	
	SelectAll_Comments_Checkboxes.click();
	Thread.sleep(3000);
	Scroll_Checkboxes();
	Thread.sleep(2000);
	HighlightElement(driver, SelectAll_Comments_Checkboxes);	
	SelectAll_Comments_Checkboxes.click();
	Thread.sleep(3000);
	Scroll_Checkboxes();
	Thread.sleep(2000);
	}
	
	public void Refresh_OpenAll_CloseAll_Delete_Functionality() throws Exception{
	JavascriptExecutor JR = (JavascriptExecutor) driver;
	JR.executeScript("arguments[0].scrollIntoView(true);",Refresh_Comments);	
	Thread.sleep(3000);	
	HighlightElement(driver, Refresh_Comments);	
	Refresh_Comments.click();	
	Thread.sleep(5000);	
	HighlightElement(driver, OpenAll_Addressed_Comments);	
	OpenAll_Addressed_Comments.click();
	Thread.sleep(3000);	
	Scroll_Checkboxes();
	Thread.sleep(3000);	
	HighlightElement(driver, CloseAll_Addressed_Comments);	
	CloseAll_Addressed_Comments.click();
	Thread.sleep(3000);	
	Scroll_Checkboxes();
	Thread.sleep(3000);	
	HighlightElement(driver, Delete_Comments);	
	
	JavascriptExecutor JA = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div[3]/h5"));
	JA.executeScript("arguments[0].scrollIntoView(true);",element);
	
	List<WebElement> All_Checkboxes = driver.findElements(By.xpath("//*[@id='contentappendicescomments-tab']/div[2]/div/div/div/input[1]"));
	int Count_Checkboxes=1;
	for(WebElement AC:All_Checkboxes){
		if(Count_Checkboxes==1 || Count_Checkboxes==2){
		HighlightElement(driver, AC);
		AC.click();
		Thread.sleep(2000);
		}
		if(Count_Checkboxes==2){
			JavascriptExecutor JD = (JavascriptExecutor) driver;
			JD.executeScript("arguments[0].scrollIntoView(true);",Comments_subtab);	
		break;	
		}
		Count_Checkboxes++;
	}
	Thread.sleep(2000);
	HighlightElement(driver, Delete_Comments);	
	Delete_Comments.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	JavascriptExecutor jc = (JavascriptExecutor) driver;
	jc.executeScript("arguments[0].scrollIntoView(true);",Comments_SubTab);
	Thread.sleep(2000);
	HighlightElement(driver, Appendices_SubTab);
	Appendices_SubTab.click();

	}

}
