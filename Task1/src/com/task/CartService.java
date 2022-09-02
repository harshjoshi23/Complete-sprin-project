package com.task;

import java.util.Set;
import java.util.*;

import com.task.Product;


	private TreeSet<FoodProduct> foodList;
	private TreeSet<TextileProduct> textileList;
	
	public CartService() {
		super(); 
		this.foodList = new TreeSet();
		this.textileList = new TreeSet();
	}
	
	
	public Collection<Product> findTopThree(int ch){
		Set<Product> topThree = new TreeSet<Product>();
		if(ch == 1) {
			int idx = 0;
			for(int i=0; i<=2; i++) {
				topThree = NULL;
		}		
		}
		if(ch == 2) {
			for(int i=0;i<=2;i++) {
//				topThree.add(this..get(i));
				break;
			}
		}
		return topThree;
		
				
	} 

}
