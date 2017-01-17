package testCase_projectDashB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_editProjectInformationLink_withSaveAndCancelButton_TC02 {
	
	By EditProjectLink_underProjectDashboard=By.xpath(".//*[@id='divViewProjectInfo']/table/tbody/tr/td/h4/a");
	By GeneralXpathForFieldLebles_underEditInfoLink=By.xpath(".//*[@id='formProjectInfo']/table/tbody/tr/th");
	By GeneralXpathForButtons=By.xpath(".//*[@id='formProjectInfo']/table/tbody/tr[5]/td/input"); 
	By ProjectNameTextField=By.name("pName");
	By DraftReportDueDateTextField=By.id("newDraftDate");     // 01/03/2017
	By FinalReportDueDateTextField=By.id("newFinalDate");     // 01/10/2017
	By SveButton=By.name("submitEditProjectInfo");
	By CancelButton=By.name("cancelEditProjectInfo");
	
	
	
	//By LogoutMenue=By.id("link_164");
	//By Logout= By.xpath(".//*[@id='SnehalPatilMenu']/li/ul/li[4]/a");
	
	public WebDriver wd;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_projectDashboard\\src\\testData\\TestData1.xlsx");
	
    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
    {
           JavascriptExecutor jse=(JavascriptExecutor)wd;
          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
          Thread.sleep(2000);
          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
       
    }


	
	public Validate_editProjectInformationLink_withSaveAndCancelButton_TC02(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	/* Method for setting valid data for user name field */
	public void click_onEditProjectInformationLink() throws InterruptedException
	{
		WebElement e=wd.findElement(EditProjectLink_underProjectDashboard);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(3000);
		
	}
	
	public void verify_availableFieldLeblesUnderProjectInfoLink() throws InterruptedException
	{
		 List<WebElement> li= wd.findElements(GeneralXpathForFieldLebles_underEditInfoLink);
		    for(WebElement e:li)
		    {
				HighlightElement(wd, e);
				String s=e.getText();
				System.out.println(s);
				
		    }
		    
		    List<WebElement> li1= wd.findElements(GeneralXpathForButtons);
		    for(WebElement e1:li1)
		    {
				HighlightElement(wd, e1);
				String s1=e1.getText();
				System.out.println(s1);
				
		    }
		
	}
	
	/* Method for entering valid data in available text field */
	public void enterTheInformation() throws InterruptedException
	{
		WebElement e=wd.findElement(ProjectNameTextField);
		e.clear();
		e.sendKeys(ExcelR1.getData("Data For Edit Information",1,1));
		HighlightElement(wd, e);
		Thread.sleep(1000);
		
		WebElement e1=wd.findElement(DraftReportDueDateTextField);
		e1.clear();
		e1.sendKeys("01/03/2017");
		HighlightElement(wd, e1);
		Thread.sleep(1000);
		
		WebElement e2=wd.findElement(FinalReportDueDateTextField);
		e2.clear();
		e2.sendKeys("01/10/2017");
		HighlightElement(wd, e2);
		Thread.sleep(1000);
		
	}
	
	public void click_onSaveButton() throws InterruptedException
	{
		WebElement e=wd.findElement(SveButton);
		HighlightElement(wd, e);
		e.click();
		
	}
	
	public void click_onCancelButton() throws InterruptedException
	{
		WebElement e=wd.findElement(CancelButton);
		HighlightElement(wd, e);
		e.click();
		
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onEditProjectInformationLink();
		this.verify_availableFieldLeblesUnderProjectInfoLink();
		this.enterTheInformation();
		this.click_onSaveButton();
		this.click_onEditProjectInformationLink();
		this.enterTheInformation();
		this.click_onCancelButton();
		
	}
	
	

}
