package aaronarthur.Ch5Assignment;

// Aaron Arthur 11/18 Converts a decimal to a hex number

import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Welcome to the binary to hex converter!\nEnter a whole number between 0-15: ");
		int userInput = input.nextInt();
		
		if (userInput == 0) {
			System.out.println("The hex value is 0.");
		}
		else if (userInput == 1) {
			System.out.println("The hex value is 1.");
		}
		else if (userInput == 2) {
			System.out.println("The hex value is 2.");
		}
		else if (userInput == 3) {
			System.out.println("The hex value is 3.");
		}
		else if (userInput == 4) {
			System.out.println("The hex value is 4.");
		}
		else if (userInput == 5) {
			System.out.println("The hex value is 5.");
		}
		else if (userInput == 6) {
			System.out.println("The hex value is 6.");
		}
		else if (userInput == 7) {
			System.out.println("The hex value is 7.");
		}
		else if (userInput == 8) {
			System.out.println("The hex value is 8.");
		}
		else if (userInput == 9) {
			System.out.println("The hex value is 9.");
		}
		else if (userInput == 10) {
			System.out.println("The hex value is A.");
		}
		else if (userInput == 11) {
			System.out.println("The hex value is B.");
		}
		else if (userInput == 12) {
			System.out.println("The hex value is C.");
		}
		else if (userInput == 13) {
			System.out.println("The hex value is D.");
		}
		else if (userInput == 14) {
			System.out.println("The hex value is E.");
		}
		else if (userInput == 15) {
			System.out.println("The hex value is F.");
		}
		else {
			System.out.println("Invalid input.");
		}
	
		
	}

}
