package aaronarthur.Ch5Assignment;

// Aaron Arthur 11/18 Converts letters to number on phone key pad

import java.util.Scanner;

public class PhoneKeyPads {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get user input
		
		System.out.print("Welcome to the phone key pad program\n"
				+ "Enter a letter: ");
		String letter = input.nextLine();
		
		// Find where it is on the keypad
		
		if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("b") ||
				letter.equalsIgnoreCase("c") ) {
			System.out.println("Your number is 2. ");
		}
		else if (letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("e") ||
				letter.equalsIgnoreCase("f") ) {
			System.out.println("Your number is 3. ");
		}
		else if (letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("h") ||
				letter.equalsIgnoreCase("i") ) {
			System.out.println("Your number is 4. ");
		}
		else if (letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k") ||
				letter.equalsIgnoreCase("l") ) {
			System.out.println("Your number is 5. ");
		}
		else if (letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("n") ||
				letter.equalsIgnoreCase("o") ) {
			System.out.println("Your number is 6. ");
		}
		else if (letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("q") ||
				letter.equalsIgnoreCase("r") || letter.equalsIgnoreCase("s") ) {
			System.out.println("Your number is 7. ");
		}
		else if (letter.equalsIgnoreCase("t") || letter.equalsIgnoreCase("u") ||
				letter.equalsIgnoreCase("v") ) {
			System.out.println("Your number is 8. ");
		}
		else if (letter.equalsIgnoreCase("w") || letter.equalsIgnoreCase("y") ||
				letter.equalsIgnoreCase("x") || letter.equalsIgnoreCase("z") ) {
			System.out.println("Your number is 9. ");
		}
		else {
			System.out.println("Your letter is invalid.");
		}
		
		
	}

}
