package com.bridgeIt.dataStructures;

public class Queue {

	int size;
	int queue[];
	int rear;
	int front;
	public int capacity;
	
	public Queue() 
	{
		capacity=20;
		size=0;
		queue=new int[capacity];
		rear=front=-1;
	}
	
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
	
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Underflow");
		}
		else
		{
			System.out.println("You are Poped from queue:"+queue[front++]);
		}
		size--;
	}
	
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
			return false;
	}
	
	public int size()
	{
		return size;
	}
	
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
