package com.bridgeIt.objectOriented;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class sample {

	public static void main(String args[]){    
		JSONObject obj=new JSONObject();    
		  obj.put("name","shivraj");    
		  obj.put("age",new Integer(27));    
		  obj.put("salary",new Double(600000));    
		   System.out.println(obj);   
			   
		String s="{\"name\":\"shiv\",\"salary\":45000,\"age\":23}";	   
		Object obj1=JSONValue.parse(s);
		JSONObject jasonobject=(JSONObject)obj1;
		String st=(String)jasonobject.get("name");
		Long NUM=(Long)jasonobject.get("salary");
		System.out.println(st);
		System.out.println(NUM);
		
		}    
}
