package com.training.listners;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ContextListner
 *
 */
@WebListener
public class ContextListner implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public ContextListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("Session Id: " + se.getSession().getId());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    // Its method from super class so we can't have error
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	// Apply
    	PrintWriter out = null;
    	 try {
			out = new PrintWriter(new FileWriter(new File("count.txt"), false));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	out.println(count);
    	out.close();
    	
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("Value Remove: "+se.getName());
    	se.getSession().setAttribute("details", "Added by Listner");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 

    }
    int count;

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	
//    	BufferedReader reader = null;
    	try {
    		BufferedReader reader =	new BufferedReader(new FileReader(new File("count.txt")));
    		int count = 0;
    		String line = null;
    		while((line=reader.readLine())!= null) {
    			count = Integer.parseInt(line);
    		}
    	}
    	catch(Exception e) 
    	{
    	e.printStackTrace();	
    	}
    	sce.getServletContext().setAttribute("count", count);
    }
	
}
