package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	XSSFSheet sheet2;
	XSSFSheet sheet3;
	public int rowcount;
	public int rowcount2;
	public int rowcount3;
	
	public Excel_Data(int SheetNumber, String excelpath) throws IOException{
		File src = new File(excelpath);
	    FileInputStream fis = new FileInputStream(src);
				
		//we use XSSFWorkbook for .xlsx and HSSWorkbook used for .xls file.
		wb= new XSSFWorkbook(fis);
		
		//we also able to send sheetname also in getSheetname method but here we sent index no. of firstsheet.
	    sheet1= wb.getSheetAt(SheetNumber);
		sheet2= wb.getSheetAt(SheetNumber);
		sheet3= wb.getSheetAt(SheetNumber);
	    rowcount= sheet1.getLastRowNum();	
	    rowcount2= sheet2.getLastRowNum();
	    rowcount3= sheet3.getLastRowNum();
	}
	
	public String Project_Name(int row, int column) {		
		// get values from excel.	
		DataFormatter formatter = new DataFormatter(); 
		Cell cell = sheet1.getRow(row).getCell(column);
		String excelProject_Name=formatter.formatCellValue(cell);			
		return excelProject_Name;
	}
	
	public String Client_Property_Number(int row, int column) {		
		// get values from excel.		
		String excelClient_Property_Number=sheet1.getRow(row).getCell(column).getStringCellValue();			
		return excelClient_Property_Number;
	}

	public String Address(int row, int column) {		
		// get values from excel.		
		String excelAddress=sheet1.getRow(row).getCell(column).getStringCellValue();			
		return excelAddress;
	}
	
	public String City(int row, int column) {		
		// get values from excel.		
		String excelCity=sheet1.getRow(row).getCell(column).getStringCellValue();			
		return excelCity;
	}
	
	public String Zip(int row, int column) {		
		// get values from excel.		
		String excelZip=sheet1.getRow(row).getCell(column).getStringCellValue();			
		return excelZip;
	}
	
	public String Site_Id(int row, int column) {
		//String excelSite_Id= sheet2.getRow(row).getCell(column).getStringCellValue();
		DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
		Cell cell = sheet2.getRow(row).getCell(column);
		String excelSite_Id = formatter.formatCellValue(cell);
		return excelSite_Id;	
	}
	
	public String Username(int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		Cell cell = sheet3.getRow(row).getCell(column);
		String excelUsername = formatter.formatCellValue(cell);
		return excelUsername;	
	}
	
	public String Password(int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		Cell cell = sheet3.getRow(row).getCell(column);
		String excelPassword = formatter.formatCellValue(cell);
		return excelPassword;	
	}
	
	public void writeonexcel(String writeonexcelpath) throws Exception{
		
		//for write result on same excel file i.e src
		//FileOutputStream is used for send output on excel 
		FileOutputStream fout= new FileOutputStream(writeonexcelpath);
		//following method is used for write on workbook i.e excel.
		wb.write(fout);
	}
}
