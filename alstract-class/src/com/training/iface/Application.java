package com.training.iface;

public class Application {

	// We are making it as an object to anything can be passed here 
	
	public static void print(Object conv, double args) {
		
		// is conv is an instance of Function or not
		if(conv instanceof Function) {
		System.out.println(((Function) conv).apply(args));
	}
	}
	public static void main(String[] args) {

		CurrencyConverter obj1 = new CurrencyConverter();
		print(obj1, 100); 
		TemperatureConverter obj2 = new TemperatureConverter();
		print(obj2, 34);

	}

}
