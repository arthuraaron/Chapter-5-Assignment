package aaronarthur.Ch5Assignment;

// Aaron Arthur 11/18 Converts a grade to a number

import java.util.Scanner;

public class ConvertGradeToNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Welcome to the grade to number converter!\nEnter a grade (A-F): ");
		String userInput = input.nextLine();
		
		if (userInput.equalsIgnoreCase("A")) {
			System.out.println("Your number is 4. ");
		}
		else if (userInput.equalsIgnoreCase("B")) {
			System.out.println("Your number is 3. ");
		}
		else if (userInput.equalsIgnoreCase("C")) {
			System.out.println("Your number is 2. ");
		}
		else if (userInput.equalsIgnoreCase("D")) {
			System.out.println("Your number is 1. ");
		}
		else if (userInput.equalsIgnoreCase("F")) {
			System.out.println("Your number is 0. ");
		}
		else {
			System.out.println("Invalid input.");
		}
		
		
	}

}
