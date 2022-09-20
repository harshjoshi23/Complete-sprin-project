
package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import lombok.Data;

@Data
public class MobilePlan {
	public MobilePlan() {
		super() ; 
	}
	
//	public MobilePlan(int planId, String planName, double cost, String validity) {
//		super();
//		this.planId = planId;
//		this.planName = planName;
//		this.cost = cost;
//		this.validity = validity;
//	}
	
	private int planId;
	private String planName;
	private double cost;
	private String validity;
}


