package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Vailidate_ContinueButton_withPackageSection_EDRStandardPackagewithLightbox_underThe_EDRPackagesPage_TC16 {
	
	//EDR Packages Page
	    By EDRPackagesPageHeader=By.xpath(".//*[@id='SECT_7526_HDR_TLI']");
	    By GeneralXpathForPackagesAvailabe_onEDRPackagesPage=By.xpath("html/body/form/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]");
	    
		By CheckBox_EDRStandardPackagewithLightbox=By.id("PKG_464_HD_CHK");
		By OptionButton_EDRStandardPackagewithLightbox=By.id("PKG_464_DEF_IMG_EXP");
		By CloseButton_EDRStandardPackagewithLightbox=By.id("PKG_464_DEF_IMG_EXP");
		By GeneralXpath_forDDs_EDRStandardPackagewithLightbox=By.xpath("html/body/form/div//div[4]/div/div/div/div/div/div/div/div/div/div/div[6]/div");
		By SearchDestance=By.xpath(".//*[@id='PKG_464_SD_DDL']");
		By EDR_fieldCheckSystem=By.xpath(".//*[@id='PKG_464_251_AO_CHK']");
		
		By ContinueButton_withPackageSelection=By.id("SECT_7526_HDR_SCB");
		By YesAddToOrderButton=By.xpath(".//*[@id='img']");
		
		By CityDirectoryPageHeader=By.xpath(".//*[@id='form1']/div/div/div/div/div/div/div/div/img");
		By AddressToSearch=By.xpath(".//*[@id='_ContentDiv']/div[1]");
		By GeneralXpath_ofcontent_UnderCitDirectory=By.xpath("html/body/form/div/div/div/div/div/div/div/div/div/div/div//div/div/span");
		By ContinueButton_onCityDirectory=By.xpath(".//*[@id='_CompleteSession']");
		
		public static WebDriver wd;
		public static String SubParentWndow;
		public static String SubParent1Wndow;
		public static Set<String> s;
		ExcelR1 obj=new ExcelR1("..\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
		  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
		    {
		           JavascriptExecutor jse=(JavascriptExecutor)wd;
		          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
		          Thread.sleep(3000);
		          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
		       
		    }
		  
		  public void windowScroll()
			{
				JavascriptExecutor jse = (JavascriptExecutor)wd;
				jse.executeScript("window.scrollBy(0,110)", "");
			}
		  
		  
		public Vailidate_ContinueButton_withPackageSection_EDRStandardPackagewithLightbox_underThe_EDRPackagesPage_TC16(WebDriver wd)
		{
			this.wd=wd;
		}
		
		public void check_contentAvailability_onEDRPackagePage() throws InterruptedException
		{
			String s0=wd.getTitle();
			System.out.println("Page Title is: "+s0);
			
			WebElement e=wd.findElement(EDRPackagesPageHeader);
			HighlightElement(wd, e);
			String s=e.getText();
			System.out.println(s);
			
			List<WebElement> e1= wd.findElements(GeneralXpathForPackagesAvailabe_onEDRPackagesPage);
		    for(WebElement e0:e1)
		    {
		    	windowScroll();
				HighlightElement(wd, e0);
				String s1=e0.getText();
				System.out.println(s1);
		    }
			
	    }
		
		public void SelectCheckEDRStandardPackagewithLightbox_onEDRPackagePage() throws InterruptedException
		{
			WebElement e=wd.findElement(OptionButton_EDRStandardPackagewithLightbox);
			HighlightElement(wd, e);
			String s=e.getText();
			System.out.println(s);
			e.click();
			
			List<WebElement> e1= wd.findElements(GeneralXpath_forDDs_EDRStandardPackagewithLightbox);
			int counter=0;
		    for(WebElement e0:e1)
		    {
				HighlightElement(wd, e0);
				counter++;
				if(counter==12)
				{
					break;
				}
		    }
		    
		    WebElement e2=wd.findElement(CloseButton_EDRStandardPackagewithLightbox);
			HighlightElement(wd, e2);
			String s2=e2.getText();
			System.out.println(s2);
			e.click();
		    	
		}
		
		public void click_checkBox_EDRStandardPackagewithLightbox_underPropertyLocationPage() throws InterruptedException
		{
			JavascriptExecutor jse = (JavascriptExecutor)wd;
			jse.executeScript("window.scrollBy(0,450)", "");
			WebElement e=wd.findElement(CheckBox_EDRStandardPackagewithLightbox);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(5000);
			
			 WebElement e2=wd.findElement(SearchDestance);
				HighlightElement(wd, e2);
				e2.click();
				Thread.sleep(2000);
				e2.click();
				
				WebElement e3=wd.findElement(EDR_fieldCheckSystem);
				HighlightElement(wd, e3);
				e3.click();
		}
		
		public void click_onContinueButtonLocationPage() throws InterruptedException
		{
			WebElement e=wd.findElement(ContinueButton_withPackageSelection);
			HighlightElement(wd, e);
			e.click();
			Thread.sleep(10000);
		}
		
		public void mainMethod() throws InterruptedException
		{
			//this.check_contentAvailability_onEDRPackagePage();
			this.SelectCheckEDRStandardPackagewithLightbox_onEDRPackagePage();
			this.click_checkBox_EDRStandardPackagewithLightbox_underPropertyLocationPage();
			this.click_onContinueButtonLocationPage();
			
		}

}
