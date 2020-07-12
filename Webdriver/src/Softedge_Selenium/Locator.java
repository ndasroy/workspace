package Softedge_Selenium;

// File to save xpaths/locators
public class Locator 
{
//	These could be ideally static(so that everytime we should not create object to call) 
//		& final(so that one couldn't change it from elsewhere).
	
	public static final String SignIn=".//*[@id='jriTop_signin9']";
	public static final String UserName=".//*[@id='txtUserName']";
	public static final String Password=".//*[@id='txtPasswd']";
	public static final String SignIn_Submit=".//*[@id='imgbtnSignin']";
	public static final String SignOut=".//*[@id='jriTop_signOut']";
	
	
}
