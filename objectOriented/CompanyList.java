package com.bridgeIt.objectOriented;

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
	
	public void remove(String name,Integer amount){
		
		if (head==null){return;}
		CompanyShares current=head;
		Integer num=0;
		if(current.symbol.equals(name)){
			if(current.shareprice<0){
				head=current.next;
				current=null;
			}
			else {
			
				if(current.shareprice-amount>0){
					current.shareprice=current.shareprice-amount;
					totalSharePrice=totalSharePrice-amount;
					return;
				}else{
					System.out.println("amount is out of bound can't proceed");
					return;
				}
			
			}
			return;
		}
		while(current.next.symbol.equals(name)==false){
				System.out.println(current.next.symbol+"99999 "+name);
				current=current.next;
			}
		System.out.println(current.next.symbol+"-- "+name);
		num=current.shareprice;
		System.out.println(num);
		if(num-amount>0){
			System.out.println(current.shareprice+"---------");
			current.shareprice=current.shareprice-amount;
			System.out.println(current.shareprice+"---------");
			totalSharePrice=totalSharePrice-amount;
			return;
		}else{
			System.out.println("amount is out of bound can't proceed");
			return;
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
