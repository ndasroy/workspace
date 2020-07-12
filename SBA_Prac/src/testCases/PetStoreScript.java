package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import dataTable.ExcelHandle;
import pageFactory.PetStore;
import pageFactory.PetStoreFoodPage;
import util.util;

public class PetStoreScript {
	
	protected static WebDriver driver;
	
  @Test
  public void findFoodPrice() throws Exception{
//	  util.takeScreenshot();
	  PetStore.goToFoodPage();
	  PetStoreFoodPage.sortFoodItems();
	  PetStoreFoodPage.getFoodDetails();
	  util.takeScreenshot();
  }
  @BeforeClass
  @Parameters("BROWSER")
  public void beforeClass(String browser) throws Exception {
	  
	  if (browser.equalsIgnoreCase("FIREFOX")){
		  driver=new FirefoxDriver();
		  
	  }
	  else{
		  System.setProperty("webdriver.chrome.driver", "D:\\Important Softwares\\Selenium\\Chrome-IE_Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  
	  driver.get(ExcelHandle.getData(0, 0));
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  PageFactory.initElements(driver, PetStore.class);
	  PageFactory.initElements(driver, PetStoreFoodPage.class);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
