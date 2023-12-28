/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		for(int i=1; i<=number; i++) // i represent the number of the rows
		{
			String str = "";
			for(int j=1; j<=number; j++) // j represent the number of * in any row
			{
				str = str + "* ";
			}
			// prints the board - odd rows without space before the *
			if(i%2!=0) {System.out.println(str);} 
			else System.out.println(" " + str.substring(0,str.length()-1));
		}
	}
}
