package Calculator_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClick 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.calculator.net");
		driver.manage().window().maximize();
		
		Percent_Cal_PO.mathCalculator(driver).click();
		Percent_Cal_PO.percentCalculator(driver).click();
		Percent_Cal_PO.percentInnerPage1(driver).sendKeys("10");
		Percent_Cal_PO.percentInnerPage2(driver).sendKeys("400");
		Percent_Cal_PO.percentInnerPage4(driver).click();
	}
}
