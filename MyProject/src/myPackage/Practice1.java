package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath(".//*[@id='jriTop_signin9']")).click();
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("anil.shirole.jy@gmail.com");
		driver.findElement(By.xpath(".//*[@id='txtPasswd']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='imgbtnSignin']")).click();
		
		
		
		
		driver.findElement(By.xpath(".//*[@id='jriTop_signOut']")).click();
		
		driver.close();
		
		
		
	}
}
