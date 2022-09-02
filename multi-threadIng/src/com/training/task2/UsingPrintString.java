package com.training.task2;

public class UsingPrintString implements Runnable {

	
	  public String str1;
	    public String str2;
	    

	   public UsingPrintString(String str1, String str2) {
	        super();
	        this.str1 = str1;
	        this.str2 = str2;
	        
	        Thread thread = new Thread(this);
	        thread.start();
	    }

	   @Override
	    public void run() {
	        PrintString.print(str1, str2);



	   }
}
