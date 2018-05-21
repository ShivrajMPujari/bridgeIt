package datastucture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator; 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CommercialData {

	public static void main(String[] args) throws IOException, ParseException {
		
		StockAccount();

	}
	 public static void StockAccount() throws IOException, ParseException
	    {
	        System.out.println("Enter Your Chocie");
	        System.out.println("1.Create a new Account\n2.Buy Shares\n3.Sell Shares\n4.Print Report");
	        int choice=Utility.inputInt();
	        switch(choice)
	        {
	        case 1: System.out.println("Creating Account");
	                createAcc();
	                break;
	        case 2: System.out.println("You are buying Shares");
	                buyShare();
	                break;
	        case 3: System.out.println("You are selling shares");
	                sellShare();
	                break;
	        case 4: System.out.println("Print Report");
	                 printReport();
	                 break;
	        default: break;
	        }
	       
	    }
	   @SuppressWarnings("unchecked")
	    public static void sellShare() throws IOException, ParseException
	    {
	        File file = new File("D:/Java/DataStructure/src/datastucture/Files/customerShare.json");
	        File file1 =new File("D:/Java/DataStructure/src/datastucture/Files/companyStock.json");
	        if(file.exists() && file1.exists())
	        {
	            //Scanner scan = new Scanner(System.in);
	            // reading stock file
	            FileReader fr = new FileReader(file);
	            JSONParser parser = new JSONParser();
	            JSONArray stock = (JSONArray) parser.parse(fr);
	            //reading share file
	           
	            FileReader sf = new FileReader(file1);
	            JSONParser parser1 = new JSONParser();
	            JSONArray share = (JSONArray) parser1.parse(sf);
	           
	            System.out.println("Enter the user");
	            String name = Utility. inputString();
	            Iterator<?> itr = stock.iterator();
	            Iterator<?> itr1 = share.iterator();
	            boolean flag = false;
	            while (itr.hasNext())
	            {
	                JSONObject obj=(JSONObject) itr.next();
	                if(obj.get("Name").equals(name))
	                {
	                    System.out.println("Enter the share sysmbol to sale share:[@,!,#]");
	                    String sym = Utility.inputString();
	                    System.out.println("Enter the number of share to sale");
	                    int count= Utility. inputInt();
	                    //obj.put("Share Symbol", sym);
	                    while(itr1.hasNext())
	                    {
	                        JSONObject obj1 = (JSONObject) itr1.next();
	                        if(obj1.get("Symbol").equals(sym))
	                        {   
	                            int bal =  Integer.parseInt(obj.get("Balance").toString());
	                            int price = Integer.parseInt(obj1.get("Price").toString());
	                            int noShare =  Integer.parseInt(obj.get("ShareCount").toString());
	                            int stockShare = Integer.parseInt(obj1.get("Count").toString());
	                            int saleprize = count*price;
	                            int newbal = bal+saleprize;
	                            int sharecountcus = noShare-count;
	                            
	                            int sharecountstock = stockShare+count;
	                            if(sharecountcus>0 && noShare>0)
	                            {
	                            obj.remove("Balance");
	                            obj.remove("ShareCount");
	                            obj1.remove("Count");
	                            obj.put("Balance",newbal);
	                            obj.put("ShareCount",sharecountcus);
	                            obj1.put("Count", sharecountstock);
	                            }
	                            else
	                            {
	                            	System.out.println("No Shares Available");
	                            }
	                            Date d = new Date();
	                            String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
	                            System.out.println("Date "+date);
	                            flag = true;
	                            break;
	                        }
	                       
	                    }
	                }

	                FileWriter fs = new FileWriter(file);
	                fs.write(JSONValue.toJSONString(stock));
	                fs.flush();
	                fs.close();
	            }
	            if(flag == false)
	            {
	                System.out.println("User name not exits");
	            }
	            FileWriter fw = new FileWriter(file1);
	            fw.write(JSONValue.toJSONString(share));
	            fw.flush();
	            fw.close();
	        }
	        else
	        {
	            System.out.println("File Does not exits");
	        }
	        StockAccount();
	    }

	   
	    @SuppressWarnings("unchecked")
	    public static void buyShare() throws IOException, ParseException
	    {
	    	 File file = new File("D:/Java/DataStructure/src/datastucture/Files/customerShare.json");
		     File file1 =new File("D:/Java/DataStructure/src/datastucture/Files/companyStock.json");
	        if(file.exists() && file1.exists())
	        {
	           
	            // reading stock file
	            FileReader fr = new FileReader(file);
	            JSONParser parser = new JSONParser();
	            JSONArray stock = (JSONArray) parser.parse(fr);
	            //reading share file
	           
	            FileReader sf = new FileReader(file1);
	            JSONParser parser1 = new JSONParser();
	            JSONArray share = (JSONArray) parser1.parse(sf);
	           
	            System.out.println("Enter the user");
	            String name =  Utility.inputString();
	            Iterator<?> itr = stock.iterator();
	            Iterator<?> itr1 = share.iterator();
	            boolean flag = false;
	            while (itr.hasNext())
	            {
	                JSONObject obj=(JSONObject) itr.next();
	                if(obj.get("Name").equals(name))
	                {
	                    System.out.println("Enter the share sysmbol to buy share:[@,!,#]");
	                    String sym = Utility.inputString();
	                    /*obj.put("Share symbol", sym);
	                    if(obj.get("Share Symbol").equals(sym))
	                    {*/
	                        while(itr1.hasNext())
	                        {
	                            JSONObject obj1 = (JSONObject) itr1.next();
	                            if(obj1.get("Symbol").equals(sym))
	                            {   
	                                System.out.println("Enter the amount");
	                                int amt=  Utility.inputInt();
	                                int bal =  Integer.parseInt(obj.get("Balance").toString());
	                                
	                                int price = Integer.parseInt(obj1.get("Price").toString());
	                    
	                                int noShare =  Integer.parseInt(obj.get("ShareCount").toString());
	                                
	                                int stockShare = Integer.parseInt(obj1.get("Count").toString());
	                                int numofshare = amt/price;
	                                
	                                int newbal = bal-amt;
	                                int sharecountcus = noShare+numofshare;
	                                int sharecountstock = stockShare-numofshare;
	                                
	                                obj.remove("Balance");
	                                obj.remove("ShareCount");
	                                obj1.remove("Count");
	                               
	                                obj.put("Balance",newbal);
	                                obj.put("ShareCount",sharecountcus);
	                                obj1.put("Count", sharecountstock);
	                                Date d = new Date();
	                                String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
	                                System.out.println("Date "+date);
	                                flag= true;
	                                break;
	                            }
	                        }
	                   
	                }
	                FileWriter fs = new FileWriter(file);
	                fs.write(JSONValue.toJSONString(stock));
	                fs.flush();   
	                fs.close();
	            }
	            if(flag == false)
	            {
	                System.out.println("User name not exits");
	            }
	            FileWriter fw = new FileWriter(file1);
	            fw.write(JSONValue.toJSONString(share));
	            fw.flush();
	            fw.close();
	        }
	        else
	        {
	            System.out.println("File does not exits");
	        }
	        StockAccount();
	    }

	    public static void createAcc() throws IOException, ParseException
	    {
	        File file = new File("D:/Java/DataStructure/src/datastucture/Files/customerShare.json");
	        if(file.exists())
	        {
	           
	            boolean check= true;
	            while (check==true)
	            {   
	                System.out.println("Want to add user: yes or no");
	                String user = Utility.inputString();
	                if(user.equals("yes"))
	                {   
	                   
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
	        }
	        StockAccount();
	    }
	    
	    public static void printReport() throws IOException, ParseException {
	        FileReader file=fileRead("D:/Java/DataStructure/src/datastucture/Files/customerShare.json");   
	        JSONParser parser=new JSONParser();
	        JSONArray shareArray=(JSONArray)parser.parse(file);
	        Iterator<?> iterator=shareArray.iterator();
	        while(iterator.hasNext())
	        {
	            JSONObject shareobj=(JSONObject) iterator.next();
	            System.out.println(shareobj);
	        }
	       
	}
	    public static FileReader fileRead(String string)
	    {
	        FileReader reader = null;
	        try {
	        	reader = new FileReader(string);
	        } catch (FileNotFoundException e) {
	       
	            e.printStackTrace();
	        }
	        return reader;   
	    }
}
