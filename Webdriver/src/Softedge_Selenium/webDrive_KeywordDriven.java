package Softedge_Selenium;

// If application is very dynamic,xpaths are saved in excel sheets,else saved in java class file

import java.util.concurrent.TimeUnit;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDrive_KeywordDriven
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
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		
		webDrive_KeywordDriven sc=new webDrive_KeywordDriven();
		
		
		driver.findElement(By.xpath(Locator.SignIn)).click();
		driver.findElement(By.xpath(Locator.UserName)).sendKeys("anil.shirole.jy@gmail.com");	
		driver.findElement(By.xpath(Locator.Password)).sendKeys("123456");
		driver.findElement(By.xpath(Locator.SignIn_Submit)).click();
		
		sc.takeScreenShot(driver, "c:\\Temp\\Recharge");	// Taking screenshot
		
		// Sign out
		driver.findElement(By.xpath(Locator.SignOut)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
		//driver.quit();
	}
}
