package pom;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_page {
	
	WebDriver driver;
	
	public Login_page(WebDriver driver){
		
	this.driver = driver;	
	}
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	 {
	        JavascriptExecutor jse=(JavascriptExecutor)wd;
	       jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	       Thread.sleep(1500);
	       jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	    
	 }
	
	 @FindBy(how=How.ID,using="uEmail")
	 WebElement username;
	 
	 @FindBy(how=How.ID,using="pass")
	 WebElement password;
	 
	 @FindBy(xpath="//*[@id='login-box']/div[3]/div/button")
	 WebElement loginbutton;

	 public void logintoparcel() throws Exception{
		 
			Excel_Data excel= new Excel_Data(1, "src\\Test_Data\\Appendices.xlsx");
			String Username="";
			String Password="";
			for(int e=1; e<=excel.rowcount2; e++){
				Username=excel.Username(1, 0);
				Password=excel.Password(1, 1);
			}	 
				 
		 Thread.sleep(2000);
		 HighlightElement(driver, username);
		 username.sendKeys(Username);
		 HighlightElement(driver, password);
		 password.sendKeys(Password);
		 HighlightElement(driver, loginbutton);
		 loginbutton.click();
		 
	 }
	 
	 
}
