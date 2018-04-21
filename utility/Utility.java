package com.bridgeIt.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

import com.bridgeIt.dataStructures.Dequeue;
import com.bridgeIt.dataStructures.Queue;
import com.bridgeIt.dataStructures.Stack;
import com.bridgelabz.datastucture.QueueLinkList;



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

	/*
	 * Function to replace string from given pattern
	 * @param inputString contains pattern
	 * @param name contains desired string to replace
	 */
	public static String replace(String name, String statement) {

		statement = statement.replace("<<UserName>>", name);
		return statement;
	}
	
	
	
	//converts String array to String
	
	
	/*
	 * Function converts string array to string and storing in variable
	 * outcome
	 * @param string array
	 */
	public static String convertToString(String [] st){
			String output="";
			
		for (int i = 0; i < st.length; i++) {
			
			output=output+st[i]+" ";
		}
		
		return output;

	}
	
	

	// question 2(head and tail)(functional)
	
	/* Function flip to take number of flip and generate head and tails percentage and
	 * displays percent of head and tails 
	 * @param num takes number of flips
	 * 
	 * */
	public static void flip(int number) {

		
		double head = 0;
		double tails = 0;
		double total = 0;
		double headPercent = 0;
		double tailsPercent = 0;
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

	

	/* Function for checking whether given year is leap year or not 
	 *
	 * @param year takes any year 
	 * */
	public static void checkLeapYear(int year) {

		if (year/1000==0) {

			System.out.println("Please enter the years digits greater then three");
			return;
		}

		if (year % 4 == 0 &&  year%100!=0) {

			System.out.println(year + " is leap year");
			return;
		}
		if (year%400==0){

			System.out.println(year + " is leap year");
			return;
		}
		
		System.out.println(year + " is not a leap year");
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
	
	
	/*Function calculateHarmonic calculates nth harmonic value
	 * @param number to give nth term
	 * */
	public static void calculateHarmonic(double n) {
		double sum = 0;
		if (n == 0) {
			System.out.println("Invalid harmonic number");
		}

		for (double i = 1; i <= n; i++) {
			sum = sum + (1 / i);

		}

		System.out.println(n + "th harmonic is " + sum);

	}

	/* question 6 primefactor (functional)*/
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


	/* Function factorizePrime generates prime factors of any integer number 
	 * @param number for generating prime factor of that number
	 * */
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
	
	
	
	/* Function to simulate gambling through randomness
	 * @param stake money to with
	 * @param goal gambler's target to achieve 
	 * @param times for playing n numbers of times
	 * */
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
	public static int random() {
		Random num= new Random();
		return num.nextInt(NUMBER);
	}
	
	public static boolean search(int[] a,int num){
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]==num){
				
				return true;
			}
			
		}

		return false;
	}
	
	
	/* coupon function generates n distinct number
	 * @param n number of distinct coupon
	 * 
	 * */
	public static int[] coupon(int n){
		
		int a[] = new int[n];
		int count=0;
		int i=0;
		while(i!=a.length){
			int value=random();
			count++;
			if(search(a,value)==false){
				a[i]=value;
				System.out.println(Arrays.toString(a));
				i++;
			}
			if(i==a.length-1)break;
		}
		
		System.out.println("Total random number needed to have all distinct numbers is "+count);
			return a;
	}

	
	// question 10 triplet (functional)
	

	/* Function create an array and checks the distinct values equals to zero
	 * @param size used to take the size of an array
	 * */
	public static void tripletChecking(int size) {

		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the value to the array");
			arr[i] = Utility.inputInt();

		}

		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length ; k++) {

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
	
	
	

	/* Function function to select type of the array and to display the contains
	 * @returns displays the contains of an array
	 * */
	public static void selectArray() {

		int size = 0;
		System.out.println("select the array type:- 1.integer 2.boolean 3.double");
		int a = Utility.inputInt();
		System.out.println(a);
		
		switch(a){
		
		case 1:{
			
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
			break;
			
		}
		case 2:{
			
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
			
			break;
			
		}
		case 3:{
			

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
			break;
		}
		default:{
			System.out.println("Entered value is incorrent");
			break;
		}
		}
		
		
	
	}
	
	
	// question 11 euclidian distance
	
	
	
	/* Function calculating the euclidean distance from origin
	 * @param euclidean distance at desired point along x-axis
	 *  @param euclidean distance at desired point along y-axis
	 * */
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
    
    
    /* Function takes the users input and permutes the string
	 * @param str any desired string
	 * @param number the starting index
	 * @param number last index of the string 
	 * */
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
	
	
	/* Function to calculate the roots of the equation a*x*x + b*x + c=0
	 * @param delta ,a,b,c
	 * */
	public static void calculateRoots(double delta,double a,double b,double c){
		
		double dsqt=Math.sqrt(delta);    							//using function to calculate square roots
		
		double r1=(-b+dsqt)/(2*a);									//calculating root1 (-b + sqrt(delta))/(2*a)
		double r2=(-b-dsqt)/(2*a);									//calculating root2(-b - sqrt(delta))/(2*a)
		
		System.out.println("root 1 "+r1);
		System.out.println("root 2 "+r2);
		
	}
	
	//question 16 (wind chill) 
	
	/* Function chillCalculation calculates the wind chill 
	 * @param command line arguments
	 * */
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
	
	/* Function checks two Strings are anagram or not
	 * @param string s1 and s2 
	 * */
	public static void  detectAnagram(String str1, String str2) {
		 str1=str1.replace(" ", "");
		 str2=str2.replace(" ","");
		 str1=str1.toLowerCase();
		 str2=str2.toLowerCase();
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		int count = 0;

		if (charArray1.length ==charArray2.length) {
			for (int i = 0; i <charArray1.length; i++) {

				for (int j = 0; j < charArray2.length; j++) {

					if (charArray1[i] == charArray2[j]) {

						charArray2[j] = 0;
						count++;
					}

				}

			}
			if (count == charArray1.length) {
				System.out.println("Given strings are anagram");
			}else {
				System.out.println("Given strings are no an anagram");
		}

		} 
		else{
			System.out.println("Given strings are no an anagram");
		}
	}


	// question 2 prime number range

	/* Function takes two ranges and prints the prime numbers within that range
	 * @param initial and final range
	 * */
	public static void  makeRange(int a, int b) {

		for (int i = a; i <= b; i++) {

			Utility.primer(i);

		}

	}

	/* Function takes integer number and checks whether it is prime number or not
	 * @param integer number
	 * */
	public static void primer(int p) {

		
		int count = 0;
		for (int j = 2; j < p; j++) {

			if (p % j == 0) {
				count++;

			}

		}
		if (count == 0&& p!=1) {
			System.out.println(p + " ");			
		//	Utility.checkPalindromic(p);

		}

	}

	// question 3 extension

	/* Function checks the number is palindrome or not
	 * @param prime numbers from an array
	 * */
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
 
	/* Function takes prime array and checks for palindromic number
	 * @param integer array of prime numbers
	 * */
	public static void primePalindrome(int prime[]){
		
		for (int i = 0; i < prime.length - 1; i++) {
			
			Utility.checkPalindromic(prime[i]);
		}

	}
	

	/* Function finds the prime numbers and store the numbers in an array
	 * @param number takes the range 
	 * @returns integer array of prime number
	 * */
	 public static int[] primeNumbers(int n)
	    {
	            int a[]=new int[n];
	            int k=0;
	            for(int i=0;i<n;i++)
	            {
	                if(isPrime(i)&&i!=1)
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
	        //        System.out.println();
	              
	              /*  for (int integer : newArray) {
	                    System.out.println(integer);
	                } */
	            return newArray;
	           
	       
	}
	
		/* Function interates in array and checks for anagram numbers
		 * @param integer array
		 * */
		public static void printAnagram(int prime[]){
			
			for (int i = 0; i < prime.length-1; i++) {
				for (int j = i+1; j < prime.length; j++) {
					if(Utility.checkIntAnagaram(prime[i], prime[j])){
						System.out.println(prime[i]+" "+prime[j]+"  are anagram");
					}
				}
				
			}
			
			
		}
	 /* Function checks whether the given number is prime or not
		 * @param integer value to check for prime number conditions
		 * @returns boolean:true if it is prime number
		 * */
	    public static boolean isPrime (int number) {
	  
	     for(int i=2; i<=number/2; i++){
	         if(number % i == 0&& number!=1){
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
	  //prints the contents in an array of prime numbers
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
	    
	    
	    
		/* Function checks the number is palindrome or not
		 * @param prime numbers from an array
		 * */
	    public static boolean checkIntAnagaram(int n1, int n2){

	        String num1=String.valueOf(n1);
	        String num2=String.valueOf(n2);
			
	        char[] string1=num1.toCharArray();
	        char[] string2=num2.toCharArray();
	        Arrays.sort(string1);
	        Arrays.sort(string2);
	        String st1=new String(string1);
	        String st2=new String(string2);
	        if(st1.equals(st2)){
	        	
	        	return true;
	        }
			return false;
			
		}
	    
	// QUESTION 4 Utility methods
	    public static TreeMap<Double, String> TMAP = new TreeMap<Double, String>();
	    
		/* Function sortbyKey sorts the key in descending order
		 * @returns all the elements in Treemap -(key,value) 
		 * */
	    public static void sortbykey() {
			ArrayList<Double> sortedKeys = new ArrayList<Double>(TMAP.keySet());

			Collections.sort(sortedKeys, Collections.reverseOrder());

			// Display the TreeMap which is naturally sorted
			for (Double x : sortedKeys)
				System.out.println("Performance time = " + x + " nsec,Method Name = " + TMAP.get(x));
		}


		//Method For Insertion Sort(generic)
		/* Function takes generic array and sorts it 
		 * @param generic array
		 * */
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

	    
	    //generic array for insertion sort stopwatch
	    public static <T extends Comparable<T>> Double insertionStopWatch(T[] array){
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
	  	public static <T extends Comparable<T>>  Double  binarySearchStopWatch(T[] array,T search){
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
	    
	    /* Function takes any array and sorts it by bubble sort
		 * @param any array 
		 * */
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
		
	  	public static <T extends Comparable<T>>  Double  bubbleSortStopWatch(T[] array){
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

	
	/* Function to search the element
	 * @param String s1 ,starting index ,end index, word
	 * */
	public static void binarySearchString(String st[], int sIndex, int eIndex, String x) {

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
	

	/* Function creates an array between two ranges
	 * @param Numbers initial range and final range
	 * */
	    
	public static int[]  createArray(int range ){
		int size= (range);
		System.out.println(size);
		
		int [] ary= new int[size];
		System.out.println(Arrays.toString(ary));
		for(int i=0;i<size;i++){
					
			ary[i]=i;
			
		}
		System.out.println(Arrays.toString(ary));
		return ary;
	
		
	}
	
	//search method

	
	
	/* Function to search the users assumed number
	 * @param Numbers array,starting ,index length
	 * */
	public static void binarySearchingUser(int arr[], int sIndex, int eIndex) {

		int want = 0;
		if (eIndex >= sIndex) {
			int mid = sIndex + (eIndex - sIndex) / 2;
			System.out.println(arr[mid] + " is this number is your disered value ? ");
			System.out.println("1.yes  2.less then  3.greater then");
			want = Utility.inputInt();

			if (want == 1) {

				System.out.println("match found at index " + mid);

			} else if (want == 2) {

				binarySearchingUser(arr, sIndex, mid - 1);

			} else if (want == 3) {

				binarySearchingUser(arr, mid + 1, eIndex);
			}

		} else {

			System.out.println("match not found");
		}
	}
	
	
	/* Function does binary seach to find the desired number
	 * @param Integer array 
	 * */
	public static void binarySearchInArray(int[] array) {
		int start = 0;
		int end = array.length;
		int mid = (start + end) / 2;
		while (start < end) {
			System.out.println("You are between " + (start + 1) + " and " + (end) + "\nEnter true or false");
			boolean b = Utility.inputBoolean();
			mid = (start + end) / 2;
			if (b == true) {
				start = mid + 1;
			} else if (b == false) {
				end = mid;
			}
		}
		System.out.println("Your Number is : " + array[mid]);
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
	
	
	 /* Function takes String array and converts it to integer array
	  * @param integer array 
	 * */
	public static Integer[] stringToInt(String [] s){
		
		Integer integer[]= new Integer[s.length];
		 
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
	//Method for merge sort
	
	 /* Function divdes the array recursively and make it available for merge sorting
	  * @param generic array ,lower index,higher index
	 * */
    public static <T extends Comparable<T>> void mergeSort (T a[] , int low , int high )
    {
        if(low < high)
        {
            int mid = (low + high )/2;
            mergeSort (a,low,mid);
            mergeSort (a,mid+1,high);            
            merge(a,low,mid,high);  
       }                   
    }
   

	 /* Function merges the array which was divded
	  * @param generic array ,lower index,mid index,higher index
	  * */
    public static <T extends Comparable<T>> void merge(T a[] , int start, int mid, int end)
    {
       
        int p = start , q = mid+1;
        Object[] arr1 = new Object[end-start+1];
        int k=0;
        for(int i = start ;i <= end ;i++)
        {
           
            if(p>mid)     
            {
                arr1[k++] = a[q++] ;
            }
           
            else if ( q > end)  
            {
               arr1[k++] = a[p++];
            }
            //checks which part has smaller element.
            else if( a[p].compareTo(a[q])<0)    
            {
               arr1[ k++ ] = a[p++];
            }
            else
            {
               arr1[ k++ ] = a[q++];
            }
        }
        for (int l=0 ; l< k ;l ++)
        {
              a[start++] = (T) arr1[l] ;                         
        }
        System.out.println("After Sorting:");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    	}
	
	 public static void vendingMachine( int changes)
	    {
		 		
	            int notes[]={1, 2, 5, 10, 50, 100, 500, 1000};
	            int len=notes.length;
	            int count=0;
	            for (int i = len-1; i >= 0; i--)
	            {
	            	int num=0;
	                while(changes>=notes[i])
	                {
	                    changes-=notes[i];
	                    count++;
	                    num++;
	                }
	                if(num>0)
	                System.out.println(notes[i]+"x"+num);
	            }
	           
	            System.out.println("\nNumber of changes:"+count);
	    }

	//question 14 sqt using newton
	
	 

		/* Function calculates the square root of number
		 * @param double epsilon and a number 
		 * @return integer value which is square root of a number
		 * */
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
	 
	 
		/* Function takes date with respect to month/day/year and calculates the day of the week
		 * @param month/day/year
		 * @returns integer day of the week
		 * */
	 public static int findingDay(int m, int d, int y)
	    {
	       
	        int y1=y-(14-m)/12;
	        int x=y1+y1/4-y1/100+y1/400;
	        int m1=m + 12 * ((14 - m) / 12) - 2;
	        int d1=(d+x+31*m1/12) % 7;
	       
	        return d1;
	}
	 
	 /* Function takes day number and prints particular day of the week.
		 * @param day number according to Gregorian calendar 
		 * */
	 
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
	 
	 /* Function number takes in choice and temperature to calculate conversions
		 * @param initial and final range
		 * */
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

	  
	  /* Function converts the pricipal amount into appropriate salary 
		 * @param numbers principal,rate of interest and years
		 * @return number payments
		 * */ 
	  public static void monthlyPayment(double p,double r,int y)
	    {
	        double n=y*12;
	        double rate= r/(12*100);
	        double payment=(p*rate)/(1-Math.pow(1+rate,-n));
	        System.out.println("Monthly Payment is:"+payment);
	}
	
	  
	  /* Function  converts integer number to binary
		 * @param number which will be converted to binary
		 * @return String value which holds binary representation
		 * */
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
	
	
	/* Function will take integer number and convert it into binary 8-bit 
	 * @param number any integer number
	 * */
	public static String increseLength(int number) {

		String binary = Utility.toBinary(number);

		while (binary.length() != 8) {

			binary = "0" + binary;

		}
		System.out.println(binary);
		return binary;
	}

	// swaps the nibbles of any binary 8-bit number
	
	/* Function will swap nibbles of 8--bit binary number
	 * @param String of binary number 
	 * */
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
		System.out.println(result);
		return result;

	}

	// converts any binary number into integer
	
	 /* Function converts the binary number into integer
	 * @param String of binary number 
	 * */
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
	
	/* Function to find the binary number is power of two or not
	 * @param String of binary number 
	 * */
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
	  
	  //DATASTRUCTURES----------
	
	/* Function reads the files and converts it in string array
	 * @param file name with extension
	 * */
	public static String [] readFile(String file){
		String [] str=null;
		FileReader fileRead;
		try {
			fileRead = new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//"+file+"");
			BufferedReader br = new BufferedReader(fileRead);
			String read=br.readLine();
			String concat=read;
			while(read!=null){
				
				read=br.readLine();
				if(read==null){break;}
				concat=concat+read;
			}
			System.out.println(concat);
			  str=concat.split("\\s");	
			 }	
			 catch (IOException e) {
					
					e.printStackTrace();
					
				}
		
		return str;
		
	}  
	
	
	/* Function writes the content in file 
	 * @param file name with extension,data any literals
	 * */
	public static <T extends Comparable<T>> void printData(String file,T data){
			
			FileWriter filewrite;
			PrintWriter printwrite;
			try {
	
				filewrite = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//"+file+"",true);
				printwrite=new PrintWriter(filewrite);
				
				printwrite.print(""+data+" ");
				printwrite.flush();
				printwrite.close();
			} catch (IOException e) {
				e.printStackTrace();
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
		 
		    
		//calender queue
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
		                weekday.insert("\t"+i);
		                if (((i + d) % 7 == 0) || (i == days[month-1]))
		                weekday.insert("\n");
		            }
		            weekday.display();
		    }
		    //Method to find day of a week
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
		    
    
    /* Function checks the expression is balanced or not
	 * @param string equation
	 * */ 
    public static void checkParentheses(String equation){
		
		Stack st= new Stack<>();
		for (int i = 0; i < equation.length(); i++) {
			if(equation.charAt(i)=='('){
				
				st.push('(');
				
			}else if(equation.charAt(i)==')'){
				
				try {
					st.pop();
				} catch (Exception e) {
					System.out.println("Unbalanced equation");
					return;
				}
				
			}
		}
		if(Stack.size==0){
			System.out.println("it is balanced expression");
		}else{
			
			System.out.println("it is not balanced expression");
		}
			
	}

	
    
    /* Function check whether is palindrome or not
	 * @param string word
	 * */ 
	 public static void isPalindromeChecker(String string) {
	        Dequeue d= new Dequeue();
	        boolean status=false;
	        char[] array=string.toCharArray();
	        char first;
	        char last;
	        for(int i=0;i<array.length;i++)
	        {
	            d.addRear(array[i]);
	        }
	        /*int size=d.size();
	        System.out.println(size);*/
	        while(d.size()>1)
	        {
	            first=d.removeFront();
	            last=d.removeRear();
	            System.out.println(first);
	            System.out.println(last);
	            if(first!=last)
	            {
	                status=false;
	                break;
	            }
	            else
	                status=true;
	        }
	        System.out.println(d.size());
	        if(status==true)
	        {
	            System.out.println("Is a palindrome");
	        }
	        else
	            System.out.println("Not a palindrome");
	    }  
 
	 
	 /* Function for calculating the factorial
		 * @param integer number
		 * @returns integer value of factorial
		 * */ 
	   public static int fact(int num){
		
		   if(num==1)
		   return 1;
		   
		   return num*fact(num-1);
	 
	   }
	   
	   /* Function to calculate the catalan number 
		 * @param integer number
		 * @returns double value of factorial
		 * */ 
	   public static double binarySearchTree(int number){
		   double result=0;
		   
		   result=fact(number*2)/(fact(number+1)*fact(number));
		   
		   return result;
	   }
		 
		/* Function to calculates the day of the week
		 * @param integer number for month ,day,year
		 * @returns 
		 * */ 
	   public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }
	   


	   /* Function checks whether the given year is leap year o not
		 * @param integer number for year
		 * @returns boolean value true or false
		 * */ 
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }
	   
	   
	   
	    /* Function takes the integer value for month and year, Prints the calender
		 * @param integer number for year,month
		 * */ 
	    public static void printCalender(int month,int year){
	        // months[i] = name of month i
	        String[] months = {
	            "",                               // leaved empty so that months[1] = "January"
	            "January", "February", "March",
	            "April", "May", "June",
	            "July", "August", "September",
	            "October", "November", "December"
	        };

	        // days[i] = number of days in month i
	        int[] days = {
	            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	        };

	        // check for leap year
	        if (month == 2 && isLeapYear(year)) days[month] = 29;

	        // print calendar header
	        System.out.println("   " + months[month] + " " + year);
	        System.out.println(" S  M Tu  W Th  F  S");

	        // starting day
	        int d = day(month, 1, year);

	        // print the calendar
	        for (int i = 0; i < d; i++)
	        	System.out.print("   ");
	        for (int i = 1; i <= days[month]; i++) {
	        	System.out.printf("%2d ", i);
	            if (((i + d) % 7 == 0) || (i == days[month]))System.out.println();
	        }
	    }
	
		
    /* Function takes integer array and converts it to prime anagram array
	 * @param integer array
	 * @returns the integer array
	 * */ 
	public static Integer[] primeAnagramArray(Integer arr[]){
		//	Integer result[]=new Integer[]
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=null)
				count++;
		}
		
	//	System.out.println(count);
		Integer result[]=new Integer[count];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=null)
				result[index++]=arr[i];
		}
		
		return result;
		
	}
						
	
	
    /* Function takes integer array and separates it to prime and anagram array
	 * @param integer array
	 * @returns the integer array
	 * */ 
	public static Integer[] anagramArray(int prime[]){
		Integer	anagramArray[][]= new Integer[1000][2];
		Integer anagram[]=new Integer[400];
		int index=0;
		int row0=0;
		int row1=0;
		int colmn0=0;
		int colmn1=1;
		
		for (int i = 0; i < prime.length-1; i++) {
			int count=0;
			for (int j = i+1; j < prime.length; j++) {
				if(Utility.checkIntAnagaram(prime[i], prime[j])){
					
					anagramArray[row0++][colmn0]=Integer.valueOf(prime[i]);
					count++;
					anagramArray[row0++][colmn0]= Integer.valueOf(prime[j]);
					anagram[index++]=prime[i];
					anagram[index++]=prime[j];
					
				}
			}
			if(count==0)
			anagramArray[row1++][colmn1]=prime[i];
			
		}
	
		prints2dArray(anagramArray, 200, 2);
		return anagram;
	}
	
	 /* Function reads and print the 2d array
		 * @param integer array, row,column
		 * */ 
	public static <T extends Comparable<T>> void prints2dArray(T[][] array,int row ,int column){
					
					for (int i = 0; i < row; i++) {
						for (int j = 0; j < column; j++) {
							System.out.printf("%4d ", array[i][j]);
			}
			System.out.println( );
				}
	
	}
	
	 /* Function split the array and divides the array 
		 * @param integer array
		 * */     
	public static void arraySplit(int [] arr){
		int row=30;
		int column=10;
		int row0=0;
		int row1=0;
		int row2=0;
		int row3=0;
		int row4=0;
		int row5=0;
		int row6=0;
		int row7=0;
		int row8=0;
		int row9=0;
		Integer arrayInteger[]=new Integer[arr.length];
		for(int i=0;i<arr.length;i++){
			
			arrayInteger[i]=Integer.valueOf(arr[i]);
			
		}
		 Integer array[][]=new Integer[row][column];
		
		 for (int i = 0; i < arrayInteger.length; i++) {
			
			 Integer num=arrayInteger[i];
			 num=num/100;
			 
			 switch(num){
			 
			 case 0:{
				 if(arrayInteger[i]<100)
				 array[row0++][num]=arrayInteger[i];
				 break;
			 }
			 case 1:{
				 if(arrayInteger[i]<200)
					 array[row1++][num]=arrayInteger[i];
					 break;
			 }
			 case 2:{
				 if(arrayInteger[i]<300)
					 array[row2++][num]=arrayInteger[i];
					 break;
			 }
			 case 3:{
				 if(arrayInteger[i]<400)
					 array[row3++][num]=arrayInteger[i];
					 break;
			 }
			 case 4:{
				 if(arrayInteger[i]<500)
					 array[row4++][num]=arrayInteger[i];
					 break;
			 }
			 case 5:{
				 if(arrayInteger[i]<600)
					 array[row5++][num]=arrayInteger[i];
					 break;
			 }
			 case 6:{
				 if(arrayInteger[i]<700)
					 array[row6++][num]=arrayInteger[i];
					 break;
			 }
			 case 7:{
				 if(arrayInteger[i]<800)
					 array[row7++][num]=arrayInteger[i];
					 break;
			 }
			 case 8:{
				 if(arrayInteger[i]<900)
					 array[row8++][num]=arrayInteger[i];
					 break;
			 }
			 case 9:{
				 if(arrayInteger[i]<1000)
					 array[row9++][num]=arrayInteger[i];
					 break;
			 }
			 
			 }
			 
			 
			
			 
		}
		 prints2dArray(array, row, column);
		
	}
	
	
	 /* Function search the null value in array and make it to zero 
	 * @param integer array, row ,column
	 * */ 
	public static  void makeZero(Integer[][] array,int row ,int column){
	

	for (int i = 0; i < row; i++) {
		for (int j = 0; j < column; j++) {
			
			if(array[i][j]==null){
				
				array[i][j]=0;
			}
			
		}
			}
	
}	    


}
