package bingolinlinlin;

import java.util.HashSet;
import java.util.Random;

/**
 * Bingo class.
 */
public class Bingolin {

	/**
	 * Set with different cards from the players.
	 */
	private HashSet<Card> game = new HashSet<>();

	/**
	 * Set with different all the numbers have appeared.
	 */
	private HashSet<Integer> numbers = new HashSet<>();

	/**
	 * Function that adds a Card to the set.
	 * 
	 * @param card Card that will be added to the set.
	 */
	public void addCard(Card card) {
		game.add(card);
	}

	/**
	 * Function that deletes a Card from the set.
	 * 
	 * @param card Card with a unique id to be deleted from the set.
	 */
	public void deleteCard(Card card) {
		game.remove(card);
	}

	/**
	 * Function that prints a card with a specific id.
	 * 
	 * @param id ID from the card to be printed.
	 */
	public void showCard(int id) {

		Card example = null;
		for (Card card : game) {

			if (card.getCode() == id) {
				example = card;
			}

		}
		System.out.println(example);
	}

	/**
	 * Function that prints all cards.
	 */
	public void showAllCards() {

		for (Card card : game) {

			System.out.println(card);

		}

	}

	/**
	 * Function that checks all cards.
	 * 
	 * @param num Num that will be checked.
	 */
	public void checkCards(int num) {

		for (Card card : game) {
			card.checkNumber(num);
		}
	}

	/**
	 * Function that generates a number for the bingo game.
	 * 
	 * @return Number generated.
	 */
	public int generateNumber() {
		int number;
		Random rnd = new Random();
		
		do {
			number = rnd.nextInt(1, 91);
		} while (numbers.contains(number));
		
		numbers.add(number);
		return number;
	}

}