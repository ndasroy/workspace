package Softedge_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

public class JavaScripts 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		
		webDrive_KeywordDriven sc=new webDrive_KeywordDriven();
		
		
		driver.findElement(By.xpath(Locator.SignIn)).click();
		driver.findElement(By.xpath(Locator.UserName)).sendKeys("nab88@gmail.com");	
		driver.findElement(By.xpath(Locator.Password)).sendKeys("123456");
		
		// javascript to handle scrolling
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("window,scrollTo(0,document.body.scrollHeight)");
		
		// Right click
		Actions mouse=new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath(Locator.UserName))).contextClick().build().perform();
		
		
		//driver.findElement(By.xpath(Locator.SignIn_Submit)).click();

	}

}
