package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import testCases.PetStoreScript;

public class PetStoreFoodPage extends PetStoreScript {
	
	@FindBy(how=How.ID,using="sort")
	static WebElement sortDropDown;
	

	@FindBy(how=How.XPATH,using="//ul[@class='ProductList']/li/div[2]/span[1]/a")
	static WebElement firstFoodName;
	
	@FindBy(how=How.XPATH,using="//ul[@class='ProductList']/li/div[2]/span[2]")
	static WebElement firstFoodPrice;
	
	public static void sortFoodItems() throws Exception{
		
		Select S = new Select(sortDropDown);
		S.selectByValue("priceasc");
		//doglink.click();
		Thread.sleep(10000);
	}
	
	public static void getFoodDetails() throws Exception{
		System.out.println(firstFoodName.getText());
		System.out.println(firstFoodPrice.getText());
		Thread.sleep(10000);
		
	}

}
