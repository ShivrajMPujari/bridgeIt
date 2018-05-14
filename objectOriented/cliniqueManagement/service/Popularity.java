package com.bridgeIt.objectOriented.cliniqueManagement.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Popularity {

	
	public JSONObject popularSpecilization(){
		
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
	//	System.out.println(jsonobject);
		Set set=jsonobject.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
		
			Map.Entry entry=(Map.Entry)itr.next();
			JSONObject jsonObj=(JSONObject)entry.getValue();
			if(jsonObj.size()==5){
				jsonObj.get("Name");
				System.out.println("One of the popular specialization in the clinique is "+jsonObj.get("Specialization"));
			}
		}
		
		return jsonobject;
		
	}
	
	public JSONObject popularDoctor(){
		
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
		Set set=jsonobject.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
		
			Map.Entry entry=(Map.Entry)itr.next();
			JSONObject jsonObj=(JSONObject)entry.getValue();
			if(jsonObj.size()>=4){
				jsonObj.get("Name");
				System.out.println("One of the popular Doctor in the clinique is "+jsonObj.get("Name"));
			}
		}
		
		return jsonobject;
		
		
		}
	

	public static void main(String[] args) {
		
		
		Popularity popular=new Popularity();
		popular.popularDoctor();
		
	}
}
