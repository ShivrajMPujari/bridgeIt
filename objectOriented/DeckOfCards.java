package com.bridgeIt.objectOriented;

public class DeckOfCards {

	public static void main(String[] args) {
	
		deckOfCard();

	}
	
	public static void deckOfCard() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
       
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
        String array [][] = new String[4][13];
       
        // initialize deck
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++)
        {
        	
            for (int j = 0; j < suits.length; j++)
            {
            	
                deck[suits.length*i + j] = ranks[i] + "->" + suits[j];
            }
        }
   
        // shuffle
        for (int i = 0; i < n; i++)
        {
            int r = i + (int) (Math.random() * (n-i));
           
            System.out.println(r);
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
      // print shuffled deck
   
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j <9; j++)
            {
                array[i][j]=(deck[i + j * 4]);
            }
        }
       
        for(int i=0;i<array.length;i++)
        {System.out.println("Player:"+(i+1));
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
	}
/*	public static void deckOfCardQueue() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
        String array [][] = new String[4][9];
        QueueLinkList q=new QueueLinkList();
        // initialize deck
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++)
        {
            for (int j = 0; j < suits.length; j++)
            {
                deck[suits.length*i + j] = ranks[i] + "->" + suits[j];
            }
        }
   
        // shuffle
        for (int i = 0; i < n; i++)
        {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
     
        // print shuffled deck
   
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                array[i][j]=deck[i + j * 4];
                q.insert(array[i][j]+"\t");
              
            }
            q.insert("\n");
        }
        q.display();
        SortDeck(array,q);*/
    }  
   /* public static void SortDeck(String [][]array,QueueLinkList q) {

		char[] rank = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' };
		String[] cards=new String[51];
		for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                cards[j]=array[i][j];
               // System.out.print(cards[j]);
              
            }
        }
		String card;
			for (int i = 0; i < rank.length; i++) 
			{
			for (int j = 0; j < cards.length; j++) 
			{
				card = cards[j];
				System.out.print(card);
				char cardRank = card.charAt(card.lastIndexOf(card));
				if (cardRank == rank[i]){
					q.insert(card+"\t");
				}
			}
			q.insert("\n");
		}
			q.display();
	}*/
	

