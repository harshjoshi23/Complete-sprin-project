package com.example.demo.ifaces;

@FunctionalInterface

public interface Transformer {
	
	public double Transformer(String msg);
	public default void show(String msg) {
		System.out.println("Inside Message" + msg);
	}
}
