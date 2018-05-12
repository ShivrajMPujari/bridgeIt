package com.bridgeIt.objectOriented.cliniqueManagement.controller;

import com.bridgeIt.objectOriented.cliniqueManagement.service.DoctorImp;
import com.bridgeIt.objectOriented.cliniqueManagement.service.PatientImp;

public class CliniqueManagementImp implements CliniqueManagement {
	
	DoctorImp doctorImp =new DoctorImp();
	PatientImp patientImp= new PatientImp();
	@Override
	public void addDoctor() {
		
		doctorImp.addDoctors();
		
	}

	@Override
	public void addPatient() {

		
		patientImp.addPatient();
		
	}

	@Override
	public void viewDoctors() {
	
		doctorImp.readDoctor();
	}

	@Override
	public void viewPatients() {
		
		patientImp.readPatient();
	}

	@Override
	public void popularSpecialization() {
		
		
		
	}

	@Override
	public void popularDoctor() {
		// TODO Auto-generated method stub
		
	}

}
