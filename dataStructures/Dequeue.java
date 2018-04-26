package com.bridgeIt.dataStructures;

/**
 * @author bridgeit
 *
 */
/**
 * @author bridgeit
 *
 */
public class Dequeue {

	int size;
	char queue[];
	int rear;
	int front;
	int capacity;
	
	/* Constructor initializes  properties in the dequeue
	 * */ 
	public Dequeue() 
	{
		capacity=20;
		size=0;
		queue=new char[capacity];
		rear=front=-1;	
	}
	
	  
	
	/**Function add the elements in the front of dequeue
	 * @param item
	 */
	void addFront(char item)
	{
		if(size>capacity)
		{
			System.out.println("Overflow");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
				front=0;
				rear=0;
			}
			else
				if(front==0)
				front=capacity-1;
				else
			front=front-1;
			queue[front]=item;
			System.out.println("Inserted into front of queue:"+item);
		}
		size++;
	}
	
	
	 /* Function adds the elements at the rear end 
	  * @param Char elements
	  * */ 
	public void addRear(char item)
	{
		if(size>capacity)
		{
			System.out.println("Queue is overloaded");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
			queue[++rear]= item;
			front=0;
			}
			else
			{
				queue[++rear]=item;
			}
			System.out.println("Inserted into rear of queue:"+item);
			size++;
		}
	}
	
	
	 /* Function removes the elements at the front end 
	  * @returns Char elements
	  * */ 
	public char removeFront()
	{
		size--;
		return queue[front++];
	}
	
	
	 /* Function removes the elements at the rear end 
	  * @returns Char elements
	  * */ 
	public char removeRear()
	{
	
		size--;
		return queue[rear--];
	}
	
	
	 /* Function checks the is queue is empty or not
	  * @returns boolean true or false
	  * */ 
	boolean isEmpty()
	{
		if(size()==0)
		{
			return true;
		}
		else
			return false;
	}
	
	 /* Function return the size of the dequeue
	  * @returns Integer size 
	  * */ 
	public int size()
	{
		return size;
	}
	
}
