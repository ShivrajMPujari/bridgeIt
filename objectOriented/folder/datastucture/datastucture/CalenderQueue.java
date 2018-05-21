package datastucture;

public class CalenderQueue {

	static int d=0;
	public static void main(String[] args) {
		
		/*System.out.println("Enter the month:");
		int month=Utility.inputInt();
		System.out.println("Enter the year:");
		int year=Utility.inputInt();*/
	//	Utility.CalendarQueue(month,year);
		Integer[][] stackCalender=calenderStack(5,2018);
		Stack st1= new Stack<>();
		Stack st2= new Stack<>();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if(stackCalender[i][j]==null){
					break;
				}
				st1.push(stackCalender[i][j]);
			}
		}
		
		for(int j=0;j<st1.size();j++){
			st2.push(st1.pop());
		}
		st2.printStackCalender();;
		
		
	}
	
	public static Integer[][] calenderStack(int month,int year){
		
		  String[] months = {"January", "February", "March","April", "May", "June",
	                "July", "August", "September","October", "November", "December"};

	            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	            if ((month == 2) && (isLeapOrNot(year)))
	            {
	                days[month] = 29;
	            }
		
		Integer calenderArray[][]=new Integer[6][7];
		 d = dayOfWeek(month, 1, year);
		int k=0,h=0;
		for(int i=0;i<d;i++){
	
		calenderArray[k][h++]=-1;
		}
		for(int j=1;j<=days[month-1];j++){
			
			if(h%7==0 &&h!=0){
				h=0;
				k=k+1;
				System.out.println("next");
			}
			calenderArray[k][h++]=j;
		}
		return calenderArray;
		
                   
		/*        for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					
					System.out.printf("%3d",calenderArray[i][j]);
				}
			System.out.println();
	         }   */
		
		
		
		
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
	
}
