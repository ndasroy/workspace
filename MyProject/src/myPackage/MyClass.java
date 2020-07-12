package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyClass {

    public static void main(String[] args) {

       //Create a new instance of Firefox Browser
       WebDriver gc = new FirefoxDriver();

       gc.get("https://www.google.com");
       gc.manage().window().maximize();
       WebElement element = gc.findElement(By.name("q"));
       element.sendKeys("SAM");
       element.submit();
       //gc.close();
   }
}
