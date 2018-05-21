package com.bridgeIt.objectOriented.stocksProcessing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeIt.utility.Utility;

public class LinkedList<N> {
	Node<N> head=null;
	Node<N> tail=null;
	int size;
	static class Node<N>
	{
		N data;
		Node<N> next;
		public Node() {
			this.data=null;
			this.next=null;
		}
		Node(N data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node<N> start() {
		return head;
	}
	/**function adds the items in the list
	 * @param item
	 */
	public void add(N item)
	{
		if(head==null)
		{
			Node<N> newnode=new Node<N>(item);
			head=newnode;
			tail=newnode;
		}
		else
		{
			Node<N> newnode=new Node<N>(item);
			Node<N> temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			//temp.next=newnode;
			tail.next=newnode;
			tail=newnode;
		}
		size++;
	}
		
	/**Function removes the item from the list
	 * @param item
	 */
	public void remove(N item) 
	{
		if(head==null)
		{
			System.out.println("No elements to remove");	
		}
		else
		{
			Node<N> temp=head;
			if(temp.data==item)
			{
				head=temp.next;
			}
			else
			{
				while(!(temp.next.data.equals(item)) && temp.next!=null)
				{
					temp=temp.next;
				}
				System.out.println(temp.next.data+" is deleted");
				temp.next=temp.next.next;
			}
		}
		size--;
	}
	/**Function searches for the item in the list
	 * @param item
	 */
	public void search(N item) 
	{
		Node<N> temp=head;
		boolean status=false;
			while(temp.next!=null)
			{
				status=false;
				if(temp.data.equals(item))
				{
					status=true;
					break;
				}	
				temp=temp.next;
			}
			if(temp.data.equals(item))
				status=true;
			if(status==true)
			{
				System.out.println("Found in list");
				remove(item);
			}
			else
			{
				System.out.println("Not found in list, So it is Added to the list");
				add(item);
			}
	}
	public int size() 
	{
		int count=0;
		if(head==null)
		{
			return 0;
		}
		Node<N> cur=head;
		while(cur!=null)
		{
			count++;
			cur=cur.next;
		}
		
		return count;
		
	}
	public boolean isEmpty() 
	{
		if(size==0)
			return true;
		else
			return false;
	}
	public void append(N item)
	{
		this.add(item);
	}
	public void index(N item)
	{
		Node<N> temp=head;
		int ind=0;
			while(temp!=null)
			{
				if(temp.data.equals(item))
				{
					System.out.println("Found in position:"+ind);
					break;
				}
				
				ind++;
				temp=temp.next;
			}
			
	}
	
	/**
	 * function display the content in the list 
	 */
	public void display() 
	{
		Node<N> temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	/**function iterates through the list and adds the shares in the list
	 * @param symbol
	 */
	public void iteratorAdd(Object symbol) 
	{
		Node<N> temp=head;
		while(temp==null)
		{
			JSONObject object=(JSONObject)temp.data;
			System.out.println(object);
				if(object.get("Symbol").equals(symbol)){
					System.out.println("Enter number of shares to add");
					long addShare=Utility.inputLong();
					long count=(long)object.get("Count");
					count=count+addShare;
					object.replace("Count", count);
					System.out.println(object);
			return;
		}
				temp=temp.next;
	}
	}
	
	/**function iterates through the list and renoves the shares in the list
	 * @param symbol
	 */
	public void iteratorRemove(Object symbol) 
	{
		Node<N> temp=head;
		while(temp!=null)
		{
			JSONObject object=(JSONObject)temp.data;
			System.out.println(object);
				if(object.get("Symbol").equals(symbol)){
					System.out.println("Enter number of shares to remove");
					long addShare=Utility.inputLong();
					long count=(long)object.get("Count");
					count=count-addShare;
					if(count<0){System.out.println("Sorry no stock left"); return;}
					object.replace("Count", count);
					System.out.println(object);
			return;
		}
				temp=temp.next;
	}
	}
	
	/**
	 * function writes the content in the file
	 */
	public void writeToJson(){
		
		FileWriter filewrite;
		PrintWriter printwrite;
		JSONArray array=new JSONArray();
		try {
			filewrite = new FileWriter("/home/bridgeit/Downloads/shiv/JavaPrograms/src/com/bridgeIt/objectOriented/stocksProcessing/Files/companyStock.json");
			
			Node<N> temp=head;
			while(temp!=null)
			{
				JSONObject object=(JSONObject)temp.data;
				array.add(object);
				temp=temp.next;
			}
			filewrite.write(array.toJSONString());
			filewrite.flush();
			filewrite.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
/*	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add(5);
		list.add(9);
		list.add(8);
		list.append(10);
		list.display();
		list.index(9);
		list.insertAt(2, 12);
		list.pop();
		list.pop(1);
		list.display();
		
	
	}*/
}
