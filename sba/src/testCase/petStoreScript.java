package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import datatable.excelHandle;
import pageFactory.petStore;
import pageFactory.petStoreFoodPage;
import util.util;

public class petStoreScript {
	protected static WebDriver driver;
	
  @Test
  public void findFoodPrice() throws Exception {
	  petStore.goToFoodPage();
	  petStoreFoodPage.sortFoodItems();
	  petStoreFoodPage.getFoodDetails();
	  util.takeScreenshot();
	  System.out.println("End of script");
  }
  
  @BeforeClass
  @Parameters("BROWSER")
  public void beforeClass(String browser) throws Exception {
	  
		 
	  if(browser.equalsIgnoreCase("Firefox"))
		  {
		  //System.setProperty("webdriver.firefox.marionette", "D:\\selenium\\driver\\geckodriver.exe");
		  
	  //System.setProperty("webdriver.chrome.driver", "D:\\selenium\\driver\\chromedriver.exe");
	 // driver=new InternetExplorerDriver(cap);
	  driver=new FirefoxDriver();
	  driver.get(excelHandle.getData(0, 0));
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  PageFactory.initElements(driver, petStore.class);
	  PageFactory.initElements(driver, petStoreFoodPage.class);
		  }
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
