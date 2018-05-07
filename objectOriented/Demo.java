package com.bridgeIt.objectOriented;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Demo {

	public static void main(String[] args) {
		JSONArray array1=new JSONArray();
		JSONArray array2= new JSONArray();
		JSONObject jobj =new JSONObject();
		array1.add("1");
		array1.add("1");
		array1.add("1");
		array1.add("1");
		array1.add("1");
		System.out.println(array1);
		System.out.println("-----------------");
		Iterator list= array1.iterator();
		while (list.hasNext()) {
			String object = (String) list.next();
			array2.add(object);
			
		}
		array2.add("123");
		
		array1=null;
		
		System.out.println(array2);
		System.out.println(array1);
	}
}
