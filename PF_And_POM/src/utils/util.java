package utils;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testCases.BookFlightScript;
import utils.TestBase;

public class util extends BookFlightScript {
	
	public static void takeScreenshot() throws Exception{
		
		String dir=System.getProperty("user.dir");
		SimpleDateFormat dt=new SimpleDateFormat("yyyyMMddhhmmss");
		String filename=dir+"\\src\\"+dt.format(new Date())+".jpg";
		
		File scrFile=((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.FILE);			
		FileUtils.copyFile(scrFile, new File(filename));
		
	}

}
