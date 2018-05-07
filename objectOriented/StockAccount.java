package com.bridgeIt.objectOriented;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeIt.utility.Utility;

public class StockAccount {

	
	Integer shares;
	Integer totalSharePrice;
	CompanyList list;
	StockAccount(String files){
		
		File file= new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//sharePerson//"+files+".json");
		if(file.exists()!=true){
			
			try {
				file.createNewFile();
				System.out.println("Your account has been created");
			} catch (IOException e) {
				e.printStackTrace();
			}
			list=new CompanyList();
		}else{
			System.out.println("Your account is now active");
		}
		
	}
	
	public double valueOf(){
			
		return totalSharePrice;
		
	}
	
	public void buy(int amount, String symbol){
		
	list.addAmount(symbol, amount);
			
	}
	
	public void sell(int amount, String symbol){
		
		list.remove(symbol, amount);
		

	}
	public void save(String filename,CompanyList lister){
		
	list.write(filename, lister);

	}
	

	public void printReport(){
		
		list.display();
	}
	
	public void editDisplay(JSONObject jsonObject){
		
		System.out.println(jsonObject.toString());
		
	}
	public boolean fileExistence(String files){
		
		File file= new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//Json//"+files+".json");
		boolean existence=file.exists();
		if(existence){
			
			return true;
		}
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return false;
	}

	public JSONObject editPerson(String file){
		
		JSONParser parser = new JSONParser();
		JSONObject stocksDetails=null;
			try {
			Object object=parser.parse(new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//sharePerson//"+file+".json"));
			stocksDetails=(JSONObject)object;
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}
			return stocksDetails;
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject editBuy(JSONObject jsonObject,int amount, String symbol){
		JSONArray newArray =new JSONArray();
	   Object object=jsonObject.get(symbol);
	   if(object!=null){
		   
		   JSONArray array =(JSONArray)object;
		   System.out.println(array);
		   Long stockprice=(Long)array.get(1);
		   array.set(1, stockprice+amount);
		   System.out.println(array);
		   
		   return jsonObject;
	   }
	   newArray.add(0, symbol);
	   newArray.add(1, amount);
	   System.out.println("Enter the date");
	   String date=Utility.inputString();
	   newArray.add(2,date);
	   jsonObject.put(symbol, newArray);
	   
	   return jsonObject;
	   
	}
	
	public JSONObject editSell(JSONObject jsonObject,int amount, String symbol){
		
		Object object=jsonObject.get(symbol);
		if(object==null){
			System.out.println("Your transaction can't be done,Entered wrong symbol");
			return jsonObject;
		}
		 JSONArray array =(JSONArray)object;
		 long shareprice=(long) array.get(1);
		 if(shareprice-amount>0){
			   array.set(1, shareprice-amount);
			   return jsonObject;
		 }else{
			 System.out.println("Sorry can't do this transaction,Account out of balance");
			 return jsonObject;
		 }
	}
	public void editPrint(JSONObject jsonObject,String file){
		System.out.println(file);
		try {
			FileWriter filewrite= new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//sharePerson//"+file+".json");
			filewrite.write(jsonObject.toJSONString());
			filewrite.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
	    
		System.out.println("enter the name");
		String name=Utility.inputString();
		StockAccount stock=new StockAccount(name);
		JSONObject jsonObject=stock.editPerson(name);
		System.out.println(jsonObject);
		
	    stock.editBuy(jsonObject, 15, "rel");
	    stock.editBuy(jsonObject, 2500, "apple");
	    stock.editSell(jsonObject, 200, "apple");
	    System.out.println(jsonObject);
	    stock.editPrint(jsonObject, name);
	    
	/*	System.out.println("Enter the name of account");
		String files=Utility.inputString();
		StockAccount stocks=new StockAccount(files);
		
		stocks.buy(1200, "tata");
		stocks.buy(3000, "tata");
		stocks.buy(2500, "rel");
		stocks.buy(2500, "rel");
		stocks.buy(5000, "indianoil");
		stocks.buy(5000, "indianoil");
		stocks.printReport();
		
		System.out.println("------------------------");
		
		stocks.sell(2000, "tata");
		stocks.sell(2000, "rel");
		stocks.sell(2000, "indianoil");
		stocks.save(files, stocks.list);
		*/
			
	}
	

	}
