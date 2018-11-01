package aaronarthur.Ch5Assignment;

import java.util.Scanner;

public class ASCIICode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Welcome to the ASCII generator! \nEnter a whole number from 0 to 127: ");
		int userNum = input.nextInt();
		
		char ascii  = (char) userNum;
		
		System.out.println("The ASCII symbol for "+ userNum + " is " + ascii + ".");
		

	}

}
