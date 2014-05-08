package com.howtodoinjava._Log4jPropertiesConfiguration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 * 
 */
public class App {
	static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		// PropertiesConfigurator is used to configure logger from properties
		// file
		PropertyConfigurator.configure("log4j.properties");

		logger.debug("Log4j appender configuration is successful !!");

	}
}
