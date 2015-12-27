package com.example.maven;
import org.slf4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class);
	logger.info("Temperature has risen above 50 degrees.");
	//System.out.println( "Hello World!" );
    }
}
