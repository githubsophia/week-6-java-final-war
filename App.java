package cardGameWar;


public class App {
//(In the “App” class, we were asked to make this the main method.)
	
	public static void main(String[] args) {

		
		//2A. Instantiate a Deck and two Players, call the shuffle method on the deck.
		//create a new deck to start the game:
		//(I created two players and named them Sophia, myself, and Promineo Tech...)
		
		Player playerOne = new Player("Sophia");
		Player playerTwo = new Player("Promineo Tech");
		Deck deck = new Deck(); //(..and created a new deck to start the game and called the shuffle method on it.)
		deck.shuffle();
		
//2B. Using a traditional for loop, iterate 52 times, calling the Draw method on the other player each iteration using the Deck
		//you instantiated.
		
		//(Then I use a for loop to iterate 26 cards to each player’s hand which equals 52 cards all together.) 
		
		for (int i = 1; i <= 26; i++) {
			playerOne.hand.add(deck.draw()); //(They are drawing from the deck...)
			playerTwo.hand.add(deck.draw());
		}
		//(...and then the card will be described after they draw.)
		playerOne.describe();
		playerTwo.describe();
		
		//2C. Using a traditional for loop, iterate 26 times and call the flip method for each player.
		
		for (int i = 0; i < 26; i++) { //(Using a for loop again to iterate 26 times and then call the flip method for each player.)
			Card playerOneCard = playerOne.flip();
			Card playerTwoCard = playerTwo.flip();
			
//2D. Compare the value of each card returned by the two player's flip methods. Call the incrementScore method on the player
			//whose card has the higher value.
//2E. After the loop, compare the final score from each player.
			//(If/else statement to compare the value of the cards flipped and use the player that has a higher score.)
			
			if (playerOneCard.getValue() > playerTwoCard.getValue()) {
				playerOne.incrementScore();
			} else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
				playerTwo.incrementScore();
			} else {
				System.out.println();
				
			}
		}

		//2F. Print the final score of each player and either "Player 1", "Player 2", or "Draw" depending on which score is higher or
//if they're both the same.
		//(Then it prints either Player1/Sophia is the winner, Player2/Promineo Tech is the winner, or “Draw” if it’s a tie.)
		
		if (playerOne.score > playerTwo.score) {
			System.out.println("Sophia " + "is the winner!");
			System.out.println("With a score of " + playerOne.score + " to " + playerTwo.score + ".");
		} else if (playerTwo.score > playerOne.score) {
			System.out.println("Promineo Tech " + "is the winner!");
			System.out.println("With a score of " + playerTwo.score + " to " + playerOne.score + ".");
		} else {
			System.out.println("Draw");
		}
	}

}