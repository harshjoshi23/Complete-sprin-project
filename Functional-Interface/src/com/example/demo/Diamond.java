package com.example.demo;

import com.example.demo.ifaces.Converter;
import com.example.demo.ifaces.Transformer;

public class Diamond implements Converter<String,String> ,Transformer{

	// Diamond Problem 2 interfaces having shame method show 
	// now diamond is confused which show to show 
//
//	@Override
//	public double Transformer(String msg) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
	
	
	@Override
	public String convert(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void show(String msg) {
		// TODO Auto-generated method stub
		Converter.super.show(msg);
		Transformer.super.show(msg);

	}
	

}
