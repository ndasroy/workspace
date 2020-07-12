package com.sba.core;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class Runner 
{
	public static WebDriver driver = null;
	
	
	@BeforeTest
	@Parameters({"browser","iedriverpath"} )
	  public void beforeTest(String browser, String iedriverpath) 
	  {
		  if(browser.equalsIgnoreCase("firefox"))
		  {
			  driver = new FirefoxDriver();
		  }
		  else if(browser.equalsIgnoreCase("ie"))
		  {
			  GenericLibrary.killProcessIfRunning("IEDriverServer.exe");
			  File path = new File(System.getProperty("user.dir")+"\\"+iedriverpath);
			  System.setProperty("webdriver.ie.driver", path.getAbsolutePath());
			  
			  DesiredCapabilities capab = DesiredCapabilities.internetExplorer();

			  capab.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			  capab.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			  capab.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
			  
			  driver = new InternetExplorerDriver(capab);
		  }
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	
	
	  @Test
	  @Parameters({"url", "datapath", "outputpath"})
	  public void test(String url, String datapath, String outputpath) throws Exception
	  {
		  driver.get(url);
		 Thread.sleep(2000);
		 
		 datapath = System.getProperty("user.dir")+"\\"+datapath;
		 outputpath = System.getProperty("user.dir")+"\\"+outputpath;
		 
		 //fetching data from excel
		 String fromValue =  Utility.readExcel(datapath, "from");
		 String toValue =  Utility.readExcel(datapath, "to");
		 String adultValue =  Utility.readExcel(datapath, "adults");
		 String childrenValue =  Utility.readExcel(datapath, "childrens");
		 String pageTitle =  Utility.readExcel(datapath, "title");
		 
		 
		 //setting value to from
		 GenericLibrary.setValue(driver, PageObjectRepository.cleartrip_textbox_from, fromValue);
		 Thread.sleep(2000);
		 
		 //setting value to To
		 GenericLibrary.setValue(driver, PageObjectRepository.cleartrip_textbox_to, toValue);
		 Thread.sleep(2000);
		 
		 //selecting date
		 GenericLibrary.selectDate(driver, PageObjectRepository.cleartrip_calendar_date);
		 Thread.sleep(2000);
		 
		 //Select Adult
		 GenericLibrary.selectValue(driver, PageObjectRepository.cleartrip_dropdown_adult, adultValue);
		 Thread.sleep(2000);
		 

		 //Select Children
		 GenericLibrary.selectValue(driver, PageObjectRepository.cleartrip_dropdown_children, childrenValue);
		 Thread.sleep(2000);
		 
		 //click search flight
		 GenericLibrary.clickButton(driver, PageObjectRepository.cleartrip_button_searchflight);
		 Thread.sleep(10000);
		 
		 //click third book button
		 GenericLibrary.clickBookButton(driver, PageObjectRepository.cleartrip_button_book);
		 Thread.sleep(3000);
		 
		 //Store details
		 List<ArrayList<String>> allData = GenericLibrary.storeDetails(driver, PageObjectRepository.cleartrip_alldetails);
		 
		 
		//click continue booking button
		 GenericLibrary.clickButton(driver, PageObjectRepository.cleartrip_button_continuebooking);
		 Thread.sleep(2000);
		 
		 
		 //checking if any popup message appeared then clicking on Continue
		 GenericLibrary.clickOkContinue(driver, PageObjectRepository.cleartrip_button_okcontinue);
		 
		 
		 //Validate page title
//		 GenericLibrary.validatePageTitle(driver, PageObjectRepository.cleartrip_pagetitle, pageTitle);
		 Thread.sleep(2000);
		 
		 
		 //writing result
		 File op = new File(outputpath);
		 if(!op.exists())
		 {
			 op.mkdir();
		 }
		 Utility.writeToExcel(allData, op+"\\Result.xls");
		 Thread.sleep(3000);
		 
		 
		 //capturing screen shot and save
		 Utility.capturescreen(outputpath, "ScreenShot1");
		 //String path = System.getProperty("user.dir")+"\\output_ScreenShot\\";
		 // Utility.capturescreen(path, "screenShot1");
		 
	  }
  

  @AfterTest
  public void afterTest() 
  {
	  //closing browser
	  driver.quit();
  }

}