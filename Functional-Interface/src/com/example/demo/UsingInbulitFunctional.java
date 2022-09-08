package com.example.demo;

import java.util.*;
import java.util.function.*;

public class UsingInbulitFunctional {

	public static void usingPrediate() {

		Predicate<Integer> result = (mark) -> mark>80;
		
		System.out.println("Is Pass:= "+result.test(90));
		System.out.println("Is Pass:= "+result.test(100));
		System.out.println("Is Pass:= "+result.negate().test(10));


		
		// Brlow 3 lines are equal to the lambda function 
//		Predicate<Integer> response = new Predicate<Integer>() {
//			// An overridden mwthod
//		};

	}
	
	public static void usingConsumer() {
		Consumer<String> printNames = (name) -> System.out.println(name);
		List<String> nameList = Arrays.asList("Harsh","Karsh","Barsh","Varsh");
		
		// Takes functional interface consumer as argument 
		nameList.forEach(printNames);
		System.out.println("------------------------Other Output------------------------");
		// Passing the reference of the method
		nameList.forEach(System.out::println);
		
	}
	
	public static void usingfunction() {
		Function<Double,Double> dlrToInr = (dlr) -> dlr*90;
		// We can use the other interface directly
		System.out.println(dlrToInr.apply(100.00D));
		
//		// T U are our argument and R is the returntype
//		BiFuncion<T,U,R> obj =  ;
//		System.out.println(obj );
		
	}
	public static void main(String[] args) {
		System.out.println("------------------------Prediate Interface------------------------");
		usingPrediate();
		System.out.println("------------------------Consumer Interface------------------------");
		usingConsumer();
		System.out.println("------------------------Functional Interface------------------------");
		usingfunction();
	}

}
