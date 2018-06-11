package card;

import java.lang.Math;


class Card {
	private int number;
	private char suit;
	public static char[] Suit = {'s','h','d','c'};
	
	public Card(){
		number = (int)(Math.random()*13)+1;
		int x = (int)(Math.random()*4);
		suit = Suit[x];
	}
	
	
	public Card(int number,char suit){
		this.number = number;
		this.suit = suit;
	}
	
	
	
	public String toString(){
		if (number == 1){
			return suit+"A";
		}else if(number == 11){
			return suit+"J";
		}else if(number == 12){
			return suit+"Q";
		}else if(number == 13){
			return suit+"K";
		}else{
			return String.format("%c%d",suit,number);
		}
	}
		
	public int getNumber(){
		return	number;
	}
	
	public int getNextNumber(){
		if (number == 13)
			return 1;
		else
			return number+1;
	}
	
	public static void main (String args[]){
	
		Card c = new Card(13,'h');
		System.out.println(c.number);
		System.out.println(c.suit);
		System.out.println(c.getNumber());
		System.out.println(c.getNextNumber());
		
		Card d = new Card();
		System.out.println(d.number);
		System.out.println(d.suit);
		System.out.println(d);
		
		for(int i=1; i<=10; i++){
			Card f = new Card();
			System.out.println(f);
		}
	}
}