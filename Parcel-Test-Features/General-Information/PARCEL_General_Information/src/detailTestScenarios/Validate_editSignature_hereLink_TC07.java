package detailTestScenarios;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelR1;

public class Validate_editSignature_hereLink_TC07 {
	
	By EditSignaturesButton=By.xpath(".//*[@id='editLinkCS']/a");
	By MainPartUnderTheEditSugnatures=By.xpath("//*[@id='editCS']/form/table/tbody/tr/td/b");
	By ElementsUnderMainSections=By.xpath(".//*[@id='editCS']/form/table[1]/tbody/tr[5]/td[2]/input");
	By HereLinkForSiteAssessor=By.xpath("html/body//form/table/tbody/tr[7]/td/div/a");
	By HereLinkAsGeneral=By.xpath("html/body/div//div/form/table/tbody/tr/td/div/a");
	By HereLinkEnvironmentProfessional=By.xpath(".//*[@id='sigMsg_629230']/a");
	By MainMenue=By.xpath("");
	By GeneralXPathForMainMenue=By.xpath("");
	By GeneralXPath=By.xpath("");
	
	public static WebDriver wd;
	public static Set<String> s;
	public String parent1Window;
	ExcelR1 obj=new ExcelR1("C:\\Users\\Admin\\workspace\\PARCEL_General_Information\\src\\testData\\General Information Test Data.xlsx");
	  public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
	public Validate_editSignature_hereLink_TC07(WebDriver wd)
	{
		this.wd=wd;
	} 
	
	public void click_onEditSignatureButton() throws InterruptedException
	{
		WebElement e=wd.findElement(EditSignaturesButton);
		HighlightElement(wd, e);
		String s1=e.getText();
		System.out.println(" : "+s1 );
		e.click();
	}
	public void contentUdsertheEditSignatureButton() throws InterruptedException
	{
		List<WebElement> l=wd.findElements(MainPartUnderTheEditSugnatures);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
	            String s=e.getText();
				System.out.println(" "+s );
		}
		
		List<WebElement> m=wd.findElements(ElementsUnderMainSections);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
	            String s=e.getText();
				System.out.println(" "+s );
		}
		
		List<WebElement> n=wd.findElements(HereLinkAsGeneral);
		for(WebElement e:l)
		{
			HighlightElement(wd, e);
	            String s=e.getText();
				System.out.println(" "+s );
		}
		
		
	}
	
	public void mainMethod() throws InterruptedException
	{
		this.click_onEditSignatureButton();
		this.contentUdsertheEditSignatureButton();
	}

}
