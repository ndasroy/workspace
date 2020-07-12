package Practice;

/* This file is used to write all the important codes with their proper syntax.These major code we've learned*/

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LearnedCode_NotToRun 
{
	// Taking Screenshot code
	
				int i=0;
				void takeScreenShot(WebDriver driver,String FileName)		// Catching the filename
				{
					try
					{
						i++;
						FileName=FileName+i+".jpg";
						TakesScreenshot screenShot=(TakesScreenshot)driver;// type casting of driver.
						File SrcFile=screenShot.getScreenshotAs(OutputType.FILE);// to get the getScreenshotAs method,we need to typecast
						FileUtils.copyFile(SrcFile, new File(FileName));
					}
					catch(Exception e)
					{
						
					}
				}
	public static void main()
			{
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.calculator.net/");
			
			// Creating objects for taking screenshots
			LearnedCode_NotToRun sc=new LearnedCode_NotToRun();
			sc.takeScreenShot(driver, "c:\\Temp\\Recharge");	// Passing the filename of screenshot
			
						
			// window maximizing
			driver.manage().window().maximize();
			
			// Implicit wait
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			//To handle drop-downs
			Select serviceProvider = new Select(driver.findElement(By.xpath(".//*[@id='jriTop_signin9']")));
			serviceProvider.selectByIndex(2);
			
			// Alert Handling
			Alert deleteAlert= driver.switchTo().alert();
			deleteAlert.accept();
						
			// Right click &  selecting through right click
			Actions mouse=new Actions(driver);
			mouse.moveToElement(driver.findElement(By.xpath(Locator.UserName))).contextClick().build().perform();
			mouse.moveToElement(driver.findElement(By.linkText("Create New Account"))).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
			
			
			// javascript to handle scrolling
			JavascriptExecutor js1= (JavascriptExecutor)driver;
			js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
			
			// Switching window starting
			
			String parentWin= driver.getWindowHandle();
			
			// Enhanced "for" Loop
					for (String win:driver.getWindowHandles())
					{
						// Switching window
						driver.switchTo().window(win);
						if(driver.getCurrentUrl().contains("JRIPopularRecharges.aspx"))
						{
							// within this loop,all the actions would be performed in new window.
							driver.findElement(By.linkText("951")).click();	
						}
					}
			// Going back to Parent window
			driver.switchTo().window(parentWin);
			
			
			// To read HTML Table from page
			List<WebElement> ListRow=driver.findElements(By.className("listrow"));
			
			for (WebElement row:ListRow)
			{
				//System.out.println(row.findElement(By.className("listcontent")).getText());	// getting 1st column of each row
				
				List<WebElement> ListCol=row.findElements(By.className("listcontent"));		// getting all columns of table
				
				for(WebElement col:ListCol)
				{
					System.out.print(col.getText()+"	");
				}
				System.out.println();
			}
					
			
			}
}
