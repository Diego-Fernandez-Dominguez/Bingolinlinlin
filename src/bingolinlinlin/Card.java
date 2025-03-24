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
	private int cardCode = 0;

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
	 * @param cardCode The unique identifier for the card.
	 * @param name     The name associated with the card.
	 */
	public Card(int cardCode, String name) {

		if (cardCode > 0) {
			this.cardCode = cardCode;
		}
		if (name != null && !name.isBlank()) {
			this.name = name;
		}

		this.card = generateCard();
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

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {

				do {
					num = rand.nextInt(90) + 1;
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
	public int getCardCode() {
		return cardCode;
	}

	/**
	 * Retrieves the bingo card as a string representation.
	 *
	 * @return The string representation of the bingo card.
	 */
	public String getCard() {

		String cardText = "";

		for (int i = 0; i < card.length; i++) {
			cardText += "\n";

			cardText += i + "  ";

			for (int j = 0; j < card[i].length; j++) {

				cardText += card[i][j] + " ";

			}
		}

		return cardText;
	}

	/**
	 * Retrieves the name associated with the card.
	 *
	 * @return The name of the card.
	 */
	public String getName() {
		return name;
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

		if (cardCode == card2.cardCode) {
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

		String cardText = "";

		cardText += cardCode + ": " + name;

		cardText += getCard();

		return cardText;

	}

}
