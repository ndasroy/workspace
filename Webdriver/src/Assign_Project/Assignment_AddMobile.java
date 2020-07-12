package Assign_Project;


import java.io.File;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import Softedge_Selenium.Locator;

public class Assignment_AddMobile 
{
	int i=0;
	void takeScreenShot(WebDriver driver,String FileName)		// Catching the filename
	{
		try
		{
			i++;
			FileName=FileName+"_AddMobile_"+i+".jpg";
			TakesScreenshot screenShot=(TakesScreenshot)driver;
			File SrcFile=screenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SrcFile, new File(FileName));
		}
		catch(Exception e)
		{
			
		}
		
	}
	
  @Test(dataProvider = "dp")
  public void f(String Useremail,String Password,String Mobilenumber) 
  
  {
	  	WebDriver driver=null;					// we need to define this outside the try block to use it in finally block
	  	try
	  	{
	  	driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(Locators.SignIn)).click();
		driver.findElement(By.xpath(Locators.UserName)).sendKeys(Useremail);	
		driver.findElement(By.xpath(Locators.Password)).sendKeys(Password);
		driver.findElement(By.xpath(Locators.SignIn_Submit)).click();
				
		Assert.assertEquals(true, driver.getCurrentUrl().contains("myaccount_directory.aspx"));
		
		driver.findElement(By.xpath(Locators.AddMobile)).click();
		try
		{
			driver.findElement(By.xpath(Locators.EnterMobile)).sendKeys(Mobilenumber);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Exception e=new Exception();
			throw e;
		}
		catch(Exception e)
		{
			Select serviceProvider=new Select(driver.findElement(By.xpath(Locators.ServiceProvider)));
			serviceProvider.selectByValue("2");
		}
		
		driver.findElement(By.xpath(Locators.NickName)).sendKeys("Airtel");
		driver.findElement(By.xpath(Locators.PopUpAddMobile)).click();
		
		
		Assignment_AddMobile sc=new Assignment_AddMobile();
		sc.takeScreenShot(driver, "c:\\Temp\\Recharge");	// Taking screenshot
		
		
	  	}
	  	finally
	  	{
	  		//driver.close();		// To close the current browser
			driver.quit();			// To close all the browser
	  		
	  	}
			//The FirefoxDriver cannot be used here after quit() was called.

  }

  @DataProvider
  public Object[][] dp() 
  {
	  	  Object[][] O=null;
	  try
	  {
		  Workbook wb=Workbook.getWorkbook(new File("C:\\Users\\SOUMI\\workspace\\Assign_Datasheets\\AddMobile.xls"));	// file should saved in xls format,not xlsx format
		  
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
