package bingolinlinlin;

import java.util.HashSet;
import java.util.Random;

public class Card {

	int cardCode = 0;

	int card[][] = new int[3][5];

	String name = "Unknown";

	public Card(int cardCode, String name) {

		if (cardCode > 0) {
			this.cardCode = cardCode;
		}

		if (name != null && !name.isBlank()) {
			this.name = name;
		}

		this.card = generateCard();

	}

	private int[][] generateCard() {

		Random rand = new Random();

		HashSet<Integer> numbers = new HashSet<Integer>();

		int number;
		
		int contI;
		int contJ;

		int card[][] = new int[3][5];

		while()

			return card;
		}

	}
}
