package cardGameWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

//1B. Fields: cards (List of Card)
	//(Under “Deck”, I created a new array list for the cards...)
	
	List<Card> deck = new ArrayList<Card>();
	
//1B. Methods: shuffle (randomizes the order of the cards)
	//(...and then shuffled the deck...)
	
	public void shuffle() {
	Collections.shuffle(deck);
	}

//1B. Methods: draw (removes and returns the top card of the Cards field)
	//(...and then draw to play a new card.)
	
	public Card playCard() {
		Card playedCard = this.deck.get(0);
		this.deck.remove(0);
		return playedCard;
	}
	
//1B. Methods: In the constructor ("new deck"), when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	//(Then we loop through all our card values and our suits to add the whole deck by...)
	
public Deck() {
	for (int k = 2; k <= 14; k++) {
		for (int i = 0; i < 4; i++) {
		deck.add(new Card(i, k));
		}
	}
}

//getters and setters for getting cards from the deck and setting the order after shuffling
//(...telling it to get the cards that are set in the deck...)
public List<Card> getCards(){
	return deck;
}
public void setCards(List<Card> deck) {
	this.deck = deck;
}

//(...and then a new draw can take place.)

public Card draw() {
	if (deck.isEmpty()) {
		System.out.println("No more cards.");
		return null;
	}else {
		Card drawnTopCard = deck.get(0);
		deck.remove(0);
		return drawnTopCard;
		
	}
}

}
