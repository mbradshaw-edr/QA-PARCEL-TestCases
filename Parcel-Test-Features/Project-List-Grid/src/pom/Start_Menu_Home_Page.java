package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Start_Menu_Home_Page {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentstart-content']/ul/li[1]/a")
	WebElement New_Single_Site_Project;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement single_site_project_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentstart-content']/ul/li[2]/a")
	WebElement New_Portfolio;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement New_Portfolio_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='contentstart-content']/ul/li[3]/a")
	WebElement Order_Placed_On_Edr_Website;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div/h3")
	WebElement Order_Placed_On_EDR_Website_Page_Header;
	
	@FindBy(how=How.XPATH,using="//*[@id='header-nav']/li[3]/a")
	WebElement Home_tab;
	
	public Start_Menu_Home_Page(WebDriver driver){
		this.driver = driver;	
	}
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	}
	
	public void Check_Start_Menus() throws Exception{
		Thread.sleep(3000);
		HighlightElement(driver, New_Single_Site_Project);
		New_Single_Site_Project.click();
		Thread.sleep(5000);
		HighlightElement(driver, single_site_project_Page_Header);
		System.out.println("Page Header on Single Site Project Page: "+single_site_project_Page_Header.getText());
		Home_tab.click();
		Thread.sleep(5000);
		HighlightElement(driver, New_Portfolio);
		New_Portfolio.click();
		Thread.sleep(5000);
		HighlightElement(driver, New_Portfolio_Page_Header);
		System.out.println("Page Header on New Portfolio Page: "+New_Portfolio_Page_Header.getText());
		Home_tab.click();
		Thread.sleep(5000);
		HighlightElement(driver, Order_Placed_On_Edr_Website);
		Order_Placed_On_Edr_Website.click();
		Thread.sleep(5000);
		HighlightElement(driver, Order_Placed_On_EDR_Website_Page_Header);
		System.out.println("Page Header on Order Placed On Edr Website Page: "+Order_Placed_On_EDR_Website_Page_Header.getText());
		Home_tab.click();
		Thread.sleep(5000);
	}
	
	

}
