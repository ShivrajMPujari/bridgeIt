package com.bridgeIt.objectOriented;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeIt.utility.Utility;

public class CompanyList {

	CompanyShares head;
	CompanyShares next;
	Integer totalSharePrice=0;
	
	void add(CompanyShares company){
		
		if(head==null){
			head=company;	
			totalSharePrice=totalSharePrice+company.shareprice;
			return;
		}
		CompanyShares current=head;
		while(current.next!=null){
			
			current=current.next;
		}
		current.next=company;
		totalSharePrice=totalSharePrice+company.shareprice;
	}
	
	public boolean remove(String name,Integer amount){
		
		if(search(name)==false){
			System.out.println("no such symbol available");
			return false;
		}
		else{
			CompanyShares current=head;
			if(current.symbol.equals(name)){
				
				if(current.shareprice-amount>0){
					current.shareprice=current.shareprice-amount;
					return true;
				}else{
					System.out.println("Transaction can't be done");
					return false;
				}	
			}
			if(current.next.symbol.equals(name)!=true){
				
				current=current.next;
			}
			
			if(current.next.shareprice-amount>0){
				current.next.shareprice=current.next.shareprice-amount;
				return true;
			}else{
				System.out.println("Transaction can't be done");
				return false;
			}	
			
		}
			
		
	}
	
	public void display(){
		
		CompanyShares current=head;
		if(current==null){
			
			return;	
		}
		while(current!=null){
			
			System.out.println(current.symbol+" "+current.shareprice+" "+current.date);
			current=current.next;
		}
		
	}
	
	
	public void write(String file,CompanyList list){
	
		JSONObject object = new JSONObject();
		JSONArray array=null;
		
		try {
			FileWriter filewrite= new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//sharePerson//"+file+".json");
			
			CompanyShares current=head;
			if(current==null){
				
				return;	
			}
			while(current!=null){
				array =new JSONArray();
				System.out.println(current.symbol+" "+current.shareprice+" "+current.date);
				array.add(current.symbol);
				array.add(current.shareprice);
				array.add(current.date);
				object.put(current.symbol, array);
				current=current.next;
			}
			
			filewrite.write(object.toJSONString());
			filewrite.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public boolean search(String symbol){
	
		if (head==null){return false;}
		CompanyShares current=head;
		if(current.symbol.equals(symbol)){
			return true;
		}
		while(current.next.symbol.equals(symbol)==false){	
				current=current.next;
				if(current==null) return false;
			}
		
		return true;
	}
	
	public void addAmount(String symbol,Integer amount){
		
		if (head==null){
			System.out.println("enter the date");
			String date=Utility.inputString();
			CompanyShares share= new CompanyShares(symbol, amount,date);
			head=share;
			totalSharePrice=totalSharePrice+amount;
			return;	
		}
		CompanyShares current=head;
		CompanyShares previous=null;
		while(current.symbol.equals(symbol)==false){
			previous=current;
			current=current.next;
		if(current==null){
			System.out.println("enter the date");
			String date=Utility.inputString();
			CompanyShares share= new CompanyShares(symbol, amount,date);
			previous.next=share;
			return;
		}
			
		}
		current.shareprice=current.shareprice+amount;
		totalSharePrice=totalSharePrice+amount;
	}
	
	
	static class CompanyShares{
			
			Integer shareprice ;
			String date;
			String symbol;	
			CompanyShares next;	
			CompanyShares(){}
			CompanyShares(String symbol,Integer shareprice,String date){
				this.symbol = symbol;
				this.shareprice=shareprice;
				this.date=date;
				next = null;
			}
			
			public Integer getShareprice() {
				return shareprice;
			}
			public void setShareprice(Integer shareprice) {
				this.shareprice = shareprice;
			}
			public String getDate() {
				return date;
			}
			public void setDate(String date) {
				this.date = date;
			}
			public String getSymbol() {
				return symbol;
			}
			public void setSymbol(String symbol) {
				this.symbol = symbol;
			}
			public CompanyShares getNext() {
				return next;
			}
			public void setNext(CompanyShares next) {
				this.next = next;
			}
			
		}
	
	public static void main(String[] args) {
		
		CompanyShares comp1= new CompanyShares("tata", 1200, "12-4-15");
		CompanyShares comp2= new CompanyShares("ta", 1200, "12-4-15");
		
		CompanyList list= new CompanyList();
		list.add(comp2);
		list.add(comp1);
		list.display();
	
	}
}
