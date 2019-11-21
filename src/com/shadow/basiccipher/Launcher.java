package com.shadow.basiccipher;

import java.util.Scanner;

public class Launcher {

	private static final Scanner userIn = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Welcome the User
		System.out.println("Welcome to my basic cipher");
		System.out.print("\nEnter text: ");

		String text = null;
		String operation = null;

		if (userIn.hasNextLine()) {
			text = userIn.nextLine();
		} else {
			System.out.println("Next time enter a string");
			System.exit(10);
		}
		System.out.print("Operation, Encrypt(e), Decrypt(d): ");

		operation = userIn.next();
		char op = operation.toLowerCase().charAt(0);

		switch (op) {
		case 'e':
			System.out.println(RegexHelper.encrypt("PIX", text));
			break;
		case 'd':
			System.out.println(RegexHelper.decrypt("PIX", text));
			break;
		default:
			System.out.println("Please enter (e/d) Thank you.\n");
		}

	}

}
