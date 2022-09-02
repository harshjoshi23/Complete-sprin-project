package com.task;

import java.util.Objects;

public class Product {
	private int productID, ratePerUnit;
	private String productName;
	
	public Product(int productID, int ratePerUnit, String productName) {
		super();
		this.productID = productID;
		this.ratePerUnit = ratePerUnit;
		this.productName = productName;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(int ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productID, productName, ratePerUnit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productID == other.productID && Objects.equals(productName, other.productName)
				&& ratePerUnit == other.ratePerUnit;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", ratePerUnit=" + ratePerUnit + ", productName=" + productName
				+ "]";
	}
	
	

}
