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
	public static XSSFSheet s;
	
	public Excel_Data(String excelpath) throws IOException {
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);

	}

	public String Site_Id(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s=wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelSite_Id = formatter.formatCellValue(cell);
		return excelSite_Id;	
	}
	
	public String Username(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s=wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelUsername = formatter.formatCellValue(cell);
		return excelUsername;	
	}
	
	public String Password(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s=wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelPassword = formatter.formatCellValue(cell);
		return excelPassword;	
	}
	
	public String Questionnaire_Email_To_Name(String sheetName, int row, int column){
	DataFormatter formatter = new DataFormatter(); 
	s=wb.getSheet(sheetName);
	Cell cell = s.getRow(row).getCell(column);
	String excel_Questionnaire_Email_To_Name=formatter.formatCellValue(cell);	
	return excel_Questionnaire_Email_To_Name;	
	}
	
	public String Questionnaire_Email_To_Email(String sheetName, int row, int column){
	DataFormatter formatter = new DataFormatter();
	s = wb.getSheet(sheetName);
	Cell cell = s.getRow(row).getCell(column);
	String excel_Questionnaire_Email_To_Email=formatter.formatCellValue(cell);
	return excel_Questionnaire_Email_To_Email;
	}
	
	public String Questionnaire_Email_Message(String sheetName, int row, int column){
	DataFormatter formatter = new DataFormatter();
	s = wb.getSheet(sheetName);
	Cell cell = s.getRow(row).getCell(column);
	String excel_Questionnaire_Email_Message=formatter.formatCellValue(cell);	
	return excel_Questionnaire_Email_Message;
	}
	
	public void writeonexcel(String writeonexcelpath) throws Exception{
		
		//for write result on same excel file i.e src
		//FileOutputStream is used for send output on excel 
		FileOutputStream fout= new FileOutputStream(writeonexcelpath);
		//following method is used for write on workbook i.e excel.
		wb.write(fout);
	}
}
