package aaronarthur.Ch5Assignment;

// Aaron Arthur 11/18 Converts from hex to binary.

import java.util.Scanner;

public class HexToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Welcome to the hex to binary converter!\nEnter a hex digit: ");
		char userInput = input.nextLine().charAt(0);
		
		if (userInput == '0') {
			System.out.println("The binary value is 0.");
		}
		else if (userInput == '1') {
			System.out.println("The binary value is 1.");
		}
		else if (userInput == '2') {
			System.out.println("The binary value is 10.");
		}
		else if (userInput == '3') {
			System.out.println("The binary value is 11.");
		}
		else if (userInput == '4') {
			System.out.println("The binary value is 100.");
		}
		else if (userInput == '5') {
			System.out.println("The binary value is 101.");
		}
		else if (userInput == '6') {
			System.out.println("The binary value is 110.");
		}
		else if (userInput == '7') {
			System.out.println("The binary value is 111.");
		}
		else if (userInput == '8') {
			System.out.println("The binary value is 1000.");
		}
		else if (userInput == '9') {
			System.out.println("The binary value is 1001.");
		}
		else if (userInput == 'A') {
			System.out.println("The binary value is 1010.");
		}
		else if (userInput == 'B') {
			System.out.println("The binary value is 1011.");
		}
		else if (userInput == 'C') {
			System.out.println("The binary value is 1100.");
		}
		else if (userInput == 'D') {
			System.out.println("The binary value is 1101.");
		}
		else if (userInput == 'E') {
			System.out.println("The binary value is 1110.");
		}
		else if (userInput == 'F') {
			System.out.println("The binary value is 1111.");
		}
		else {
			System.out.println("Invalid input.");
		}
		
		
		
	}

}
