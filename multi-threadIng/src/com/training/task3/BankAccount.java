package com.training.task3;

public class BankAccount {
	
	public double currentBalance;
//	
//	public BankAccount(double currentBalance) {
//		super();
//		  = currentBalance;
//	}
	
	
	public BankAccount(double currentBalance) {
		super();
		this.currentBalance = currentBalance;
	}
	public synchronized double deposit(double amount) {
		this.currentBalance = this.currentBalance+amount;
		notify();
		return this.currentBalance;
	}
	
	

	public synchronized double withraw(double amount) {
		if(this.currentBalance<amount) {
			System.out.println("Insufficient");
		}
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.currentBalance = this.currentBalance - amount;
		
		return this.currentBalance;
	}
	

}
