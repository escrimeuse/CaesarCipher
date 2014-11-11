/*
	Author: Cathryn Griffiths
			cathryn.griffiths@gmail.com
			cathryn.dersam.net

 */
import java.util.Scanner;

public class Cipher {

	// Variables
	//==========
	Scanner keyboard=new Scanner(System.in); 	// for user input
	private String originalMessage = ""; 	// the original, untranslated message
	private int key;	// the key used for the Cipher
	private String newMessage = "";	// the new, translated message
	
	// Methods
	//========
	public void setMessage() // message to encrypt
	{
		System.out.println("*\tType your message on one line. Press <ENTER> when you are done.");
		System.out.print("\t");
		keyboard.nextLine(); // get rid of garbage
		originalMessage=keyboard.nextLine();
		originalMessage=originalMessage.toUpperCase();
		System.out.println();
	}
	
	public void setKey() // set the key for encrypting
	{
		System.out.print("*\tType the number for the key you would like to use, then press <ENTER>: ");
		key=keyboard.nextInt();

		while(key<1 || key > 26)
		{
			System.out.println("\tERROR:\tThe key you entered is not valid. The key must be between 1 and 26 (inclusive).");
			System.out.print("\t\t\tPlease enter a new key: ");
			key=keyboard.nextInt();
		}
		System.out.println();
	}
	
	public void encrypt() //encrypt message
	{
		for(int i=0; i<originalMessage.length(); i++)
		{
			int charNum=100;
			char rotatedChar='\t';
			
			switch(originalMessage.charAt(i))
			{
				case 'A': charNum=0;
						break;
				case 'B': charNum=1; 
						break;
				case 'C': charNum=2;
						break;
				case 'D': charNum=3;
						break;
				case 'E': charNum=4;
						break;
				case 'F': charNum=5;
						break;
				case 'G': charNum=6;
						break;
				case 'H': charNum=7;
						break;
				case 'I': charNum=8;
						break;
				case 'J': charNum=9;
						break;
				case 'K': charNum=10;
						break;
				case 'L': charNum=11;
						break;
				case 'M': charNum=12;
						break;
				case 'N': charNum=13;
						break;
				case 'O': charNum=14;
						break;
				case 'P': charNum=15;
						break;
				case 'Q': charNum=16;
						break;
				case 'R': charNum=17;
						break;
				case 'S': charNum=18;
						break;
				case 'T': charNum=19;
						break;
				case 'U': charNum=20;
						break;
				case 'V': charNum=21;
						break;
				case 'W': charNum=22;
						break;
				case 'X': charNum=23;
						break;
				case 'Y': charNum=24;
						break;
				case 'Z': charNum=25;
						break;
				default: charNum=100;
						break;
			}
			
			if (charNum==100)
			{
				newMessage+=originalMessage.charAt(i);
				continue;
			}
			
			charNum = (charNum + key)%26;
			
			switch(charNum)
			{
				case 0: rotatedChar = 'A';
					break;
				case 1: rotatedChar = 'B';
					break;
				case 2: rotatedChar = 'C';
					break;
				case 3: rotatedChar = 'D';
					break;
				case 4: rotatedChar = 'E';
					break;
				case 5: rotatedChar = 'F';
					break;
				case 6: rotatedChar = 'G';
					break;
				case 7: rotatedChar = 'H';
					break;
				case 8: rotatedChar = 'I';
					break;
				case 9: rotatedChar = 'J';
					break;
				case 10: rotatedChar = 'K';
					break;
				case 11: rotatedChar = 'L';
					break;
				case 12: rotatedChar = 'M';
					break;
				case 13: rotatedChar = 'N';
					break;
				case 14: rotatedChar = '0';
					break;
				case 15: rotatedChar = 'P';
					break;
				case 16: rotatedChar = 'Q';
					break;
				case 17: rotatedChar = 'R';
					break;
				case 18: rotatedChar = 'S';
					break;
				case 19: rotatedChar = 'T';
					break;
				case 20: rotatedChar = 'U';
					break;
				case 21: rotatedChar = 'V';
					break;
				case 22: rotatedChar = 'W';
					break;
				case 23: rotatedChar = 'X';
					break;
				case 24: rotatedChar = 'Y';
					break;
				case 25: rotatedChar = 'Z';
					break;
			}
			newMessage+=rotatedChar;
			
		}
	}

	public void displayNewMessage()
	{
		System.out.println(newMessage);
	}
}
