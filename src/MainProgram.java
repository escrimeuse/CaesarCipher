/*
	Author: Cathryn Griffiths
			cathryn.griffiths@gmail.com
			cathryn.dersam.net

	Description of program:
		This is a Caesar Cipher program. It asks the user to input a key and a message to be translated,
		and outputs the translated message.

 */

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		// Variable declaration
		//=====================
		String translate;	 // stores yes or no, used to determine if user wants to translate a message
		Scanner keyboard=new Scanner(System.in);	// for user input
		Cipher message = new Cipher();	// message object, which will be inputted by the user and translated by the program
		
		// Welcome message
		//================
		System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println("B                                                  A");
		System.out.println("C                  Caesar Cipher                   B");
		System.out.println("D                                                  C");
		System.out.println("EFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCD");
		System.out.println();
		System.out.println("This program encrypts or decrypts messages using the classic Caesar Cipher.");
		System.out.println();
		System.out.println("The Caesar Cipher is a substitution cipher that was used by Julius Caesar ");
		System.out.println("for coding military messages.");
		System.out.println();
		System.out.println("It works is by substituting each letter in a message with another letter of the");
		System.out.println("alphabet, using a specific key. If the key is 13, then each letter will be ");
		System.out.println("substituted by the letter than is 13 letters away from it in the alphabet. For");
		System.out.println("example, with a key of 13, the letter 'A' will be replaced with the letter 'N', ");
		System.out.println("the letter 'B' with the letter 'O', and so on.");
		System.out.println();
		
		// Determine if user wants to translate a message
		//===============================================
		System.out.print("*\tWould you like to translate a message (YES or NO)? ");
		translate = keyboard.next();
		translate= translate.toUpperCase();
		while(translate.equals("YES")==false && translate.equals("NO")==false)
		{
			System.out.println("\tERROR:\tThe response you entered does not correspond to YES or NO.");
			System.out.println("\t\t\tType YES if you would like to translate a message, or NO if \n\t\t\tyou do not want to translate a message.");
			System.out.print("\t\t\tWould you like to translate a message (YES or NO)? ");
			translate = keyboard.next();
			translate= translate.toUpperCase();
		}
		if (translate.equals("NO")==true)
		{
			System.out.println();
			System.out.println("Goodbye!");
			System.exit(0); 	// close program
		}
		System.out.println();

		message.setKey();	// Prompts user to set the key for the Cipher
		
		message.setMessage();	// Prompts user to enter a message to translate using the Cipher
		
		message.encrypt();	// encrypts the message using the Cipher
		
		// Display translated message
		//===========================
		System.out.println("*\tThe translated message is: ");
		System.out.print("\t");
		message.displayNewMessage();

		// Display exit message
		//====================
		System.out.println();
		System.out.println("Thank you for using the Caesar Cipher! Goodbye!");

		
		

	}

}
