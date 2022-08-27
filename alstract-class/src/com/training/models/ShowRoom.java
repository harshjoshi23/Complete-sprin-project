package com.training.models;
import com.training.iface.Automobile;

public class ShowRoom {
	
	public void PrintQuote(Automobile polyAuto)
    {
        System.out.println(polyAuto.getColour());
        System.out.println(polyAuto.getModel());
        System.out.println(polyAuto.getPrice());
    }
    
    public Automobile modelFractory(int key)
    {
        switch(key)
        {
        case 1: return new MarutiCar(); 
        case 2: return new ToyotoCar();
        case 3: return new HyundaiCar(); 
        default: 
        	return null;
        
        }
    }
	

}
