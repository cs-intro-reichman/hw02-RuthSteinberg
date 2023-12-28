/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int first = (int)((Math.random()*10)); //generates the first random number
		int temp=first;
		System.out.print(first); // print the first random number
		int ran=temp;
		/* if (and only if) the new random number greater than the previous number
		generates another random number and print*/
		do { 
			// Generates random numbers between [0-10)
			ran = (int)((Math.random()*10));
			if(ran>=temp)
			{
				System.out.print(" "+ran);
				temp=ran;
			} 
		} while (ran>=temp);
	}
}
