/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		int length = str.length(); 
		// Print every char in the word from end to beginning 
		for (int i=length-1; i>=0; i--) 
		{
			System.out.print(str.charAt(i));
		}
		// check whether the length of the word is even or odd and print the middle char
		if(length%2==0) 
		{
			System.out.println("\n"+ "The middle character is " + str.charAt((length/2)-1));
		}
		else System.out.println("\n"+ "The middle character is " + str.charAt(length/2));
	}
}
