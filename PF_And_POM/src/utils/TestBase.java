package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pageFactory.LoginPage;
import dataTable.ExcelHandle;

public class TestBase {
	protected static WebDriver driver;
	
	@BeforeClass
	  @Parameters("BROWSER")
	  public void beforeClass(String browser) throws Exception {
		  
		  if (browser.equalsIgnoreCase("FIREFOX")){
			  driver=new FirefoxDriver();
			  
		  }
		  else{
			  System.setProperty("webdriver.chrome.driver", "D:\\Important Softwares\\Selenium\\Chrome-IE_Drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
//			  driver=new InternetExplorerDriver();		//"webdriver.ie.driver"
		  }
		  
		  driver.get(ExcelHandle.getData(0, 0));
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  PageFactory.initElements(driver, LoginPage.class);
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
