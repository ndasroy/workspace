package com.sba.core;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class Utility
{
	
	public static String readExcel(String filePath, String columnName) throws IOException
	{
		int cellNo = 0;
		int rowCount = 0;
		String CellValue = "";
		File path = new File(filePath);
		FileInputStream file = new FileInputStream(path);
		
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		HSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.rowIterator();
		while(rowIterator.hasNext())
		{
			
			Row row = rowIterator.next();
			rowCount++;
				
			if(rowCount==1)
			{
				Iterator<Cell> cellIterator = row.cellIterator();
				while(cellIterator.hasNext())
				{
					Cell cell = cellIterator.next();
					String ColumnValue = cell.getStringCellValue();
				
					if(ColumnValue.equalsIgnoreCase(columnName))
					{
						cellNo = cell.getColumnIndex();
						break;
					}
				}
			}
			else
			{
				Cell cell = row.getCell(cellNo);
				CellValue = cell.getStringCellValue();
			}
		}
		
		file.close();
		return CellValue;
	}
	
	
	
	
	
	public static void capturescreen(String path, String testCaseId) throws Exception 
	{
		try
		{		
		   Rectangle screenRectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		   Robot robot = new Robot();
		   BufferedImage image = robot.createScreenCapture(screenRectangle);
		  
		  
			   File file = new File(path);
			   	if (file.exists())
				{
					file.delete();
				}
				if (!file.exists())
				{
					file.mkdir();
				}
		   ImageIO.write(image, "jpeg", new File(path+"/" + testCaseId + ".jpeg"));
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	
	
	public static void writeToExcel(List<ArrayList<String>> listOfData, String path) throws IOException 
	{
		File newFile=new File(path);
		if(newFile.exists())
		{
			newFile.delete();
		}
		
		if(!newFile.exists())
		{
			newFile.createNewFile();
		
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet();
			
			for(int t=0; t<listOfData.size();t++)
			{
				//Create a new row in current sheet
				Row row = sheet.createRow(t);
				
				ArrayList<String> eachValue = listOfData.get(t);
				
				int totalcell = eachValue.size();
				
				for(int colNo=0; colNo<totalcell; colNo++)
				{
					//Create a new cell in current row
					Cell cellColl = row.createCell(colNo);
				
					//Set value to new value
					cellColl.setCellValue(eachValue.get(colNo));
				}
			}
			FileOutputStream out = new FileOutputStream(new File (path));
		    workbook.write(out);
		    out.close();
		}

	}
		
		
}
