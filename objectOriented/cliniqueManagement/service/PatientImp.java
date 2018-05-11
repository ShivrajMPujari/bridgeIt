package com.bridgeIt.objectOriented.cliniqueManagement.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeIt.objectOriented.cliniqueManagement.model.Patient;
import com.bridgeIt.utility.Utility;

public class PatientImp {

	public Patient addPatient(){
		
		Patient patient =new Patient();
		System.out.println("Enter the name");
		String name=Utility.inputStringLong();
		patient.setName(name);
		System.out.println("Enter the Id");
		String id=Utility.inputString();
		patient.setId(id);
		System.out.println("Enter the Mobile number");
		String mobNo=Utility.inputString();
		patient.setMobileNumber(mobNo);
		
		return patient;
		
	}

	public void writePatient(Patient patient,JSONObject jsonobject){
		
			
			try {
				FileWriter writer= new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//Patients.json");
				HashMap<String,Object> main=new HashMap<String,Object>();
				main.put("Name", patient.getName());
				main.put("MobileNumber", patient.getMobileNumber());
				main.put("Id",patient.getId());
				jsonobject.put(patient.getId(), main);
				writer.write(jsonobject.toJSONString());
				writer.flush();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
	
		}
	public JSONObject readPatient(){
		
		JSONParser parser = new JSONParser();
		JSONObject jsonobject = null;
		try {
			FileReader read = new FileReader(
					"//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//Patients.json");
			Object object = parser.parse(read);
			jsonobject = (JSONObject) object;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		System.out.println(jsonobject);
		return jsonobject;
			
	}
	public static void main(String[] args) {
		PatientImp patient = new PatientImp();
		Patient p1 =patient.addPatient();
		JSONObject json=patient.readPatient();
		patient.writePatient(p1, json);
	}
}
