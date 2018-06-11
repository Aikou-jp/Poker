package card;

public class MyCards {
	
	// 5枚の手札
	public GameCard[] cards = new GameCard[5];;
	
	// deckから5枚引いて手札を作る
	public MyCards(CardDeck deck) {
		for (int i=0; i<5; i++) {
			cards[i] = deck.nextCard();
		}
	}
	
	// カードデッキを作成し、そのデッキから手札を作り、表示する
	public static void main(String args[]) {
		CardDeck deck = new CardDeck();
		MyCards myCards = new MyCards(deck);
		for (int i=0; i<5; i++) {
			System.out.println(myCards.cards[i]);
		}
	}
}