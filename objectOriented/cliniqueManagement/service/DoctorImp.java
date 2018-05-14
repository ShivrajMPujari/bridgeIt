package com.bridgeIt.objectOriented.cliniqueManagement.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeIt.objectOriented.cliniqueManagement.model.Doctor;
import com.bridgeIt.utility.Utility;

public class DoctorImp {

	public Doctor addDoctors(){
	
		Doctor doctor=new Doctor();
		System.out.println("Enter the name of Doctor");
		String name=Utility.inputStringLong();
		doctor.setName(name);
		System.out.println("Enter the Id of Doctor");
		String id=Utility.inputString();
		doctor.setId(id);
		System.out.println("Enter the Specialization of Doctor");
		String specialization=Utility.inputStringLong();
		doctor.setSpecialization(specialization);
		System.out.println("Enter the Availability");
		String availability=Utility.inputString();
		doctor.setAvailability(availability);
		return doctor;
	}
	
	public void writeDoctor(Doctor doctor,JSONObject jsonobject){
	
		
		try {
			FileWriter writer= new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//Doctors.json");
			HashMap<String,Object> main=new HashMap<String,Object>();
			main.put("Name", doctor.getName());
			main.put("Availability", doctor.getAvailability());
			main.put("Specialization", doctor.getSpecialization());
			main.put("Id", doctor.getId());
			jsonobject.put(doctor.getId(), main);
			
			writer.write(jsonobject.toJSONString());
			writer.flush();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}
	
	public JSONObject readOneAppointment(Object id){
		
		JSONParser parser = new JSONParser();
		JSONObject jsonobject = null;
		DoctorSearchImp docSearch= new DoctorSearchImp();
		JSONObject patients=null;
		FileReader read;
		try {
			read = new FileReader(
					"//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//DoctorAppointment.json");
	
			Object object = parser.parse(read);
			jsonobject = (JSONObject) object;
			patients=	(JSONObject) jsonobject.get(id);
			
		} catch (IOException | ParseException e) {
			
			e.printStackTrace();
		}
		
		return patients;
		}
	
	
	
	public JSONObject readDoctorAppointments(){
		
		JSONParser parser = new JSONParser();
		JSONObject jsonobject = null;
		DoctorSearchImp docSearch= new DoctorSearchImp();
		try {
			FileReader read = new FileReader(
					"//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//DoctorAppointment.json");
			Object object = parser.parse(read);
			jsonobject = (JSONObject) object;
		//	System.out.println(jsonobject);
			  Set set=jsonobject.entrySet();//Converting to Set so that we can traverse  
			    Iterator itr=set.iterator();  
			    while(itr.hasNext()){  
		    //Converting to Map.Entry so that we can get key and value separately  
			        Map.Entry entry=(Map.Entry)itr.next();  
			  //      System.out.println(entry.getKey()+"-"+entry.getValue()); 
			//        System.out.println("-----------------------------------------------------");
			        System.out.println("Appointments for Doctor id:- "+entry.getKey());
			       JSONObject jobject= (JSONObject) entry.getValue();
		//	       System.out.println(jobject);
			//   	System.out.println(jsonobject);
				
				  Set set1=jobject.entrySet();//Converting to Set so that we can traverse  
				    Iterator itr1=set1.iterator();  
				    while(itr1.hasNext()){  
			    //Converting to Map.Entry so that we can get key and value separately  
				        Map.Entry entry1=(Map.Entry)itr1.next();    
				       JSONObject jobj= (JSONObject) entry1.getValue();
				  //     System.out.println(jobj);
				 	  System.out.println("Patient Id:-"+jobj.get("Id"));
				       System.out.println("Patient Name:- "+jobj.get("Name"));
				       System.out.println("MobileNumber:- "+jobj.get("MobileNumber"));
				      System.out.println("--------------------------------------------------------------------");
			    }
			    }
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		return null;
		}
	
	public JSONObject displayDoctors(){
		
		JSONParser parser = new JSONParser();
		JSONObject jsonobject = null;
		try {
			FileReader read = new FileReader(
					"//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//Doctors.json");
			Object object = parser.parse(read);
			jsonobject = (JSONObject) object;
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		System.out.println(jsonobject);
		return jsonobject;
		
	}
	
	
	public JSONObject readDoctor(){
		
		JSONParser parser = new JSONParser();
		JSONObject jsonobject = null;
		try {
			FileReader read = new FileReader(
					"//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//cliniqueManagement//files//Doctors.json");
			Object object = parser.parse(read);
			jsonobject = (JSONObject) object;
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		System.out.println(jsonobject);
		  Set set=jsonobject.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
	    //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		  //      System.out.println(entry.getKey()+"-"+entry.getValue()); 
		        System.out.println("-----------------------------------------------------");
		        
		       JSONObject jobj= (JSONObject) entry.getValue();
		       System.out.println("Id:-"+jobj.get("Id"));
		       System.out.println("Name:- "+jobj.get("Name"));
		       System.out.println("Specialization:- "+jobj.get("Specialization"));
		       System.out.println("Availability:- "+jobj.get("Availability"));
		       
		       System.out.println("-------------------------------------------------------");
		  /*      Set set1= jobj.entrySet();
		        Iterator itr1=set1.iterator(); 
		        while(itr1.hasNext()){
		            Map.Entry entry1=(Map.Entry)itr1.next();  
		           System.out.println(entry1.getKey()+":-"+entry1.getValue()); 
		        }*/
	}
			return jsonobject;
		
	}
	
	public static void main(String[] args) {
		DoctorImp doc =new DoctorImp();
		
	//	Doctor doc1= doc.addDoctors();
		JSONObject jsonobject= doc.readDoctor();
		/*doc.writeDoctor(doc1, jsonobject);
		doc.readDoctor();*/
		/*  Set set=jsonobject.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		        //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+"-"+entry.getValue()); 
		       JSONObject jobj= (JSONObject) entry.getValue();
		        Set set1= jobj.entrySet();
		        Iterator itr1=set1.iterator(); 
		        while(itr1.hasNext()){
		            Map.Entry entry1=(Map.Entry)itr1.next();  
		            System.out.println(entry1.getKey()+" "+entry1.getValue()); 
		        }
	}    */
		DoctorSearchImp imp= new DoctorSearchImp();
		
		JSONObject jsonobject1=imp.byAvailability(jsonobject,"AM");
	//	System.out.println(jsonobject1);
}
}
