package com.training.task1;

public class NumberServiceTask implements Runnable {// Implements runnable 

	private String name;
	private NumberService service;
	private int countTo;
	
	public NumberServiceTask(String name, int countTo) {
		super();
		this.name = name;
		this.countTo = countTo;
		this.service = new NumberService();
		
		Thread thread = new Thread(this, name); // 2. Pass runnable thread constructor.
		thread.start(); // 3. Make the thread runnable by invoking start.
		
	}

	@Override
	public void run() {
		// Run method should be called here
		System.out.println(this.service.sumNumbers(countTo)); //The code that should run as a thread
		//run method gets called by thread scheduler. 
 
	}

}
