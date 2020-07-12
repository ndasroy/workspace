package Selenium_Grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Grid 
{
	String URL = "http://www.calculator.net";
  @Test
  public void f() {
	  try
	  {
		  	DesiredCapabilities cap = DesiredCapabilities.firefox();
      		cap.setBrowserName("firefox");
      		String Node = "http://192.168.1.50:5555/wd/hub";
	//this ip will get when we connect to client. in browser type: 'localhost:4444'
	
      		WebDriver driver = new RemoteWebDriver(new URL(Node), cap);
    		  
      		driver.get(URL);
      // Puts an Implicit wait, Will wait for 40 seconds before throwing exception
      		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  }
	  catch(Exception e)
	  {
		  
	  }
  }
}


//Server
//java -jar selenium-server-standalone-2.45.0.jar -port 4444 -role hub -nodeTimeout 1000

//Client
//java -jar D:\JAR\selenium-server-standalone-2.45.0.jar -role node -hub http://10.30.217.157:4444/grid/register -browser browserName=firefox -port 5555
//
//10.30.217.157:4444:::  is server ip and port
//copied selenium-server-standalone-2.45.0.jar from 

