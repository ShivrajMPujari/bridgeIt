package com.bridgeIt.objectOriented.AddressBook;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.codehaus.jackson.map.ObjectMapper;

public class JacksonClass {

	
	public static void main(String[] args) {
		try {
			
			FileWriter filewriter=new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//Json//shiv.json");
			PrintWriter printwrite=new PrintWriter(filewriter);
			Person p=new Person();
			p.setLastname("jay");
			p.setCity("mumbai");
			ObjectMapper mapping = new ObjectMapper();
			mapping.writeValue(printwrite, p);
			printwrite.flush();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	
	}
	
	
}
