package com.logging;
import org.apache.log4j.Logger;

public class DemoLogging {
	// set Logger

	private static final Logger logger = LogUtility.getLogger(DemoLogging.class);
     public static void main(String... a)
     {
    	 logger.info("hello");
      	 logger.info("This is info log");
         logger.warn("This is warn msg");
         logger.error("This is error msg");
    }
    
}