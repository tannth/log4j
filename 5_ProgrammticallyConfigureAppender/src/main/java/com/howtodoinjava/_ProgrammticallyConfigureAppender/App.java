package com.howtodoinjava._ProgrammticallyConfigureAppender;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

/**
 * Hello world!
 * 
 */
public class App {
	private static final Logger log = Logger.getLogger(App.class);

	public static void main(String[] args) {
		// This is the root logger provided by log4j
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.DEBUG);

		// Define log pattern layout
		PatternLayout layout = new PatternLayout(
				"%d{ISO8601} [%t] %-5p %c %x - %m%n");

		// add console appender to root logger
		rootLogger.addAppender(new ConsoleAppender(layout));

		try {
			RollingFileAppender fileAppender = new RollingFileAppender(layout,
					"application.log");
			rootLogger.addAppender(fileAppender);
		} catch (IOException ex) {
			System.out.println("Failed to add appender !!");
		}

		// Let verify the log messages
		log.info("Welcome to www.HowToDoInJava.com");
		log.debug("Welcome to www.HowToDoInJava.com");
		log.error("Welcome to www.HowToDoInJava.com");
		log.fatal("Welcome to www.HowToDoInJava.com");

	}
}
