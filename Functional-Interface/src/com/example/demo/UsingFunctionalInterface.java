package com.example.demo;

import com.example.demo.ifaces.Converter;

public class UsingFunctionalInterface {
	// Lammbda exp as arg
	
	public static void print(Converter<Double,Double> conv){
		System.out.println();
	}
	
	public static void main(String[] args) {
		Converter<Double,Double> dlrToInr = 
				(dlr) -> dlr*90;
				
		Converter<Double,Double> EuroToInr = 
				(dlr) -> dlr*120;
												
				print(dlrToInr);
				print(EuroToInr);
				print((val)->val*100);
//			System.out.println(dlrToInr);
//			System.out.println(EuroToInr);
//			
			
//			System.out.println(dlrToInr);
//				System.out.println(dlrToInr.convert(100.00D)); 
	}

}
