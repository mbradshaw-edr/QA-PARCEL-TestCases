package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_continueButton_underPropertyLocationPage_TC15 {
	
	By GeneralXpathForFirstMap=By.xpath("html/body/form/div//div/label"); 
	By Coordinates=By.xpath(".//*[@id='LATLONG_CNT_COORD_TTL']");
	By SearchButton1=By.xpath(".//*[@id='_LeftColumnContentHolder_imgAddressSearch']");
	By PropertyBoundaryTool=By.xpath(".//*[@id='polyTitle']/div/img");
	By DrawButton=By.id("imgStartTool");
	By GeneralXpathForMaoOptions=By.xpath(".//*[@id='map_host']/div/div/div[15]/div/div");
	By ContinueButton=By.id("ibtContinue");
	By GeneralXpathForPackagesAvailabe_onEDRPackagesPage=By.xpath("html/body/form/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]");
	
	//EDR Packages Page
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
	
	// Delivery Information Page: Xpath need to write below----
	
	
	
	
	
	
	public static WebDriver wd;
	public static String SubParentWndow;
	public static String SubParent1Wndow;
	public static Set<String> s;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(3000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_continueButton_underPropertyLocationPage_TC15(WebDriver wd)
	{
		this.wd=wd;
	}
	
	public void check_contentAvailability() throws InterruptedException
	{
		List<WebElement> e1= wd.findElements(GeneralXpathForFirstMap);
	    for(WebElement e:e1)
	    {
			HighlightElement(wd, e);
			String s1=e.getText();
			System.out.println(s1 );
	    }
	    
	    WebElement e=wd.findElement(Coordinates);
		HighlightElement(wd, e);
		String s=e.getText();
		System.out.println(s);
		
		 WebElement e2=wd.findElement(SearchButton1);
			HighlightElement(wd, e2);
			String s2=e2.getText();
			System.out.println(s2);
			
			 WebElement e3=wd.findElement(PropertyBoundaryTool);
				HighlightElement(wd, e3);
				String s3=e3.getAttribute("alt");
				System.out.println(s3);
				
				List<WebElement> e4= wd.findElements(GeneralXpathForMaoOptions);
			    for(WebElement e0:e4)
			    {
					HighlightElement(wd, e0);
					String s0=e0.getText();
					System.out.println(s0);
			    }
         }
	
	public void click_onContinueButton_underPropertyLocationPage() throws InterruptedException
	{
		WebElement e=wd.findElement(ContinueButton);
		HighlightElement(wd, e);
		e.click();
		Thread.sleep(30000);
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.check_contentAvailability();
		this.click_onContinueButton_underPropertyLocationPage();
	}

}
