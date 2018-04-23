package com.bridgeIt.dataStructures;

import com.bridgelabz.datastucture.QueueLinkList;

public class Demo1 {

	
	
	public static void main(String[] args) {
	
		calenderArray(5, 2018);
		
	}
	
	
	public static void calenderArray(int month,int year){
		
		  QueueLinkList weekday=new QueueLinkList();
	        String[] months = {"January", "February", "March","April", "May", "June",
	                "July", "August", "September","October", "November", "December"};

	            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	            if ((month == 2) && (isLeapOrNot(year)))
	            {
	                days[month] = 29;
	            }
		
	            int day=dayOfWeek(month, 1, year);
	           System.out.println(day);
	           
	           System.out.println(days[month]);
	           
	            
	            int calenderArray[][]=new int[7][7];
	            int k=0,g=0;
	        
	            
	            for(int j=0;j<day;j++){
	            	
	            	calenderArray[k][g++]=-1;

	            }
	            for (int i = 1; i < days[month]; i++) {
	            	
	            	System.out.println(i);
	            	if((i+day)%7==0){
	            		g=0;
	            		calenderArray[k+1][g]=i;
	            		System.out.println("next");
	            		    continue;
	            	}
	            	calenderArray[k][g++]=i;
				}
	            
	            
	            
	            for (int i = 0; i < 7; i++) {
					for (int j = 0; j < 7; j++) {
						
						
					System.out.println(calenderArray[i][j]);
	
					}
					
				}
	            
	            
		
	}
    public static int dayOfWeek(int m, int d, int y)
    {
        
        int y1=y-(14-m)/12;
        int x=y1+y1/4-y1/100+y1/400;
        int m1=m + 12 * ((14 - m) / 12) - 2;
        int d1=(d+x+31*m1/12) % 7;

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
}
