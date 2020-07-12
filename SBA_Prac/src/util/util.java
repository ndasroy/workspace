package util;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testCases.PetStoreScript;

public class util extends PetStoreScript {
	
	public static void takeScreenshot() throws Exception{
		
		String dir=System.getProperty("user.dir");
		SimpleDateFormat dt=new SimpleDateFormat("yyyymmddhhmm");
		String filename=dir+"\\src\\testCases\\"+dt.format(new Date())+".jpg";
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(filename));
		
	}

}
