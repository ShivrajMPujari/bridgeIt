package datastucture;

import java.util.Scanner;

public class Utility {

	static Scanner scanner=new Scanner(System.in);
	
	
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
