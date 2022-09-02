package com.task;

import java.util.Set;
import java.util.TreeSet;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int productID, int ratePerUnit, String productName, String type, String shelfLife
		FoodProduct Prod1 = new FoodProduct(1, 10, "Prod1", "veg", 4);
		FoodProduct Prod2 = new FoodProduct(2, 20, "Prod2", "nonveg", 3);
		FoodProduct Prod3 = new FoodProduct(3, 30, "Prod3", "veg", 1);
		FoodProduct Prod4 = new FoodProduct(4, 40, "Prod4", "vegan", 12);
		FoodProduct Prod5 = new FoodProduct(5, 50, "Prod5", "nonveg", 7);
		
//		(int productID, int ratePerUnit, String productName, String type, String material
		
		TextileProduct obj1 = new TextileProduct(6, 60, "obj1", "Shirt", "Cotton") ;
		TextileProduct obj2 = new TextileProduct(7, 70, "obj2", "Jeans", "Jute") ;
		TextileProduct obj3 = new TextileProduct(8, 80, "obj3", "Shirt", "Wool") ;
		TextileProduct obj4 = new TextileProduct(9, 90, "obj4", "Jeans", "Denim") ;
		TextileProduct obj5 = new TextileProduct(10, 100, "obj5", "other", "Nylon") ;
		
		Set<FoodProduct> foodProd = new TreeSet<>();
		Set<TextileProduct> textileProd = new TreeSet<>();
		
		System.out.println(foodProd.add(Prod1));
		System.out.println(foodProd.add(Prod2));
		System.out.println(foodProd.add(Prod3));
		System.out.println(foodProd.add(Prod4));
		System.out.println(foodProd.add(Prod5));
		
		System.out.println(textileProd.add(obj1));
		System.out.println(textileProd.add(obj2));
		System.out.println(textileProd.add(obj3));
		System.out.println(textileProd.add(obj4));
		System.out.println(textileProd.add(obj5));
		
		int count = 0;
		for(FoodProduct i: foodProd) {
			if(count>=2)
			System.out.println(i);
			count++;
		}
		
		int count2 = 0;

		for(TextileProduct i: textileProd) {
			if(count2>=2)
			System.out.println(i);
			count2++;

		}
		
		}
		

	}

