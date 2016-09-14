/**
 * 
 */


import java.util.Locale;
import java.util.Scanner;

/**
 * @author Kimberli
 *
 */
public class Lab6PigLatin {

	/**
	 * @param args
	 * @param all 
	 * @param strBuff 
	 */
	public static void main(String[] args) {
		
		int vowelFirst;
		char firstLetter;
		String text; //whatever user inputs
		String vow = "a,e,i,o,u";
		String choice = "y";
		
		System.out.println("Pig Latin Translator");
		
do	{ //initiate do-while loop		
		System.out.println("Enter text to translate: ");
		Scanner k = new Scanner(System.in);
		text = k.nextLine();
		text = text.toLowerCase();/* method named to make all letters lower case */
		
		firstLetter = text.charAt(0);//identifies letter in first place
		vowelFirst = vow.indexOf(firstLetter);//determines if first letter is a vowel
		
		boolean firstLetterVowel = (vowelFirst >= 0);//moves characters
		System.out.println("Continue? y/n");
		k.nextLine();
		choice = k.nextLine();
	}while(choice.equals("y")); //ends do-while loop

	}//end main method
}//end public class Lab6PigLatin