package pageFactory;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import testCase.petStoreScript;
import junit.framework.Assert;

public class petStoreFoodPage extends petStoreScript {

	@FindBy(how=How.ID,using="sort")
	static WebElement sortDropDown;
	

	@FindBy(how=How.XPATH,using="//ul[@class='ProductList']/li/div[2]/span[1]/a")
	static WebElement firstFoodName;
	
	@FindBy(how=How.XPATH,using="//ul[@class='ProductList']/li/div[2]/span[2]")
	static WebElement firstFoodPrice;
	
	public static void sortFoodItems() throws Exception
	{
		Select s=new Select(sortDropDown);
		s.selectByValue("priceasc");
		//doglink.click();
		Thread.sleep(10000);
		
	}
	
	public static void getFoodDetails() throws Exception
	{
		System.out.println(firstFoodName.getText());
		System.out.println(firstFoodPrice.getText());
		Thread.sleep(10000);
		
	}
	
	
}
