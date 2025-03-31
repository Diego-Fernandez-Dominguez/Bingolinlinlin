package bingolinlinlin;

import java.util.Scanner;

public class BingoMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int option = -1;

//		System.out.println("Hello world =^b");

		do {

			menu();

			System.out.println("Introduce an option");
			option = sc.nextInt();

			switch (option) {

			case 1 -> { // Show card

			}
			case 2 -> { // Check card

			}
			case 3 -> { // New card

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

		System.out.println("\u001B[34m" + "1. Show card\r\n" + "\u001B[33m" + "2. Check card\r\n" + "\u001B[32m"
				+ "3. New card\r\n" + "\u001B[31m" + "4. Give up" + "\u001B[0m");

	}

	private static String askName() {

		String name;
		
		System.out.println("Introduce the user name");
		name = sc.nextLine();
		
		return name;
	}
	
	private static int askCode() {
		
		int code;
		
		System.out.println("Introduce the code");
		code = sc.nextInt();
		
		sc.nextLine();
		
		return code;
	}
	
	public static Card createCard () {
		
		Card card = null;
		
		String nombre = askName();
		
		card = new Card (nombre);
		
		return card;
	}

}
