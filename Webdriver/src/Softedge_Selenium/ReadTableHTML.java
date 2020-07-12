package Softedge_Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadTableHTML 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		
		webDrive_KeywordDriven sc=new webDrive_KeywordDriven();
		
		
		driver.findElement(By.xpath(Locator.SignIn)).click();
		driver.findElement(By.xpath(Locator.UserName)).sendKeys("anil.shirole.jy@gmail.com");	
		driver.findElement(By.xpath(Locator.Password)).sendKeys("123456");
		driver.findElement(By.xpath(Locator.SignIn_Submit)).click();

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
		driver.findElement(By.xpath(Locator.SignOut)).click();
		driver.quit();
	}

}
