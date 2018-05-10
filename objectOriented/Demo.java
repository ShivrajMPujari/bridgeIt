package com.bridgeIt.objectOriented;

import java.util.Arrays;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Demo {

	public static void main(String[] args) {
		
		char array[]={'a','c','k','1','e'};
		String str[]={"ckif","kojh","ahhf","ehf","ahhk","ek","1dh"};
		String [] str1=new String[8];
		int len =str.length;
		int index=0;	
	
		for(int i=0;i<array.length;i++){
			
			for(int j=0;j<str.length;j++){
				
				if(array[i]==str[j].charAt(0)){
					
					str1[index++]=str[j];
					str[j]=" ";
				}
			}	
		}
		
		System.out.println(Arrays.toString(str1));
/*		
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
		System.out.println(array1);*/
		
		
		
	}
}
