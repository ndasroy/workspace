package Softedge_Selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clicking_Number 
{

	public static void main(String[] args) 
	{

		Scanner S=new Scanner(System.in);
		System.out.println("Enter the 10 digit mobile number to recharge");
		String M=S.next();
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.justrechargeit.com");
		driver.manage().window().maximize();
		
				
		driver.findElement(By.xpath(Locator.SignIn)).click();
		driver.findElement(By.xpath(Locator.UserName)).sendKeys("anil.shirole.jy@gmail.com");	
		driver.findElement(By.xpath(Locator.Password)).sendKeys("123456");
		driver.findElement(By.xpath(Locator.SignIn_Submit)).click();

		
		List<WebElement> ListRow=driver.findElements(By.className("listrow"));
		
		int i=0;
		for (WebElement row:ListRow)
		{
			//System.out.println(row.findElement(By.className("listcontent")).getText());	// getting 1st column of each row
			
			List<WebElement> ListCol=row.findElements(By.className("listcontent"));		// getting all columns of table
			
			for(WebElement col:ListCol)
			{
				//System.out.print(col.getText()+"	");
				if(col.getText().equals(M))
				{
					row.findElement(By.id("listingtable_lnkRecharge_"+i)).click();
					break;
				}
				
			}
			i++;
			System.out.println("Number is not present");
			System.out.println();
		}
	}

}
