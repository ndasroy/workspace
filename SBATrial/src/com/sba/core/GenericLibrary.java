package com.sba.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericLibrary 
{
	/**
	 * Method to enter text
	 * @param driver
	 * @param xpath
	 * @param value
	 */
	public static void setValue(WebDriver driver, String xpath, String value)
	{
		try
		{
			WebElement textBox = driver.findElement(By.xpath(xpath));
			highlighter(driver, textBox);
			textBox.clear();
			textBox.sendKeys(value);
			textBox.sendKeys(Keys.TAB);
		}
		catch(Exception ex)
		{
			System.out.println("TextBox object Not found");
		}
	}
	
	
	/**
	 * Method to select value from dropdown
	 * @param driver
	 * @param xpath
	 * @param value
	 */
	public static void selectValue(WebDriver driver, String xpath, String value)
	{
		try
		{
			Select dropDown = new Select(driver.findElement(By.xpath(xpath)));
			highlighter(driver, driver.findElement(By.xpath(xpath)));
			dropDown.selectByVisibleText(value);
		}
		catch(Exception ex)
		{
			System.out.println("DropDown object Not found");
		}
	}
	
	
	/**
	 * Method to click button
	 * @param driver
	 * @param xpath
	 */
	public static void clickButton(WebDriver driver, String xpath)
	{
		try
		{
			WebElement button = driver.findElement(By.xpath(xpath));
			highlighter(driver, button);
			button.click();
		}
		catch(Exception ex)
		{
			System.out.println("Button object Not found");
		}
	}
	
	
	/**
	 * Method to select tomorrows date
	 * @param driver
	 * @param xpath
	 * @throws ParseException
	 */
	public static void selectDate(WebDriver driver, String xpath) throws ParseException
	{
		SimpleDateFormat df = new SimpleDateFormat("d-MM-yy");
		Date dt = new Date();
		String currentDate = df.format(dt);
		SimpleDateFormat sdf = new SimpleDateFormat("d-MM-yy");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(currentDate));
		c.add(Calendar.DATE, 1);
		String tomorrowsDate = sdf.format(c.getTime());
		String dateToBeSelected = tomorrowsDate.split("-")[0];
		if (dateToBeSelected.equals("32"))
		{
			dateToBeSelected="1";
		}
		
		xpath = xpath.replaceAll("@value", dateToBeSelected);
		
		WebElement dateElement = driver.findElement(By.xpath(xpath));
		highlighter(driver, dateElement);
		dateElement.click();
		
	}
	
	
	/**
	 * Method to click third book button
	 * @param driver
	 * @param xpath
	 * @throws InterruptedException
	 */
	public static void clickBookButton(WebDriver driver, String xpath) throws InterruptedException
	{
		List<WebElement> allButton = driver.findElements(By.xpath(xpath));
		
		if((allButton.size())!=0)
		{
			WebElement desiredButton = allButton.get(2);
			highlighter(driver, desiredButton);
			desiredButton.click();
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("Book button not found");
		}
	}
	
	
	/**
	 * Method to store details data
	 * @param driver
	 * @param xpath
	 * @return
	 */
	public static List<ArrayList<String>> storeDetails(WebDriver driver, String xpath)
	{
		List<ArrayList<String>> allData = new ArrayList<ArrayList<String>>();
		ArrayList<String> header = new ArrayList<String>();
		ArrayList<String> data = new ArrayList<String>();
		try
		{
			header.add("Details");
			header.add("Date");
			header.add("Time");
			allData.add(header);
			
			WebElement detailsElement = driver.findElement(By.xpath(xpath));
			highlighter(driver, detailsElement);
			String totaldata = detailsElement.getText();
			String Details = (totaldata.split("London"))[0]+"London";
			String Date = ((totaldata.split("London"))[1]).split("\\n")[0];
			String time = ((totaldata.split("\\n"))[1]).split(":")[1];
			data.add(Details);
			data.add(Date);
			data.add(time);
			allData.add(data);
		}
		catch(Exception ex)
		{
			
		}
		return allData;
	}
	
	
	
	/**
	 * Method to validate page title
	 * @param driver
	 * @param xpath
	 * @param expectedValue
	 */
	public static void validatePageTitle(WebDriver driver, String xpath, String expectedValue)
	{
		WebElement titleElement = driver.findElement(By.xpath(xpath));
		highlighter(driver, titleElement);
		String title = titleElement.getText();
		
		if(title.equals(expectedValue))
		{
			System.out.println("Page title matched");
		}
		else
		{
			System.out.println("Page title not matched. Coming as \""+title+"\"");
		}
	}
	
	
	/**
	 * Method to click on continue button if its appeared 
	 * @param driver
	 * @param xpath
	 */
	public static void clickOkContinue(WebDriver driver, String xpath)
	{
		try
		{
			WebElement button = driver.findElement(By.xpath(xpath));
			highlighter(driver, button);
			if(button.isDisplayed())
			{
				button.click();
				Thread.sleep(5000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Ok, Continue message not appeared");
		}
	}
	
	
	
	/**
	 * Method to highlight object for run time understanding
	 * @param driver
	 * @param element
	 */
	public static void highlighter(WebDriver driver, WebElement element)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			for(int i=0;i<=3;i++)
			{
				js.executeScript("arguments[0].style.border='3px solid #3300FF'", element);
				Thread.sleep(150);
				js.executeScript("arguments[0].style.border=''", element);
				Thread.sleep(150);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error in highlighter");;
		}
	}
	
	
	/**
	 * Method to kill any process
	 * @param processToKill
	 */
	public static void killProcessIfRunning(String processToKill) 
	{
		try{
		
			String line;
			String pidInfo ="";

			Process p =Runtime.getRuntime().exec(System.getenv("windir")+"\\system32\\tasklist.exe");

			BufferedReader input =  new BufferedReader(new InputStreamReader(p.getInputStream()));

			while ((line = input.readLine()) != null) {
			    pidInfo+=line; 
			}

			input.close();

			if(pidInfo.contains(processToKill))
			{
			   Runtime.getRuntime().exec("taskkill /F /IM " + processToKill);
			}

			p.destroy();
		}
		catch (Exception e) 
		{
			System.out.println("Error in closing iedriver process");
		}
	}

}
