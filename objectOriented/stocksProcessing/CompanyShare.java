package com.bridgeIt.objectOriented.stocksProcessing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeIt.utility.Utility;


public class CompanyShare {

	
	/**
	 * Function add the shares in the particular company record
	 */
	public void companyShareAdd(){
		
			File file = new File("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/companyStock.json");
			FileReader fr;
			try {
				fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				
				Iterator<?> itr = array.iterator();
				LinkedList<Object> list = new LinkedList<Object>();
				
				while(itr.hasNext()){
					
					JSONObject object=(JSONObject)itr.next();
					list.add(object);

				}
				System.out.println("Enter the symbol");
				Object symbol=Utility.inputString();
				list.iteratorAdd(symbol);
				list.display();
				list.writeToJson();	
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * Function removes the shares in the particular company record
	 */
	public void companyShareRemove(){

		File file = new File("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/companyStock.json");
		FileReader fr;
		try {
			fr = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser.parse(fr);
			Iterator<?> itr = array.iterator();
			LinkedList<Object> list = new LinkedList<Object>();
			
			while(itr.hasNext()){
				
				JSONObject object=(JSONObject)itr.next();
				list.add(object);

			}
			System.out.println("Enter the symbol");
			Object symbol=Utility.inputString();
			list.iteratorRemove(symbol);
			list.display();
			list.writeToJson();	
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
	}	
	
	/**
	 * Function displays the share records of the company 
	 */
	public void companyShareDisplay(){
		
		File file = new File("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/companyStock.json");
		FileReader fr;
		try {
			fr = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser.parse(fr);
			Iterator<?> itr = array.iterator();
			LinkedList<Object> list = new LinkedList<Object>();
			
			while(itr.hasNext()){
				
				JSONObject object=(JSONObject)itr.next();
				list.add(object);

			}
			list.display();
		
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	}
