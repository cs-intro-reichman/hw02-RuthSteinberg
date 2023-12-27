/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int index=1;
		while(index<=num)
		{
			if(num%index==0) System.err.println(index);
			index++;
		}
	}
}
