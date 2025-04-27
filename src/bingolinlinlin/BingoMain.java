package bingolinlinlin;

import java.util.Scanner;

public class BingoMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Bingolin bingolin = new Bingolin();

		int option = -1;

		int number;

		int id;

		boolean winner = false;

		do {

			menu();

			System.out.println("Introduce an option");

			option = sc.nextInt();

			sc.nextLine();

			switch (option) {

			case 1 -> { // Show card

				// id = askCode();

				bingolin.showAllCards();

			}

			case 2 -> { // Check card

				id = askCode();

				bingolin.checkCards(id);

			}

			case 3 -> { // New card

				Card card = createCard();

				bingolin.addCard(card);

			}

			case 4 -> { // Start game

				System.out.println("Start game");

			}

			default -> { // Wrong option

				System.out.println("Wrong option");

			}

			}

		} while (option != 4);

		do {

			menu2();

			System.out.println("Introduce an option");

			option = sc.nextInt();

			sc.nextLine();

			switch (option) {

			case 1 -> { // Show all cards

				bingolin.showAllCards();

			}
			
			case 2 -> { // Generate a number

				number = bingolin.generateNumber();
				
				System.out.println("The number is: " + number);
				
				bingolin.checkCards(number);

			}
			
			case 3 -> { // Check line

				id = askCode();
				
				Card card = bingolin.searchCard(id);

				if (card == null) {
					
					System.out.println("The card doesnt exists");
					
				} else {
					
					if (card.checkLine()) {
						
						System.out.println("LINE");
						
					} else {
						
						System.out.println("Theres no line :(");
						
					}
				}

			}
			
			case 4 -> { // Check Bingo

				id = askCode();
				
				Card card = bingolin.searchCard(id);

				if (card == null) {

					System.out.println("The card doesnt exists");

				} else {

					if (card.checkBingo()) {

						System.out.println("BINGOOOOOOOOOOO LIN LIN LINNNNN");

						winner = true;

					} else {

						System.out.println("Theres no bingo lin lin lin :(");

					}

				}

			}
			
			case 5 -> { // Finish the game

				System.out.println("Bye Bye");

			}
			
			default -> System.out.println("Wrong option"); // Wrong option
			
			}
			
		} while (option != 5 && !winner);

		sc.close();
	}

	public static void menu() {

		System.out.println("\u001B[34m" + "1. Show cards\r\n" + "\u001B[33m" + "2. Check card\r\n" + "\u001B[32m"

				+ "3. New card\r\n" + "\u001B[31m" + "4. Start Game" + "\u001B[0m");

	}

	public static void menu2() {
		System.out.println("\u001B[34m" + "1. Show cards\r\n" + "\u001B[33m" + "2. Get Number\r\n" + "\u001B[32m"

				+ "3. Check Line\r\n" + "\u001B[31m" + "4. BINGO\r\n" + "\u001B[0m" + "5. End Game");

	}

	private static String askName() {

		System.out.println("Introduce the user name");

		return sc.nextLine();

	}

	private static int askCode() {

		int code;

		System.out.println("Introduce the code");

		code = sc.nextInt();

		sc.nextLine();

		return code;

	}

	public static Card createCard() {

		Card card = null;

		String nombre = askName();

		card = new Card(nombre);

		return card;

	}

}