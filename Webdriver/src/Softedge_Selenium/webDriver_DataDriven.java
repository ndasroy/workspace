package Softedge_Selenium;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;

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

public class webDriver_DataDriven 
{
	int i=0;
	void takeScreenShot(WebDriver driver,String FileName)		// Catching the filename
	{
		try
		{
			i++;
			FileName=FileName+i+".jpg";
			TakesScreenshot screenShot=(TakesScreenshot)driver;
			File SrcFile=screenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SrcFile, new File(FileName));
		}
		catch(Exception e)
		{
			
		}
		
	}
	
  @Test(dataProvider = "dp")
  public void f(String Username, String Password) 
  
  {
	  	WebDriver driver=null;					// we need to define this outside the try block to use it in finally block
	  	try
	  	{
	  	driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='jriTop_signin9']")).click();
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys(Username);
		driver.findElement(By.xpath(".//*[@id='txtPasswd']")).sendKeys(Password);
		driver.findElement(By.xpath(".//*[@id='imgbtnSignin']")).click();
		
		Assert.assertEquals(true, driver.getCurrentUrl().contains("myaccount_directory.aspx"));
		
		webDrive_KeywordDriven sc=new webDrive_KeywordDriven();
		sc.takeScreenShot(driver, "c:\\Temp\\Recharge");	// Taking screenshot
		
		
	  	}
	  	finally
	  	{
	  		//driver.close();		// To close the current browser
			driver.quit();			// To close all the browser
	  		
	  	}
		// Sign out
		//driver.findElement(By.xpath(".//*[@id='jriTop_signOut']")).click();	//The FirefoxDriver cannot be used after quit() was called.

  }

  @DataProvider
  public Object[][] dp() 
  {
	  	  Object[][] O=null;
	  try
	  {
		  Workbook wb=Workbook.getWorkbook(new File("C:\\Users\\SOUMI\\workspace\\Webdriver\\Data.xls"));	// file should saved in xls format,not xlsx format
		  
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
