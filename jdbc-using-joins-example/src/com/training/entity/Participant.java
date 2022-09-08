package com.training.entity;

public class Participant {
	private int id;
	private String firstName;
	private String email;
	public Participant(int id, String firstName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.email = email;
	}
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
