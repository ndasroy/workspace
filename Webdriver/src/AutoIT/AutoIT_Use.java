package AutoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT_Use {

	public static void main(String[] args) 
	{
		try
		{
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			
			driver.get("http://www.toolsqa.com/automation-practice-form/");
			driver.findElement(By.id("photo")).click();
			
			Runtime.getRuntime().exec("C:\\Fileupload.exe");
			
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
