package test_cases;

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

	public String Project_Name(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter();
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelProject_Name = formatter.formatCellValue(cell);
		return excelProject_Name;
	}

	public String Client_Property_Number(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter();
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelClient_Property_Number = formatter.formatCellValue(cell);
		return excelClient_Property_Number;
	}

	public String Address(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter();
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelAddress = formatter.formatCellValue(cell);
		return excelAddress;
	}

	public String City(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter();
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelCity = formatter.formatCellValue(cell);
		return excelCity;
	}

	public String Zip(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter();
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelZip = formatter.formatCellValue(cell);
		return excelZip;
	}

	public String Site_Id(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter(); // creating formatter
														// using the default
														// locale
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelSite_Id = formatter.formatCellValue(cell);
		return excelSite_Id;
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

	public String Browser(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter();
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelBrowser = formatter.formatCellValue(cell);
		return excelBrowser;
	}

	public String URL(String sheetName, int row, int column) {
		DataFormatter formatter = new DataFormatter();
		s = wb.getSheet(sheetName);
		Cell cell = s.getRow(row).getCell(column);
		String excelURL = formatter.formatCellValue(cell);
		return excelURL;
	}

	public void writeonexcel(String writeonexcelpath) throws Exception {
		FileOutputStream fout = new FileOutputStream(writeonexcelpath);
		wb.write(fout);
	}
}
