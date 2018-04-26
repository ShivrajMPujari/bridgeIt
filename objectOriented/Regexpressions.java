package com.bridgeIt.objectOriented;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgeIt.utility.Utility;

public class Regexpressions {

	public static void main(String[] args) {
		
		System.out.println("Enter your Name");
		String username=Utility.inputString();
		
		System.out.println("Enter your Fullname");
		String userFullname=Utility.inputStringLong();
		
		System.out.println("Enter your Mobile number");
		String userNumber=Utility.inputString();
		
		System.out.println("Enter the Date");
		String userDate=Utility.inputStringLong();
		
		String paragraph="Hello <<name>>, We have your full name as <<full name>> in our system."
				+ " your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification "
				+ "Thank you BridgeLabz 01/01/2016.";
		
		String replaceName="<<name>>";
		String replaceFullname="<<full name>>";
		String replaceNumber="xxxxxxxxxx";
		String replaceDate="01/01/2016";
		
		Pattern pattern = Pattern.compile(replaceName);
		Matcher match = pattern.matcher(paragraph);
		paragraph=match.replaceAll(username);
		
		Pattern pattern1 = Pattern.compile(replaceFullname);
		Matcher match1 = pattern1.matcher(paragraph);
		paragraph=match1.replaceAll(userFullname);
		
		Pattern pattern2 = Pattern.compile(replaceNumber);
		Matcher match2 = pattern2.matcher(paragraph);
		paragraph=match2.replaceAll(userNumber);
		
		Pattern pattern3 = Pattern.compile(replaceDate);
		Matcher match3 = pattern3.matcher(paragraph);
		paragraph=match3.replaceAll(userDate);
		
		System.out.println(paragraph);
		
		
	}

}
