package Softedge_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDrive_Test2 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		
		// Sign Up
		driver.findElement(By.xpath(".//*[@id='signup-link9']")).click();
		driver.findElement(By.xpath(".//*[@id='signup_name']")).sendKeys("Nabyendu");
		driver.findElement(By.xpath(".//*[@id='signup_mobileno']")).sendKeys("9556032257");
		
		driver.findElement(By.xpath(".//*[@id='signup_email']")).sendKeys("nbdasroy@gmail.com");
		driver.findElement(By.xpath(".//*[@id='signup_password']")).sendKeys("123456");
		
		driver.findElement(By.xpath(".//*[@id='checkbox1']")).click();
		driver.findElement(By.xpath(".//*[@id='checkbox']")).click();
		
		driver.findElement(By.xpath(".//*[@id='imgbtnSubmit']")).click();
		
		//Sign Out
		driver.findElement(By.xpath(".//*[@id='jriTop_signOut']")).click();
		
	}
}
