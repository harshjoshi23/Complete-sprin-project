package com.training.iface;

public class TemperatureConverter implements Function {

	@Override
	public double apply(double arg) {
		// TODO Auto-generated method stub
		return 5*(arg-32)/9;
	}

}
