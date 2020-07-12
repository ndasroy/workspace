package Logging;

import org.apache.log4j.Logger;

public class Project_Logging 
{
	static Logger log = Logger.getLogger(Project_Logging.class.getName());
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			log.debug("Hello this is a debug message");		// To explicitly putting logging msg,we need to write these.
			log.info("Hello this is an info message");
			log.error("Hello this is an error message");
			log.error("Hello this is an Selenium Error");
	}

}




