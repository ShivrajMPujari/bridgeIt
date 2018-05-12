package com.bridgeIt.objectOriented.cliniqueManagement.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
		writeDoctorAppointments(doctorObject,patientObject);
		
	}
	
	public void writeAppointment(JSONObject doctor,JSONObject patient){
		
		
		
	JSONObject patients=new JSONObject();
	JSONArray j1= new JSONArray();
	j1.add(patient);
	HashMap<String,HashMap<String,JSONArray>> doctorHash=new HashMap<String,HashMap<String,JSONArray>>();
	HashMap<String,JSONArray> subHash=new  HashMap<String,JSONArray>();
	subHash.put("Appointments",j1);
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
	
	public void writeDoctorAppointments(JSONObject doctor,JSONObject patient){
		
		JSONObject appointments=readDoctorAppointments();
		System.out.println(appointments+"ic");
		Object key=appointments.get((String) doctor.get("Id"));
		System.out.println(key);
		HashMap<String,JSONObject> map =new HashMap<String,JSONObject>();
		JSONObject jobj =new JSONObject();
		jobj.put(patient.get("Id"),patient );
		if(key==null){
			HashMap<String,JSONObject> doctorHash=new HashMap<String,JSONObject>();
			doctorHash.put((String) doctor.get("Id"), jobj);
			appointments.putAll(doctorHash);
		}else{
				JSONObject doctorList = (JSONObject)key;
			JSONObject objects=(JSONObject)appointments.get(key);
			doctorList.put(patient.get("Id"),patient);
		//	System.out.println(objects+"-----");
				
		}
/*		JSONObject patients=new JSONObject();
		JSONArray j1= new JSONArray();
		HashMap<String,HashMap<String,JSONArray>> doctorHash=new HashMap<String,HashMap<String,JSONArray>>();
		HashMap<String,JSONArray> subHash=new  HashMap<String,JSONArray>();
		subHash.put("Appointments",j1);
		doctorHash.put((String) doctor.get("Id"),subHash);
		patients.putAll(doctorHash);*/
		try {
			FileWriter write= new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//DoctorAppointment.json");
			write.write(appointments.toJSONString());
			write.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void writePatientsAppointments(JSONObject patient){	
			JSONObject patients=new JSONObject();
			JSONArray j1= new JSONArray();
			HashMap<String,HashMap<String,JSONArray>> doctorHash=new HashMap<String,HashMap<String,JSONArray>>();
			HashMap<String,JSONArray> subHash=new  HashMap<String,JSONArray>();
			subHash.put("Appointments",j1);
	//		doctorHash.put((String) doctor.get("Id"),subHash);
			patients.putAll(doctorHash);
			
			try {
				FileWriter write= new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//PatientAppointment.json");
				write.write(patients.toJSONString());
				write.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	public JSONObject readDoctorAppointments(){
		
		JSONObject jsonObject=null;
		try {
			FileReader read = new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//DoctorAppointment.json");
			JSONParser parse= new JSONParser();
			Object object=parse.parse(read);
			jsonObject=(JSONObject)object;
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		
		return jsonObject;
		
	}
	public JSONObject readPatientAppointments(){
		
		JSONObject jsonObject=null;
		try {
			FileReader read = new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//PatientAppointment.json");
			JSONParser parse= new JSONParser();
			Object object=parse.parse(read);
			jsonObject=(JSONObject)object;
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		
		return jsonObject;
		
	}
	public static void main(String[] args) {
		Appointment appoint=new Appointment();
		appoint.takeAppointment();
	//	appoint.writeAppointment(doctor, patient);
		
		
	}
	
}
