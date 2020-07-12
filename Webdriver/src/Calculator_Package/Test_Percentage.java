package Calculator_Package;


import java.io.File;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Test_Percentage 
{
	
  @Test(dataProvider = "dp")
  public void f(String PerC, String PrinC) 
  
  {
	  	WebDriver driver=null;					
	  	try
	  	{
	  	driver=new FirefoxDriver();
		driver.get("http://www.calculator.net");
		driver.manage().window().maximize();
		
		Percent_Cal_PO.mathCalculator(driver).click();
		Percent_Cal_PO.percentCalculator(driver).click();
		Percent_Cal_PO.percentInnerPage1(driver).sendKeys(PerC);
		Percent_Cal_PO.percentInnerPage2(driver).sendKeys(PrinC);
		Percent_Cal_PO.percentInnerPage4(driver).click();
		
		
		
	  	}
	  	finally
	  	{
	  		//driver.close();		// To close the current browser
			driver.quit();			// To close all the browser
	  		
	  	}
		
  }

  @DataProvider
  public Object[][] dp() 
  {
	  	  Object[][] O=null;
	  try
	  {
		  Workbook wb=Workbook.getWorkbook(new File("C:\\Data.xls"));	// file should saved in xls format,not xlsx format
		  
		  Sheet Sh=wb.getSheet(0);
		  
		  O=new Object[Sh.getRows()][Sh.getColumns()];
		  
		  for(int i=0;i<Sh.getRows();i++)
		  {
			  for(int j=0;j<Sh.getColumns();j++)
			  {
				  O[i][j]=Sh.getCell(j,	i).getContents();				// i=row;j=column
				  
				  //System.out.print(Sh.getCell(j,	i).getContents()+"	");
			  }
			  System.out.println();
		  }
		  
		  
	  }
	  catch(Exception e)
	  {
		  
		  
	  }
	  return O;
  }
}
