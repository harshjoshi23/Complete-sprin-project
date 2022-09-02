package com.training.task3;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount(1000);
		
		// A very rare case 
		Thread firstThread = new Thread() {
			
			@Override
			public void run() {
				System.out.println("After Withraw: "+account.withraw(700));
//				account.withraw(7000);
			}
			
		};
		firstThread.start();
		
		Thread secondThread = new Thread() {
			
			
			// Annonymous Class
			@Override
			public void run() {
				System.out.println("Before Withraw: "+account.deposit(300));
//				account.deposit(3000);
			}
			
		};
		secondThread.start();

	}

}
