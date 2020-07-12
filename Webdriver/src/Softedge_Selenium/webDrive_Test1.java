package Softedge_Selenium;

// We've hard coded Locators & Data.

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDrive_Test1 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='jriTop_signin9']")).click();
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("anil.shirole.jy@gmail.com");
		driver.findElement(By.xpath(".//*[@id='txtPasswd']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='imgbtnSignin']")).click();
		
		driver.findElement(By.xpath(".//*[@id='divLnkAddMobile']/a")).click();
		try
		{
			driver.findElement(By.xpath(".//*[@id='txtpopMobileNo']")).sendKeys("9556032256");
			//driver.wait(15);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Exception e=new Exception();
			throw e;
		}
		catch(Exception e)
		{
			
			
		}
		
		driver.findElement(By.xpath(".//*[@id='txtpopMobileNickname']")).sendKeys("Airtel");
		driver.findElement(By.xpath(".//*[@id='btnPopupAddMobile']")).click();
		
		// Sign out
		driver.findElement(By.xpath(".//*[@id='jriTop_signOut']")).click();
		
	}
}
