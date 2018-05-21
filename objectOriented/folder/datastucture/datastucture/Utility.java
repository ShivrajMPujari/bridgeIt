package datastucture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility {

	static Scanner scanner=new Scanner(System.in);
	
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
	        File file = new File("/home/bridgeit/workspace/Files/customerShare.json");
	        File file1 =new File("/home/bridgeit/workspace/Files/companyStock.json");
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
	            String name = inputString();
	            Iterator<?> itr = stock.iterator();
	            Iterator<?> itr1 = share.iterator();
	            boolean flag = false;
	            while (itr.hasNext())
	            {
	                JSONObject obj=(JSONObject) itr.next();
	                if(obj.get("Name").equals(name))
	                {
	                    System.out.println("Enter the share sysmbol to sale share:[@,!,#]");
	                    String sym = inputString();
	                    System.out.println("Enter the number of share to sale");
	                    int count= inputInt();
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
	            String name = inputString();
	            Iterator<?> itr = stock.iterator();
	            Iterator<?> itr1 = share.iterator();
	            boolean flag = false;
	            while (itr.hasNext())
	            {
	                JSONObject obj=(JSONObject) itr.next();
	                if(obj.get("Name").equals(name))
	                {
	                    System.out.println("Enter the share sysmbol to buy share:[@,!,#]");
	                    String sym = inputString();
	                    /*obj.put("Share symbol", sym);
	                    if(obj.get("Share Symbol").equals(sym))
	                    {*/
	                        while(itr1.hasNext())
	                        {
	                            JSONObject obj1 = (JSONObject) itr1.next();
	                            if(obj1.get("Symbol").equals(sym))
	                            {   
	                                System.out.println("Enter the amount");
	                                int amt= inputInt();
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

	    @SuppressWarnings("unchecked")
	    public static void createAcc() throws IOException, ParseException
	    {
	        File file = new File("/home/bridgeit/workspace/Files/customerShare.json");
	        if(file.exists())
	        {
	           
	            boolean check= true;
	            while (check==true)
	            {   
	                System.out.println("Want to add user: yes or no");
	                String ch = inputString();
	                if(ch.equals("yes"))
	                {   
	                   
	                    FileReader fr = new FileReader(file);
	                    JSONParser parser = new JSONParser();
	                    JSONArray arr1 = (JSONArray) parser.parse(fr);
	                    JSONObject json = new JSONObject();
	                    System.out.println("Enter name");
	                    String name = inputString();
	                    System.out.println("Enter balance");
	                    int bal = inputInt();
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
	        FileReader file=fileRead("/home/bridgeit/workspace/Files/customerShare.json");   
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
	        FileReader f = null;
	        try {
	            f = new FileReader(string);
	        } catch (FileNotFoundException e) {
	       
	            e.printStackTrace();
	        }
	        return f;   
	    }

	
	  public static long inputlong()
	    {
	    	 try {
	         	return scanner.nextLong();
	 		} catch (Exception e) {
	 			scanner.nextLine();
	 			System.out.println("Invalid input, try again.");
	 			return inputlong();
	 		}
	    }
	//To return Integer input
	    public static int inputInt()
	    {
	            try {
	            	return scanner.nextInt();
				} catch (Exception e) {
					scanner.nextLine();
					System.out.println("Invalid input, try again.");
					return inputInt();
				}
	       
	    }

	//To return Double input
	    public static double inputDouble()
	    {
	    	 try {
	         	return scanner.nextDouble();
				} catch (Exception e) {
					scanner.nextLine();
					System.out.println("Invalid input, try again.");
					return inputDouble();
				}
	       
	    }
	//To return Boolean input;
	    public static boolean inputBoolean()
	    {
	    	 try {
	         	return scanner.nextBoolean();
				} catch (Exception e) {
					scanner.nextLine();
					System.out.println("Invalid input, try again.");
					return inputBoolean();
				}
	    }
	
	
	 public static String inputStringLine()
	    {

	        try {
	        	return scanner.nextLine();
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("Invalid input, try again.");
				return inputStringLine();
			}
	    }
	 
	 public static String inputString()
	    {

	        try {
	        	return scanner.next();
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("Invalid input, try again.");
				return inputString();
			}
	    }
	    
	 
	 
	  public static void bankCounter()
	    {
	        Queue q=new Queue();
	        System.out.println("Enter your choice:");
	        System.out.println("1. To add in queue");
	        System.out.println("2. To do transaction");
	        int choice=inputInt();
	        int option;
	        double sum=0;
	        while(choice==1 && q.size()<q.capacity)
	        {
	           
	            q.enqueue(choice);
	            System.out.println("Enter your choice:");
	            System.out.println("1. To add in queue");
	            System.out.println("2. To do transaction");
	            option=inputInt();
	            if(option==1)
	                choice=option;
	            else
	                choice=option;
	        }
	        while(choice==2 && (q.size()<q.capacity))
	        {
	            if(q.isEmpty())
	            {
	                System.out.println("Please add into queue First");
	                System.out.println("Enter your choice:");
	                System.out.println("1. To add in queue");
	                System.out.println("2. To do transaction");
	                option=inputInt();
	                if(option==1)
	                    q.enqueue(1);
	                else
	                    choice=option;
	            }
	            else
	            {
	                System.out.println("Choose Your Transaction:");
	                System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Add in queue again\n5.No. of ppl in queue");
	                int select=Utility.inputInt();
	           
	                switch (select) {
	                case 1: System.out.println("Enter Your Amount:");
	                        double amountdepo=inputDouble();
	                        sum=bankDeposit(amountdepo,sum);
	                        q.dequeue();
	                        break;
	                case 2: System.out.println("Enter Your Amount:");
	                        double amountwith=inputDouble();
	                        sum=bankWithdraw(amountwith,sum);
	                        q.dequeue();
	                        break;
	                case 3: System.out.println("Balance is:"+sum);
	                        q.dequeue();
	                        break;
	                case 4: q.enqueue(1);
	                        break;
	                case 5: int size= q.size();
	                        System.out.println("Number of ppl in the queue are:"+size);
	                default:
	                        break;
	                }
	            }
	        }
	    }
	//Method to deposit
	    public static double bankDeposit(double amount,double sum)
	    {
	        System.out.println("Amount deposited is:"+amount);
	        sum=sum+amount;
	        System.out.println("Total amount"+sum);
	        return sum;
	    }
	   
	//Method to withdraw
	    public static double bankWithdraw(double amount,double sum)
	    {
	        System.out.println("Amount withdrawn is:"+amount);
	        sum=sum-amount;
	        System.out.println("Total amount"+sum);
	        return sum;
	    }
	 
	  //Method for CalendarQueue
	    public static void CalendarQueue(int month,int year)
	    {
	        QueueLinkList weekday=new QueueLinkList();
	        String[] months = {"January", "February", "March","April", "May", "June",
	                "July", "August", "September","October", "November", "December"};

	            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	            if ((month == 2) && (isLeapOrNot(year)))
	            {
	                days[month] = 29;
	            }
	            System.out.println("\t\t\t" + months[month-1] + " " + year);
	            System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
	            int d = dayOfWeek(month, 1, year);
	            for(int i=0;i<d;i++)
	            {
	                weekday.insert("\t");
	            }
	            for (int i = 1; i <= days[month-1]; i++)
	            {
	                //System.out.printf("%2d ", i);
	                weekday.insert("\t"+i);
	                if (((i + d) % 7 == 0) || (i == days[month-1]))
	                weekday.insert("\n");
	            }
	            weekday.display();
	    }
	  //Method to find day of a week
	    public static int dayOfWeek(int m, int d, int y)
	    {
	        /*y0 = y − (14 − m) / 12
	                x = y0 + y0/4 − y0/100 + y0/400
	                m0 = m + 12 × ((14 − m) / 12) − 2
	                d0 = (d + x + 31m0 / 12) mod 7*/
	        int y1=y-(14-m)/12;
	        int x=y1+y1/4-y1/100+y1/400;
	        int m1=m + 12 * ((14 - m) / 12) - 2;
	        int d1=(d+x+31*m1/12) % 7;
	        //System.out.println(d1);
	        return d1;
	    }
	  //Method to check Leap Year
	    public static boolean isLeapOrNot(int year)
	    {
	        if(year%4==0 || year%400==0 && year%100!=0)
	        {
	            System.out.println("Is a Leap Year");
	            return true;
	        }
	        else
	        {
	            System.out.println("Is not a Leap Year");
	            return false;
	        }
	       
	    }
	    
	    public static void calendarStack(int month,int year) {
	        StackLinkList weekdayIn=new StackLinkList();
	        StackLinkList weekdayOut=new StackLinkList();
	        String[] months = {"","January", "February", "March","April", "May", "June",
	                "July", "August", "September","October", "November", "December"};

	            int[] days = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	            if ((month == 2) && (isLeapOrNot(year)))
	            {
	                days[month] = 29;
	            }
	            System.out.println("\t\t\t" + months[month] + " " + year);
	            System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
	            int d = dayOfWeek(month, 1, year);
	            for(int i=0;i<d;i++)
	            {
	                  weekdayIn.insert("\t");
	                 
	            }
	          // weekdayIn.display();
	          
	            for (int i = 1 ; i <=days[month] ; i++)
	            {
	                weekdayIn.insert(i);
	             if (((i + d) % 7 == 0) || (i == days[month-1]))    
	            	 weekdayIn.insert("\n");
	            }
	        
	           for(int i=1;i<=weekdayIn.size(); i++)
	           {
	        	   Object value=weekdayIn.delete();
	        	   System.out.println(value);
	               weekdayOut.insert(value);
	             
	           }
	           weekdayOut.display();
	    }
	    
	    
	    
	    
}
