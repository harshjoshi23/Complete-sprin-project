package com.training.models;

import com.training.iface.Automobile;

public class PolymorphismApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom saiCars = new ShowRoom(); 
		NewShowRoom saiCarsNew = new NewShowRoom();
//		Automobile auto = saiCars.modelFractory(Integer.parseInt(args[0]));
		
//		Input from user via command line.
////		Automobile auto2 = saiCarsNew.modelFractory(Integer.parseInt(args[0]));
		Automobile auto2 = saiCarsNew.modelFractory(3);

//		saiCars.PrintQuote(auto);
		saiCars.PrintQuote(auto2);


	}

}
