package com.bridgeIt.utility;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Utility {

	// all scanner inputs
	static Scanner sc = new Scanner(System.in);
         
	public static int inputInt() {

		int a = sc.nextInt();
           
		return a;

	}

	public static String inputString() {

		String a = sc.next();

		return a;

	}
	
	public static String inputStringLong() {

		String a = sc.nextLine();

		return a;

	}

	public static double inputDouble() {

		double a = sc.nextDouble();

		return a;
	}
	
	
	public static long inputLong() {

		long a = sc.nextLong();

		return a;
	}
	
	public static boolean inputBoolean() {

		boolean a = sc.nextBoolean();

		return a;
	}
	//-----------------------------------

	// question 1 (replace username)(functional)
	public static String replace(String name, String statement) {

		String st = null;
		st = statement.replace("<<UserName>>", name);

		return st;
	}
	
	
	public static String[] splitString(String inputString,String name){
		
		String toReplaced="<<UserName>>,";
		String []stringArray=inputString.split("\\s");
		
		for (int i = 0; i < stringArray.length; i++) {
			
			if(stringArray[i].equals(toReplaced)){
				
				stringArray[i]=name+",";
				break;

			}
			
			
		}
		return stringArray;
		
		
	}
	
	//converts String array to String
	public static String convertToString(String [] st){
			String output="";
			
		for (int i = 0; i < st.length; i++) {
			
			output=output+st[i]+" ";
		}
		
		
		return output;

	}
	
	

	// question 2(head and tail)(functional)
	public static void flip(int number) {

		/*using variables head and tails as counter to count head and tails  
		 * headPercent and tailsPercentage to calculate percent of outcome of head and tails
		 * flipper to store random values from Math.random()
		 * */
		double head = 0;
		double tails = 0;
		double total = 0;
		double headPercent = 0.0;
		double tailsPercent = 0.0;
		double flipper=0;

		for (int i = 0; i < number; i++) {

			flipper = Math.random();

			if (flipper > 0.5) {

				head++;
				total++;
			} else {

				tails++;
				total++;
			}
		}

		headPercent = (head / total) * 100;
		tailsPercent = (tails / total) * 100;
		System.out.println("Head percent is " + headPercent);
		System.out.println("Tails percent is " + tailsPercent);

	}
	
	// question 3 (leap year)(functional)

	public static void checkLeapYear(String year) {

		int saal = 0;

		if (year.length()<4) {

			System.out.println("Please enter the years digits greater then three");
			return;
		}

		saal = Integer.parseInt(year);

		if (saal % 4 == 0 &&  saal%100!=0) {

			System.out.println(saal + " is leap year");
			return;
		}

		if (saal % 4==0 && saal%100 == 0 && saal%400!=0) {

			System.out.println(saal + " is not a leap year");
			return;
		}
		
		if (saal % 4==0&& saal%100 == 0 && saal%400==0){

			System.out.println(saal + " is leap year");
			return;
		}
		

	}

	// question 4--- 2 raise to power table (functional)
	
	public static void createTable(String power){
		
		/*converting variable String to integer storing in pow variable */
		int pow=Integer.parseInt(power);
		if (pow>=31){
			
			System.out.println("plz select power less then 31");
			return;
		}
		
		for (int i = 1; i <=pow; i++) {
			
			/*calling methods raiseToTwo which returns integer value*/
			
			System.out.println(2+" raise to "+i+"="+raiseToTwo(i));
		}
		
	}
	
	public static int raiseToTwo(int num){
			
			int sum=1;
			for(int i=1;i<=num;i++){	
				sum=sum*2;
			}
			return sum;
		}


	
	
	
	// question 5 Harmonic number(functional)
	public static void calculateHarmonic(double n) {
		double sum = 0;
		if (n == 0) {
			System.out.println("Invalid harmonic number");
		}

		for (double i = 1; i <= n; i++) {
			// System.out.println(i);
			sum = sum + (1 / i);

		}

		System.out.println(n + "th harmonic is " + sum);

	}

	// question 6 primefactor (functional)

	public static void factorization(int num) {

		for (int j = 0; j <= num; j++) {

			while (num % 2 == 0) {

				System.out.println(2 + " ");
				num = num / 2;
				break;
			}

			for (int i = 3; i <= num; i = i + 2) {

				if (num % i == 0) {

					System.out.println(i + " ");
					num = num / i;

				}

			}

		}

		if (num != 1) {
			System.out.println(num);
		}

	}
	
	// question 6 prime factorization(functional)

	public static void factorizePrime(long n) {
		for (long i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		if (n > 1)
			System.out.println(n);
		
	}
	
	// question 7 gambler (functional)
	public static void gambling(int stake, int goal, int times) {
		int wins = 0;
		int loss = 0;
		double winPercent = 0;

		for (int i = 1; i <= times; i++) {

			int money = stake;
			while (money > 0 && money < goal) {

				if (Math.random() > 0.5) {

					money++;
				 if (money >= goal) {

						wins++;
					}

				} else {

					money--;
					if (money == 0) {

						loss++;
					}

				}

			}

		}

		winPercent = ((double) wins / (double) times) * 100;
		System.out.println("Number of wins " + wins);

		System.out.println("Percentage of wins " + winPercent);
		System.out.println("Percentage of loss " + (100 - winPercent));

	}
	
	// question 8 Coupon number
	
	 public static int NUMBER=0;
	public static float random() {
		return (float) Math.random() * 9999;
	}
	
	public static boolean search(float[] a,float num){
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]==num){
				
				return true;
			}
			
		}

		return false;
	}
	
	
	public static float[] coupon(int n){
		
		float a[] = new float[n];
		int count=0;
		int i=0;
		while(i!=a.length){
			//System.out.println(1);
			float value=random();
			count++;
			System.out.println(value);
			if(search(a,value)==false){
				a[i]=value;
				
				
				i++;
			}

		}
		System.out.println(count);
			return a;
	}

	
	/*public static void couponGenerator(int n) {
		boolean same = false;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			float value = random();
			NUMBER++;
			for (int j = 0; j < n; j++) {
				if (a[j] == value) {
					same = true;
					break;

				}
				if (same == false) {
					a[i] = (int) value;
				}

			}

		}
		System.out.println("Distinct Coupon number are:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("\n Count of random numbers is " + NUMBER);
	}
	
	*/
	
	// question 10 triplet (functional)

	public static void tripletChecking(int size) {

		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the value to the array");
			arr[i] = Utility.inputInt();

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length - 2; k++) {

					if (arr[i] + arr[j] + arr[k] == 0) {

						System.out.println(
								arr[i] + " " + arr[j] + " " + arr[k] + " values at index " + i + " " + j + " " + k);
					}

				}
			}

		}

	}
	
	
	
	// question 9 Array library (functional)
	public static void printing(String st) {

		PrintWriter pw = new PrintWriter(System.out);
		pw.println(st);

		pw.flush();
		

	}

		
	public static void prints(String st) {

		PrintWriter pw = new PrintWriter(System.out);
		pw.print(st);

		pw.flush();
		

	}
	/*public static void printOut(String st) {

		PrintWriter pw = new PrintWriter(OutputStream out);
		pw.print(st);

		pw.flush();
		

	}
	*/

	public static <T extends Comparable<T>> void printsArray(T[][] array,int row ,int column){
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				prints(array[i][j]+" ");
			}
			System.out.println( );
				}
	
	}
	
	public static void selectArray() {

		int size = 0;
		System.out.println("select the array type:- 1.integer 2.boolean 3.double");
		int a = Utility.inputInt();
		System.out.println(a);
		if (a == 1) {

			System.out.println("Enter the row of array");
			int row = Utility.inputInt();

			System.out.println("Enter the column of array");
			int column = Utility.inputInt();
			Integer[][] arr = new Integer[row][column];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.println("Enter the values to array");
					arr[i][j] = Utility.inputInt();

				}

			}

			printsArray(arr, row, column);

		} else if (a == 2) {

			System.out.println("Enter the row of array");
			int row = Utility.inputInt();

			System.out.println("Enter the column of array");
			int column = Utility.inputInt();
			Boolean[][] arr = new Boolean[row][column];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.println("enter the values to array");
					arr[i][j] = Utility.inputBoolean();
				}

			}
			// reading

			printsArray(arr, row, column);

		} else if (a == 3) {

			System.out.println("enter the row of array");
			int row = Utility.inputInt();
			System.out.println("enter the column of array");
			int column = Utility.inputInt();

			Double[][] arr = new Double[row][column];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.println("enter the values to array");
					arr[i][j] = Utility.inputDouble();

				}

			}

			// reading

			printsArray(arr, row, column);
		}

		else {
			System.out.println("Invalid selection");
		}

	}
	
	
	// question 11 euclidian distance
	public static void calculateDistance(String x1,String y1){
		
		
		
		double x=Double.parseDouble(x1);
		double y=Double.parseDouble(y1);
		
		
		//double d=Math.pow(x, 4);
		
		double sum=Math.pow(x, 2)+Math.pow(y, 2);
		
		double result= Math.pow(sum ,0.5);
		System.out.println("Euclidian distance is "+result);
		

	}
	
	//question 12 permutation of string 
	/*	
		swaping two indexs i and j
		@param any string 
		@param i index to be swapped
		@param j index to be swapped
	*/
    public static  String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	
	//recursive permute
	
    public static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
             //  str = swap(str,l,i);
            }
        }
    }
	
	
	
	
	// question 13 StopWAtch

	public static double getTime() {
		double time = System.currentTimeMillis();

		return time;
	}
	
	public static double getTimeNano() {
		double time = System.nanoTime();

		return time;
	}

	public static double stopWatch(double start, double end) {
		double timelapsed = ((end - start));
		System.out.println("Time elapsed is:" + timelapsed +" msec");
		
		return timelapsed ;
	}
	
	public static double stopWatchNano(double start, double end) {
		double timelapsed = ((end - start));
		System.out.println("Time elapsed is:" + timelapsed +" nsec");
		
		return timelapsed ;
	}
	
	//question 14

	static final int EMPTY = 0;
	static final int NONE = 0;
	static final int USER = 1;
	static final int COMPUTER = 2;
	static final int Tie = 3;

	// Generate a random computer move
	public static int computer_move(int[][] board) {
		int move = (int) (Math.random() * 9);

		while (board[move / 3][move % 3] != EMPTY)
			move = (int) (Math.random() * 9);

		return move;
	}

	// See if the game is over
	public static int checkWinner(int[][] board) {

		// top row
		if ((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
			return board[0][0];

		// middle row
		if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
			return board[1][0];

		// bottom row
		if ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
			return board[2][0];

		// Check verticals

		// left column
		if ((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
			return board[0][0];

		// middle column
		if ((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
			return board[0][1];

		// right column
		if ((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
			return board[0][2];

		// Check diagonals
		// one diagonal
		if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
			return board[0][0];

		// the other diagonal
		if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
			return board[0][2];

		// Check if the board is full
		if (board[0][0] == EMPTY || board[0][1] == EMPTY || board[0][2] == EMPTY || board[1][0] == EMPTY
				|| board[1][1] == EMPTY || board[1][2] == EMPTY || board[2][0] == EMPTY || board[2][1] == EMPTY
				|| board[2][2] == EMPTY)
			return NONE;

		return Tie;
	}

	// Print the board
	public static void print_board(int[][] board) {
		System.out.print(printChar(board[0][0]));
		System.out.print("|");
		System.out.print(printChar(board[0][1]));
		System.out.print("|");
		System.out.println(printChar(board[0][2]));
		System.out.println("-----");
		System.out.print(printChar(board[1][0]));
		System.out.print("|");
		System.out.print(printChar(board[1][1]));
		System.out.print("|");
		System.out.println(printChar(board[1][2]));
		System.out.println("-----");
		System.out.print(printChar(board[2][0]));
		System.out.print("|");
		System.out.print(printChar(board[2][1]));
		System.out.print("|");
		System.out.println(printChar(board[2][2]));
	}

	// gameplay
	public static void gamePlay() {

		int turn = USER;
		Scanner sc = new Scanner(System.in);
		// We will represent the board as nine cells
		// 0 = empty, 1 = user, 2 = computer
		int[][] board = new int[3][3];

		// move: 1-9 representing
		int move;

		// winner: 0 = none, 1 = user, 2 = computer, 3 = tie
		int winner;

		System.out.println("This is a tic-tac-toe game");
		System.out.println("You are playing against the computer!");
		System.out.println("Enter 0-8 to indicate your move");

		Utility.print_board(board);

		// While (game not over)
		while (true) {
			if (turn == USER) {
				System.out.println("Your move");
				move = -1;
				while (move < 0 || move > 8 || board[move / 3][move % 3] != EMPTY) {
					System.out.println("Please enter your move(0-8): ");
					move = sc.nextInt();
				}
			} else {
				move = Utility.computer_move(board);
				System.out.println("Computer move: " + move);
			}

			// Update the board
			board[(int) (move / 3)][move % 3] = turn;

			// Print the board
			Utility.print_board(board);

			// if game is over
			winner = Utility.checkWinner(board);

			if (winner != NONE)
				break;

			// switch turn
			if (turn == USER) {
				turn = COMPUTER;
			} else {
				turn = USER;
			}

		}

		// Print out the outcome
		switch (winner) {
		case USER:
			System.out.println("You won!");
			break;
		case COMPUTER:
			System.out.println("Computer won!");
			break;
		default:
			System.out.println("Tie!");
			break;
		}
	}

	// Return an X or O, depending upon whose move it was
	public static char printChar(int b) {
		switch (b) {
		case EMPTY:
			return ' ';
		case USER:
			return 'X';
		case COMPUTER:
			return 'O';
		}
		return ' ';
	}

	
	// question 15 Quadratic equation 
	
	//delta calculations
	public static double deltaCalculation(double a,double b,double c){
		double delta=0;
		double b2=0;
		
		b2=Math.pow(b, 2);
		delta=b2-4*a*c;
		
		return delta;

	} 
	//root calculations
	public static void calculateRoots(double delta,double a,double b,double c){
		
		double dsqt=Math.sqrt(delta);
		
		double r1=(-b+dsqt)/(2*a);
		double r2=(-b-dsqt)/(2*a);
		
		System.out.println("root 1 "+r1);
		System.out.println("root 2 "+r2);
		
	}
	
	//question 16 (wind chill) 
	
	public static void chillCalculation(String temperature,String speed) {
		
		
		
		double t=Double.parseDouble(temperature);
		double v= Double.parseDouble(speed);
		double r=0;
		double w=0;
		
		if (t<50 && v>3 && v<120){
			
			r=Math.pow(v, 0.16);
			
			w=35.74+0.6215*t+(0.4275*t-35.75)*r;
			System.out.println("WindChill is "+w);
		}
		else{
			
			System.out.println("entered value is not in range");
		}
	
	}
	
	// ALOGORITHMS -------------

	// QUESTION 1 ANAGRAM detection
	public static void  detectAnagram(String s1, String s2) {

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		int count = 0;

		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {

				for (int j = 0; j < a2.length; j++) {

					if (a1[i] == a2[j]) {

						a2[j] = 0;
						count++;
					}

				}

			}
			if (count == a1.length) {
				System.out.println("Given strings are anagram");
			}

		} else {
			System.out.println("Given strings are no an anagram");
		}

	}


	// question 2 prime number range

	public static void  makeRange(int a, int b) {

		for (int i = a; i <= b; i++) {

			Utility.primer(i);

		}

	}

	
	public static void primer(int p) {

		
		int count = 0;
		for (int j = 2; j < p; j++) {

			if (p % j == 0) {
				count++;

			}

		}
		if (count == 0) {
			System.out.println(p + " ");
			// Utility.storeArray(p);
			
			Utility.checkPalindromic(p);

		}

	}

	// question 3 extension

	public static void checkPalindromic(int num) {

		String st = Integer.toString(num);
		char[] s = st.toCharArray();

		int size = s.length;
		char[] s1 = new char[size];
		int l = 0;
		for (int i = size - 1; i >= 0; i--) {
			s1[l] = s[i];

			l++;
		}

		String st1 = new String(s);

		String st2 = new String(s1);

		if (st1.equals(st2)) {
			System.out.println(st1 +" is palindromic ");
		}

	}
 


	 public static int[] primeNumbers(int n)
	    {
	            int a[]=new int[n];
	            int k=0;
	            for(int i=0;i<n;i++)
	            {
	                if(isPrime(i))
	                {
	                    a[k]=i;
	                    k++;
	                }
	            }
	            int len=0;
	            for (int i=0; i<a.length; i++)
	                {
	                    if (a[i] != 0)
	                        len++;
	                }
	               
	                int [] newArray = new int[len];
	                int j=0;
	                for (int i=0; i<a.length; i++)
	                {
	                    if (a[i] != 0) {
	                        newArray[j] = a[i];
	                        j++;
	                    }
	                }
	                System.out.println();
	              
	              /*  for (int integer : newArray) {
	                    System.out.println(integer);
	                } */
	            return newArray;
	           
	       
	}
	
	//To check number is prime or not
	    public static boolean isPrime (int number) {
	  
	     for(int i=2; i<=number/2; i++){
	         if(number % i == 0){
	             return false;
	         }
	     }
	     return true;
	}
	    
	  //Method to find prime anagram
	    public static boolean FindAnagram(int[] out) {
	        int len=out.length;
	       boolean status=false;
	        for(int i=0;i<len;i++)
	        {
	            for(int j=i+1;j<len;j++)
	            {
	                //System.out.println(out[i]+" "+out[j]);
	            status=	 AnagramInteger(out[i],out[j]);
	           
	            }
	        }
	       return status;
	}
	    
	  //Method to display anagram
	    public static void displayangaram(boolean status) {
			if(status)
			{
				System.out.println("Is Anagram");
			}
			else
				System.out.println("Is Not Anagram");
	}
	    
	  //Method for integer anagram
	    public static boolean AnagramInteger(int n1, int n2) {
	   
	        String num1=String.valueOf(n1);
	        String num2=String.valueOf(n2);
	       boolean status= Anagram(num1, num2);
	       return status;
	}
	  //Method for Anagram String
	    public static boolean Anagram(String str1, String str2)
	    {
	        char[] string1=str1.toCharArray();
	        char[] string2=str2.toCharArray();
	        Arrays.sort(string1);
	        Arrays.sort(string2);
	        boolean isAnagram =false;
	        isAnagram = Arrays.equals(string1, string2);
	        if(isAnagram==true)
	        {
	           //pSystem.out.println(str1+" , "+str2+" are Anagram Strings");
	        	 return isAnagram;
	        }
	        else
	           //System.out.println(str1+" , "+str2+" are not Anagram Strings");
	        	  return isAnagram;
	       
	}
	  //Method to display array
	    public static void display(int array[])
	    {
	       
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	}
	

	// Anagram check

	/*public static void aCheck(int num1, int num2) {

		String s1 = Integer.toString(num1);
		String s2 = Integer.toString(num2);

		char[] a1 = s1.toCharArray();
		System.out.println(Arrays.toString(a1));
		char[] a2 = s2.toCharArray();
		System.out.println(Arrays.toString(a2));
		int count = 0;

		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {

				for (int j = i; j < a2.length; j++) {

					if (a1[i] == a2[j]) {

						a2[j] = 0;
						count++;
					}

				}

			}
			System.out.println(count);
			if (count == a1.length) {
				System.out.println(count+" "+s1 + " " + s2 + " are anagram");
			}

		}

	}
	*/
	    public static void checkIntAnagaram(int n1, int n2){

	        String num1=String.valueOf(n1);
	        String num2=String.valueOf(n2);
			
	        char[] string1=num1.toCharArray();
	        char[] string2=num2.toCharArray();
	        Arrays.sort(string1);
	        Arrays.sort(string2);
	        String st1=new String(string1);
	        String st2=new String(string2);
	        if(st1.equals(st2)){
	        	System.out.println(n1+" "+n2+"  are anagram");
	        }
			
		}
	    
	    
	    
	    
	    
	// QUESTION 4 Utility methods
	    
	    

		//Method For Insertion Sort
	    public static <T extends Comparable<T>> void insertionSort(T array[]) {
	        int length=array.length;
	        int j;
	        T temp;
	        for(int i=0;i<length;i++)
	        {
	            j=i;
	            temp = array[i];
	            while(j>0&&temp.compareTo(array[j-1])<0)
	            {
	                array[j]=array[j-1];
	                j=j-1;
	            }
	            array[j]=temp;//insert unsorted element
	        }
	        for (int i = 0; i < array.length; i++)
	        {
	            System.out.println(array[i]);
	        }
	    }

	    
	    //generic array for insertion sort
	    public static <T extends Comparable<T>> double insertionStopWatch(T[] array){
			double start=0;
			double end=0;
			double result=0;
		//	String [] st={"zon","bcon","ac","mk","za","ad"};
		//	Integer arr[]= {2,3,1,54,0,7,5};
			start = Utility.getTimeNano();
			System.out.println(start);
			insertionSort(array);
			end = Utility.getTimeNano();
			System.out.println(end);
			result=Utility.stopWatchNano(start, end);
			return result;
		}
	    
	  
	    //generic stopwatch for binary search
	  	public static <T extends Comparable<T>> double binarySearchStopWatch(T[] array,T search){
	  		double start=0;
	  		double end=0;
	  		double result=0;
	  		//String [] st={"zon","bcon","ac","mk","za","ad"};
	  		start = Utility.getTimeNano();
	  		System.out.println(start);
	  	//	insertionSort(array);
	  		binarySearch(array,search);
	  		end = Utility.getTimeNano();
	  		System.out.println(end);
	  		result=Utility.stopWatchNano(start, end);
	  		return result;
	  	}
	  	
	  	
	    //generic method  for binary search in the array
	  	//elements should be sorted to perform search operation
	    public static<T extends Comparable<T>> void binarySearch(T[] array,T search)
	    {
	        int length=array.length;
	        int first=0;
	        int last=length-1;
	        int mid;
	       
	        while(first<=last)
	        {    mid=(first+last)/2;
	            if(array[mid].compareTo(search)<0)
	            {
	                first=mid+1;
	            }
	            else if(array[mid].compareTo(search)==0)
	            {
	                System.out.println(search+" found in location "+mid);
	                break;
	            }
	            else if(array[mid].compareTo(search)>0)
	            {
	                last=mid-1;
	            }
	        }
	        if(first > last)
	        {
	            System.out.println(search+"Not found");
	        }
	 
	        
	}
	 
	    //generic method for bubble sorting the array
	    public static <T extends Comparable<T>> void bubbleSort(T array[]) {
	        int length=array.length;
	       
	       
	        for(int i=0;i<length-1;i++)
	        {
	            for(int j=i+1;j<length;j++)
	            {
	                if(array[i].compareTo(array[j])>0)
	                {
	                    T temp=array[i];
	                    array[i]=array[j];
	                    array[j]=temp;
	                }
	            }
	        }
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }
	}
	    
	//StopWatch for Insertion sort String
		
	  	public static <T extends Comparable<T>> double bubbleSortStopWatch(T[] array){
	  		double start=0;
	  		double end=0;
	  		double result=0;
	  		start = Utility.getTimeNano();
	  		System.out.println(start);
	  		bubbleSort(array);
	  		end = Utility.getTimeNano();
	  		System.out.println(end);
	  		result=Utility.stopWatchNano(start, end);
	  		return result;
	  	}
	  	
	    
	    
	    
	    
	    

	public static void binarySearchInt(int arr[], int sIndex, int eIndex, int x) {

		// int mid=(sIndex+eIndex)/2;
		if (eIndex >= sIndex) {
			int mid = sIndex + (eIndex - sIndex) / 2;

			if (arr[mid] == x) {
				System.out.println("match found at index " + mid);
				return;
			}

			if (arr[mid] > x) {

				binarySearchInt(arr, sIndex, mid - 1, x);
			} else {

				binarySearchInt(arr, mid + 1, eIndex, x);
			}

		} else {

			System.out.println("match not found");
		}
	}

	public static void binarySearchString(String st[], int sIndex, int eIndex, String x) {

		// int mid=(sIndex+eIndex)/2;
		if (eIndex >= sIndex) {
			int mid = sIndex + (eIndex - sIndex) / 2;

			if (st[mid].equals(x)) {
				System.out.println("match found at index " + mid);
				return;
			}

			if (st[mid].compareTo(x) > 0) {

				binarySearchString(st, sIndex, mid - 1, x);
			} else {

				binarySearchString(st, mid + 1, eIndex, x);
			}

		} else {

			System.out.println("match not found");
		}
	}

	public static void makeArrInt(int size) {
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {

			System.out.println("enter the value to the array");
			arr[i] = Utility.inputInt();

		}

	}

	public static void makeArrString(int size) {

		String st[] = new String[size];
		for (int i = 0; i < size; i++) {

			System.out.println("enter the value to the array");
			st[i] = Utility.inputString();

		}

	}
	
	public static void iSortInt(int arr[]) {

		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

	}

	public static void iSortString(String st[]) {

		int n = st.length;
		for (int i = 1; i < n; ++i) {
			String key = st[i];
			int j = i - 1;

			while (j >= 0 && st[j].compareTo(key) > 0) {
				st[j + 1] = st[j];
				j = j - 1;
			}
			st[j + 1] = key;
		}

		for (int i = 0; i < st.length; i++) {

			System.out.println(st[i]);

		}

	}
	
	
	
	//Integer sort 
	public static void binarySortInt(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

	}
	
	

	public static void bSortString(String st[]) {

		for (int i = 0; i < st.length; i++) {

			for (int j = i + 1; j < st.length; j++) {

				if (st[i].compareTo(st[j]) > 0) {

					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;

				}

			}

		}

		for (int i = 0; i < st.length; i++) {

			System.out.println(st[i]);

		}

	}
	
	//StopWatch for binary search integer
	public static double binaryIntStopWatch(){
		double start=0;
		double end=0;
		double result=0;
		int []arr1={1,2,34,56,78,99};
		start = Utility.getTime();
		System.out.println(start);
		Utility.binarySearchInt(arr1, 0, arr1.length, 56);
		end = Utility.getTime();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}
	
	//StopWatch for binary search String
	public static double binaryStringStopWatch(){
		
		double start=0;
		double end=0;
		double result=0;
		String[] st1 ={"acon","bcon","con","dcon","econ","fcon"};
		start = Utility.getTime();
		System.out.println(start);
		Utility.binarySearchString(st1, 0, st1.length, "con");
		end = Utility.getTime();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}

	//StopWatch for Insertion sort String
	
	public static double iSortStringStopWatch(){
		double start=0;
		double end=0;
		double result=0;
		String [] st={"zon","bcon","ac","mk","za","ad"};
		start = Utility.getTime();
		System.out.println(start);
		Utility.iSortString(st);
		end = Utility.getTime();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}
	//StopWatch for insertion integer
	
	public static double iSortIntStopWatch(){
		double start=0;
		double end=0;
		double result=0;
	//	String [] st={"zon","bcon","ac","mk","za","ad"};
		int arr[]= {2,3,1,54,0,7,5};
		start = Utility.getTime();
		System.out.println(start);
		Utility.iSortInt(arr);
		end = Utility.getTime();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}
	

	//StopWatch for bubble sort String
	
	public static double bSortStringStopWatch(){
		double start=0;
		double end=0;
		double result=0;
		String [] st={"zon","bcon","ac","mk","za","ad"};
		start = Utility.getTime();
		System.out.println(start);
		Utility.bSortString(st);
		end = Utility.getTime();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}

	//Stopwatch for bubble sort int
	

	public static double bSortIntStopWatch(){
		double start=0;
		double end=0;
		double result=0;
	
		int arr[]= {2,3,1,54,0,7,5};
		start = Utility.getTimeNano();
		System.out.println(start);
		Utility.binarySortInt(arr);
		end = Utility.getTimeNano();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}

	
	    
	    
	//question number 5 user search binary
	

	
	    
	public static int[]  createArray(int a , int b){
		int size= (b-a)+1;
		System.out.println(size+" "+a+" "+b);
		
		int [] ary= new int[size];
		System.out.println(Arrays.toString(ary));
		for(int i=0;i<size;i++){
					
			ary[i]=a;
			a++;
			
		}
		System.out.println(Arrays.toString(ary));
		return ary;
	
		
	}
	
	//search method

	public static void binarySearchingUser(int arr[], int sIndex, int eIndex) {

		int want = 0;
		// int mid=(sIndex+eIndex)/2;
		if (eIndex >= sIndex) {
			int mid = sIndex + (eIndex - sIndex) / 2;
			System.out.println(arr[mid] + " is this number is your disered value ? ");
			System.out.println("1.yes  2.less then  3.greater then");
			want = Utility.inputInt();

			if (want == 1) {

				System.out.println("match found at index " + mid);

			} else if (want == 2) {

				System.out.println(mid);
				binarySearchingUser(arr, sIndex, mid - 1);

			} else if (want == 3) {

				binarySearchingUser(arr, mid + 1, eIndex);
			}

		} else {

			System.out.println("match not found");
		}
	}
	
	
	//QUESTION 6 binary search the word from word list
	
	public static String[] wordSort(String st[]) {

		for (int i = 0; i < st.length; i++) {

			for (int j = i + 1; j < st.length; j++) {

				if (st[i].compareTo(st[j]) > 0) {

					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;

				}

			}

		}

		for (int i = 0; i < st.length; i++) {

			System.out.println(st[i]);

		}
		return st;

	}
	
	//question 8 bubble sort Integers list
	
	public static int[] stringTOInt(String [] s){
		
		int integer[]= new int[s.length];
		 
		 for(int i=0;i<s.length;i++){
			 
			 if(s[i].equals("")){
				 continue;
			 }
			 integer[i]=Integer.parseInt(s[i]);
			 
		 }
		 
		 System.out.println(Arrays.toString(integer));
		
		
		
		return integer;
	
	}
	
	
	
	//question 7 insertion sort string
	
	public static void iSortingStrings(String st[]) {

		int n = st.length;
		for (int i = 1; i < n; ++i) {
			String key = st[i];
			int j = i - 1;

			while (j >= 0 && st[j].compareTo(key) > 0) {
				st[j + 1] = st[j];
				j = j - 1;
			}
			st[j + 1] = key;
		}

		for (int i = 0; i < st.length; i++) {

			System.out.println(st[i]);

		}

	}
	
	//question 9
	 public static void vendingMachine( int changes)
	    {
	            int notes[]={1, 2, 5, 10, 50, 100, 500, 1000};
	            int len=notes.length;
	            int count=0;
	            for (int i = len-1; i >= 0; i--)
	            {
	                while(changes>=notes[i])
	                {
	                    changes-=notes[i];
	                    System.out.print(notes[i]+" ");
	                    count++;
	                }

	            }
	           
	            System.out.println("\nNumber of changes:"+count);
	    }

	//question 14 sqt using newton
	
	 public static int sqrt(double e, int c) {

			int t = c;
			int i = 0;
			double e1 = e - 15;

			while (Math.abs((t - c / t)) > e1 * t) {
				t = ((c / t) + t) / 2;

				if (i == 10) {
					break;
				}
				i++;
			}
			return t;

		}
	 
	 //day of the week
	 public static int findingDay(int m, int d, int y)
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
	 
	 public static void printDay(int num){
			
			switch (num) {
			case 0:
				System.out.println("it's Sunday");
				break;
			case 1:
				System.out.println("it's Monday");
				break;
			case 2:
				System.out.println("it's Tuesday");
				break;
			case 3:
				System.out.println("it's Wednesday");
				break;
			case 4:
				System.out.println("it's Thrusday");
				break;
			case 5:
				System.out.println("it's Friday");
				break;	
			case 6:
				System.out.println("it's Saturday");
				break;		
			default:
				System.out.println("NO-day");
				break;
			}
	 }
			

	 //temperature conversion
	 
	  public static void temperatureConvert(int choice, int temperature)
	    {
	        /*Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
	                Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
	         */
	        int convert;
	       
	        switch(choice)
	        {
	        case 1:    convert=(temperature * 9/5)+32;
	                System.out.println("After Conversation:"+convert);
	                break;
	       
	        case 2: convert=(temperature-32)*5/9;
	                System.out.println("After Conversation:"+convert);
	                break;
	        default: break;
	        }   
	}

	// toBinary() takes integer number as parameter and converts to binary
	// string representation
	public static String toBinary(int num) {

		String st = "";
		while (true) {
			if (num > 0) {

				if (num % 2 == 0) {
					st = "0" + st;

					num = num / 2;

				} else {

					st = "1" + st;
					num = num / 2;
				}
				if (num == 0)
					break;
			}

		}

		return st;

	}

	// takes any integer and convert it into binary with 8-bit length
	public static String increseLength(int number) {

		String binary = Utility.toBinary(number);

		while (binary.length() != 8) {

			binary = "0" + binary;

		}

		return binary;
	}

	// swaps the nibbles of any binary 8-bit number
	public static String swapNibble(String binary) {

		// creating char array ch[]
		char ch[] = binary.toCharArray();
		char temp = ' ';

		for (int i = 0; i < (binary.length() / 2); i++) {

			temp = ch[i];
			ch[i] = ch[i + 4];
			ch[i + 4] = temp;

		}

		String result = new String(ch);
		return result;

	}

	// converts any binary number into integer
	public static int toInt(String binary) {

		int j = 0;
		int sum = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {
			if (binary.charAt(i) == '1') {

				sum = sum + Utility.raiseToTwo(j);

			}

			j++;
		}

		return sum;

	}
	  
	// To check whether the given number is power of two
	public static boolean findPowOfTwo(String binary) {

		int count = 0;
		for (int i = 0; i < binary.length(); i++) {

			if (binary.charAt(i) == '1') {
				count++;

			}

		}

		if (count == 1) {
			return true;

		} else {

			return false;
		}

	}
	  
	  
	  
}
