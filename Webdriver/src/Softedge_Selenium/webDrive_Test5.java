package Softedge_Selenium;

import java.util.concurrent.TimeUnit;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDrive_Test5
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
		
		webDrive_Test5 sc=new webDrive_Test5();
		sc.takeScreenShot(driver, "c:\\Temp\\Recharge");	// Passing the filename of screenshot
		
		driver.findElement(By.xpath(".//*[@id='jriTop_signin9']")).click();
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("anil.shirole.jy@gmail.com");
		
		sc.takeScreenShot(driver, "c:\\Temp\\Recharge");
		
		driver.findElement(By.xpath(".//*[@id='txtPasswd']")).sendKeys("123456");
		
		sc.takeScreenShot(driver, "c:\\Temp\\Recharge");
		
		driver.findElement(By.xpath(".//*[@id='imgbtnSignin']")).click();
		
		sc.takeScreenShot(driver, "c:\\Temp\\Recharge");
		
		// Sign out
		driver.findElement(By.xpath(".//*[@id='jriTop_signOut']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
		//driver.quit();
	}
}
