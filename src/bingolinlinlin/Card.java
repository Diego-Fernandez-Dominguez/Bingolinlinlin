package bingolinlinlin;

public class Card {
	int cardCode = 0;
	int card[][] = new int[3][5];

	public Card(int cardCode) {

		if (cardCode > 0) {
			this.cardCode = cardCode;
		}

		this.card = generateCard();

	}

	private int[][] generateCard() {

		int card[][] = new int[3][5];

		return card;
	}

}
