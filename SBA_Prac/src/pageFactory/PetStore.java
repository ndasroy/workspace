package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testCases.PetStoreScript;

public class PetStore extends PetStoreScript {
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Dog')]")
	static WebElement dogLink;
	
	@FindBy(how=How.LINK_TEXT,using="Food")
	static WebElement dogFoodLink;
	
	public static void goToFoodPage() throws Exception{
		
		Actions action= new Actions(driver);
		action.moveToElement(dogLink).build().perform();
		dogLink.click();
		Thread.sleep(5000);
		dogFoodLink.click();
		Thread.sleep(5000);
		
	}

}
