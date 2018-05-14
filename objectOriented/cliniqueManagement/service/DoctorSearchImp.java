package com.bridgeIt.objectOriented.cliniqueManagement.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;

public class DoctorSearchImp implements SearchDoctor {




   public static void main(String[] args) {
	
	   Object obj1="str";
	   String obj2="str";
	   System.out.println(obj1.equals(obj2));
 
	   
}

	
	@Override
	public JSONObject byId(JSONObject jsonObject,Object id) {
		  Set set=jsonObject.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
	    //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		  //      System.out.println(entry.getKey()+"-"+entry.getValue()); 
		       JSONObject jobj= (JSONObject) entry.getValue();
		        Set set1= jobj.entrySet();
		        Iterator itr1=set1.iterator(); 
		        while(itr1.hasNext()){
		            Map.Entry entry1=(Map.Entry)itr1.next();  
		            if(entry1.getKey().equals("Id")&&entry1.getValue().equals(id)){
		            	 System.out.println(entry1.getKey()+" "+entry1.getValue()); 
		            	return jobj;
		            }
		           
		        }
	}
			return null;  	
		    
	}
	
	@Override
	public JSONObject bySpecilization(JSONObject jsonObject,Object Specilization) {
		  Set set=jsonObject.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
	    //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		  //      System.out.println(entry.getKey()+"-"+entry.getValue()); 
		       JSONObject jobj= (JSONObject) entry.getValue();
		        Set set1= jobj.entrySet();
		        Iterator itr1=set1.iterator(); 
		        while(itr1.hasNext()){
		            Map.Entry entry1=(Map.Entry)itr1.next();  
		            if(entry1.getKey().equals("Specialization")&&entry1.getValue().equals(Specilization)){
		            	System.out.println(jobj);
		            }
		         //   System.out.println(entry1.getKey()+" "+entry1.getValue()); 
		        }
	}
			return null;  	
		    
	}
	
	@Override
	public JSONObject byAvailability(JSONObject jsonObject,Object Availability) {
		  Set set=jsonObject.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
	    //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		  //      System.out.println(entry.getKey()+"-"+entry.getValue()); 
		       JSONObject jobj= (JSONObject) entry.getValue();
		        Set set1= jobj.entrySet();
		        Iterator itr1=set1.iterator(); 
		        while(itr1.hasNext()){
		            Map.Entry entry1=(Map.Entry)itr1.next();  
		            if(entry1.getKey().equals("Availability")&&entry1.getValue().equals(Availability)){
		            	System.out.println(jobj);
		            }
		       //     System.out.println(entry1.getKey()+" "+entry1.getValue()); 
		        }
	}
			return null;  	
		    
	}

	@Override
	public JSONObject byName(JSONObject jsonObject, Object name) {
		  Set<Object> set=jsonObject.entrySet();//Converting to Set so that we can traverse  
		    Iterator<Object> itr=set.iterator();  
		    while(itr.hasNext()){  
	    //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+"-"+entry.getValue()); 
		       JSONObject jobj= (JSONObject) entry.getValue();
		        Set set1= jobj.entrySet();
		        Iterator itr1=set1.iterator(); 
		        while(itr1.hasNext()){
		            Map.Entry entry1=(Map.Entry)itr1.next();  
		            if(entry1.getKey().equals("Name")&&entry1.getValue().equals(name)){
		            	return jobj;
		            }
		            System.out.println(entry1.getKey()+" "+entry1.getValue()); 
		        }
	}
			return null;  	
		    
	}

}
