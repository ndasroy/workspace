package Softedge_Selenium;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class webDrive_Test3 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// To handle dropdowns
//		Select serviceProvider = new Select(driver.findElement(By.xpath(".//*[@id='jriTop_signin9']")));
//		serviceProvider.selectByIndex(2);
		
		driver.findElement(By.xpath(".//*[@id='jriTop_signin9']")).click();
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("anil.shirole.jy@gmail.com");
		driver.findElement(By.xpath(".//*[@id='txtPasswd']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='imgbtnSignin']")).click();
		
		driver.findElement(By.xpath(".//*[@id='listingtable_ImgRecharge_5']")).click();
		String parentWin= driver.getWindowHandle();
		
		driver.findElement(By.linkText("View Popular Recharges")).click();
		
		// Enhanced "for" Loop
		for (String win:driver.getWindowHandles())
		{
			driver.switchTo().window(win);
			if(driver.getCurrentUrl().contains("JRIPopularRecharges.aspx"))
			{
				// within this loop,all the actions would be performed in new window.
				driver.findElement(By.linkText("951")).click();	
			}
		}
		
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath(".//*[@id='btnProceedtoPay']")).click();
		
		
		// Sign out
		driver.findElement(By.xpath(".//*[@id='jriTop_signOut']")).click();
		
	}
}
