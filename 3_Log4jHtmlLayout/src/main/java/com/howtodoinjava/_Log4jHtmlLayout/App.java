package com.howtodoinjava._Log4jHtmlLayout;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 * 
 */
public class App {
	static final Logger log = Logger.getLogger(App.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("Sample debug message");
		log.info("Sample info message");
		log.error("Sample error message");
		log.fatal("Sample fatal message");
	}
}
