package com.training.models;

import com.training.iface.Automobile;

public class ToyotoCar implements Automobile {

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Off White";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Fortuner";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 4593834;
	}

}
