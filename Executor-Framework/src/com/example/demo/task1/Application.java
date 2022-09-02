package com.example.demo.task1;
import java.util.concurrent.*;

public class Application {
	public static void usingFixedThreadExecutor() {
		
		int processorCount = Runtime.getRuntime().availableProcessors();
		
		System.out.println("Processor Count:= "+processorCount);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		UsingPrintString[] tasks = {
				new UsingPrintString("Idly","Sambar"),
				new UsingPrintString("Tea","Biscut"),
				new UsingPrintString("Pizza","Coke"),
				new UsingPrintString("Paratha","Achar")
				
			};
			for(UsingPrintString i: tasks)
				service.submit(i);
			service.shutdown();


	}

	public static void usingSingleThreadExecutor() {
		ExecutorService service = Executors.newSingleThreadExecutor();
		UsingPrintString[] tasks = {
			new UsingPrintString("Idly","Sambar"),
			new UsingPrintString("Pizza","Coke"),
			new UsingPrintString("Paratha","Achar"),
			new UsingPrintString("Tea","Biscut")
			
		};
		for(UsingPrintString i: tasks)
			service.submit(i);
		
		service.shutdown();
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingFixedThreadExecutor();
		
}
}
