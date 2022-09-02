package com.task.service;

import java.util.Set;

import com.task.Product;

public class CartService {

	private TreeSet<FoodProduct> foodList;
	private TreeSet<TextileProduct> textileproduct;
	public CartService() {
		super();
		// TODO Auto-generated constructor stub
		
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
