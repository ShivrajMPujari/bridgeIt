package com.bridgeIt.objectOriented.cliniqueManagement.model;

import java.util.HashMap;
import java.util.LinkedList;

public class Doctor {
	
	private String name;
	private String mobileNumber;
	private int id;
	public HashMap <String,LinkedList<Patient>> patientlist=new HashMap<String,LinkedList<Patient>> ();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
