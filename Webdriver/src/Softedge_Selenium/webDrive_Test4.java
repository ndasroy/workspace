package Softedge_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDrive_Test4 
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
		
		driver.findElement(By.xpath(".//*[@id='listingtable_btnGridDelete_0']")).click();
		
		Alert deleteAlert= driver.switchTo().alert();
		deleteAlert.accept();
		
		// Sign out
		driver.findElement(By.xpath(".//*[@id='jriTop_signOut']")).click();
		
	}
}
