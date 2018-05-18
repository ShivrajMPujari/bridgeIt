
package com.bridgeIt.objectOriented;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CompanyList {

	CompanyShares head;
	CompanyShares next;
	Integer totalSharePrice=0;
	
	/**function adds the a particular company to the list
	 * @param company Company object
	 */
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
	
	/**Function removes particular user amount from the account 
	 * @param name company symbol
	 * @param amount integer amount to be removed 
	 * @return boolean true if user transaction has been done
	 */
	public boolean remove(String name,Integer amount,String date){
		
		if(search(name)==false){
			System.out.println("no such symbol available");
			return false;
		}
		else{
			CompanyShares current=head;
			if(current.symbol.equals(name)){
				
				if(current.shareprice-amount>0){
					current.shareprice=current.shareprice-amount;
					current.setDate(date);
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
				current.next.setDate(date);
				current.next.shareprice=current.next.shareprice-amount;
				return true;
			}else{
				System.out.println("Transaction can't be done");
				return false;
			}	
			
		}
			
		
	}
	
	/**
	 * Function displays the Company list
	 */
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
	
	
	/**function write to the file of the user
	 * @param file String name of user file
	 * @param list CompanyList object
	 */
	@SuppressWarnings({ "resource", "unchecked" })
	public void write(String file,CompanyList list,Integer totalSharePrice){
	
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
			object.put("totalSharePrice", totalSharePrice);
			filewrite.write(object.toJSONString());
			filewrite.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**Function searches the particular user from the list
	 * @param symbol String company symbol
	 * @return boolean true if user exist
	 */
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
	
	/**Function adds particular user amount to his account
	 * @param symbol
	 * @param amount
	 */
	public boolean addAmount(String symbol,Integer amount,String date){
		
		if (head==null){
			
			CompanyShares share= new CompanyShares(symbol, amount,date);
			head=share;
			totalSharePrice=totalSharePrice+amount;
			return true;	
		}
		CompanyShares current=head;
		CompanyShares previous=null;
		while(current.symbol.equals(symbol)==false){
			previous=current;
			current=current.next;
		if(current==null){
			
			CompanyShares share= new CompanyShares(symbol, amount,date);
			previous.next=share;
			return true;
		}
			
		}
		current.shareprice=current.shareprice+amount;
		totalSharePrice=totalSharePrice+amount;
		return true;

	}
	
/*	

	public JSONObject editPerson(String file){
		
		JSONParser parser = new JSONParser();
		JSONObject stocksDetails=null;
			try {
			Object object=parser.parse(new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//sharePerson//"+file+".json"));
			stocksDetails=(JSONObject)object;
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}
			return stocksDetails;
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject editBuy(JSONObject jsonObject,int amount, String symbol){
		JSONArray newArray =new JSONArray();
	   Object object=jsonObject.get(symbol);
	   if(object!=null){
		   
		   JSONArray array =(JSONArray)object;
		   System.out.println(array);
		   Long stockprice=(Long)array.get(1);
		   array.set(1, stockprice+amount);
		   System.out.println(array);
		   
		   return jsonObject;
	   }
	   newArray.add(0, symbol);
	   newArray.add(1, amount);
	   System.out.println("Enter the date");
	   String date=Utility.inputString();
	   newArray.add(2,date);
	   jsonObject.put(symbol, newArray);
	   
	   return jsonObject;
	   
	}
	
	public JSONObject editSell(JSONObject jsonObject,int amount, String symbol){
		
		Object object=jsonObject.get(symbol);
		if(object==null){
			System.out.println("Your transaction can't be done,Entered wrong symbol");
			return jsonObject;
		}
		 JSONArray array =(JSONArray)object;
		 long shareprice=(long) array.get(1);
		 if(shareprice-amount>0){
			   array.set(1, shareprice-amount);
			   return jsonObject;
		 }else{
			 System.out.println("Sorry can't do this transaction,Account out of balance");
			 return jsonObject;
		 }
	}
	
	public void editPrint(JSONObject jsonObject,String file){
		System.out.println(file);
		try {
			FileWriter filewrite= new FileWriter("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//sharePerson//"+file+".json");
			filewrite.write(jsonObject.toJSONString());
			filewrite.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void editDisplay(JSONObject jsonObject,String file){
		
		System.out.println(jsonObject.toString());
		
		
	}*/
	
	class CompanyShares{

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
			
			/**getter method for share price 
			 * @return integer value of share price
			 */
			public Integer getShareprice() {
				return shareprice;
			}
			
			/**setter method for share price 
			 */
			public void setShareprice(Integer shareprice) {
				this.shareprice = shareprice;
			}
			
			/**getter method for date of transaction
			 * @return String value of date
			 */
			public String getDate() {
				return date;
			}
			/**setter method to set the of date
			 * @param date string date
			 */
			public void setDate(String date) {
				this.date = date;
			}
			
			/**getter method to get the value company symbol
			 * @return String value of symbol of company
			 */
			public String getSymbol() {
				return symbol;
			}
			
			/**setter method set the value of Company symbol
			 * @param symbol company symbol
			 */
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
		CompanyList list= new CompanyList();
		CompanyList.CompanyShares comp1=list.new CompanyShares("tata", 1200, "12-4-15");
		CompanyShares comp2= list.new CompanyShares("ta", 1200, "18-6-15");
		list.add(comp2);
		list.add(comp1);
		list.display();
	
	}
}
