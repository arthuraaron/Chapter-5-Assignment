package aaronarthur.Ch5Assignment;

// Aaron Arthur 11/18 Compares cities alphabetically

import java.util.Scanner;

public class AlphabeticalCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		String temp;
		
		String city1;
		String city2;
		String city3;
		String city4;
		String city5;
		
		// Get user input for cities
		
		System.out.print("Welcome to the alphabetical cities program!\n"
				+ "Enter the name of the first city: ");
		city1 = input.nextLine();
		
		System.out.print("Enter the name of the second city: ");
		city2 = input.nextLine();
		
		System.out.print("Enter the name of the third city: ");
		city3 = input.nextLine();
		
		System.out.print("Enter the name of the fourth city: ");
		city4 = input.nextLine();
		
		System.out.print("Enter the name of the fifth city: ");
		city5 = input.nextLine();
		
		
		
		// Compare 1 and 2
		if (city1.compareTo(city2) > 0) {
			temp = city1;
			city1 = city2;
			city2 = temp;
		}
		
		// Compare 2 and 3
		if (city2.compareTo(city3) > 0) {
			temp = city2;
			city2 = city3;
			city3 = temp;
			if (city1.compareTo(city2) > 0) {
				temp = city1;
				city1 = city2;
				city2 = temp;
			}
		}
		
		// Compare 3 and 4
		if (city3.compareTo(city4) > 0) {
			temp = city3;
			city3 = city4;
			city4 = temp;
			if (city2.compareTo(city3) > 0) {
				temp = city2;
				city2 = city3;
				city3 = temp;
				if (city1.compareTo(city2) > 0) {
					temp = city1;
					city1 = city2;
					city2 = temp;
				}
			}
		}
		
		// Compare 4 and 5
		if (city4.compareTo(city5) > 0) {
			temp = city4;
			city4 = city5;
			city5 = temp;
			if (city3.compareTo(city4) > 0) {
				temp = city3;
				city3 = city4;
				city4 = temp;
				if (city2.compareTo(city3) > 0) {
					temp = city2;
					city2 = city3;
					city3 = temp;
					if (city1.compareTo(city2) > 0) {
						temp = city1;
						city1 = city2;
						city2 = temp;
					}
				}
			}
		}
		
		
		System.out.println("The cities in alphebetical order are "
				+ city1 + ", " + city2 + ", " + city3 + ", " + city4 + ", " + city5 + ". ");
		
		
	}

}
