package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page 
{

	private static WebElement element = null;
	
		public static WebElement Link_Login(WebDriver driver)
		{
			element=driver.findElement(By.xpath(".//*[@id='jriTop_signin9']"));
			return element;
		}
		
		public static WebElement Link_Logout(WebDriver driver)
		{
			element=driver.findElement(By.xpath(".//*[@id='jriTop_signOut']"));
			return element;
		}
}
