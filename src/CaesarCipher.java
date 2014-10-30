import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {

		int rotation=0;		// number to rotate alphabet by
		String decrypted = ""; 	// decrypted string (string in "plain English"
		String encrypted = ""; 	// string encrypted by cipher
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("****************************************************************");
		System.out.println("            Caesar Cipher Encryptor and Decryptor               ");
		System.out.println("****************************************************************");
		System.out.println();
		System.out.println("This program encrypts a message using a Ceasar Cipher.");
		System.out.println();
		System.out.println("Enter a message that you would like encrypted.");
		System.out.println("Do not press ENTER until you are finished writing the message.");
		System.out.println();
		System.out.println("\tMESSAGE:");
		decrypted = keyboard.nextLine();
		System.out.println();
		System.out.println("By how much would you like the alphbet to be rotated? ");
		rotation = keyboard.nextInt();
		
		decrypted = decrypted.toUpperCase();

		for(int i=0; i<decrypted.length(); i++)
		{
			int charNum = 0;
			char rotatedChar='\t';
			
			switch(decrypted.charAt(i))
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
			
			if(charNum==100)
				continue;
			
			charNum = (charNum + rotation)%26;
			
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
			
			encrypted+=rotatedChar;
			
		}
		
		System.out.println("The encrypted message is: ");
		System.out.println(encrypted);
		
		
	}

}
