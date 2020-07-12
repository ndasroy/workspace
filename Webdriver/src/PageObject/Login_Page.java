package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page 
{

		private static WebElement element = null;
		
		public static WebElement txtbx_UserName(WebDriver driver)
		{
			element=driver.findElement(By.xpath(".//*[@id='txtUserName']"));
			return element;
		}
		
		public static WebElement txtbx_Password(WebDriver driver)
		{
			element=driver.findElement(By.xpath(".//*[@id='txtPasswd']"));
			return element;
		}
		
		public static WebElement btn_LogIn(WebDriver driver)
		{
			element=driver.findElement(By.xpath(".//*[@id='imgbtnSignin']"));
			return element;
		}
	
}
