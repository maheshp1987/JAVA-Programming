package com.logging;
import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.FileAppender;

public class LogUtility {
	public static Logger getLogger(Class<?> classm) {
		Logger logger = Logger.getLogger(classm);
		String logLevel = "INFO";
		String pattern = "%d{dd MMM yyyy HH:mm:ss} Level: %p  Class: %C Method: %M Message: %m %n";
		PatternLayout layout = new PatternLayout(pattern);
		FileAppender appender = null;

			try {
				appender = new FileAppender(layout, "demo.log", true);
			} catch (IOException ioException) {
					logger.error(ioException);
			}
			logger.addAppender(appender);
			if (logLevel.equalsIgnoreCase("INFO")) {
				logger.setLevel(Level.INFO);

			} else if (logLevel.equalsIgnoreCase("DEBUG")) {

				logger.setLevel(Level.DEBUG);

			} else if (logLevel.equalsIgnoreCase("WARN")) {

				logger.setLevel(Level.WARN);

			} else if (logLevel.equalsIgnoreCase("ERROR")) {

				logger.setLevel(Level.ERROR);

			} else if (logLevel.equalsIgnoreCase("FATAL")) {

				logger.setLevel(Level.FATAL);

			}
		return logger;
	}
}
