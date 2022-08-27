package com.training.models;

import com.training.iface.Automobile;

public class NewShowRoom extends ShowRoom {

//	public NewShowRoom() {
//		super();
//	}
// Overloasding method
	public Automobile modelFractory(int key)
	    {
	        switch(key)
	        {
	        case 4: return new Bmw();
	        }
			return super.modelFractory(key);
	        }

}
