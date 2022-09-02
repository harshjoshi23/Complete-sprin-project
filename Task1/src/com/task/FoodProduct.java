package com.task;

import java.util.Objects;

public class FoodProduct extends Product implements Comparable<FoodProduct> {
	private String type;
	int shelfLife;
	



	@Override
	public String toString() {
		return "FoodProduct [type=" + type + ", shelfLife=" + shelfLife + ", toString()=" + super.toString() + "]";
	}


	public FoodProduct(int productID, int ratePerUnit, String productName, String type, int shelfLife) {
		super(productID, ratePerUnit, productName);
		this.shelfLife = shelfLife;
		this.type = type;

	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(shelfLife, type);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodProduct other = (FoodProduct) obj;
		return Objects.equals(shelfLife, other.shelfLife) && Objects.equals(type, other.type);
	}


//	@Override
//	public String toString() {
//		return "FoodProduct [type=" + type + ", shelfLife=" + shelfLife + "]";
//	}


	@Override
	public int compareTo(FoodProduct otherObj) {
		// TODO Auto-generated method stub
		if (this.getRatePerUnit() < otherObj.getRatePerUnit())
			return -1;
		if (this.getRatePerUnit() > otherObj.getRatePerUnit())
			return 1;
		return 0;
//		return 0;
	}
	
	
	
	

}
