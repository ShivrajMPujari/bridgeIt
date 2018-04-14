package com.bridgeIt.dataStructures;

public class OrderedList<N extends Comparable<N>> {

	static class Node<N> {
		N data; // data to be stored
		Node<N> next; // reference to the next node

		Node(N data, Node next) {
			this.data = data;
			this.next = next;
		}

		public	static Node HEAD;

		public static <N extends Comparable<N>> void add(N data) {

			if (HEAD == null) {

				Node node = new Node(data, null);
				HEAD = node;

			}
				Node<N> current=HEAD;
				if(current==HEAD && data.compareTo(current.data)<0){
					Node node = new Node(data, current);
					HEAD=node;
				}
				if (data.compareTo(current.data) > 0&&current==HEAD) {
					
					Node node = new Node(data, null);
					current.next=node;
					
					
				} 
				while(data.compareTo(current.next.data)>0){
					
					
							if(current.next==null){
													
								Node node = new Node(data, null);	
								current.next=node;
													
								}
					current=current.next;
					
					
				}
				Node node = new Node(data,current.next);	
				current.next=node;
				
				
			}

		}

		public static <N extends Comparable<N>> void printList(Node HEAD) {
			
			Node current= HEAD;
			if (current.data == null) {
				return;
			}
			while (current.data != null) {

				System.out.println(current.data);
				current = current.next;
				if (current == null)
					break;
			}
		}

		public static void main(String[] args) {

			OrderedList ol = new OrderedList();

		}
	}

