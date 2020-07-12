package PO_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.Home_Page;
import PageObject.Login_Page;

public class TestPageObject1 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		
		Home_Page.Link_Login(driver).click();
		Login_Page.txtbx_UserName(driver).sendKeys("anil.shirole.jy@gmail.com");
		Login_Page.txtbx_Password(driver).sendKeys("123456");
		Login_Page.btn_LogIn(driver).click();
		
		Home_Page.Link_Logout(driver).click();
		
		driver.close();
		
	}
	
}
