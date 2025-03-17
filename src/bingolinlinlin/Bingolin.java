package bingolinlinlin;

public class Bingolin {

	public static void printBingoCard(int Card[][]) {

		for (int i = 0; i < Card.length; i++) {
			System.out.println();
			System.out.print(i + "  ");

			for (int j = 0; j < Card[i].length; j++) {
				System.out.print(Card[i][j] + " ");
			}

		}
	}
}
