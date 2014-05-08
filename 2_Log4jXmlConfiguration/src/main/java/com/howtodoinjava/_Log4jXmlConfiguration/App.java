package com.howtodoinjava._Log4jXmlConfiguration;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Hello world!
 * 
 */
public class App {
	static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		// DOMConfigurator is used to configure logger from xml configuration
		// file
		DOMConfigurator.configure("log4j-config.xml");
		// Log in console in and log file
		logger.debug("Log4j xml configuration is successful !!");

	}
}
