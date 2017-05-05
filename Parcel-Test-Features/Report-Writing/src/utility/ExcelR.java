package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelR {
	
	XSSFWorkbook wb;
	public static XSSFSheet s;
		
	public ExcelR(String excelpath) throws IOException{
		File src = new File(excelpath);
	    FileInputStream fis = new FileInputStream(src);
		wb= new XSSFWorkbook(fis);

	}
	
	public String getURL(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s=wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelURL = formatter.formatCellValue(cell);
		return excelURL;	
	}
	
	public String getBrowserName(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s=wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelBrowserName = formatter.formatCellValue(cell);
		return excelBrowserName;	
	}
	
	public String getCredentials(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s=wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelcredentials = formatter.formatCellValue(cell);
		return excelcredentials;	
	}
	
	public String getSiteId(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s=wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelSiteId = formatter.formatCellValue(cell);
		return excelSiteId;	
	}
	
	public String getEditor_Text(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); 
		s=wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String Editor_Text = formatter.formatCellValue(cell);
		return Editor_Text;	
	}
	

	public void writeonexcel(String writeonexcelpath) throws Exception{
		FileOutputStream fout= new FileOutputStream(writeonexcelpath);
		wb.write(fout);
	}
}
