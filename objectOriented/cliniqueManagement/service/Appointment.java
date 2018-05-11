package com.bridgeIt.objectOriented.cliniqueManagement.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgeIt.utility.Utility;

public class Appointment {

	public void takeAppointment(){
		DoctorImp doctors =new DoctorImp();
		PatientImp patients=new PatientImp(); 
		JSONObject allDoctors= doctors.readDoctor();
		JSONObject allpatient=patients.readPatient();
		DoctorSearchImp Doctorimp= new DoctorSearchImp();	
		System.out.println("Enter the ID of the doctor");
		Object doctorId=Utility.inputString();
		JSONObject doctorObject=Doctorimp.byId(allDoctors,doctorId);
		System.out.println("Enter the your ID");
		Object patientId=Utility.inputString();
		PatientSearchImp patientImp=new PatientSearchImp();
		JSONObject patientObject=patientImp.byId(allpatient, patientId);
		writeAppointment(doctorObject, patientObject);
		
	}
	public void writeAppointment(JSONObject doctor,JSONObject patient){
	JSONObject patients=new JSONObject();
	JSONArray j1= new JSONArray();
   j1.add(patient);
	JSONArray j2= new JSONArray();
	HashMap<String,HashMap<String,JSONArray>> doctorHash=new HashMap<String,HashMap<String,JSONArray>>();
	HashMap<String,JSONArray> subHash=new  HashMap<String,JSONArray>();
	subHash.put("Monday",j1);
	subHash.put("Tuesday",j2);
	doctorHash.put((String) doctor.get("Id"),subHash);
	patients.putAll(doctorHash);
	try {
		FileWriter write= new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//Appointment.json");
		write.write(patients.toJSONString());
		write.flush();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
	
	public static void main(String[] args) {
		Appointment appoint=new Appointment();
		appoint.takeAppointment();
		
	}
	
}
