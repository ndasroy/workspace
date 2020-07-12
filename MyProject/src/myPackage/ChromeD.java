package myPackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeD {

	@Test
	public void mMercuryReg() throws Exception {

		System.setProperty("webdriver.chrome.driver","D:\\Important Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		System.setProperty("webdriver.ie.driver","D:\\Important Softwares\\Selenium\\Chrome-IE_Drivers\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();

		// Open Home Page
		driver.get("www.hp.com");
		// Enter text in search box
//		WebElement fname = driver.findElement(By.name("firstName"));
//		fname.clear();
//		fname.sendKeys("firstName");
		driver.quit();
	}
}