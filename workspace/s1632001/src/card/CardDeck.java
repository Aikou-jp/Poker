package card;


import java.util.ArrayList;
import java.util.Collections;

public class CardDeck extends GameCard{
	ArrayList<GameCard>deck = new ArrayList<GameCard>();
	
	public CardDeck(){
		for (int i=0;i<=3;i++){
			for (int j=1;j<=13;j++){
				deck.add(new GameCard(j,Suit[i],false));
			}
		}
	}
	
	public CardDeck(char suit){
		int i=0;
		switch (suit) {
        case 's':
            i = 0; 
            break;
       	case 'h':
            i = 1; 
            break;
        case 'd':
            i = 2; 
            break;
		case 'c':
            i = 3; 
            break;
		default:
            System.out.println("エラー");
		}

		for (int j=1;j<=13;j++){
			deck.add(new GameCard(j,Suit[i],false));
		}
	}
	

	public CardDeck(int limit){
		for (int i=0;i<=3;i++){
			for (int j=1;j<=limit;j++){
				deck.add(new GameCard(j,Suit[i],false));
			}
		}
	}
	
	
	public CardDeck(char[] suit,int limit){
		int k = 0 ;
		for (int i=0;i<suit.length;i++){
			switch (suit[i]) {
        	case 's':
            	k = 0; 
            	break;
       		case 'h':
            	k = 1; 
            	break;
        	case 'd':
            	k = 2; 
            	break;
			case 'c':
            	k = 3; 
            	break;
			default:
            	System.out.println("エラー");
			}
			for (int j=1;j<=limit;j++){
				deck.add(new GameCard(j,Suit[k],false));
			}
		}
	}
	
	public GameCard nextCard(){
		GameCard d = deck.get(0);
		d.turn();
		deck.remove(0);
		return d;
	}
	
	public void shuffle(){
		Collections.shuffle(deck);
	}
	
	public static void main(String args[]){
		char[] suit = {'s','h','d','c'};
		CardDeck owndeck = new CardDeck(suit,4);
		owndeck.shuffle();
		
		for(int i=1;i<=12;i++){
			GameCard f = owndeck.nextCard();
			System.out.print(f+" ");
		}
	}
}