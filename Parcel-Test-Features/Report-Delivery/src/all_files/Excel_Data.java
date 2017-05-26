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
	public static XSSFSheet s;

	public Excel_Data(String excelpath) throws IOException {
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
	}
	
	public String Username(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter();
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelUsername = formatter.formatCellValue(cell);
		return excelUsername;
	}

	public String Password(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter();
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelPassword = formatter.formatCellValue(cell);
		return excelPassword;
	}
	
	public String Site_Id(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelSite_Id = formatter.formatCellValue(cell);
		return excelSite_Id;
	}
	
	public String Email_Id(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelEmail_Id = formatter.formatCellValue(cell);
		return excelEmail_Id;	
	}
	
	public void writeonexcel(String writeonexcelpath) throws Exception{
		FileOutputStream fout= new FileOutputStream(writeonexcelpath);
		wb.write(fout);
	}
}
