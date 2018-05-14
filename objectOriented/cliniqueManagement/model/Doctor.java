package com.bridgeIt.objectOriented.cliniqueManagement.model;

import java.util.HashMap;
import java.util.LinkedList;

public class Doctor {

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", specialization=" + specialization + ", id=" + id + ", availability="
				+ availability + "]";
	}
	private String name;
	private String specialization;
	private String id;
	private String availability;
	public HashMap <String,LinkedList<Patient>> patientlist=new HashMap<String,LinkedList<Patient>> ();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
}
