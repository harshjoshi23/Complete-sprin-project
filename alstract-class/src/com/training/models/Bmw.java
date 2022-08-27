package com.training.models;

import com.training.iface.Automobile;

public class Bmw implements Automobile {

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Navy Blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "X5";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 8927282;
	}

}
