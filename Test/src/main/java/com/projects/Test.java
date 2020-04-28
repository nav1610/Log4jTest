package com.projects;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	  private static final Logger logger = LogManager.getLogger(Test.class);  
	  public static void main(String[] args) {  
	   //BasicConfigurator.configure();  
	   //DOMConfigurator.configure("log4j.xml");
	   
	   logger.debug("Hello world");  
	   logger.info("we are in logger info mode");  
	   System.out.println("Done");
	}

}
