package Test.Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.justrechargeit.com");
	  driver.manage().window().maximize();
  }
}
