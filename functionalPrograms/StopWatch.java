package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		double start=0;
		double end=0;
		
		 start = Utility.getTime();
		System.out.println(start);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		end = Utility.getTime();
		System.out.println(end);
		double time=Utility.stopWatch(start, end);
		
		

	}

}
