package bingolinlinlin;

import java.util.HashSet;

/**
 * Bingo class.
 */
public class Bingolin {

	/**
	 * Set with different cards from the players.
	 */
	private static HashSet<Card> game = new HashSet<>();

	/**
	 * Function that adds a Card to the set.
	 * 
	 * @param card Card that will be added to the set.
	 */
	public static void addCard(Card card) {
		game.add(card);
	}

	/**
	 * Function that deletes a Card from the set.
	 * 
	 * @param card Card with a unique id to be deleted from the set.
	 */
	public static void deleteCard(Card card) {
		game.remove(card);
	}

	/**
	 * Function that prints a card with a specific id.
	 * 
	 * @param id ID from the card to be printed.
	 */
	public static void showCard(int id) {

		Card example = null;
		for (Card card : game) {

			if (card.getCardCode() == id) {
				example = card;
			}

		}
		example.toString();
	}

	/**
	 * Function that prints all cards.
	 */
	public static void showAllCards() {

		for (Card card : game) {

			card.toString();

		}

	}

}
