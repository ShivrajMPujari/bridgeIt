package com.bridgeIt.objectOriented.AddressBook;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

public class JsonPerform {

	public void writeToFile(String file,ArrayList<Person> list ){
		
		try {
			
			FileWriter filewriter=new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//Json//"+file+".json");
			PrintWriter printwrite=new PrintWriter(filewriter);
			ObjectMapper mapping = new ObjectMapper();
				mapping.writeValue(printwrite, list);
				printwrite.flush();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
