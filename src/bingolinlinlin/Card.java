package bingolinlinlin;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

/**
 * Represents a bingo card with a unique code, a name, and a randomly generated
 * 3x5 matrix of numbers.
 */
public class Card {

	/**
	 * Unique identifier for the card.
	 */
	private static int cardCode = 0;
	private int code = 0;

	/**
	 * 3x5 matrix representing the bingo card with random numbers.
	 */
	private int card[][] = new int[3][5];

	/**
	 * Name associated with the card.
	 */
	private String name = "Unknown";

	/**
	 * Constructs a Card with a given code and name.
	 *
	 * @param name The name associated with the card.
	 */
	public Card(String name) {

		this.code = cardCode++;

		if (name != null && !name.isBlank()) {
			this.name = name;
		}

		this.card = generateCard();
	}

	public Card(int cardCode) {
		if (cardCode >= 0) {
			this.code = cardCode;
		}
	}

	/**
	 * Generates a unique 3x5 bingo card with random numbers between 1 and 90.
	 *
	 * @return A 3x5 integer matrix representing the bingo card.
	 */
	private int[][] generateCard() {

		int[][] card = new int[3][5];

		int num;

		Random rand = new Random();

		HashSet<Integer> numbers = new HashSet<>();

		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < card[i].length; j++) {

				do {
					num = rand.nextInt(1, 100);
				} while (numbers.contains(num));

				numbers.add(num);

				card[i][j] = num;
			}
		}
		return card;
	}

	/**
	 * Retrieves the unique card code.
	 *
	 * @return The card code.
	 */
	public int getCode() {
		return this.code;
	}

	/**
	 * Retrieves the bingo card as a string representation.
	 *
	 * @return The string representation of the bingo card.
	 */
	public int[][] getCard() {

		return card;
	}

	/**
	 * Retrieves the name associated with the card.
	 *
	 * @return The name of the card.
	 */
	public String getName() {
		return name;
	}

	public boolean checkNumber(int num) {
		boolean check = false;
		int i = 0;
		int j = 0;
		while (!check && i < card.length) {
			while (!check && j < card[i].length) {
				if (this.card[i][j] == num) {
					check = true;
					this.card[i][j] = -1;
				}
				j++;
			}
			j = 0;
			i++;
		}
		return check;
	}

	/**
	 * Generates a hash code based on the card code.
	 *
	 * @return The hash code.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(cardCode);
	}

	/**
	 * Compares this card to another object to determine equality. Two cards are
	 * equal if they have the same card code.
	 *
	 * @param obj The object to compare.
	 * @return True if the objects are equal, false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {

		boolean equal = false;

		Card card2 = (Card) obj;

		if (cardCode == card2.code) {
			equal = true;
		}

		return equal;
	}

	/**
	 * Returns a formatted string representation of the bingo card.
	 *
	 * @return The formatted string representation.
	 */
	@Override
	public String toString() {

	    String cardText = "mecagoenlapurta\n";

	    cardText += "Code " + this.code + ": " + this.name + "\n";
	    
	    for (int i = 0; i <= card[0].length; i++) {
	        cardText += i + "\t";
	    }
	    
	    cardText += "\n";
	    
	    for (int i = 0; i < card.length; i++) {
	        cardText += i + "\t";
	        
	        for (int j = 0; j < card[i].length; j++) {
	            if (card[i][j] != -1) {
	                cardText += card[i][j] + "\t";
	            } else {
	                cardText += "\t";
	            }
	        }
	        
	        cardText += "\n";
	    }

	    return cardText;
	}


}