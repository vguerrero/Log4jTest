package org.vmgs.corp;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
/**
 * Hello world!
 *
 */
public class App 
{
static final Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
		PropertyConfigurator.configure("log4j.properties");

		logger.debug("Sample debug message");

		logger.info("Sample info message");

		logger.warn("Sample warn message");

		logger.error("Sample error message");

		logger.fatal("Sample fatal message");
				//System.out.println( "Hello World!" );
    }
}
