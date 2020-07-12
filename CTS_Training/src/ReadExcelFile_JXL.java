
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


/**
 * https://www.seleniumeasy.com/jxl-tutorials/how-to-read-excel-file-using-java
 *
 */
public class ReadExcelFile_JXL 
{
	public void readExcel() throws BiffException, IOException 
	
	{
		String FilePath = "D:\\sampledoc.xls";
		
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);

		// TO get the access to the sheet
		
		Sheet sh = wb.getSheet("Sheet1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sh.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();

		for (int row = 0; row < totalNoOfRows; row++) {

			for (int col = 0; col < totalNoOfCols; col++) {
				System.out.print(sh.getCell(col, row).getContents() + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) throws BiffException, IOException 
	{
		ReadExcelFile_JXL DT = new ReadExcelFile_JXL();
		DT.readExcel();
	}
}
 
