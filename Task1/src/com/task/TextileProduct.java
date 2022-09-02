package com.task;

import java.util.Objects;

public class TextileProduct extends Product implements Comparable<TextileProduct>{
//	public TextileProduct(int productID, int ratePerUnit, String productName) {
//		super(productID, ratePerUnit, productName);
//		// TODO Auto-generated constructor stub
//	}

	private String type, material;

	public TextileProduct(int productID, int ratePerUnit, String productName, String type, String material) {
		super(productID, ratePerUnit, productName);
		this.type = type;
		this.material = material;
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(material, type);
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
		TextileProduct other = (TextileProduct) obj;
		return Objects.equals(material, other.material) && Objects.equals(type, other.type);
	}

//	@Override
//	public String toString() {
//		return "TextileProduct [type=" + type + ", material=" + material + "]";
//	}

	
	
	@Override
	public int compareTo(TextileProduct o1) {
		// TODO Auto-generated method stub
		if (getRatePerUnit() < o1.getRatePerUnit())
			return -1;
		if (getRatePerUnit() > o1.getRatePerUnit())
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "TextileProduct [type=" + type + ", material=" + material + ", toString()=" + super.toString() + "]";
	}
	
	

	
	
}
