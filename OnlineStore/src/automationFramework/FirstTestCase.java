package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.annotations.*;
import java.util.ArrayList;
import javax.*;

public class FirstTestCase {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.redbus.in");
		WebElement Source = driver.findElement(By.id("txtSource"));
		WebElement Destination = driver.findElement(By.id("txtDestination"));
		WebElement DatePick = driver.findElement(By.id("txtOnwardCalendar"));
		WebElement sBtn = driver.findElement(By.id("searchBtn"));
		Source.sendKeys("Pune");
		Destination.sendKeys("Indore");
		DatePick.sendKeys("24-Dec-2014");
		
		//driver.wait(60);  
	
	
	}

	}
