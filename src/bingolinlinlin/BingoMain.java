package bingolinlinlin;

import java.util.Scanner;

public class BingoMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int option = -1;
		
//		System.out.println("Hello world =^b");
		
		do {
			
			menu();
			
			System.out.println("Introduce an option");
			option = sc.nextInt();
			
			switch (option) {
			
			case 1 -> {
				
			}
			case 2 -> {
				
			}
			case 3 -> {
				
			}
			case 4 -> {
				
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

		System.out.println("\u001B[34m" + "1. Show card\r\n"
				+ "\u001B[33m" + "2. Check card\r\n"
				+ "\u001B[32m" + "3. New card\r\n"
				+ "\u001B[31m" + "4. Give up" + "\u001B[0m");

	}

}
