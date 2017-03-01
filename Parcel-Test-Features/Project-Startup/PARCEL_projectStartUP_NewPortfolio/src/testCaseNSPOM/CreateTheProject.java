package testCaseNSPOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateTheProject {
	
	 public WebDriver wd;
	 
	   public static InputStream f;
	   public static XSSFWorkbook wb;
	   public static XSSFSheet s;
	   public static XSSFRow r;
	   public static XSSFCell c;
	   public static int rc;
	   public static int cc;
	   public static String arr[][]=null;
	

	    public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	    {
	           JavascriptExecutor jse=(JavascriptExecutor)wd;
	          jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	          Thread.sleep(2000);
	          jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	       
	    }
			public CreateTheProject(WebDriver wd)
			{
				this.wd=wd;
			} 
			
			public void verifyingAllFieldsAndFieldsNames() throws InterruptedException
			{
				
				System.out.println("######Steps are also available, names are -####### ");	
				List<WebElement> l1=wd.findElements(By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td[1]"));
				for(WebElement e1:l1)
				{
					HighlightElement(wd, e1);
			            String s1=e1.getText();
						System.out.println(" : "+s1 );
				}
				
				List<WebElement> l2=wd.findElements(By.xpath("html/body/div/div/div/div/div/div/form/table/tbody/tr/td/input"));
				for(WebElement e2:l2)
				{
					HighlightElement(wd, e2);
			            String s2=e2.getAttribute("value");
						System.out.println(" : "+s2 );
				}
				
			//System.out.println("Tow buttons are also available, names are - ");	
			List<WebElement> l3=wd.findElements(By.xpath("/html/body/div/div/div/div/div/div/form/table/tbody/tr[8]/td/input"));
			for(WebElement e3:l1)
			{
				HighlightElement(wd, e3);
		            String s3=e3.getText();
					System.out.println(" : "+s3 );
			}
			
			}
			
			/*public Object[][] createMethod() throws Exception{
				  // String arr[][]=null;
				   try
				   {
				   f=new FileInputStream("C:\\Users\\Admin\\workspace\\PARCEL_projectStartUP_NewPortfolio\\src\\testData\\Detail_creatNewPortfolio.xlsx");
				              wb=new XSSFWorkbook(f);
				              s=wb.getSheetAt(0);
				              rc=s.getLastRowNum();
				              cc=15;
				              System.out.println(rc);
				              //int ci, cj;
				              arr=new String[rc][cc];
				              //ci=0;
				              for(int i=1;i<rc;i++,ci++)
				              {
				            	 // cj=0;
				            	  r=s.getRow(i);        // if we want to skip the forst row(not need first row values- uname pass), then
				            	  //cc=r.getLastCellNum();  //  we will have to write i+1 in place of i
				            	  for(int j=1;j<cc;j++,cj++)
				            	  {
				            		  c=r.getCell(j);
				            		  arr[ci][cj]=getCellDataMethod(i,j);
				            		  System.out.println(arr[ci][cj]);
				            	  
				            		  
				            		  
				            	  }
				            	  
				              }
				   }
				   catch (FileNotFoundException e){

						System.out.println("Could not read the Excel sheet");

						e.printStackTrace();

						}

					catch (IOException e){

						System.out.println("Could not read the Excel sheet");

						e.printStackTrace();

						}
				              return arr;
				   

				}
			
			
			public static String getCellDataMethod(int RowNum, int ColNum) throws Exception {

				try{

					c = s.getRow(RowNum).getCell(ColNum);

					int dataType = c.getCellType();

					if  (dataType == 3) {
						 
						return "";
						 
						}else{

						String CellData = c.getStringCellValue();

						return CellData;

					}}catch (Exception e){

					System.out.println(e.getMessage());

					throw (e);

					}

				}*/

			
			
			public void createMethod() throws IOException
			{
				 Object a[][]=new Object[2][15];
				   
				   InputStream f=new FileInputStream("..\\PARCEL_projectStartUP_NewPortfolio\\src\\testData\\Detail_creatNewPortfolio.xlsx");
				               wb=new XSSFWorkbook(f);
				               s=wb.getSheetAt(0);
				              int rc=s.getLastRowNum();
				              System.out.println(rc);
				              DataFormatter df=new DataFormatter();
				              String s3=df.formatCellValue((Cell) a[2][3]);
				              System.out.println();
				              System.out.println(a[2][2]);
				              
				              for(int i=0;i<rc;i++)
				              {
				            	  r=s.getRow(i+1);        // if we want to skip the forst row(not need first row values- uname pass), then
				            	  cc=r.getLastCellNum();  //  we will have to write i+1 in place of i
				            	  //for(int j=0;j<cc;j++)
				            	  //{
				            		   c=r.getCell(2);
				            		   /*if(c.getCellType()==c.CELL_TYPE_NUMERIC)
				            		   {
				            			   a[i][j]=c.getNumericCellValue();
				            		   }
				            		   else if(c.getCellType()==c.CELL_TYPE_BLANK)
				            		   {
				            			   a[i][j]=c
				            		   }
				            		   else if(c.getCellType()==c.CELL_TYPE_STRING)
				            		   {
				            			  
				            		  a[i][j]=c.getStringCellValue();
				            		   }*/
				            		  
				            		  //System.out.println(a[i][j]);
				            		   //String s1=df.formatCellValue(c);
				            		   //System.out.println(s1);
				            	  
				            		  
				            		  
				            	  //}
				            	  
				              }

				
			}
			
			
			public void mainMethid() throws Exception
			{
				wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//this.verifyingAllFieldsAndFieldsNames();
				this.createMethod();
				
			}

}
