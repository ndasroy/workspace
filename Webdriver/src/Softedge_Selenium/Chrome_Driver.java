package Softedge_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Chrome_Driver 
{

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important Softwares\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath(Locator.SignIn)).click();
		driver.findElement(By.xpath(Locator.UserName)).sendKeys("nab88@gmail.com");	
		driver.findElement(By.xpath(Locator.Password)).sendKeys("123456");

		driver.findElement(By.xpath(Locator.SignIn_Submit)).click();
	}

}
