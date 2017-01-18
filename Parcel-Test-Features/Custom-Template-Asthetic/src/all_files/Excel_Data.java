package all_files;

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

	public int rowcount1;
	public int rowcount2;

	public Excel_Data(int SheetNumber, String excelpath) throws IOException{
		File src = new File(excelpath);
	    FileInputStream fis = new FileInputStream(src);
				
		//we use XSSFWorkbook for .xlsx and HSSWorkbook used for .xls file.
		wb= new XSSFWorkbook(fis);
		
		//we also able to send sheetname also in getSheetname method but here we sent index no. of firstsheet.
	    sheet1= wb.getSheetAt(SheetNumber);
	    sheet2= wb.getSheetAt(SheetNumber);
	    sheet3= wb.getSheetAt(SheetNumber);
		rowcount1= sheet1.getLastRowNum();	
	}
	
	public String Username(int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		Cell cell = sheet1.getRow(row).getCell(column);
		String excelUsername = formatter.formatCellValue(cell);
		return excelUsername;	
	}
	
	public String Password(int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		Cell cell = sheet1.getRow(row).getCell(column);
		String excelPassword = formatter.formatCellValue(cell);
		return excelPassword;	
	}
	
	public String Company_Id(int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		Cell cell = sheet2.getRow(row).getCell(column);
		String excelCompany_Id = formatter.formatCellValue(cell);
		return excelCompany_Id;	
	}
	
	public String Template_Name(int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		Cell cell = sheet2.getRow(row).getCell(column);
		String excelTemplate_Name = formatter.formatCellValue(cell);
		return excelTemplate_Name;	
	}
	
	public String Template_Setup(int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		Cell cell = sheet3.getRow(row).getCell(column);
		String excelTemplate_Name = formatter.formatCellValue(cell);
		return excelTemplate_Name;	
	}
	
	public void writeonexcel(String writeonexcelpath) throws Exception{
		
		//for write result on same excel file i.e src
		//FileOutputStream is used for send output on excel 
		FileOutputStream fout= new FileOutputStream(writeonexcelpath);
		//following method is used for write on workbook i.e excel.
		wb.write(fout);
	}
}
