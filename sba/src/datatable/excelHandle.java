package datatable;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excelHandle {
	
	private static HSSFWorkbook xlWBook;
    private static HSSFSheet xlSheet;
    private static HSSFRow xlRow;
    private static HSSFCell xlCell;
	
	public static String getData(int row,int col) throws Exception
	{
		String data;
		String dir = System.getProperty("user.dir");
		String filepath=dir+"\\src\\Datatable\\data.xls";
		FileInputStream xlFile = new FileInputStream(filepath );
		// Access the required test data sheet
        xlWBook = new HSSFWorkbook(xlFile);

        // Assuming your data is in Sheet1- if not use your own sheet name
        xlSheet = xlWBook.getSheet("sheet1");
        data=xlSheet.getRow(row).getCell(col).getStringCellValue();
        
		return data;
	}
}
