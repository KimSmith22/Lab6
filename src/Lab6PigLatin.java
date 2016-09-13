/**
 * 
 */


import java.util.Scanner;

/**
 * @author Kimberli
 *
 */
public class Lab6PigLatin {

	/**
	 * @param args
	 * @param strBuff 
	 */
	public static void main(String[] args) {
		StringBuffer strBuff = new StringBuffer();
		Scanner k = new Scanner(System.in);

		String add = "way";
		String addVowel = "ay";
		String choice = "y";
		
		System.out.println("Translate to Pig Latin");
		
		//do{ // initiates do/while loop
			
		System.out.println("Enter a statement to translate: ");
		String kInput = k.nextLine();
		
		strBuff.append(kInput);
		
		Lab6Methods.makeLowerCase(strBuff); //calling method to change to all lower case
		//Lab6PigLatin.makePigLatin(strBuff); //calling method named makePigLatin
		
		StringBuffer output = Lab6Methods.makeLowerCase(strBuff);//reference pointer to other file in program
		
		System.out.println(output);
		System.out.println("Continue? y/n");
		k.nextLine();
		choice = k.nextLine();
		//}while(choice.equalsIgnoreCase("y")); //ends do/while loop
		
	}//psvm
	
	
}//end class
