package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelR1 {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet s;
	public static XSSFRow r;
	public static XSSFCell c;
	public static DataFormatter formatter = new DataFormatter();
	public ExcelR1(String excelPath)
	{
	try
	{
	File f=new File(excelPath);
	FileInputStream fin=new FileInputStream(f);
	wb=new XSSFWorkbook(fin);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	}
	public static String getData(String sheetName, int row, int column)
	{
	s=wb.getSheet(sheetName);
	c=s.getRow(row).getCell(column);
	return formatter.formatCellValue(c);
	}

}
