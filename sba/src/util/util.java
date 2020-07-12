package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testCase.petStoreScript;

public class util extends petStoreScript {
	
	public static void takeScreenshot() throws Exception
	{
		String dir = System.getProperty("user.dir");
		SimpleDateFormat dt = new SimpleDateFormat("yyyyymmddhhmm"); 
		String filename=dir + "\\"+ dt.format(new Date()) + ".png";
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(filename));
	}

}
