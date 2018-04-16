package com.bridgeIt.dataStructures;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgeIt.dataStructures.OrderedLinkedList.MyNode;

public class Demo4 {

	public  void printData(String file,Integer data){
		
		FileWriter fw;
		PrintWriter pw;
		try {
		//	fw = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//OrderedListOut.txt");
			fw = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//"+file+"",true);
			pw=new PrintWriter(fw);
			
			pw.print(""+data+" ");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	
	
	public static void main(String[] args) {
	
		Demo4 d =new Demo4();
		d.printData("HashingOut.txt", 246);
		d.printData("HashingOut.txt", 244);
		
		
	}
	
}
