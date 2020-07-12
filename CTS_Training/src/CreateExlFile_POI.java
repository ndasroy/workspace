
import  java.io.*;

import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class CreateExlFile_POI
{
    @SuppressWarnings("deprecation")
	public static void main(String[]args) throws IOException
    {
   
		   String filename="D:\\MyNew.xls";
		
		   HSSFWorkbook workbook=new HSSFWorkbook();
		   HSSFSheet sheet =  workbook.createSheet("FirstSheet");  
		   HSSFRow rowhead=   sheet.createRow((short)0);
		   
		   rowhead.createCell((short) 0).setCellValue("No.");
		   rowhead.createCell((short) 1).setCellValue("Name");
		   rowhead.createCell((short) 2).setCellValue("Address");
		   rowhead.createCell((short)3).setCellValue("Email");
		
		   HSSFRow row=   sheet.createRow((short)1);
		   
		   row.createCell((short) 0).setCellValue("1");
		   row.createCell((short) 1).setCellValue("Nabyendu");
		   row.createCell((short) 2).setCellValue("India");
		   row.createCell((short) 3).setCellValue("xyz@gmail.com");
		
		   FileOutputStream fileOut =  new FileOutputStream(filename);
		   workbook.write(fileOut);
		   fileOut.close();
		   System.out.println("Your excel file has been generated!");

   
   }
    
 }
  