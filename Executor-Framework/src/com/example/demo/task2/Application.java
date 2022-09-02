package com.example.demo.task2;

import java.util.concurrent.Callable;
//import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Application {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(8);

		try {
			Callable<Integer> task = new CountNumber(10);
			
			Future<Integer> response = service.submit(task);
			System.out.println("Task Status " + response.isDone());
			System.out.println("Future result is - " + " - " + response.get() + "; And Task done is " + response.isDone());
			
//			while(!response.isDone()) {
//				if(response.isDone()) {
//					System.out.println("Result: "+ response);
//				}
			
				System.out.println();
				TimeUnit.MILLISECONDS.sleep(50);
				System.out.println("Result:= " + response.get());
//			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		service.shutdown();
		
	}

}
