package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testCase.petStoreScript;
import junit.framework.Assert;

public class petStore extends petStoreScript{

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Dog')]")
	static WebElement doglink;
	
	@FindBy(how=How.LINK_TEXT,using="Food")
	static WebElement dogfoodlink;
	
	public static void goToFoodPage() throws Exception
	{
		Actions action = new Actions(driver);
		action.moveToElement(doglink).build().perform();
		//doglink.click();
		Thread.sleep(5000);
		dogfoodlink.click();
		Thread.sleep(5000);
	}
}
