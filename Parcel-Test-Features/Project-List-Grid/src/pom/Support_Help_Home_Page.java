package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Support_Help_Home_Page {
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="html/body/div[5]/a")
	WebElement Support_Help_Button;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[1]/a")
	WebElement Setup_Tab;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[3]/a")
	WebElement Appendices_Tab;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[4]/a")
	WebElement Sign_Tab;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[1]/div[2]/div[2]/ul/li[5]/a")
	WebElement Assemble_Tab;
	
	@FindBy(how=How.XPATH,using="//*[@id='header-nav']/li[3]/a")
	WebElement Home_tab;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/a")
	 WebElement user_dropdown;
	 
	 @FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[8]/ul/li/ul/li[4]/a")
	 WebElement logout_button;
	
	
	public Support_Help_Home_Page(WebDriver driver){
		this.driver = driver;	
	}
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	}
	
	public void Support_Help_Button() throws Exception{
	HighlightElement(driver, Support_Help_Button);		
	Thread.sleep(2000);
	System.out.println("Name for Feedback button present on Footer: "+Support_Help_Button.getText());
	Header_Menus_Home_Page Header_Menus_Home_Page = PageFactory.initElements(driver, Header_Menus_Home_Page.class);	
	Header_Menus_Home_Page.Open_SiteID_In_Simplified();	
	HighlightElement(driver, Support_Help_Button);		
	Thread.sleep(2000);
	HighlightElement(driver, Setup_Tab);
	Setup_Tab.click();
	Thread.sleep(8000);
	HighlightElement(driver, Support_Help_Button);		
	Thread.sleep(2000);
	HighlightElement(driver, Appendices_Tab);
	Appendices_Tab.click();
	Thread.sleep(8000);
	HighlightElement(driver, Support_Help_Button);		
	Thread.sleep(2000);
	HighlightElement(driver, Sign_Tab);
	Sign_Tab.click();
	Thread.sleep(8000);
	HighlightElement(driver, Support_Help_Button);		
	Thread.sleep(2000);
	HighlightElement(driver, Assemble_Tab);
	Assemble_Tab.click();
	Thread.sleep(8000);
	HighlightElement(driver, Support_Help_Button);		
	Thread.sleep(2000);
	Home_tab.click();
	Thread.sleep(5000);
	HighlightElement(driver, user_dropdown);
	user_dropdown.click();
	Thread.sleep(2000);
	HighlightElement(driver, logout_button);
	logout_button.click();
	Thread.sleep(8000);	
	}
}
