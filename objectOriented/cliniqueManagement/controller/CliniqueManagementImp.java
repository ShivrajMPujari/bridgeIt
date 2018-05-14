package com.bridgeIt.objectOriented.cliniqueManagement.controller;

import org.json.simple.JSONObject;

import com.bridgeIt.objectOriented.cliniqueManagement.model.Doctor;
import com.bridgeIt.objectOriented.cliniqueManagement.model.Patient;
import com.bridgeIt.objectOriented.cliniqueManagement.service.Appointment;
import com.bridgeIt.objectOriented.cliniqueManagement.service.DoctorImp;
import com.bridgeIt.objectOriented.cliniqueManagement.service.DoctorSearchImp;
import com.bridgeIt.objectOriented.cliniqueManagement.service.PatientImp;
import com.bridgeIt.objectOriented.cliniqueManagement.service.PatientSearchImp;
import com.bridgeIt.objectOriented.cliniqueManagement.service.Popularity;
import com.bridgeIt.utility.Utility;

public class CliniqueManagementImp implements CliniqueManagement {
	
	DoctorImp doctorImp =new DoctorImp();
	PatientImp patientImp= new PatientImp();
	Appointment appointment= new Appointment();
	DoctorSearchImp doctorSearch= new DoctorSearchImp();
	PatientSearchImp patientSearch= new PatientSearchImp();
	Popularity popular=new Popularity();
	@Override
	public void addDoctor() {
		
		Doctor doctor=doctorImp.addDoctors();
		System.out.println(doctor);
		JSONObject doctors=doctorImp.readDoctor();
		System.out.println(doctors);
		doctorImp.writeDoctor(doctor,doctors);
		
	}

	@Override
	public void addPatient() {
		Patient patient=patientImp.addPatient();
		System.out.println(patient);
		JSONObject patients=patientImp.readPatient();
		System.out.println();
		patientImp.writePatient(patient, patients);
	}

	@Override
	public void viewDoctors() {
	
		JSONObject doctors=doctorImp.readDoctor();
		System.out.println("1.Take Appointment  2.Search Doctor  3.View all appointments 4.Back");
		int choice = Utility.inputInt();
		int loop=7;
		while(loop==7){
			
			switch(choice){
			case 1:{
				appointment.takeAppointment();
				choice=4;
				loop=6;
				break;
			}
			case 2:{
				
				System.out.println("Search by:- ");
				System.out.println("1.ByName 2.ById 3.BySpecialization 4.ByAvailabilty");
				int choose=Utility.inputInt();
			
				switch(choose){
				
				case 1:{
					System.out.println("Enter the name of the doctor");
					Object name=Utility.inputStringLong();
					JSONObject doctor=doctorSearch.byName(doctors, name);
					doctorImp.readOneAppointment(doctor.get("Id"));
					System.out.println("1.Take Appointment  2.Search Doctor 3.Back");
					choice = Utility.inputInt();
					break;
				}
				case 2:{
					
					System.out.println("Enter the Id of the doctor");
					Object id=Utility.inputString();
					JSONObject doctor=doctorSearch.byId(doctors, id);
					JSONObject appointments=doctorImp.readOneAppointment(doctor.get("Id"));
					System.out.println(appointments);
					System.out.println("1.Take Appointment  2.Search Doctor 3.Back");
					choice = Utility.inputInt();
					break;
					
				}
				case 3:{
					
					System.out.println("Enter the Specialization of the doctor");
					Object specialization=Utility.inputStringLong();
					JSONObject doctor=doctorSearch.bySpecilization(doctors, specialization);
					JSONObject appointments=doctorImp.readOneAppointment(doctor.get("Id"));
					System.out.println(appointments);
					System.out.println("1.Take Appointment  2.Search Doctor 3.Back");
					choice = Utility.inputInt();
					break;
				}
				case 4:{
					
					System.out.println("Enter the Availabilty of the doctor");
					Object availabilty=Utility.inputLong();
					JSONObject doctor=doctorSearch.byAvailability(doctors, availabilty);
					JSONObject appointments=doctorImp.readOneAppointment(doctor.get("Id"));
					System.out.println(appointments);
					System.out.println("1.Take Appointment  2.Search Doctor 3.Back");
					choice = Utility.inputInt();
					break;
				}
				default:{
					
					System.out.println("Entered wrong option");
					System.out.println("1.Take Appointment  2.Search Doctor 3.Back");
					choice = Utility.inputInt();
					break;
				}
				
				}	
				
			}
			case 3:{
				doctorImp.readDoctorAppointments();
				
			}
			case 4:{
				
				loop=5;
				break;
			}
			}
		}

	}

	@Override
	public void viewPatients() {
		
	JSONObject patient=patientImp.readPatient();
	System.out.println("1.Add patients  2.Search Patient 3.Back");
	int option= Utility.inputInt();
	int num=0;
	while(num==0){
		
		switch(option){
		
		case 1:{
			
			addPatient();
			System.out.println("1.Add patients  2.Search Patient 3.Back");
			option= Utility.inputInt();
			break;
		}
		case 2:{
			System.out.println("Search patients by:-");
			System.out.println("1.ID  2.Name  3.Mobile Number");
			int choice = Utility.inputInt();
			switch(choice){
				
			case 1:{
				
				System.out.println("Enter the id of the patient");
				Object id =Utility.inputString();
				JSONObject searchedPatient=patientSearch.byId(patient, id);
				System.out.println(searchedPatient);
				break;
			}
				
			case 2:{
				
				System.out.println("Enter the name of the patient");
				Object name=Utility.inputStringLong();
				JSONObject searchedPatient=patientSearch.byName(patient, name);
				System.out.println(searchedPatient);
				break;
			}
			case 3:{
				
				System.out.println("Enter the Mobile number of the patient");
				Object mobNo=Utility.inputString();
				JSONObject searchedPatient=patientSearch.byMobNo(patient, mobNo);
				System.out.println(searchedPatient);
				break;
			}
			}	
		}
		case 3:{
			
			num=1;
			break;
			
		}
		}
		
		
	}
	
	}

	@Override
	public void popularSpecialization() {
		
		popular.popularSpecilization();
		
	}

	@Override
	public void popularDoctor() {

		popular.popularDoctor();
	}

}
