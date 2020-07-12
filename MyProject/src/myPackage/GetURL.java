package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetURL {

    public static void main(String[] args) {

       //Create a new instance of Firefox Browser
//       WebDriver gc = new FirefoxDriver();
    	
//    	System.setProperty("webdriver.chrome.driver", "D:\\Important Softwares\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
    	//WebDriver gc = new ChromeDriver();
    	WebDriver gc = new FirefoxDriver();
    
       gc.get("https://www.hp.com");
       gc.manage().window().maximize();
       String str = gc.getCurrentUrl();
       System.out.println("The current URL is :" + str);
       gc.close();
   }
}
