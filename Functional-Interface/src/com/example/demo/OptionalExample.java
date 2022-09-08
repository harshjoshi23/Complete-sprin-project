package com.example.demo;
import java.util.*;
public class OptionalExample {
	public static void main(String[] args) {
		
		Optional<String> optional = Optional.empty();
		Optional<Integer> choice = Optional.of(Integer.valueOf(200));
		if(optional.isPresent()) System.out.println("Value is:- "+optional.get());
		System.out.println("Valude is not present.. ");
		
		choice.ifPresent(val -> System.out.println(val));
		
		Optional<String> another = Optional.empty();
		another.orElseThrow(()->new RuntimeException("Value Not Preent..!!"));
		

	}
}
