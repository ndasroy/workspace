package Calculator_Package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Test_Percentage 
{
	
	int i=0;
		
	void takeScreenShot(WebDriver driver,String FileName)	throws IOException	// Catching the filename
	{
			i++;
			FileName=FileName+i+".jpg";
			TakesScreenshot screenShot=(TakesScreenshot)driver;
			File SrcFile=screenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SrcFile, new File(FileName));
		
	}
	
  @Test(dataProvider = "dp")
  	public void excelDataRead(String PercentValue, String PrincipalValue) throws Exception
  
  {
	  	WebDriver driver=null;
	  	driver=new FirefoxDriver();
		driver.get("http://www.calculator.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  
		Percent_Cal_PO.mathCalculator(driver).click();
		Percent_Cal_PO.percentCalculator(driver).click();
		Percent_Cal_PO.percentInnerPage1(driver).sendKeys(PercentValue);
		Percent_Cal_PO.percentInnerPage2(driver).sendKeys(PrincipalValue);
		Percent_Cal_PO.percentInnerPage4(driver).click();
		
		String S=Percent_Cal_PO.percentInnerPage5(driver).getText();
		
		// Creating objects for taking screenshots
		Test_Percentage sc=new Test_Percentage();
		sc.takeScreenShot(driver, "c:\\Temp\\PercentResult");	// Passing the filename of screenshot
		
		//Creating a file
		File file=new File("C:\\Result.txt");
		
		//Writing on file
		FileWriter writer=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(writer);
		bw.write(S);
		bw.close();
		writer.close();
		
		driver.quit();

  }

  @DataProvider
  	public Object[][] dp() throws Exception
  {
	  	  Object[][] O=null;
	  
		  Workbook wb=Workbook.getWorkbook(new File("C:\\Data.xls"));	// file should be saved in xls format,not xlsx format
		  
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
		  
		  return O;
  }
  
}




