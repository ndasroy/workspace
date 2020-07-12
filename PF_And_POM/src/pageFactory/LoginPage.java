package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testCases.BookFlightScript;

public class LoginPage extends BookFlightScript {
	
	
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")
	static WebElement flightLink;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	static WebElement userName;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
	static WebElement passWord;

	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	static WebElement signInButton;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	static WebElement signOffButton;
	
	public static void loginToBooking() throws Exception{
		flightLink.click();
		userName.sendKeys("academy");
		passWord.sendKeys("academy");
		signInButton.click();
	}
	public static void signingOff() throws Exception{
		signOffButton.click();
	}
}
