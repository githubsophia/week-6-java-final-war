package cardGameWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//(Under “Player”, I created a hand and set the score to zero and set the string for name.)
	
//1C. Fields: hand (List of Card), score (set to 0 in the constructor), and name.
	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
		}

	//1C. Methods1: describe (prints out information about the player and calls the describe method for each card in the Hand
	//list).
	//(This will print out each player’s name and list their cards that were drawn underneath...)
	
	public void describe() {
		System.out.println(name + " has the following cards:");
		for (Card card : hand) {
			card.describe();
		}
		//(...and I used dashes to separate the players and cards so it’s easier to read.)
		
		System.out.println("---------------------------------------");
	}
	
	//1C. Methods2: flip (removes and returns the top card of the Hand).
	//(The flip method...)
	
	public Card flip() {
		Card drawnTopCard = hand.get(0);
		hand.remove(0);
		return drawnTopCard;
	}
	
	//1C. Methods3: draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the
	//hand field).
	//(...and then drawing.)
	
	public void draw (Deck deck) {
		Card card = deck.draw();
		hand.add(card);
		}
	
	//1C. Methods4: IncrementScore (adds 1 to the Player's score field).
	//(And then incrementing and returning the score so we can see it at the bottom.)
	
	public void incrementScore() {
		this.score++;		
	}
	public int getScore() {
		return score;
	}
}