package com.howtodoinjava._Log4jSocketAppender;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 * 
 */
public class App {
	static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		// PropertiesConfigurator is used to configure logger from properties
		// file
		PropertyConfigurator.configure("log4j.properties");

		// These logs will be sent to socket server as configured in log4j.xml
		logger.error("Log4j socket appender test run successfully!!");
	}
}
