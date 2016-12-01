package pom;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Appendices_Subtab {
	
	WebDriver driver;
	String Selected_Dropdown_Option="";
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[3]/a")
	WebElement Home_tab;
	 
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/div[4]/ul/li[1]/a")
	WebElement classic_Home_tab;
	
	@FindBy(how=How.XPATH,using="//*[@id='header-nav']/li[2]/form/input[1]")
	WebElement Search_SiteId;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[3]/a")
	WebElement Appendices_Tab;
	
	@FindBy(how=How.XPATH,using="//*[@id='Appendices-tab']/div/div[1]/div/div/div/ul/li[1]/a")
	WebElement Appendices_SubTab;
	
	@FindBy(how=How.XPATH,using="//*[@id='Appendices-tab']/div/div[1]/div/div/div/ul/li[2]/a")
	WebElement Comments_SubTab;
	
	@FindBy(how=How.ID,using="allAppendices")
	WebElement AllAppendices_Section_Link;
	
	@FindBy(how=How.ID,using="drawingTools")
	WebElement DrawingTools_Section_Link;
	
	@FindBy(how=How.XPATH,using="//*[@id='divPhotoButtons']/div[1]/input[1]")
	WebElement Edit_All_Button;
	
	@FindBy(how=How.XPATH,using="//*[@id='divPhotoButtons']/div[1]/input[2]")
	WebElement Include_All_Button;
	
	@FindBy(how=How.XPATH,using="//*[@id='divPhotoButtons']/div[1]/input[3]")
	WebElement Exclude_All_Button;
	
	@FindBy(how=How.XPATH,using="//*[@id='divPhotoButtons']/div[1]/input[4]")
	WebElement Delete_All_Button;
	
	@FindBy(how=How.XPATH,using="//*[@id='butZoomToggleAll']")
	WebElement ZoomIn_All_ToggleButton;
	
	@FindBy(how=How.XPATH,using="//*[@id='divUpdateCaptions']/div/input[1]")
	WebElement EditAll_Save_Button;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[5]/a")
	WebElement Assemble_Tab;
	
	@FindBy(how=How.XPATH,using="//*[@id='deliverableForm']/div[1]/div[2]/div[1]/label")
	WebElement Assemble_Tab_Check_All;
	
	@FindBy(how=How.XPATH,using="//*[@id='submitDownloadDeliverable']")
	WebElement Assemble_Tab_Download_PDF;
	
	
	
	public Appendices_Subtab(WebDriver driver){
		this.driver = driver;	
	}	
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	}
	
	
	public void Search_SiteId(int row, int column) throws IOException, Exception{
		
		Excel_Data excel= new Excel_Data(0, "src\\Test_Data\\Appendices.xlsx");
		String Excel_SiteId="";
		for(int e=1; e<=excel.rowcount1; e++){
			Excel_SiteId=excel.Site_Id(row, column);
		}	
		HighlightElement(driver, Search_SiteId);
		Search_SiteId.clear();
		Search_SiteId.sendKeys(Excel_SiteId);
		Search_SiteId.sendKeys(Keys.ENTER);
		Thread.sleep(10000);	
	}
	
	public void Print_AllSections() throws Exception{
		List<WebElement> All_Sections = driver.findElements(By.xpath("//*[@id='sectionsList']/li/a"));
		List<String> All_Sections_array=new ArrayList<>();
		List<String> All_Sections_ID_Onpanel_array=new ArrayList<>();
		List<String> All_Sections_Names_Onpanel_array=new ArrayList<>();
		String Section_Id="";
		for(WebElement A:All_Sections){			
			All_Sections_array.add(A.getText());
		
		Section_Id=A.getAttribute("data-section-id");
		HighlightElement(driver, A);
		A.click();
		Thread.sleep(5000);	
		try{
		WebElement Section_Name_On_Panel= driver.findElement(By.xpath("//*[@id='appendixTitle"+Section_Id+"']"));
		HighlightElement(driver, Section_Name_On_Panel);
		
		All_Sections_ID_Onpanel_array.add(Section_Name_On_Panel.getAttribute("id"));
		}catch (Exception e) {
			
		}
			
		if(A.getAttribute("id").equalsIgnoreCase(AllAppendices_Section_Link.getAttribute("id"))){
			for(int i=0; i<All_Sections_ID_Onpanel_array.size(); i++){
				WebElement Section_Name_OnPanel= driver.findElement(By.id(""+All_Sections_ID_Onpanel_array.get(i)+""));
				All_Sections_Names_Onpanel_array.add(Section_Name_OnPanel.getText());
				JavascriptExecutor je = (JavascriptExecutor) driver;
				WebElement element = driver.findElement(By.id(""+All_Sections_ID_Onpanel_array.get(i)+""));
				je.executeScript("arguments[0].scrollIntoView(true);",element);
				Thread.sleep(5000);
				HighlightElement(driver, Section_Name_OnPanel);
			}
		}
		if(A.getAttribute("id").equalsIgnoreCase(DrawingTools_Section_Link.getAttribute("id"))){
			String winHandleBefore = driver.getWindowHandle();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			Thread.sleep(8000);
			driver.close();
			driver.switchTo().window(winHandleBefore);
			Thread.sleep(3000);
		}
		}
		System.out.println("All Appendices Links are displaying under Appendices Subtab are :"+All_Sections_array);
		System.out.println("After click on All Appendices Link then all sections display on panel are:"+All_Sections_Names_Onpanel_array);
		Thread.sleep(5000);	
	}
	
	public void Print_All_Legends() throws Exception{
	List<String> All_Legends_Array=new ArrayList<>();
	
		for(int R=1; R<=2; R++){
			
			for(int C=2; C<=5; C++){		
			WebElement All_Legends= driver.findElement(By.xpath("//*[@id='contentappendicesmenu-tab']/div[1]/div/div/table/tbody/tr["+R+"]/td["+C+"]/span"));	
			HighlightElement(driver, All_Legends);
			All_Legends_Array.add(All_Legends.getText());
			}
		}	
	System.out.println("All Legends Present in Appendices Sub Tab: "+All_Legends_Array);
	Thread.sleep(5000);
		
	}
	
	public void Check_Appendices_Tab() throws Exception{
		Thread.sleep(8000);	
		Search_SiteId(1,0);	
		HighlightElement(driver, Appendices_Tab);
		Appendices_Tab.click();
		Thread.sleep(8000);	
		HighlightElement(driver, Appendices_SubTab);
		HighlightElement(driver, Comments_SubTab);
		System.out.println("Sub Tabs under Appendices tab: "+Appendices_SubTab.getText()+" and "+Comments_SubTab.getText());
		Print_AllSections();
		Print_All_Legends();
	}
	
	
	public void Add_Image() throws Exception{
		List<WebElement> All_Sections = driver.findElements(By.xpath("//*[@id='sectionsList']/li/a"));
		List<String> All_Sections_Id_array=new ArrayList<>();
		WebElement View_Photo_PDF= driver.findElement(By.xpath("//*[@id='photoPDFLinks']/a[1]"));	
		
		for(WebElement A:All_Sections){	
			
			
			if((A.getText()).contains("Photo")){
			
			HighlightElement(driver, A);
			A.click();
			Thread.sleep(8000);
			
			if(View_Photo_PDF.isEnabled()){
				
			System.out.println("Section Name: "+A.getText());
			All_Sections_Id_array.add(A.getAttribute("data-section-id"));
			WebElement Add_Files= driver.findElement(By.xpath("//*[@id='appendixUploadForm"+All_Sections_Id_array.get(0)+"_browse']/span[2]"));	
			
			JavascriptExecutor JJ = (JavascriptExecutor) driver;
			JJ.executeScript("arguments[0].scrollIntoView(true);",Add_Files);
			
			HighlightElement(driver, Add_Files);
			Add_Files.click();
			Thread.sleep(3000);
			Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
			String browserName = cap.getBrowserName().toLowerCase();
			
		    if(browserName.equals("chrome")){		
			Runtime.getRuntime().exec("src\\Test_Data\\JPG Image Upload for Chrome.exe");
			Thread.sleep(15000);
			HighlightElement(driver, Add_Files);
			Add_Files.click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("src\\Test_Data\\JPG1 Image Upload for Chrome.exe");
			Thread.sleep(15000);
			HighlightElement(driver, Add_Files);
			Add_Files.click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("src\\Test_Data\\JPG2 Image Upload for Chrome.exe");
			Thread.sleep(20000);
			HighlightElement(driver, Add_Files);
			Add_Files.click();
			Runtime.getRuntime().exec("src\\Test_Data\\PNG Image Upload for Chrome.exe");
		    }
		    else if(browserName.equals("internet explorer")){
		    	Runtime.getRuntime().exec("src\\Test_Data\\JPG Image Upload for IE.exe");
		    	Thread.sleep(15000);
				HighlightElement(driver, Add_Files);
				Add_Files.click();
				Thread.sleep(3000);
		    	Runtime.getRuntime().exec("src\\Test_Data\\JPG1 Image Upload for IE.exe");
		    	Thread.sleep(15000);
				HighlightElement(driver, Add_Files);
				Add_Files.click();
				Thread.sleep(3000);
		    	Runtime.getRuntime().exec("src\\Test_Data\\JPG2 Image Upload for IE.exe");
		    	Thread.sleep(20000);
				HighlightElement(driver, Add_Files);
				Add_Files.click();
				Runtime.getRuntime().exec("src\\Test_Data\\PNG Image Upload for IE.exe");	
		    }
		    else{
		    	Runtime.getRuntime().exec("src\\Test_Data\\JPG Image Upload for firefox.exe");
		    	Thread.sleep(15000);
				HighlightElement(driver, Add_Files);
				Add_Files.click();
				Thread.sleep(3000);
		    	Runtime.getRuntime().exec("src\\Test_Data\\JPG1 Image Upload for firefox.exe");
		    	Thread.sleep(15000);
				HighlightElement(driver, Add_Files);
				Add_Files.click();
				Thread.sleep(3000);
		    	Runtime.getRuntime().exec("src\\Test_Data\\JPG2 Image Upload for firefox.exe");
		    	Thread.sleep(20000);
				HighlightElement(driver, Add_Files);
				Add_Files.click();
				Runtime.getRuntime().exec("src\\Test_Data\\PNG Image Upload for Firefox.exe");		
		    }
			Thread.sleep(15000);
			JavascriptExecutor JE = (JavascriptExecutor) driver;
			WebElement Included_Photos = driver.findElement(By.id("includedPhotos"));	
			JE.executeScript("arguments[0].scrollIntoView(true);",Included_Photos);
			break;
			}
			}
		}
	}
	
	public void Drag_And_Drop_Image() throws Exception{
		List<WebElement> All_Included_Images = driver.findElements(By.xpath("//*[@id='includedPhotos']/div/div"));
		List<String> All_Included_Images_array=new ArrayList<>();
		
		for(WebElement D:All_Included_Images){
			
		All_Included_Images_array.add(D.getAttribute("id"));
		}
		
		for(int i=1; i<=All_Included_Images_array.size(); i++){
		int All_Included_Images_array_Size=All_Included_Images_array.size();
			
		if(i==1){
			WebElement Sourcelocator = driver.findElement(By.id(""+All_Included_Images_array.get(0)+""));
			WebElement Destinationlocator = driver.findElement(By.id(""+All_Included_Images_array.get(All_Included_Images_array_Size-1)+""));
			HighlightElement(driver, Sourcelocator);
			HighlightElement(driver, Destinationlocator);
			Actions drag = new Actions(driver);
			drag.dragAndDrop(Sourcelocator,Destinationlocator).perform();
			Thread.sleep(10000);
		}	

		if(i==All_Included_Images_array_Size){
			WebElement Sourcelocator = driver.findElement(By.id(""+All_Included_Images_array.get(All_Included_Images_array_Size-1)+""));
			WebElement Destinationlocator = driver.findElement(By.id(""+All_Included_Images_array.get(0)+""));
			HighlightElement(driver, Sourcelocator);
			HighlightElement(driver, Destinationlocator);
			Actions drag = new Actions(driver);
			drag.dragAndDrop(Sourcelocator,Destinationlocator).perform();
			Thread.sleep(10000);
		}
			
		}
		
	}
	
	public void View_Image() throws InterruptedException{
		Thread.sleep(5000);	
		for(int i=1; i<=2; i++){
			Thread.sleep(5000);	
			WebElement View_Image= driver.findElement(By.xpath("//*[@id='photoPDFLinks']/a["+i+"]"));
			
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);",View_Image);
			
			Thread.sleep(3000);	
			HighlightElement(driver, View_Image);
			View_Image.click();
			Thread.sleep(15000);
			String winHandleBefore = driver.getWindowHandle();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			driver.close();
			driver.switchTo().window(winHandleBefore);
			Thread.sleep(5000);
		}
	}
	
	public void Edit_All_Option() throws Exception{
		HighlightElement(driver, Include_All_Button);
		Include_All_Button.click();
		Thread.sleep(5000);	
		//alert handling
		driver.switchTo().alert().accept();
		HighlightElement(driver, Edit_All_Button);
		Edit_All_Button.click();
		Thread.sleep(3000);		
		List<WebElement> All_Included_Images = driver.findElements(By.xpath("//*[@id='includedPhotos']/div/div"));
		int Counter=1;
		String Image_Id;
		String Image_Id_No;
		for(WebElement I:All_Included_Images){
		
			if(Counter==1){
			Image_Id=I.getAttribute("id");
			Image_Id_No=Image_Id.substring(9);
			
			WebElement Edit_Captionbox= driver.findElement(By.xpath("//*[@id='divEditCaption"+Image_Id_No+"']"));	
			HighlightElement(driver, Edit_Captionbox);
			Edit_Captionbox.click();
			Thread.sleep(3000);	
			
			WebElement Edit_Caption= driver.findElement(By.id("captionBox_"+Image_Id_No+""));	
			System.out.println("textarea: "+Edit_Caption.getText());
			System.out.println("textarea id: "+Edit_Caption.getAttribute("id"));
			HighlightElement(driver, Edit_Caption);
			Edit_Caption.sendKeys("Test");
			Thread.sleep(8000);	
			HighlightElement(driver, EditAll_Save_Button);
			EditAll_Save_Button.click();
			Thread.sleep(8000);	
			
			WebElement Rotate_Left_Image= driver.findElement(By.id("divRotLeft"+Image_Id_No+""));
			WebElement Rotate_Right_Image= driver.findElement(By.id("divRotRight"+Image_Id_No+""));
			WebElement Zoom_In_Image= driver.findElement(By.id("divMagViewPhoto"+Image_Id_No+""));
			WebElement Zoom_Out_Image= driver.findElement(By.id("divMinViewPhoto"+Image_Id_No+""));
			WebElement Exclude_Image= driver.findElement(By.id("divExcludeBox"+Image_Id_No+""));
			WebElement Include_Image= driver.findElement(By.id("divIncludeBox"+Image_Id_No+""));
			WebElement Delete_Image= driver.findElement(By.id("divDeletePhoto"+Image_Id_No+""));
			
			
			Rotate_Left_Image.click();
			Thread.sleep(8000);	
			
			Rotate_Right_Image.click();
			Thread.sleep(8000);	
			
			Zoom_In_Image.click();
			Thread.sleep(8000);	
			
			Zoom_Out_Image.click();
			Thread.sleep(8000);	
			
			Exclude_Image.click();
			Thread.sleep(5000);	
			
			JavascriptExecutor JI = (JavascriptExecutor) driver;
			WebElement Excluded_Photos = driver.findElement(By.id("excludedPhotos"));	
			JI.executeScript("arguments[0].scrollIntoView(true);",Excluded_Photos);
			Thread.sleep(5000);
			
			Include_Image.click();
			Thread.sleep(5000);	
			
			JavascriptExecutor JP = (JavascriptExecutor) driver;
			WebElement Included_Photos = driver.findElement(By.id("includedPhotos"));	
			JP.executeScript("arguments[0].scrollIntoView(true);",Included_Photos);
			Thread.sleep(5000);
			
			Delete_Image.click();
			Thread.sleep(5000);	
			driver.switchTo().alert().accept();
			Thread.sleep(3000);	
			}
		Counter++;	
		}
		}
	
	
	public void Include_Exclude_Zoom_Delete_Options() throws Exception{
		
		HighlightElement(driver, Exclude_All_Button);
		Exclude_All_Button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);	
		HighlightElement(driver, Include_All_Button);
		Include_All_Button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);	
		HighlightElement(driver, ZoomIn_All_ToggleButton);
		ZoomIn_All_ToggleButton.click();
		WebElement excludedPhotos_Heading= driver.findElement(By.id("excludedPhotos"));
		Thread.sleep(5000);	
		
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("arguments[0].scrollIntoView(true);",excludedPhotos_Heading);
		Thread.sleep(3000);
		
		JavascriptExecutor JV = (JavascriptExecutor) driver;
		JV.executeScript("arguments[0].scrollIntoView(true);",ZoomIn_All_ToggleButton);
		Thread.sleep(3000);
		
		HighlightElement(driver, ZoomIn_All_ToggleButton);
		ZoomIn_All_ToggleButton.click();
		Thread.sleep(10000);
		HighlightElement(driver, Delete_All_Button);
		Delete_All_Button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);		
	}
	
	public void Check_Upload_PDF() throws Exception{
		List<WebElement> All_Sections = driver.findElements(By.xpath("//*[@id='sectionsList']/li/a"));
		List<String> All_Sections_Id_array=new ArrayList<>();
		WebElement View_Photo_PDF= driver.findElement(By.xpath("//*[@id='photoPDFLinks']/a[1]"));	
		
		for(WebElement A:All_Sections){	
			
			
			if((A.getText()).contains("Photo")){
			
			HighlightElement(driver, A);
			A.click();
			Thread.sleep(8000);
			
			if(View_Photo_PDF.isEnabled()){
				System.out.println("Section Name: "+A.getText());
				All_Sections_Id_array.add(A.getAttribute("data-section-id"));
				WebElement Add_Files= driver.findElement(By.xpath("//*[@id='appendixUploadForm"+All_Sections_Id_array.get(0)+"_browse']/span[2]"));	
				
				JavascriptExecutor JJ = (JavascriptExecutor) driver;
				JJ.executeScript("arguments[0].scrollIntoView(true);",Add_Files);
				
				HighlightElement(driver, Add_Files);
				Add_Files.click();
				Thread.sleep(3000);
				Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
				String browserName = cap.getBrowserName().toLowerCase();
				  if(browserName.equals("chrome")){		
						Runtime.getRuntime().exec("src\\Test_Data\\PDF Upload for Chrome.exe");
						Thread.sleep(15000);
				  }
				  else if(browserName.equals("internet explorer")){	
						Runtime.getRuntime().exec("src\\Test_Data\\PDF Upload for IE.exe");
						Thread.sleep(15000);
				  }
				  else{		
						Runtime.getRuntime().exec("src\\Test_Data\\PDF Upload for firefox.exe");
						Thread.sleep(15000);
				  }
					
					
					JavascriptExecutor JO = (JavascriptExecutor) driver;
					WebElement Other_Uploaded_Files = driver.findElement(By.xpath("//*[@id='divSectionPhotos"+All_Sections_Id_array.get(0)+"']/h5"));	
					JO.executeScript("arguments[0].scrollIntoView(true);",Other_Uploaded_Files);
					Thread.sleep(5000);
					HighlightElement(driver, Assemble_Tab);
					Assemble_Tab.click();
					Thread.sleep(10000);	
					HighlightElement(driver, Assemble_Tab_Check_All);
					Assemble_Tab_Check_All.click();
					Thread.sleep(5000);
					HighlightElement(driver, Assemble_Tab_Download_PDF);
					Assemble_Tab_Download_PDF.click();
					Thread.sleep(15000);
					HighlightElement(driver, Appendices_Tab);
					Appendices_Tab.click();
					Thread.sleep(8000);
					JO.executeScript("arguments[0].scrollIntoView(true);",Other_Uploaded_Files);
					Thread.sleep(5000);
					
				/*	Following try code for to check uploaded pdf is present under downloaded report or not. But this
					code have limitations in which we need to manually upload pdf first in appendices section and download
					report, after that report path need to put into appendices excel. Then delete uploaded pdf under appendices
					section and run the test after that Report will be print on console panel of eclipse.*/
					
					try {
						Excel_Data excel= new Excel_Data(2, "src\\Test_Data\\Appendices.xlsx");
						String Downloaded_PDF="";
						for(int e=1; e<=excel.rowcount3; e++){
							Downloaded_PDF=excel.Open_Downloaded_PDF(1, 0);
						}
						
					PDDocument pd= PDDocument.load(new File(""+Downloaded_PDF+""));
					System.out.println("Total Pages of PDF: "+pd.getNumberOfPages());
					PDFTextStripper pdf= new PDFTextStripper();
					System.out.println("Search included PDF into Photograph Appendix section: \n"+pdf.getText(pd));
					}catch (Exception e) {
					
					}
					
					List<WebElement> All_Uploaded_PDF = driver.findElements(By.xpath("//*[@id='appendicesFilesTable"+All_Sections_Id_array.get(0)+"']/tbody/tr/td/a[@class='pdf']"));
					int Counter=1;
					for(WebElement PDF:All_Uploaded_PDF){	
					
					if(Counter==1){
						
					JavascriptExecutor JZ = (JavascriptExecutor) driver;
					JZ.executeScript("arguments[0].scrollIntoView(true);",PDF);
					Thread.sleep(5000);
						
					WebElement Rename_PDF_File= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+All_Sections_Id_array.get(0)+"']/tbody/tr[2]/td[5]/a[2]"));		
					HighlightElement(driver, Rename_PDF_File);
					Rename_PDF_File.click();
					Thread.sleep(5000);
					
					WebElement Change_PDF_File_Name= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+All_Sections_Id_array.get(0)+"']/tbody/tr[3]/td/form/input[1]"));
					WebElement Go_Button= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+All_Sections_Id_array.get(0)+"']/tbody/tr[3]/td/form/input[5 and @type='button' and @value='Go']"));
					
					
					HighlightElement(driver, Change_PDF_File_Name);
					Change_PDF_File_Name.sendKeys("Test");
					Thread.sleep(5000);
					HighlightElement(driver, Go_Button);
					Change_PDF_File_Name.click();
					Go_Button.click();

					
					Thread.sleep(3000);
					driver.switchTo().alert().accept();
					Thread.sleep(3000);
					WebElement RenamePDF_File= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+All_Sections_Id_array.get(0)+"']/tbody/tr[2]/td[5]/a[2]"));		
					HighlightElement(driver, RenamePDF_File);
					RenamePDF_File.click();
					Thread.sleep(5000);
					WebElement Move_Dropdown= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+All_Sections_Id_array.get(0)+"']/tbody/tr[3]/td/form/select"));
					WebElement GoButton= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+All_Sections_Id_array.get(0)+"']/tbody/tr[3]/td/form/input[5 and @type='button' and @value='Go']"));
					WebElement Change_PDFFile_Name= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+All_Sections_Id_array.get(0)+"']/tbody/tr[3]/td/form/input[1]"));
					HighlightElement(driver, Move_Dropdown);
					Select MoveDropdown = new Select(Move_Dropdown);
					MoveDropdown.selectByIndex(2);
					
					Selected_Dropdown_Option=Move_Dropdown.getAttribute("value");
					HighlightElement(driver, GoButton);
					Change_PDFFile_Name.click();
					GoButton.click();
					Thread.sleep(3000);
					driver.switchTo().alert().accept();
					Thread.sleep(3000);
					List<WebElement> AllSections = driver.findElements(By.xpath("//*[@id='sectionsList']/li/a"));
					for(WebElement B:AllSections){
					
					if((B.getAttribute("data-section-id")).equals(Selected_Dropdown_Option)){
						HighlightElement(driver, B);
						B.click();
						Thread.sleep(5000);
						
						List<WebElement> All_PDF = driver.findElements(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr/td/a[@class='pdf']"));
						int counter=1;
						for(WebElement allPDF:All_PDF){	
							if(counter==1){
								
								JavascriptExecutor JF = (JavascriptExecutor) driver;
								JF.executeScript("arguments[0].scrollIntoView(true);",allPDF);
								Thread.sleep(5000);
									
								
								WebElement Rename_PDFFile= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[2]/td[5]/a[2]"));		
								HighlightElement(driver, Rename_PDFFile);
								Rename_PDFFile.click();
								Thread.sleep(5000);	
								WebElement Moveto_Dropdown= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[3]/td/form/select"));
								WebElement ChangePDFFile_Name= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[3]/td/form/input[1]"));
								WebElement go_button= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[3]/td/form/input[5 and @type='button' and @value='Go']"));
								HighlightElement(driver, Moveto_Dropdown);
								Select MovetoDropdown = new Select(Moveto_Dropdown);
								MovetoDropdown.selectByIndex(1);
								
								Selected_Dropdown_Option=Moveto_Dropdown.getAttribute("value");
								HighlightElement(driver, go_button);
								ChangePDFFile_Name.click();
								go_button.click();
								Thread.sleep(3000);
								driver.switchTo().alert().accept();
								Thread.sleep(3000);
								
								List<WebElement> allsections = driver.findElements(By.xpath("//*[@id='sectionsList']/li/a"));
								for(WebElement C:allsections){
																							
								if((C.getAttribute("data-section-id")).equals(Selected_Dropdown_Option)){
									HighlightElement(driver, C);
									C.click();
									Thread.sleep(5000);
								break;
								}
							}
						break;
						}	
						counter++;
					  }	
					break;	
					}	
				  }
				break;	
				}
			Counter++;	
			}
		break;
		  }	
		break;
		}
	  }
	}
	
	public void Check_PDF_Exclude_Include_Sort_Delete() throws Exception{
		
		WebElement Add_Another_File= driver.findElement(By.xpath("//*[@id='appendixUploadForm"+Selected_Dropdown_Option+"_browse']/span[2]"));	
		
		JavascriptExecutor JA = (JavascriptExecutor) driver;
		JA.executeScript("arguments[0].scrollIntoView(true);",Add_Another_File);
		
		HighlightElement(driver, Add_Another_File);
		Add_Another_File.click();
		Thread.sleep(3000);
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		  if(browserName.equals("chrome")){		
				Runtime.getRuntime().exec("src\\Test_Data\\PDF Upload for Chrome.exe");
				Thread.sleep(15000);
		  }
		  else if(browserName.equals("internet explorer")){	
				Runtime.getRuntime().exec("src\\Test_Data\\PDF Upload for IE.exe");
				Thread.sleep(15000);
		  }
		  else{		
				Runtime.getRuntime().exec("src\\Test_Data\\PDF Upload for firefox.exe");
				Thread.sleep(15000);
		  }
			
		List<WebElement> All_PDFS = driver.findElements(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr/td/a[@class='pdf']"));
		
		JavascriptExecutor JX = (JavascriptExecutor) driver;
		JX.executeScript("arguments[0].scrollIntoView(true);",Add_Another_File);
		
		int COUNTER=1;
		for(WebElement allPDFs:All_PDFS){	
			if(COUNTER==1){
				
				JavascriptExecutor JF = (JavascriptExecutor) driver;
				JF.executeScript("arguments[0].scrollIntoView(true);",allPDFs);
				Thread.sleep(5000);	
				WebElement Exclude_File= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[2]/td[5]/a[3]"));			
				HighlightElement(driver, Exclude_File);
				Exclude_File.click();
				Thread.sleep(8000);
				WebElement Include_File= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[2]/td[5]/a[4]"));			
				HighlightElement(driver, Include_File);
				Include_File.click();
				Thread.sleep(8000);
				WebElement Move_Down= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[2]/td[5]/a[7]"));
				
				HighlightElement(driver, Move_Down);
				Move_Down.click();
				Thread.sleep(8000);
				WebElement Move_Up= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[5]/td[5]/a[6]"));
				
				HighlightElement(driver, Move_Up);
				Move_Up.click();
				Thread.sleep(8000);
				WebElement Move_Tobottom= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[2]/td[5]/a[8]"));
				
				HighlightElement(driver, Move_Tobottom);
				Move_Tobottom.click();
				Thread.sleep(8000);
				WebElement Move_Totop= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[5]/td[5]/a[5]"));
				
				HighlightElement(driver, Move_Totop);
				Move_Totop.click();
				Thread.sleep(8000);
				
				WebElement Delete_PDF= driver.findElement(By.xpath("//*[@id='appendicesFilesTable"+Selected_Dropdown_Option+"']/tbody/tr[2]/td[5]/a[1]"));
				HighlightElement(driver, Delete_PDF);
				Delete_PDF.click();
				Thread.sleep(5000);
				driver.switchTo().alert().accept();
				Thread.sleep(5000);
			}
	  COUNTER++;	
	  }
	
	}
}
