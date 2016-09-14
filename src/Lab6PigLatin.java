/**
 * 
 */


import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

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
		
		int vowelFirst = 0;
		int posOfVowel = 0;
		char firstLetter;
		String text; //whatever user inputs.
	    String front; //beginning of word
		String back; // user input without first letter
		
		String choice = "y";
		
		System.out.println("Pig Latin Translator");
		
	
		do	{ //initiate do-while loop	
		
		System.out.println("Enter text to translate: ");
		Scanner k = new Scanner(System.in);
		text = k.nextLine();
				
		text = text.toLowerCase();/* method  to make all letters lower case */
		
		firstLetter = text.charAt(0);//identifies letter in first place
	
		
		boolean firstLetterVowel = (text.charAt(0)== 'a' || text.charAt(0) == 'e' || text.charAt(0)== 'i' || text.charAt(0) == 'o' || text.charAt(0) == 'u');
		
		if (firstLetterVowel) {
			System.out.println("Translation: " +text + "way");
		}// end if
		else {
			for(int i = 0; i < text.length();  i++){
				if(text.charAt(i)== 'a' || text.charAt(i) == 'e' || text.charAt(i)== 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
					posOfVowel = i;
				break;
				}
			}
			front = text.substring(0,posOfVowel);
			back = text.substring(posOfVowel); //captures word without first letter

			System.out.println("Translation: " +back + front+ "ay");
		}//end else
		System.out.println("Continue? y/n");
		choice = k.nextLine();
	}while(choice.equals("y")); //ends do-while loop

	}//end main method
}//end public class Lab6PigLatin