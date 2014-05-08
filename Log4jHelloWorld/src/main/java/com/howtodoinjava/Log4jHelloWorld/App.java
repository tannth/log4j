package com.howtodoinjava.Log4jHelloWorld;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 * 
 */
public class App {
	final static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("Hello World!");
	}
}
