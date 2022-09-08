package com.training.log4j_example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
import org.apache.logging.log4j.*;

public class App 
{
	
	private static final Logger logger = LogManager.getRootLogger();
	
    public static void main( String[] args )
    {
    	logger.info( "Hello World!" );
        
        logger.info("Enter  a number from 0 to 100 ");
        Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();
        		 logger.info("You inserted the number:"+number);
       if(number > 100) {
    	   logger.error("You entered a wrong number!");
           throw new RuntimeException("Wrong Number");
       } else {
    	   logger.debug("Number is smaller than 100, -correct!");
       }

    }
}
