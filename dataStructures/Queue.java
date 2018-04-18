package com.bridgeIt.dataStructures;

import java.util.Scanner;

import com.bridgeIt.dataStructures.OrderedLinkedList.MyNode;

public class Queue <T extends Comparable<T>> {

	MyNode first;
	public static Double balanceAmount;
	public static int size=0;
	public static Queue q = new Queue<>();

	public void enqueue(T data){
		
		if(first==null){
			
			MyNode<T> newNode = new MyNode<T>(data);
			first=newNode;
			return;
		}
		else{
			MyNode current=first;
			while(current.next!=null){
				
				current=current.next;
				
			}
			MyNode<T> newNode = new MyNode<T>(data);
			current.next=newNode;
		}
	}
	public boolean dequeue(){
		
		System.out.println("Enter the action 1.withdraw  2.deposit");
		Scanner sc = new Scanner(System.in);
		int wantTo=sc.nextInt();
		MyNode current=first;
		if(wantTo==1){
			Double data=new Double((double) current.data);
			balanceAmount = balanceAmount-data;
			
		}else if(wantTo==2){
	
			balanceAmount = balanceAmount+(Double)current.data;
			
		}else{	
			System.out.println("Invalid entry");
			return false;
		}
		
		first=current.next;
		current=null;
		return true;
	}
	
	public void printQueue(){
		
		MyNode current=first;
		while(current!=null){
			
			System.out.println(current.data);
			current= current.next;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		q.addOns();
		q.printQueue();
		q.transactions();
		System.out.println(balanceAmount);
	}
	
	public void addOns(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people in queue");
			size=sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the amount you want to withdraw or deposit person"+i);
			Double b= sc.nextDouble();
			q.enqueue(b);
		}
	}
	
	
	
	public void transactions(){
		boolean result=true;
		for (int i = 0; i < size ; i++) {
			
			if(dequeue()){
				System.out.println("Transaction successfully");
				continue;
			}else{
				dequeue();
			}
			
		}
		
	}
	
	static class MyNode<T>{
		T data;			
		MyNode<T> next;		
		MyNode(T data){
			this.data = data;
			next = null;
		}
}
}
