package com.bridgeIt.dataStructures;

public class OrderedList {
	
	static Node HEAD;
	
	public static <N extends Comparable<N>> void add(N data){
		
		Node current=HEAD;	
		if(current==null){
			
			Node node= new Node(null,data,null);

		}

	}
		
	
	public static <N extends Comparable<N>> void printList(){
			
			Node current=HEAD;
			if(current.data==null){
				return;
			}
			while(current.data!=null){
				
				System.out.println(current.data);
			//	printWriting();
				current=current.next;
				if(current==null)break;
			}
					}
	
	
	public static void main(String[] args) {
		
		OrderedList ol= new OrderedList();
		ol.add(21);
	//	ol.add(23);
		ol.printList();
		
		
		
	}
	
}
