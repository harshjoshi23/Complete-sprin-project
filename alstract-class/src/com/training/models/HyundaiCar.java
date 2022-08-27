package com.training.models;

import com.training.iface.Automobile;

public class HyundaiCar implements Automobile {

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Badass Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Creta";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1682323;
	}

}
