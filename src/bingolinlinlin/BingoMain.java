package bingolinlinlin;

import java.util.Scanner;

public class BingoMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Bingolin bingolin = new Bingolin();

		int option = -1;

		int id;



//		System.out.println("Hello world =^b");



		do {

			menu();

			System.out.println("Introduce an option");

			option = sc.nextInt();

			switch (option) {



			case 1 -> { // Show card

				//id = askCode();

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

			case 4 -> { // Give up

				System.out.println("Leaving game");

			}

			default -> {

				System.out.println("Wrong option");



			}

			}



			sc.nextLine();



		} while (option != 4);



		sc.close();



	}



	public static void menu() {

		System.out.println("\u001B[34m" + "1. Show cards\r\n" + "\u001B[33m" + "2. Check card\r\n" + "\u001B[32m"

				+ "3. New card\r\n" + "\u001B[31m" + "4. Give up" + "\u001B[0m");

	}



	private static String askName() {

		sc.nextLine();
		
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