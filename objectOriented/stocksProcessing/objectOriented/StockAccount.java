package com.bridgeIt.objectOriented.stocksProcessing.objectOriented;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeIt.objectOriented.AddressBook.Person;
import com.bridgeIt.utility.Utility;

public class StockAccount {

	ArrayList<Company> companyList =new ArrayList<Company> ();
	ArrayList<Customer> customerList=new ArrayList<Customer>();
	
	public boolean createFile(String files)  {
	File file= new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//stocksProcessing//Files//sharePersons//"+files+".json");
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
	
	public void addCompany(){
		ArrayList<Company> list=new ArrayList<Company>();
		
		for (int i = 0; i < 3; i++) {
			Company company =new Company();
			System.out.println("enter the symbol");
			String symbol=Utility.inputString();
			company.setSymbol(symbol);
			System.out.println("enter the sharePrice");
			long sharePrice=Utility.inputLong();
			company.setSharePerPrice(sharePrice);
			System.out.println("enter the shareNumbers");
			long shareNum=Utility.inputLong();
			company.setShares(shareNum);
			list.add(company);
		}
		
	try {
			
			FileWriter filewriter=new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//stocksProcessing//Files//sharePersons//shareMarket.json");
			PrintWriter printwrite=new PrintWriter(filewriter);
			ObjectMapper mapping = new ObjectMapper();
			mapping.writeValue(printwrite,list );
			printwrite.flush();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Company> readCompany(){
		ArrayList<Company> companies=null;
		ObjectMapper map= new ObjectMapper();
		FileReader file1;
		try {
			file1 = new FileReader("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/sharePersons/shareMarket.json");
			BufferedReader br = new BufferedReader(file1);
			 companies= (ArrayList<Company>) map.readValue(br,new TypeReference<List<Company>>(){});
			System.out.println(companies);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return companies;

	}
	
	public void createAcc() throws IOException, ParseException{
		

        File file = new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//stocksProcessing//Files//sharePersons//shareMarket.json");
        if(file.exists())
        {
           
            boolean check= true;
            while (check==true)
            {   
                System.out.println("Want to add user: yes or no");
                String user = Utility.inputString();
                if(user.equals("yes"))
                {   
                   
                	
                	ArrayList<Customer> customers=null;
            		ObjectMapper map= new ObjectMapper();
            		FileReader file1;
            		try {
            			file1 = new FileReader("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/sharePersons/Customer.json");
            			BufferedReader br = new BufferedReader(file1);
            			customers= (ArrayList<Customer>) map.readValue(br,new TypeReference<List<Customer>>(){});
            			Customer customer=new Customer();
            			 System.out.println("Enter name");
                         String name =  Utility.inputString();
                     	customer.setName(name);
                         System.out.println("Enter balance");
                         long bal =  Utility.inputLong();
            			customer.setBalance(bal);
            			customer.setShareCount(100);
            			customers.add(customer);
            			
            			try {
            				
            				FileWriter filewriter=new FileWriter("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/sharePersons/Customer.json");
            				PrintWriter printwrite=new PrintWriter(filewriter);
            				map.writeValue(printwrite,customers );
            				printwrite.flush();
            			
            			} catch (IOException e) {
            				
            				e.printStackTrace();
            			}
   
            		} catch (IOException e) {
            			e.printStackTrace();
            		}
                }   else
                {
                    check=false;
                }
                }
            }
        }
                	
                	
/*                	
                	
                    FileReader fr = new FileReader(file);
                    JSONParser parser = new JSONParser();
                    JSONArray arr1 = (JSONArray) parser.parse(fr);
                    JSONObject json = new JSONObject();
                    System.out.println("Enter name");
                    String name =  Utility.inputString();
                    System.out.println("Enter balance");
                    int bal =  Utility.inputInt();
                    json.put("Name",name);
                    json.put("Balance",bal);
                    json.put("ShareCount",100);
               
                    arr1.add(json);
                    FileWriter fw = new FileWriter(file);
                    fw.write(JSONArray.toJSONString(arr1));
                    fw.flush();
                    fw.close();
       
                }
                else
                {
                    check=false;
                }
            }
           
        }
        else
        {
            System.out.println("File does not exits");
        }*/
  //      stockAccount();
    
		
		
	  public static void buyShare() throws IOException, ParseException
	    {
	    	  File file = new File("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/sharePersons/Customer.json");
		      File file1 =new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//stocksProcessing//Files//sharePersons//shareMarket.json");
		       
	        if(file.exists() && file1.exists())
	        {
	           ArrayList<Customer> customers=StockAccount.readCustomers();
	           ArrayList<Company> companies=StockAccount.readCompany();
	           boolean flag=false;
	          System.out.println("Enter the name");
	          String name =  Utility.inputString();
	           for (Customer customer : customers) {
				
	        	 if( customer.getName().equals(name)){
	        		 System.out.println("Enter the share symbol to buy share:");
	                 String sym = Utility.inputString();
	        		 
	        		 for (Company company : companies) {
						
	        			if( company.getSymbol().equals(sym)){
	        				
	        			long sharePerPrice=company.getSharePerPrice();
	        			long shares=company.getShares();
	        			System.out.println("Enter the amount");
	        			long amt=  Utility.inputInt();
	        			long newShares=amt/sharePerPrice;
	        			shares=shares-newShares;
	        			company.setShares(shares);
	        			long balance=customer.getBalance();
	        			balance=balance+amt;
	        			customer.setBalance(balance);
	        			long shareCount=customer.getShareCount();
	        			shareCount=shareCount+newShares;
	        			customer.setShareCount(shareCount);
	        			 Date d = new Date();
                         String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
                         System.out.println("Transaction done at "+date);
                         flag=true;
	        			}
 
					}
	        	 }   
		     	}
	           
	           StockAccount.writeCompany(companies);
	           StockAccount.writeCustomers(customers);
	           
	           if(flag == false)
	            {
	                System.out.println("User name not exits");
	            }
	        }else{
	        	System.out.println("file does not exist");
	        }
	           
	     //   stockAccount();
	    }

	  public static ArrayList<Customer> readCustomers(){
      	ArrayList<Customer> customers=null;
  		ObjectMapper map= new ObjectMapper();
  		FileReader file1;
  		
  			try {
				file1 = new FileReader("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/sharePersons/Customer.json");
				BufferedReader br = new BufferedReader(file1);
	  			customers= (ArrayList<Customer>) map.readValue(br,new TypeReference<List<Customer>>(){});
  			} catch (IOException e) {
			
				e.printStackTrace();
			}
  		
		  
		return customers;
		}
	  
	  public static void writeCustomers(ArrayList<Customer> list){
		  
			ObjectMapper map= new ObjectMapper();
			try {
				
				FileWriter filewriter=new FileWriter("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/sharePersons/Customer.json");
				PrintWriter printwrite=new PrintWriter(filewriter);
				map.writeValue(printwrite,list );
				printwrite.flush();
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		  
	  }
	  
	  public static void writeCompany(ArrayList<Company> list){
		  
			ObjectMapper map= new ObjectMapper();
			try {
				
				FileWriter filewriter=new FileWriter("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/sharePersons/Company.json");
				PrintWriter printwrite=new PrintWriter(filewriter);
				map.writeValue(printwrite,list);
				printwrite.flush();
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		  
	  }
	
	
		public static void main(String[] args) {
			
			StockAccount st= new StockAccount();
			//st.createAccount("aim");
			try {
				st.buyShare();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
