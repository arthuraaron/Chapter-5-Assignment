package aaronarthur.Ch5Assignment;

import java.util.Scanner;

public class UnicodeOfCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Welcome to the unicode generator! \nEnter a character: ");
		char userChar = input.next().charAt(0);
		
		int unicode = (int) userChar;
		
		//System.out.println(unicode);
		
		String unicodeString = Integer.toString(unicode);
		
		//System.out.println(unicodeString);
		
		unicodeString = unicodeString.format("%04d",  unicode);
		
		
		
		System.out.println("The unicode for "+ userChar + " is " + unicodeString + ".");
		

	}

}