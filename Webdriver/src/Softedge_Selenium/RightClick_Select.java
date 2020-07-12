package Softedge_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Select 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		System.out.println(driver.findElement(By.xpath(Locator.SignIn)).getAttribute("id"));
		// Right click
//		Actions mouse=new Actions(driver);
//		mouse.moveToElement(driver.findElement(By.linkText("Create New Account"))).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

	}

}
