package com.bridgeIt.objectOriented.cliniqueManagement.controller;

public interface CliniqueManagement {

	/**
	 * function adds the doctor in the clinic
	 */
	void addDoctor();
	
	/**
	 * function adds the patients in the clinic
	 */
	void addPatient();
	
	/**
	 * function displays the doctors in the clinic
	 */
	void viewDoctors();
	/**
	 * function displays the patients in the clinic
	 */
	void viewPatients();
	/**
	 * function checks the popular specialization in the clinic
	 */
	void popularSpecialization();
	/**
	 * 	/**
	 * function checks the popular doctors in the clinic
	 */
	void popularDoctor(); 
}
