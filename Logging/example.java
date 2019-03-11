package com.java.practice;

import java.io.IOException;
import java.util.logging.*;

public class Logging {
	
	/* Creating Logger to capture the events
	 * 
	 * Root logger can be access by, Logger root = Logger.getLogger("");
	 * 
	 * SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST are the log levels
	 */
	
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void setUpLog() {
		
		LogManager.getLogManager().reset(); // This will get rid of any handlers the root logger has
		
		LOGGER.setLevel(Level.INFO); // This will make sure LOGGER object will log levels from INFO and above
		
		ConsoleHandler ch = new ConsoleHandler();  // create a console handler object
		ch.setLevel(Level.INFO); // set the console handler to capture events of INFO and above
		LOGGER.addHandler(ch); // adding console handler to the LOGGER
		
		FileHandler fh = null;
		
		try {
			fh = new FileHandler("myLogger.log");
			fh.setLevel(Level.FINE);
			LOGGER.addHandler(fh);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			LOGGER.log(Level.SEVERE, e.getMessage()); // writes event to the "myLogger.log" file
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			LOGGER.log(Level.SEVERE, e.getMessage()); // writes event to the "myLogger.log" file
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logging.setUpLog();
		
		LOGGER.info("main method executed!");
		try {
			throw new IOException("IO Exception");
		}
		catch (java.io.IOException e){
			LOGGER.log(Level.INFO, e.getMessage());
		}
		LOGGER.log(Level.SEVERE, "Severe Error Occured!");
	}

}
