package com.bridgeIt.objectOriented;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeIt.dataStructures.QueueLinkList;
import com.bridgeIt.dataStructures.Stack;
import com.bridgeIt.utility.Utility;

public class StockAccount {

	Integer shares;
	Integer totalSharePrice=0;
	CompanyList list;
	Stack<String> symbols=new Stack<String>();
	QueueLinkList<String> queue =new QueueLinkList<String>();
	
	/**Constructor to initialize file
	 * @param files
	 */
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
	
	/**Function return total share price
	 * @return
	 */
	public double valueOf(){
			
		return totalSharePrice;
		
	}
	
	/**Function adds amount to account of the user
	 * @param amount integer amount to be added 
	 * @param symbol String company symbol
	 */
	public void buy(int amount, String symbol,String date){
		
	boolean status=list.addAmount(symbol, amount,date);
	if(status){
	symbols.push(symbol);
	totalSharePrice=totalSharePrice+amount;
	queue.enqueue(date);
	}
	}
	
	/**Function reduces the amount from the user account
	 * @param amount integer amount to be reduced
	 * @param symbol String company symbol
	 */
	public void sell(int amount, String symbol,String date){
		
		boolean result=list.remove(symbol, amount,date);
		if(result==true){
			totalSharePrice=totalSharePrice-amount;	
			symbols.push(symbol);
			queue.enqueue(date);
			
		}
	}
	
	/**Function saves the details of the user in file
	 * @param filename String file name
	 * @param lister CompanyList object which has list of all shares
	 */
	public void save(String filename,CompanyList lister,Integer totalSharePrice){
		
	list.write(filename, lister,totalSharePrice);

	}
	

	/**
	 * function print the details of the users share 
	 */
	public void printReport(){
		
		list.display();
		System.out.println("Transactions are done with-");
		symbols.printStack();
		System.out.println("Transactions dates-");
		queue.printQueue();
	}
	
	
	/**function print the details of the existing user
	 * @param jsonObject
	 */
	public void editDisplay(JSONObject jsonObject){
		
		System.out.println(jsonObject.toString());
		
	}
	
	/**Function checks whether file exist or not and create file accordingly
	 * @param files String file 
	 * @return boolean true if file exist or false
	 */
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

	/**function fetch the object of existing user 
	 * @param file String file name
	 * @return JSONObject 
	 */
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
	
	/**Function adds the amount to existing users particular company share
	 * @param jsonObject users details
	 * @param amount integer amount get added to the account of the user
	 * @param symbol String company symbol
	 * @return jsonobject of user
	 */
	@SuppressWarnings("unchecked")
	public JSONObject editBuy(JSONObject jsonObject,int amount, String symbol){
		JSONArray newArray =new JSONArray();
	   Object object=jsonObject.get(symbol);
	   Long totalSharePrice=(Long)jsonObject.get("totalSharePrice");
	   if(object!=null){
		   
		   JSONArray array =(JSONArray)object;
		   System.out.println(array);
		   Long stockprice=(Long)array.get(1);
		   array.set(1, stockprice+amount);
		   totalSharePrice=totalSharePrice+amount;
		   jsonObject.replace("totalSharePrice", totalSharePrice);
		   System.out.println(array);
		   
		   return jsonObject;
	   }
	   newArray.add(0, symbol);
	   newArray.add(1, amount);
	   System.out.println("Enter the date");
	   String date=Utility.inputString();
	   newArray.add(2,date);
	   jsonObject.put(symbol, newArray);
	   totalSharePrice=totalSharePrice+amount;
	   jsonObject.replace("totalSharePrice", totalSharePrice);
	   return jsonObject;
	   
	}
	
	/**Function reduces the particular amount from the existing user
	 * @param jsonObject
	 * @param amount integer amount to be reduced from users account
	 * @param symbol String company symbol
	 * @return
	 */
	public JSONObject editSell(JSONObject jsonObject,int amount, String symbol){
		
		Object object=jsonObject.get(symbol);
		Long totalSharePrice=(Long)jsonObject.get("totalSharePrice");
		if(object==null){
			System.out.println("Your transaction can't be done,Entered wrong symbol");
			return jsonObject;
		}
		 JSONArray array =(JSONArray)object;
		 long shareprice=(long) array.get(1);
		 if(shareprice-amount>0){
			   array.set(1, shareprice-amount);
			   totalSharePrice=totalSharePrice-amount;
			   jsonObject.replace("totalSharePrice", totalSharePrice);
			   return jsonObject;
		 }else{
			 System.out.println("Sorry can't do this transaction,Account out of balance");
			 return jsonObject;
		 }
	}
	
	/**Function print the details of the existing user
	 * @param jsonObject
	 * @param file
	 */
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
