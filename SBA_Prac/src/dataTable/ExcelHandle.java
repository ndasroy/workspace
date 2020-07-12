package dataTable;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelHandle {
	
	public static HSSFWorkbook xlWbook;
	public static HSSFSheet xlSheet;
	public static HSSFRow xlRow;
	public static HSSFCell xlCell;
	
	public static String getData(int row,int col) throws Exception {
		
		String data;
		String dir=System.getProperty("user.dir");
		String filePath= dir+"\\src\\dataTable\\data.xls";
		FileInputStream xlFile= new FileInputStream(filePath);
		xlWbook=new HSSFWorkbook(xlFile);
		xlSheet= xlWbook.getSheet("sheet1");
		
		data=xlSheet.getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}

}
