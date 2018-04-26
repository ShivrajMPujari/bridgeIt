package com.bridgeIt.dataStructures;

public class Queue {

	int size;
	int queue[];
	int rear;
	int front;
	public int capacity;
	
	/* Constructor initializes the properties of the queue
	  * */
	public Queue() 
	{
		capacity=20;
		size=0;
		queue=new int[capacity];
		rear=front=-1;
	}
	
	
	/* Function inserts the element in the queue   
	  * @param integer item
	  * */
	public void enqueue(int item)
	{
		if(size()>capacity)
		{
			System.out.println("Queue is overloaded");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
			queue[++rear]=item;
			front=0;
			}
			else
			{
				queue[++rear]=item;
			}
			System.out.println("You are Inserted into queue");
			size++;
		}
	}
	
	/* Function removes  the element in the queue   
	  * */
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Underflow");
		}
		else
		{
			System.out.println("You are Poped from queue:"+queue[front]);
			queue[front++]=0;
		}
		size--;
	}
	
	/* Function checks whether the queue is empty   
	  * @returns boolean true if queue is empty
	  * */
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
			return false;
	}
	
	/* Function give out the size of the queue   
	  * @returns integer size of the queue
	  * */
	public int size()
	{
		return size;
	}
	
	/* Function displays the elements in the queue
	  * */
	void display()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(queue[i]);
			}
		}
	}
}
